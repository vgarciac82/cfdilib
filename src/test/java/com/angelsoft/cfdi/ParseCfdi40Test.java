package com.angelsoft.cfdi;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.InputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.angelsoft.sat.cfd._40.Comprobante;
import com.angelsoft.sat.cfdi.v4.CFDv40;
import com.angelsoft.sat.common.TimbreFiscalDigital11.TimbreFiscalDigital;

import jakarta.xml.bind.JAXBElement;

public class ParseCfdi40Test {

	private static final Logger log = LoggerFactory.getLogger(ParseCfdi40Test.class);
	private static final SimpleDateFormat DF = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

	@Test
	public void parseAndPrint() throws Exception {
		try {
			// 1) Abrir el XML desde test resources
			String resource = "/FactSIHOWINCj3FolGDL10229RFCSGU190430PU9.xml";
			InputStream in = getClass().getResourceAsStream(resource);
			assertNotNull("No se encontró el recurso: " + resource, in);

			// 2) Parsear a Comprobante usando tu librería
			Comprobante c = (Comprobante) new CFDv40(in, "com.angelsoft.sat.common.TimbreFiscalDigital11")
					.getComprobanteDocument();
			assertNotNull("No se pudo parsear el comprobante", c);

			// 3) Campos básicos
			Date fecha = toDate(c.getFecha());
			BigDecimal subtotal = c.getSubTotal();
			BigDecimal total = c.getTotal();

			Comprobante.Emisor emisor = c.getEmisor();
			Comprobante.Receptor receptor = c.getReceptor();

			String emisorRfc = emisor != null ? nullSafe(emisor.getRfc()) : "";
			String emisorNombre = emisor != null ? nullSafe(emisor.getNombre()) : "";
			String receptorRfc = receptor != null ? nullSafe(receptor.getRfc()) : "";
			String receptorNombre = receptor != null ? nullSafe(receptor.getNombre()) : "";

			// 4) Primer concepto
			String conceptoDesc = "";
			String conceptoCant = "";
			String conceptoImporte = "";
			if (c.getConceptos() != null && c.getConceptos().getConcepto() != null
					&& !c.getConceptos().getConcepto().isEmpty()) {
				Comprobante.Conceptos.Concepto con = c.getConceptos().getConcepto().get(0);
				if (con != null) {
					conceptoDesc = nullSafe(con.getDescripcion());
					conceptoCant = con.getCantidad() != null ? con.getCantidad().toPlainString() : "";
					conceptoImporte = con.getImporte() != null ? con.getImporte().toPlainString() : "";
				}
			}

			// 5) Timbre Fiscal Digital (UUID y FechaTimbrado)
			String uuid = "";
			Date fechaTimbrado = null;
			if (c.getComplemento() != null && c.getComplemento().getAny() != null) {
				List<Object> any = c.getComplemento().getAny();
				for (Object o : any) {
					Object val = (o instanceof JAXBElement) ? ((JAXBElement<?>) o).getValue() : o;
					if (val instanceof TimbreFiscalDigital) {
						TimbreFiscalDigital tfd = (TimbreFiscalDigital) val;
						uuid = nullSafe(tfd.getUUID());
						fechaTimbrado = toDate(tfd.getFechaTimbrado());
						break;
					}
				}
			}

			// 6) Log de resultados
			log.info("========== CFDI 4.0 ==========");
			log.info("Fecha:         {}", (fecha != null ? DF.format(fecha) : ""));
			log.info("Subtotal:      {}", (subtotal != null ? subtotal.toPlainString() : ""));
			log.info("Total:         {}", (total != null ? total.toPlainString() : ""));
			log.info("Emisor:        {} - {}", emisorRfc, emisorNombre);
			log.info("Receptor:      {} - {}", receptorRfc, receptorNombre);
			log.info("Concepto[0]:   {} | Cant: {} | Importe: {}", conceptoDesc, conceptoCant, conceptoImporte);
			log.info("UUID:          {}", uuid);
			log.info("FechaTimbrado: {}", (fechaTimbrado != null ? DF.format(fechaTimbrado) : ""));
			log.info("================================");
		} catch (Exception e) {
			log.error("Error: " + e.toString(), e);
			fail(e.toString());
		}
	}

	private static String nullSafe(String s) {
		return s == null ? "" : s;
	}

	private static Date toDate(Object obj) {
		if (obj == null)
			return null;
		if (obj instanceof Date)
			return (Date) obj;
		if (obj instanceof XMLGregorianCalendar) {
			return ((XMLGregorianCalendar) obj).toGregorianCalendar().getTime();
		}
		return null;
	}
}
