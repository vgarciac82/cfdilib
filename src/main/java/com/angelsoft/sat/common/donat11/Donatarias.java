//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package com.angelsoft.sat.common.donat11;

import java.time.LocalDate;
import com.angelsoft.sat.util.DateAdapter;
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
 *       <attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1.1" />
 *       <attribute name="noAutorizacion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="fechaAutorizacion" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="leyenda" use="required">
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
@XmlRootElement(name = "Donatarias")
public class Donatarias {

    /**
     * Atributo requerido para expresar la versión del complemento de donatarias
     * 
     */
    @XmlAttribute(name = "version", required = true)
    protected String version;
    /**
     * Atributo requerido para expresar el número del oficio en que se haya informado a la organización civil o fideicomiso, la procedencia de la autorización para recibir donativos deducibles, o su renovación correspondiente otorgada por el Servicio de Administración Tributaria.
     * 
     */
    @XmlAttribute(name = "noAutorizacion", required = true)
    protected String noAutorizacion;
    /**
     * Atributo requerido para expresar la fecha del oficio en que se haya informado a la organización civil o fideicomiso, la procedencia de la autorización para recibir donativos deducibles, o su renovación correspondiente otorgada por el Servicio de Administración Tributaria.
     * 
     */
    @XmlAttribute(name = "fechaAutorizacion", required = true)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate fechaAutorizacion;
    /**
     * Atributo requerido para señalar de manera expresa que el comprobante que se expide se deriva de un donativo.
     * 
     */
    @XmlAttribute(name = "leyenda", required = true)
    protected String leyenda;

    /**
     * Atributo requerido para expresar la versión del complemento de donatarias
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
     * Atributo requerido para expresar el número del oficio en que se haya informado a la organización civil o fideicomiso, la procedencia de la autorización para recibir donativos deducibles, o su renovación correspondiente otorgada por el Servicio de Administración Tributaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoAutorizacion() {
        return noAutorizacion;
    }

    /**
     * Define el valor de la propiedad noAutorizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNoAutorizacion()
     */
    public void setNoAutorizacion(String value) {
        this.noAutorizacion = value;
    }

    /**
     * Atributo requerido para expresar la fecha del oficio en que se haya informado a la organización civil o fideicomiso, la procedencia de la autorización para recibir donativos deducibles, o su renovación correspondiente otorgada por el Servicio de Administración Tributaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getFechaAutorizacion() {
        return fechaAutorizacion;
    }

    /**
     * Define el valor de la propiedad fechaAutorizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFechaAutorizacion()
     */
    public void setFechaAutorizacion(LocalDate value) {
        this.fechaAutorizacion = value;
    }

    /**
     * Atributo requerido para señalar de manera expresa que el comprobante que se expide se deriva de un donativo.
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

}
