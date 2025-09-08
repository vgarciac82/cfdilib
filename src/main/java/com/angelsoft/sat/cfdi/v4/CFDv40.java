package com.angelsoft.sat.cfdi.v4;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.util.JAXBSource;
import com.angelsoft.sat.cfd._40.Comprobante;
import org.w3c.dom.Document;

import java.io.InputStream;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.input.BOMInputStream;
import org.apache.commons.io.ByteOrderMark;

public final class CFDv40 extends CFDv4 {

	private final String XSLT = "/xslt/cfd/4/cadenaoriginal_4_0/cadenaoriginal_4_0.xslt";
	private final String BASE_CONTEXT = "com.angelsoft.sat.cfd._40";
	private final List<String> schemaLocations = Stream
			.of("http://www.sat.gob.mx/cfd/4 http://www.sat.gob.mx/sitio_internet/cfd/4/cfdv40.xsd")
			.collect(Collectors.toList());

	private final String[] XSD = new String[] {  
			"/xsd/common/catalogos/ComExt/catComExt.xsd", "/xsd/common/catalogos/Combustible/catCombustible.xsd",
			"/xsd/common/catalogos/Nomina/catNomina.xsd", "/xsd/common/catalogos/Pagos/catPagos.xsd",
			"/xsd/common/catalogos/catCFDI.xsd", "/xsd/common/catalogos/hidrocarburos/catHidrocarburos.xsd",
			"/xsd/common/tipoDatos/tdCFDI/tdCFDI.xsd", "/xsd/cfd/4/cfdv40.xsd",
			"/xsd/common/CartaPorte/CartaPorte20.xsd", "/xsd/common/CartaPorte/CartaPorte30.xsd",
			"/xsd/common/CartaPorte/CartaPorte31.xsd", "/xsd/common/ComercioExterior11/ComercioExterior11.xsd",
			"/xsd/common/ComercioExterior20/ComercioExterior20.xsd", "/xsd/common/EstadoDeCuentaCombustible/ecc12.xsd",
			"/xsd/common/GastosHidrocarburos10/GastosHidrocarburos10.xsd",
			"/xsd/common/IngresosHidrocarburos10/IngresosHidrocarburos.xsd", "/xsd/common/Pagos/Pagos20.xsd",
			"/xsd/common/TimbreFiscalDigital/TimbreFiscalDigitalv11.xsd",
			"/xsd/common/TuristaPasajeroExtranjero/TuristaPasajeroExtranjero.xsd",
			"/xsd/common/aerolineas/aerolineas.xsd", "/xsd/common/arteantiguedades/obrasarteantiguedades.xsd",
			"/xsd/common/certificadodestruccion/certificadodedestruccion.xsd",
			"/xsd/common/cfdiregistrofiscal/cfdiregistrofiscal.xsd",
			"/xsd/common/consumodecombustibles/consumodeCombustibles11.xsd", "/xsd/common/detallista/detallista.xsd",
			"/xsd/common/divisas/divisas.xsd", "/xsd/common/donat/donat11.xsd", "/xsd/common/iedu/iedu.xsd",
			"/xsd/common/implocal/implocal.xsd", "/xsd/common/ine/ine11.xsd",
			"/xsd/common/leyendasFiscales/leyendasFisc.xsd", "/xsd/common/nomina/nomina12.xsd",
			"/xsd/common/notariospublicos/notariospublicos.xsd", "/xsd/common/pagoenespecie/pagoenespecie.xsd",
			"/xsd/common/pfic/pfic.xsd",
			"/xsd/common/renovacionysustitucionvehiculos/renovacionysustitucionvehiculos.xsd",
			"/xsd/common/servicioparcialconstruccion/servicioparcialconstruccion.xsd",
			"/xsd/common/valesdedespensa/valesdedespensa.xsd", "/xsd/common/vehiculousado/vehiculousado.xsd",
			"/xsd/common/ventavehiculos/ventavehiculos11.xsd" };

	private final Comprobante document;
	private final JAXBContext context;

	public CFDv40(InputStream in, String... contexts) throws Exception {
		Comprobante parsed;
		try (BOMInputStream bomIn = BOMInputStream.builder().setInputStream(in).setInclude(false) // excluir BOM del
																									// stream entregado
																									// a JAXB
				.setByteOrderMarks(ByteOrderMark.UTF_8, ByteOrderMark.UTF_16BE, ByteOrderMark.UTF_16LE,
						ByteOrderMark.UTF_32BE, ByteOrderMark.UTF_32LE)
				.get()) {
			parsed = (Comprobante) load(bomIn, contexts);
		}
		this.document = parsed;

		// Añade contextos inferidos (complementos/addendas) + los que te pasen
		String[] effective = mergeContexts(getComprobanteContexts(document), contexts);

		// Usa la caché/contexto de CfdCommon con los contextos efectivos
		this.context = super.getContext(document, effective);
	}

	public CFDv40(Comprobante comprobante, String... contexts) throws Exception {
		this.document = copy(comprobante);
		String[] effective = mergeContexts(getComprobanteContexts(this.document), contexts);
		this.context = super.getContext(this.document, effective);
	}

	public static Comprobante newComprobante(InputStream in) throws Exception {
		return new CFDv40(in).document;
	}

	@Override
	public String getBaseContext() {
		return BASE_CONTEXT;
	}

	@Override
	public String[] getXSD() {
		return XSD;
	}

	@Override
	public String getXSLT() {
		return XSLT;
	}

	@Override
	public void addSchemaLocation(String uri) {
		schemaLocations.add(uri);
	}

	@Override
	public JAXBSource getJAXBSource() throws JAXBException {
		return new JAXBSource(context, document);
	}

	@Override
	public int getYear() {
		return document.getFecha().getYear();
	}

	@Override
	public String getCertificadoString() {
		return document.getCertificado();
	}

	@Override
	public String getSelloString() {
		return document.getSello();
	}

	@Override
	public Marshaller createMarshaller() throws JAXBException {
		return context.createMarshaller();
	}

	@Override
	public List<String> getSchemaLocation() {
		return schemaLocations;
	}

	@Override
	public Object getComprobanteDocument() {
		return document;
	}

	@Override
	public void sellar(PrivateKey key, X509Certificate cert) throws Exception {
		document.setNoCertificado(cert.getSerialNumber().toString());
		document.setCertificado(Base64.getEncoder().encodeToString(cert.getEncoded()));
		document.setSello(getSignature(key));
	}

	/** Recolecta contextos de complementos/addendas del comprobante. */
	private List<String> getComprobanteContexts(Comprobante comprobante) {
		final List<String> contexts = new ArrayList<>();
		if (comprobante != null) {
			if (comprobante.getComplemento() != null && comprobante.getComplemento().getAny() != null
					&& !comprobante.getComplemento().getAny().isEmpty()) {
				for (Object c : comprobante.getComplemento().getAny()) {
					defineComprobanteContext(c, contexts);
				}
			}
			if (comprobante.getConceptos() != null && comprobante.getConceptos().getConcepto() != null) {
				for (Object c : comprobante.getConceptos().getConcepto().stream().filter(Objects::nonNull)
						.filter(cx -> cx.getComplementoConcepto() != null)
						.filter(cx -> cx.getComplementoConcepto().getAny() != null)
						.map(cx -> cx.getComplementoConcepto().getAny()).flatMap(List::stream).toList()) {
					defineComprobanteContext(c, contexts);
				}
			}
		}
		return contexts;
	}

	/** Fusiona contextos inferidos + pasados, sin nulls ni duplicados. */
	private static String[] mergeContexts(List<String> inferred, String... passed) {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		if (passed != null) {
			for (String p : passed) {
				if (p != null && !p.isBlank())
					set.add(p);
			}
		}
		if (inferred != null) {
			for (String i : inferred) {
				if (i != null && !i.isBlank())
					set.add(i);
			}
		}
		// BASE_CONTEXT lo expone getBaseContext(); CfdCommon/CFDv4 lo usa al construir
		// contexto.
		return set.toArray(new String[0]);
	}

	public Comprobante sellarComprobante(PrivateKey key, X509Certificate cert) throws Exception {
		sellar(key, cert);
		return getComprobante();
	}

	private Comprobante getComprobante() throws Exception {
		return copy(document);
	}

	private Comprobante copy(Comprobante comprobante) throws Exception {
		Document doc = getDocument();
		Marshaller m = createMarshaller();
		m.marshal(comprobante, doc);
		Unmarshaller u = context.createUnmarshaller();
		return (Comprobante) u.unmarshal(doc);
	}
}
