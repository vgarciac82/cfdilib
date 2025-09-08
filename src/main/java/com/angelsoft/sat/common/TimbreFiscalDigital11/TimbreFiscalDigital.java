//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package com.angelsoft.sat.common.TimbreFiscalDigital11;

import java.time.LocalDateTime;
import com.angelsoft.sat.util.DateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para anonymous complex type.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="1.1" />
 *       <attribute name="UUID" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <whiteSpace value="collapse"/>
 *             <length value="36"/>
 *             <pattern value="[a-f0-9A-F]{8}-[a-f0-9A-F]{4}-[a-f0-9A-F]{4}-[a-f0-9A-F]{4}-[a-f0-9A-F]{12}"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="FechaTimbrado" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_FechaH" />
 *       <attribute name="RfcProvCertif" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC_PM" />
 *       <attribute name="Leyenda">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <whiteSpace value="collapse"/>
 *             <minLength value="12"/>
 *             <maxLength value="150"/>
 *             <pattern value="([A-Z]|[a-z]|[0-9]| |Ñ|ñ|!|"|%|&|'|´|-|:|;|>|=|<|@|_|,|\{|\}|`|~|á|é|í|ó|ú|Á|É|Í|Ó|Ú|ü|Ü){1,150}"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="SelloCFD" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <whiteSpace value="collapse"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="NoCertificadoSAT" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <length value="20"/>
 *             <whiteSpace value="collapse"/>
 *             <pattern value="[0-9]{20}"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="SelloSAT" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <whiteSpace value="collapse"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "TimbreFiscalDigital")
public class TimbreFiscalDigital {

    /**
     * Atributo requerido para la expresión de la versión del estándar del Timbre Fiscal Digital
     * 
     */
    @XmlAttribute(name = "Version", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String version;
    /**
     * Atributo requerido para expresar los 36 caracteres del folio fiscal (UUID) de la transacción de timbrado conforme al estándar RFC 4122
     * 
     */
    @XmlAttribute(name = "UUID", required = true)
    protected String uuid;
    /**
     * Atributo requerido para expresar la fecha y hora, de la generación del timbre por la certificación digital del SAT. Se expresa en la forma AAAA-MM-DDThh:mm:ss y debe corresponder con la hora de la Zona Centro del Sistema de Horario en México.
     * 
     */
    @XmlAttribute(name = "FechaTimbrado", required = true)
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    protected LocalDateTime fechaTimbrado;
    /**
     * Atributo requerido para expresar el RFC del proveedor de certificación de comprobantes fiscales digitales que genera el timbre fiscal digital.
     * 
     */
    @XmlAttribute(name = "RfcProvCertif", required = true)
    protected String rfcProvCertif;
    /**
     * Atributo opcional para registrar información que el SAT comunique a los usuarios del CFDI.
     * 
     */
    @XmlAttribute(name = "Leyenda")
    protected String leyenda;
    /**
     * Atributo requerido para contener el sello digital del comprobante fiscal o del comprobante de retenciones, que se ha timbrado. El sello debe ser expresado como una cadena de texto en formato Base 64.
     * 
     */
    @XmlAttribute(name = "SelloCFD", required = true)
    protected String selloCFD;
    /**
     * Atributo requerido para expresar el número de serie del certificado del SAT usado para generar el sello digital del Timbre Fiscal Digital.
     * 
     */
    @XmlAttribute(name = "NoCertificadoSAT", required = true)
    protected String noCertificadoSAT;
    /**
     * Atributo requerido para contener el sello digital del Timbre Fiscal Digital, al que hacen referencia las reglas de la Resolución Miscelánea vigente. El sello debe ser expresado como una cadena de texto en formato Base 64.
     * 
     */
    @XmlAttribute(name = "SelloSAT", required = true)
    protected String selloSAT;

    /**
     * Atributo requerido para la expresión de la versión del estándar del Timbre Fiscal Digital
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.1";
        } else {
            return version;
        }
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Atributo requerido para expresar los 36 caracteres del folio fiscal (UUID) de la transacción de timbrado conforme al estándar RFC 4122
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Define el valor de la propiedad uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUUID()
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Atributo requerido para expresar la fecha y hora, de la generación del timbre por la certificación digital del SAT. Se expresa en la forma AAAA-MM-DDThh:mm:ss y debe corresponder con la hora de la Zona Centro del Sistema de Horario en México.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getFechaTimbrado() {
        return fechaTimbrado;
    }

    /**
     * Define el valor de la propiedad fechaTimbrado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFechaTimbrado()
     */
    public void setFechaTimbrado(LocalDateTime value) {
        this.fechaTimbrado = value;
    }

    /**
     * Atributo requerido para expresar el RFC del proveedor de certificación de comprobantes fiscales digitales que genera el timbre fiscal digital.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcProvCertif() {
        return rfcProvCertif;
    }

    /**
     * Define el valor de la propiedad rfcProvCertif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRfcProvCertif()
     */
    public void setRfcProvCertif(String value) {
        this.rfcProvCertif = value;
    }

    /**
     * Atributo opcional para registrar información que el SAT comunique a los usuarios del CFDI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeyenda() {
        return leyenda;
    }

    /**
     * Define el valor de la propiedad leyenda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLeyenda()
     */
    public void setLeyenda(String value) {
        this.leyenda = value;
    }

    /**
     * Atributo requerido para contener el sello digital del comprobante fiscal o del comprobante de retenciones, que se ha timbrado. El sello debe ser expresado como una cadena de texto en formato Base 64.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelloCFD() {
        return selloCFD;
    }

    /**
     * Define el valor de la propiedad selloCFD.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSelloCFD()
     */
    public void setSelloCFD(String value) {
        this.selloCFD = value;
    }

    /**
     * Atributo requerido para expresar el número de serie del certificado del SAT usado para generar el sello digital del Timbre Fiscal Digital.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoCertificadoSAT() {
        return noCertificadoSAT;
    }

    /**
     * Define el valor de la propiedad noCertificadoSAT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNoCertificadoSAT()
     */
    public void setNoCertificadoSAT(String value) {
        this.noCertificadoSAT = value;
    }

    /**
     * Atributo requerido para contener el sello digital del Timbre Fiscal Digital, al que hacen referencia las reglas de la Resolución Miscelánea vigente. El sello debe ser expresado como una cadena de texto en formato Base 64.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelloSAT() {
        return selloSAT;
    }

    /**
     * Define el valor de la propiedad selloSAT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSelloSAT()
     */
    public void setSelloSAT(String value) {
        this.selloSAT = value;
    }

}
