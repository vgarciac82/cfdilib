package com.angelsoft.cfdi;

import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// StAX para detectar el root element y evitar intentar parsear logback-test.xml, etc.
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.angelsoft.sat.cfd._40.Comprobante;
import com.angelsoft.sat.cfdi.v4.CFDv40;
import com.angelsoft.sat.common.TimbreFiscalDigital11.TimbreFiscalDigital;

import jakarta.xml.bind.JAXBElement;

public class ParseCfdi40BatchTest {

	private static final Logger log = LoggerFactory.getLogger(ParseCfdi40BatchTest.class);

	private static final String NS_CFDI40 = "http://www.sat.gob.mx/cfd/4";
	private static final String NS_TFD11 = "http://www.sat.gob.mx/TimbreFiscalDigital";

	@Test
	public void parseAllXmlsInTestResources() throws Exception {
		// Raíz de test resources (target/test-classes)
		URL rootUrl = Thread.currentThread().getContextClassLoader().getResource("");
		assertNotNull("No se encontró la raíz de test resources", rootUrl);

		Path root = Paths.get(rootUrl.toURI());
		List<Path> xmls;
		try (Stream<Path> walk = Files.walk(root)) {
			xmls = walk.filter(p -> !Files.isDirectory(p))
					.filter(p -> p.getFileName().toString().toLowerCase().endsWith(".xml")).sorted()
					.collect(Collectors.toList());
		}

		log.info("=== Encontrados {} XMLs para procesar ===", xmls.size());

		int ok = 0, fail = 0, skip = 0;
		long t0 = System.nanoTime();

		for (Path p : xmls) {
			String name = root.relativize(p).toString().replace('\\', '/');
			try {
				byte[] bytes = Files.readAllBytes(p);

				// Log del archivo ANTES de parsear
				log.info("[{}] Procesando…", name);

				// Filtrado por root element (evita logback-test.xml y similares)
				if (!looksLikeCfdi(bytes)) {
					skip++;
					log.warn("[{}] SKIP: root element no es CFDI 4.0 ni TFD 1.1", name);
					continue;
				}

				try (InputStream in = new ByteArrayInputStream(bytes)) {
					// Incluimos TFD 1.1 para que el complemento se tipifique y podamos leer UUID
					Comprobante c = (Comprobante) new CFDv40(in, "com.angelsoft.sat.common.TimbreFiscalDigital11")
							.getComprobanteDocument();

					// ----------- Básicos -----------
					Date fecha = toDate(c.getFecha());
					BigDecimal subtotal = c.getSubTotal();
					BigDecimal total = c.getTotal();

					Comprobante.Emisor emisor = c.getEmisor();
					Comprobante.Receptor receptor = c.getReceptor();

					String emisorRfc = emisor != null ? nullSafe(emisor.getRfc()) : "";
					String emisorNombre = emisor != null ? nullSafe(emisor.getNombre()) : "";
					String receptorRfc = receptor != null ? nullSafe(receptor.getRfc()) : "";
					String receptorNombre = receptor != null ? nullSafe(receptor.getNombre()) : "";

					// Domicilio fiscal receptor (CP) + LugarExpedicion del comprobante
					String domicilioFiscalReceptor = receptor != null ? nullSafe(receptor.getDomicilioFiscalReceptor())
							: "";
					String lugarExpedicion = nullSafe(c.getLugarExpedicion());

					// ----------- Primer concepto -----------
					String conceptoDesc = "";
					String conceptoCant = "";
					String conceptoImporte = "";
					String claveProdServ = "";
					if (c.getConceptos() != null && c.getConceptos().getConcepto() != null
							&& !c.getConceptos().getConcepto().isEmpty()) {
						Comprobante.Conceptos.Concepto con = c.getConceptos().getConcepto().get(0);
						if (con != null) {
							conceptoDesc = nullSafe(con.getDescripcion());
							conceptoCant = con.getCantidad() != null ? con.getCantidad().toPlainString() : "";
							conceptoImporte = con.getImporte() != null ? con.getImporte().toPlainString() : "";
							claveProdServ = nullSafe(con.getClaveProdServ());
						}
					}

					// ----------- TFD 1.1 -----------
					String uuid = "";
					Date fechaTimbrado = null;
					if (c.getComplemento() != null && c.getComplemento().getAny() != null) {
						for (Object o : c.getComplemento().getAny()) {
							Object val = (o instanceof JAXBElement) ? ((JAXBElement<?>) o).getValue() : o;
							if (val instanceof TimbreFiscalDigital tfd) {
								uuid = nullSafe(tfd.getUUID());
								fechaTimbrado = toDate(tfd.getFechaTimbrado());
								break;
							}

						}
					}

					// ----------- Log una línea por archivo -----------
					log.info(
							"[{}] Fecha={} Subtotal={} Total={} | Emisor={} - {} | Receptor={} - {} | CP(Receptor)={} LugarExpedicion={} | Concepto[0]={} Cant={} Importe={} ClaveProdServ={} | UUID={} FechaTimbrado={}",
							name, fecha != null ? DF.format(fecha) : "", toStr(subtotal), toStr(total), emisorRfc,
							emisorNombre, receptorRfc, receptorNombre, domicilioFiscalReceptor, lugarExpedicion,
							conceptoDesc, conceptoCant, conceptoImporte, claveProdServ, uuid,
							fechaTimbrado != null ? DF.format(fechaTimbrado) : "");

					ok++;
				}
			} catch (Exception e) {
				fail++;
				log.error("[{}] ERROR: {}", name, e.toString(), e);
			}
		}

		long t1 = System.nanoTime();
		double secs = (t1 - t0) / 1_000_000_000.0;
		log.info("=== Resultado: OK={} FAIL={} SKIP={} Tiempo={}\u2009s ===", ok, fail, skip,
				String.format(java.util.Locale.US, "%.3f", secs));
	}

	// ---------- helpers ----------

	private static boolean looksLikeCfdi(byte[] bytes) {
		try (ByteArrayInputStream bais = new ByteArrayInputStream(bytes)) {
			XMLInputFactory f = XMLInputFactory.newFactory();
			// endurecer parser (sin DTD ni entidades externas)
			try {
				f.setProperty(XMLInputFactory.SUPPORT_DTD, false);
			} catch (Exception ignore) {
			}
			try {
				f.setProperty("javax.xml.stream.isSupportingExternalEntities", false);
			} catch (Exception ignore) {
			}

			XMLStreamReader r = f.createXMLStreamReader(bais);
			while (r.hasNext()) {
				int ev = r.next();
				if (ev == XMLStreamConstants.START_ELEMENT) {
					String local = r.getLocalName();
					String ns = r.getNamespaceURI();
					return ("Comprobante".equals(local) && NS_CFDI40.equals(ns))
							|| ("TimbreFiscalDigital".equals(local) && NS_TFD11.equals(ns));
				}
			}
		} catch (Exception ignore) {
			// si no podemos leer, devolvemos false para que lo salte
		}
		return false;
	}

	private static String nullSafe(String s) {
		return s == null ? "" : s;
	}

	private static String toStr(BigDecimal bd) {
		return bd == null ? "" : bd.toPlainString();
	}

	// Zona a usar para CFDI (Fecha sin zona)
	private static final java.time.ZoneId CFDI_ZONE = java.time.ZoneId.of("America/Mexico_City");

	// Formato de salida consistente en esa zona
	private static final java.text.SimpleDateFormat DF = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	static {
		DF.setTimeZone(java.util.TimeZone.getTimeZone("America/Mexico_City"));
	}

	private static java.util.Date toDate(Object obj) {
		if (obj == null)
			return null;
		if (obj instanceof java.util.Date d)
			return d;
		if (obj instanceof javax.xml.datatype.XMLGregorianCalendar xgc)
			return xgc.toGregorianCalendar().getTime();
		if (obj instanceof java.time.Instant inst)
			return java.util.Date.from(inst);
		if (obj instanceof java.time.OffsetDateTime odt)
			return java.util.Date.from(odt.toInstant());
		if (obj instanceof java.time.ZonedDateTime zdt)
			return java.util.Date.from(zdt.toInstant());
		if (obj instanceof java.time.LocalDateTime ldt)
			return java.util.Date.from(ldt.atZone(CFDI_ZONE).toInstant());
		if (obj instanceof java.time.LocalDate ld)
			return java.util.Date.from(ld.atStartOfDay(CFDI_ZONE).toInstant());
		return null;
	}

}
