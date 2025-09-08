//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package com.angelsoft.sat.common.implocal10;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="unbounded">
 *         <element name="RetencionesLocales" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="ImpLocRetenido" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="TasadeRetencion" use="required">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                       <fractionDigits value="2"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="Importe" use="required">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                       <fractionDigits value="2"/>
 *                       <whiteSpace value="collapse"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="TrasladosLocales" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="ImpLocTrasladado" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="TasadeTraslado" use="required">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                       <fractionDigits value="2"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="Importe" use="required">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                       <fractionDigits value="2"/>
 *                       <whiteSpace value="collapse"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="1.0" />
 *       <attribute name="TotaldeRetenciones" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             <fractionDigits value="2"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="TotaldeTraslados" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             <fractionDigits value="2"/>
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
@XmlType(name = "", propOrder = {
    "retencionesLocalesAndTrasladosLocales"
})
@XmlRootElement(name = "ImpuestosLocales")
public class ImpuestosLocales {

    @XmlElements({
        @XmlElement(name = "RetencionesLocales", type = ImpuestosLocales.RetencionesLocales.class),
        @XmlElement(name = "TrasladosLocales", type = ImpuestosLocales.TrasladosLocales.class)
    })
    protected List<Object> retencionesLocalesAndTrasladosLocales;
    /**
     * Atributo requerido para expresar la versión del complemento
     * 
     */
    @XmlAttribute(name = "version", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String version;
    /**
     * Atributo requerido para expresar la suma total de Retenciones aplicables
     * 
     */
    @XmlAttribute(name = "TotaldeRetenciones", required = true)
    protected BigDecimal totaldeRetenciones;
    /**
     * Atributo requerido para expresar la suma total de traslados aplicables
     * 
     */
    @XmlAttribute(name = "TotaldeTraslados", required = true)
    protected BigDecimal totaldeTraslados;

    /**
     * Gets the value of the retencionesLocalesAndTrasladosLocales property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retencionesLocalesAndTrasladosLocales property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRetencionesLocalesAndTrasladosLocales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImpuestosLocales.RetencionesLocales }
     * {@link ImpuestosLocales.TrasladosLocales }
     * </p>
     * 
     * 
     * @return
     *     The value of the retencionesLocalesAndTrasladosLocales property.
     */
    public List<Object> getRetencionesLocalesAndTrasladosLocales() {
        if (retencionesLocalesAndTrasladosLocales == null) {
            retencionesLocalesAndTrasladosLocales = new ArrayList<>();
        }
        return this.retencionesLocalesAndTrasladosLocales;
    }

    /**
     * Atributo requerido para expresar la versión del complemento
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.0";
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
     * Atributo requerido para expresar la suma total de Retenciones aplicables
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotaldeRetenciones() {
        return totaldeRetenciones;
    }

    /**
     * Define el valor de la propiedad totaldeRetenciones.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotaldeRetenciones()
     */
    public void setTotaldeRetenciones(BigDecimal value) {
        this.totaldeRetenciones = value;
    }

    /**
     * Atributo requerido para expresar la suma total de traslados aplicables
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotaldeTraslados() {
        return totaldeTraslados;
    }

    /**
     * Define el valor de la propiedad totaldeTraslados.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotaldeTraslados()
     */
    public void setTotaldeTraslados(BigDecimal value) {
        this.totaldeTraslados = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.</p>
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <attribute name="ImpLocRetenido" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       <attribute name="TasadeRetencion" use="required">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *             <fractionDigits value="2"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="Importe" use="required">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *             <fractionDigits value="2"/>
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
    public static class RetencionesLocales {

        /**
         * Nombre del impuesto local retenido
         * 
         */
        @XmlAttribute(name = "ImpLocRetenido", required = true)
        protected String impLocRetenido;
        /**
         * Porcentaje de retención del impuesto local
         * 
         */
        @XmlAttribute(name = "TasadeRetencion", required = true)
        protected BigDecimal tasadeRetencion;
        /**
         * Monto del impuesto local retenido
         * 
         */
        @XmlAttribute(name = "Importe", required = true)
        protected BigDecimal importe;

        /**
         * Nombre del impuesto local retenido
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImpLocRetenido() {
            return impLocRetenido;
        }

        /**
         * Define el valor de la propiedad impLocRetenido.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getImpLocRetenido()
         */
        public void setImpLocRetenido(String value) {
            this.impLocRetenido = value;
        }

        /**
         * Porcentaje de retención del impuesto local
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTasadeRetencion() {
            return tasadeRetencion;
        }

        /**
         * Define el valor de la propiedad tasadeRetencion.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getTasadeRetencion()
         */
        public void setTasadeRetencion(BigDecimal value) {
            this.tasadeRetencion = value;
        }

        /**
         * Monto del impuesto local retenido
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getImporte() {
            return importe;
        }

        /**
         * Define el valor de la propiedad importe.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getImporte()
         */
        public void setImporte(BigDecimal value) {
            this.importe = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.</p>
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <attribute name="ImpLocTrasladado" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       <attribute name="TasadeTraslado" use="required">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *             <fractionDigits value="2"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="Importe" use="required">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *             <fractionDigits value="2"/>
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
    public static class TrasladosLocales {

        /**
         * Nombre del impuesto local trasladado
         * 
         */
        @XmlAttribute(name = "ImpLocTrasladado", required = true)
        protected String impLocTrasladado;
        /**
         * Porcentaje de traslado del impuesto local
         * 
         */
        @XmlAttribute(name = "TasadeTraslado", required = true)
        protected BigDecimal tasadeTraslado;
        /**
         * Monto del impuesto local trasladado
         * 
         */
        @XmlAttribute(name = "Importe", required = true)
        protected BigDecimal importe;

        /**
         * Nombre del impuesto local trasladado
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImpLocTrasladado() {
            return impLocTrasladado;
        }

        /**
         * Define el valor de la propiedad impLocTrasladado.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getImpLocTrasladado()
         */
        public void setImpLocTrasladado(String value) {
            this.impLocTrasladado = value;
        }

        /**
         * Porcentaje de traslado del impuesto local
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTasadeTraslado() {
            return tasadeTraslado;
        }

        /**
         * Define el valor de la propiedad tasadeTraslado.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getTasadeTraslado()
         */
        public void setTasadeTraslado(BigDecimal value) {
            this.tasadeTraslado = value;
        }

        /**
         * Monto del impuesto local trasladado
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getImporte() {
            return importe;
        }

        /**
         * Define el valor de la propiedad importe.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getImporte()
         */
        public void setImporte(BigDecimal value) {
            this.importe = value;
        }

    }

}
