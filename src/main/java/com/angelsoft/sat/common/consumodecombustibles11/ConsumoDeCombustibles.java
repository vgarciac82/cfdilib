//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package com.angelsoft.sat.common.consumodecombustibles11;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.angelsoft.sat.util.DateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import mx.gob.sat.sitio_internet.cfd.catalogos.combustible.CClaveTipoCombustible;


/**
 * <p>Clase Java para anonymous complex type.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Conceptos">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ConceptoConsumoDeCombustibles" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="Determinados">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="Determinado" maxOccurs="unbounded">
 *                                         <complexType>
 *                                           <complexContent>
 *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               <attribute name="impuesto" use="required">
 *                                                 <simpleType>
 *                                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     <whiteSpace value="collapse"/>
 *                                                     <enumeration value="IVA"/>
 *                                                     <enumeration value="IEPS"/>
 *                                                   </restriction>
 *                                                 </simpleType>
 *                                               </attribute>
 *                                               <attribute name="tasaOCuota" use="required">
 *                                                 <simpleType>
 *                                                   <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                     <fractionDigits value="6"/>
 *                                                     <whiteSpace value="collapse"/>
 *                                                   </restriction>
 *                                                 </simpleType>
 *                                               </attribute>
 *                                               <attribute name="importe" use="required">
 *                                                 <simpleType>
 *                                                   <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                     <fractionDigits value="2"/>
 *                                                     <whiteSpace value="collapse"/>
 *                                                   </restriction>
 *                                                 </simpleType>
 *                                               </attribute>
 *                                             </restriction>
 *                                           </complexContent>
 *                                         </complexType>
 *                                       </element>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                           </sequence>
 *                           <attribute name="identificador" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <minLength value="1"/>
 *                                 <whiteSpace value="collapse"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="fecha" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_FechaH" />
 *                           <attribute name="rfc" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC" />
 *                           <attribute name="claveEstacion" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <whiteSpace value="collapse"/>
 *                                 <minLength value="1"/>
 *                                 <maxLength value="10"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="tipoCombustible" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Combustible}c_ClaveTipoCombustible" />
 *                           <attribute name="cantidad" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 <minInclusive value="0.001"/>
 *                                 <pattern value="[0-9]{1,14}(.([0-9]{3}))"/>
 *                                 <whiteSpace value="collapse"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="nombreCombustible" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <whiteSpace value="collapse"/>
 *                                 <minLength value="1"/>
 *                                 <maxLength value="300"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="folioOperacion" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <whiteSpace value="collapse"/>
 *                                 <minLength value="1"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="valorUnitario" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 <whiteSpace value="collapse"/>
 *                                 <fractionDigits value="2"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="importe" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 <fractionDigits value="2"/>
 *                                 <whiteSpace value="collapse"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="version" use="required" fixed="1.1">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <whiteSpace value="collapse"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="tipoOperacion" use="required" fixed="monedero electrónico">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <whiteSpace value="collapse"/>
 *             <minLength value="1"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="numeroDeCuenta" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <whiteSpace value="collapse"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="subTotal">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             <fractionDigits value="2"/>
 *             <whiteSpace value="collapse"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="total" use="required">
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
@XmlType(name = "", propOrder = {
    "conceptos"
})
@XmlRootElement(name = "ConsumoDeCombustibles")
public class ConsumoDeCombustibles {

    /**
     * Nodo requerido para enlistar los conceptos cubiertos por Consumo de Combustibles.
     * 
     */
    @XmlElement(name = "Conceptos", required = true)
    protected ConsumoDeCombustibles.Conceptos conceptos;
    /**
     * Atributo requerido para la expresión de la versión del complemento
     * 
     */
    @XmlAttribute(name = "version", required = true)
    protected String version;
    /**
     * Atributo requerido para expresar el tipo de operación de acuerdo con el medio de pago.
     * 
     */
    @XmlAttribute(name = "tipoOperacion", required = true)
    protected String tipoOperacion;
    /**
     * Nodo requerido para expresar el número de cuenta del adquirente del monedero electrónico
     * 
     */
    @XmlAttribute(name = "numeroDeCuenta", required = true)
    protected String numeroDeCuenta;
    /**
     * Atributo opcional para representar la suma de todos los importes tipo ConceptoConsumoDeCombustibles.
     * 
     */
    @XmlAttribute(name = "subTotal")
    protected BigDecimal subTotal;
    /**
     * Atributo requerido para expresar el monto total de consumo de combustibles.
     * 
     */
    @XmlAttribute(name = "total", required = true)
    protected BigDecimal total;

    /**
     * Nodo requerido para enlistar los conceptos cubiertos por Consumo de Combustibles.
     * 
     * @return
     *     possible object is
     *     {@link ConsumoDeCombustibles.Conceptos }
     *     
     */
    public ConsumoDeCombustibles.Conceptos getConceptos() {
        return conceptos;
    }

    /**
     * Define el valor de la propiedad conceptos.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumoDeCombustibles.Conceptos }
     *     
     * @see #getConceptos()
     */
    public void setConceptos(ConsumoDeCombustibles.Conceptos value) {
        this.conceptos = value;
    }

    /**
     * Atributo requerido para la expresión de la versión del complemento
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
     * Atributo requerido para expresar el tipo de operación de acuerdo con el medio de pago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOperacion() {
        if (tipoOperacion == null) {
            return "monedero electr\u00f3nico";
        } else {
            return tipoOperacion;
        }
    }

    /**
     * Define el valor de la propiedad tipoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTipoOperacion()
     */
    public void setTipoOperacion(String value) {
        this.tipoOperacion = value;
    }

    /**
     * Nodo requerido para expresar el número de cuenta del adquirente del monedero electrónico
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    /**
     * Define el valor de la propiedad numeroDeCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNumeroDeCuenta()
     */
    public void setNumeroDeCuenta(String value) {
        this.numeroDeCuenta = value;
    }

    /**
     * Atributo opcional para representar la suma de todos los importes tipo ConceptoConsumoDeCombustibles.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubTotal() {
        return subTotal;
    }

    /**
     * Define el valor de la propiedad subTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getSubTotal()
     */
    public void setSubTotal(BigDecimal value) {
        this.subTotal = value;
    }

    /**
     * Atributo requerido para expresar el monto total de consumo de combustibles.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotal()
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
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
     *       <sequence>
     *         <element name="ConceptoConsumoDeCombustibles" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Determinados">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="Determinado" maxOccurs="unbounded">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <attribute name="impuesto" use="required">
     *                                       <simpleType>
     *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           <whiteSpace value="collapse"/>
     *                                           <enumeration value="IVA"/>
     *                                           <enumeration value="IEPS"/>
     *                                         </restriction>
     *                                       </simpleType>
     *                                     </attribute>
     *                                     <attribute name="tasaOCuota" use="required">
     *                                       <simpleType>
     *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                           <fractionDigits value="6"/>
     *                                           <whiteSpace value="collapse"/>
     *                                         </restriction>
     *                                       </simpleType>
     *                                     </attribute>
     *                                     <attribute name="importe" use="required">
     *                                       <simpleType>
     *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                           <fractionDigits value="2"/>
     *                                           <whiteSpace value="collapse"/>
     *                                         </restriction>
     *                                       </simpleType>
     *                                     </attribute>
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                 </sequence>
     *                 <attribute name="identificador" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <minLength value="1"/>
     *                       <whiteSpace value="collapse"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="fecha" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_FechaH" />
     *                 <attribute name="rfc" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC" />
     *                 <attribute name="claveEstacion" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <whiteSpace value="collapse"/>
     *                       <minLength value="1"/>
     *                       <maxLength value="10"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="tipoCombustible" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Combustible}c_ClaveTipoCombustible" />
     *                 <attribute name="cantidad" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                       <minInclusive value="0.001"/>
     *                       <pattern value="[0-9]{1,14}(.([0-9]{3}))"/>
     *                       <whiteSpace value="collapse"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="nombreCombustible" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <whiteSpace value="collapse"/>
     *                       <minLength value="1"/>
     *                       <maxLength value="300"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="folioOperacion" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <whiteSpace value="collapse"/>
     *                       <minLength value="1"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="valorUnitario" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                       <whiteSpace value="collapse"/>
     *                       <fractionDigits value="2"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="importe" use="required">
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
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "conceptoConsumoDeCombustibles"
    })
    public static class Conceptos {

        /**
         * Nodo requerido para la expresión de una transacción para operaciones de compra de combustibles.
         * 
         */
        @XmlElement(name = "ConceptoConsumoDeCombustibles", required = true)
        protected List<ConsumoDeCombustibles.Conceptos.ConceptoConsumoDeCombustibles> conceptoConsumoDeCombustibles;

        /**
         * Nodo requerido para la expresión de una transacción para operaciones de compra de combustibles.
         * 
         * Gets the value of the conceptoConsumoDeCombustibles property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conceptoConsumoDeCombustibles property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getConceptoConsumoDeCombustibles().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ConsumoDeCombustibles.Conceptos.ConceptoConsumoDeCombustibles }
         * </p>
         * 
         * 
         * @return
         *     The value of the conceptoConsumoDeCombustibles property.
         */
        public List<ConsumoDeCombustibles.Conceptos.ConceptoConsumoDeCombustibles> getConceptoConsumoDeCombustibles() {
            if (conceptoConsumoDeCombustibles == null) {
                conceptoConsumoDeCombustibles = new ArrayList<>();
            }
            return this.conceptoConsumoDeCombustibles;
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
         *       <sequence>
         *         <element name="Determinados">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="Determinado" maxOccurs="unbounded">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <attribute name="impuesto" use="required">
         *                             <simpleType>
         *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 <whiteSpace value="collapse"/>
         *                                 <enumeration value="IVA"/>
         *                                 <enumeration value="IEPS"/>
         *                               </restriction>
         *                             </simpleType>
         *                           </attribute>
         *                           <attribute name="tasaOCuota" use="required">
         *                             <simpleType>
         *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                 <fractionDigits value="6"/>
         *                                 <whiteSpace value="collapse"/>
         *                               </restriction>
         *                             </simpleType>
         *                           </attribute>
         *                           <attribute name="importe" use="required">
         *                             <simpleType>
         *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                 <fractionDigits value="2"/>
         *                                 <whiteSpace value="collapse"/>
         *                               </restriction>
         *                             </simpleType>
         *                           </attribute>
         *                         </restriction>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *       </sequence>
         *       <attribute name="identificador" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <minLength value="1"/>
         *             <whiteSpace value="collapse"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="fecha" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_FechaH" />
         *       <attribute name="rfc" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC" />
         *       <attribute name="claveEstacion" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <whiteSpace value="collapse"/>
         *             <minLength value="1"/>
         *             <maxLength value="10"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="tipoCombustible" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Combustible}c_ClaveTipoCombustible" />
         *       <attribute name="cantidad" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *             <minInclusive value="0.001"/>
         *             <pattern value="[0-9]{1,14}(.([0-9]{3}))"/>
         *             <whiteSpace value="collapse"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="nombreCombustible" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <whiteSpace value="collapse"/>
         *             <minLength value="1"/>
         *             <maxLength value="300"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="folioOperacion" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <whiteSpace value="collapse"/>
         *             <minLength value="1"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="valorUnitario" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *             <whiteSpace value="collapse"/>
         *             <fractionDigits value="2"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="importe" use="required">
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
        @XmlType(name = "", propOrder = {
            "determinados"
        })
        public static class ConceptoConsumoDeCombustibles {

            /**
             * Nodo requerido para enlistar los impuestos determinados aplicables de combustibles.
             * 
             */
            @XmlElement(name = "Determinados", required = true)
            protected ConsumoDeCombustibles.Conceptos.ConceptoConsumoDeCombustibles.Determinados determinados;
            /**
             * Atributo requerido para la expresión del identificador o número del monedero electrónico
             * 
             */
            @XmlAttribute(name = "identificador", required = true)
            protected String identificador;
            /**
             * Atributo requerido para la expresión de la Fecha y hora de expedición  de la operación reportada. Se expresa en la forma aaaa-mm-ddThh:mm:ss, de acuerdo con la especificación ISO 8601.
             * 
             */
            @XmlAttribute(name = "fecha", required = true)
            @XmlJavaTypeAdapter(DateTimeAdapter.class)
            protected LocalDateTime fecha;
            /**
             * Atributo requerido del RFC del enajenante del combustible
             * 
             */
            @XmlAttribute(name = "rfc", required = true)
            protected String rfc;
            /**
             * Atributo requerido  para expresar la clave de cliente de la estación de servicio, a 10 caracteres, cuando sea requerido.
             * 
             */
            @XmlAttribute(name = "claveEstacion", required = true)
            protected String claveEstacion;
            /**
             * Atributo requerido para indicar la clave del tipo de combustible.
             * 
             */
            @XmlAttribute(name = "tipoCombustible", required = true)
            protected CClaveTipoCombustible tipoCombustible;
            /**
             * Atributo requerido para definir el volumen de combustible adquirido.
             * 
             */
            @XmlAttribute(name = "cantidad", required = true)
            protected BigDecimal cantidad;
            /**
             * Atributo requerido para expresar el nombre del combustible adquirido.
             * 
             */
            @XmlAttribute(name = "nombreCombustible", required = true)
            protected String nombreCombustible;
            /**
             * Atributo requerido para referir el número de folio de cada operación realizada por cada monedero electrónico.
             * 
             */
            @XmlAttribute(name = "folioOperacion", required = true)
            protected String folioOperacion;
            /**
             * Atributo requerido para definir el precio unitario del combustible adquirido.
             * 
             */
            @XmlAttribute(name = "valorUnitario", required = true)
            protected BigDecimal valorUnitario;
            /**
             * Atributo requerido para definir el monto  total de consumo de combustible. Debe ser equivalente al resultado de multiplicar la cantidad por el valor unitario.
             * 
             */
            @XmlAttribute(name = "importe", required = true)
            protected BigDecimal importe;

            /**
             * Nodo requerido para enlistar los impuestos determinados aplicables de combustibles.
             * 
             * @return
             *     possible object is
             *     {@link ConsumoDeCombustibles.Conceptos.ConceptoConsumoDeCombustibles.Determinados }
             *     
             */
            public ConsumoDeCombustibles.Conceptos.ConceptoConsumoDeCombustibles.Determinados getDeterminados() {
                return determinados;
            }

            /**
             * Define el valor de la propiedad determinados.
             * 
             * @param value
             *     allowed object is
             *     {@link ConsumoDeCombustibles.Conceptos.ConceptoConsumoDeCombustibles.Determinados }
             *     
             * @see #getDeterminados()
             */
            public void setDeterminados(ConsumoDeCombustibles.Conceptos.ConceptoConsumoDeCombustibles.Determinados value) {
                this.determinados = value;
            }

            /**
             * Atributo requerido para la expresión del identificador o número del monedero electrónico
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdentificador() {
                return identificador;
            }

            /**
             * Define el valor de la propiedad identificador.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getIdentificador()
             */
            public void setIdentificador(String value) {
                this.identificador = value;
            }

            /**
             * Atributo requerido para la expresión de la Fecha y hora de expedición  de la operación reportada. Se expresa en la forma aaaa-mm-ddThh:mm:ss, de acuerdo con la especificación ISO 8601.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public LocalDateTime getFecha() {
                return fecha;
            }

            /**
             * Define el valor de la propiedad fecha.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getFecha()
             */
            public void setFecha(LocalDateTime value) {
                this.fecha = value;
            }

            /**
             * Atributo requerido del RFC del enajenante del combustible
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRfc() {
                return rfc;
            }

            /**
             * Define el valor de la propiedad rfc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getRfc()
             */
            public void setRfc(String value) {
                this.rfc = value;
            }

            /**
             * Atributo requerido  para expresar la clave de cliente de la estación de servicio, a 10 caracteres, cuando sea requerido.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaveEstacion() {
                return claveEstacion;
            }

            /**
             * Define el valor de la propiedad claveEstacion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getClaveEstacion()
             */
            public void setClaveEstacion(String value) {
                this.claveEstacion = value;
            }

            /**
             * Atributo requerido para indicar la clave del tipo de combustible.
             * 
             * @return
             *     possible object is
             *     {@link CClaveTipoCombustible }
             *     
             */
            public CClaveTipoCombustible getTipoCombustible() {
                return tipoCombustible;
            }

            /**
             * Define el valor de la propiedad tipoCombustible.
             * 
             * @param value
             *     allowed object is
             *     {@link CClaveTipoCombustible }
             *     
             * @see #getTipoCombustible()
             */
            public void setTipoCombustible(CClaveTipoCombustible value) {
                this.tipoCombustible = value;
            }

            /**
             * Atributo requerido para definir el volumen de combustible adquirido.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCantidad() {
                return cantidad;
            }

            /**
             * Define el valor de la propiedad cantidad.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getCantidad()
             */
            public void setCantidad(BigDecimal value) {
                this.cantidad = value;
            }

            /**
             * Atributo requerido para expresar el nombre del combustible adquirido.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreCombustible() {
                return nombreCombustible;
            }

            /**
             * Define el valor de la propiedad nombreCombustible.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getNombreCombustible()
             */
            public void setNombreCombustible(String value) {
                this.nombreCombustible = value;
            }

            /**
             * Atributo requerido para referir el número de folio de cada operación realizada por cada monedero electrónico.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFolioOperacion() {
                return folioOperacion;
            }

            /**
             * Define el valor de la propiedad folioOperacion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getFolioOperacion()
             */
            public void setFolioOperacion(String value) {
                this.folioOperacion = value;
            }

            /**
             * Atributo requerido para definir el precio unitario del combustible adquirido.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorUnitario() {
                return valorUnitario;
            }

            /**
             * Define el valor de la propiedad valorUnitario.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getValorUnitario()
             */
            public void setValorUnitario(BigDecimal value) {
                this.valorUnitario = value;
            }

            /**
             * Atributo requerido para definir el monto  total de consumo de combustible. Debe ser equivalente al resultado de multiplicar la cantidad por el valor unitario.
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


            /**
             * <p>Clase Java para anonymous complex type.</p>
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       <sequence>
             *         <element name="Determinado" maxOccurs="unbounded">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <attribute name="impuesto" use="required">
             *                   <simpleType>
             *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       <whiteSpace value="collapse"/>
             *                       <enumeration value="IVA"/>
             *                       <enumeration value="IEPS"/>
             *                     </restriction>
             *                   </simpleType>
             *                 </attribute>
             *                 <attribute name="tasaOCuota" use="required">
             *                   <simpleType>
             *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                       <fractionDigits value="6"/>
             *                       <whiteSpace value="collapse"/>
             *                     </restriction>
             *                   </simpleType>
             *                 </attribute>
             *                 <attribute name="importe" use="required">
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
             *     </restriction>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "determinado"
            })
            public static class Determinados {

                /**
                 * Nodo para la definición de información detallada de un impuesto específico
                 * 
                 */
                @XmlElement(name = "Determinado", required = true)
                protected List<ConsumoDeCombustibles.Conceptos.ConceptoConsumoDeCombustibles.Determinados.Determinado> determinado;

                /**
                 * Nodo para la definición de información detallada de un impuesto específico
                 * 
                 * Gets the value of the determinado property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the determinado property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getDeterminado().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ConsumoDeCombustibles.Conceptos.ConceptoConsumoDeCombustibles.Determinados.Determinado }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the determinado property.
                 */
                public List<ConsumoDeCombustibles.Conceptos.ConceptoConsumoDeCombustibles.Determinados.Determinado> getDeterminado() {
                    if (determinado == null) {
                        determinado = new ArrayList<>();
                    }
                    return this.determinado;
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
                 *       <attribute name="impuesto" use="required">
                 *         <simpleType>
                 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             <whiteSpace value="collapse"/>
                 *             <enumeration value="IVA"/>
                 *             <enumeration value="IEPS"/>
                 *           </restriction>
                 *         </simpleType>
                 *       </attribute>
                 *       <attribute name="tasaOCuota" use="required">
                 *         <simpleType>
                 *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *             <fractionDigits value="6"/>
                 *             <whiteSpace value="collapse"/>
                 *           </restriction>
                 *         </simpleType>
                 *       </attribute>
                 *       <attribute name="importe" use="required">
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
                public static class Determinado {

                    /**
                     * Atributo requerido para definir el tipo de impuesto
                     * 
                     */
                    @XmlAttribute(name = "impuesto", required = true)
                    protected String impuesto;
                    /**
                     * Atributo requerido para señalar la tasa del impuesto por cada concepto amparado en el comprobante
                     * 
                     */
                    @XmlAttribute(name = "tasaOCuota", required = true)
                    protected BigDecimal tasaOCuota;
                    /**
                     * Atributo requerido para definir el importe o monto del impuesto
                     * 
                     */
                    @XmlAttribute(name = "importe", required = true)
                    protected BigDecimal importe;

                    /**
                     * Atributo requerido para definir el tipo de impuesto
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getImpuesto() {
                        return impuesto;
                    }

                    /**
                     * Define el valor de la propiedad impuesto.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     * @see #getImpuesto()
                     */
                    public void setImpuesto(String value) {
                        this.impuesto = value;
                    }

                    /**
                     * Atributo requerido para señalar la tasa del impuesto por cada concepto amparado en el comprobante
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getTasaOCuota() {
                        return tasaOCuota;
                    }

                    /**
                     * Define el valor de la propiedad tasaOCuota.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     * @see #getTasaOCuota()
                     */
                    public void setTasaOCuota(BigDecimal value) {
                        this.tasaOCuota = value;
                    }

                    /**
                     * Atributo requerido para definir el importe o monto del impuesto
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

        }

    }

}
