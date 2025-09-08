//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package com.angelsoft.sat.common.EstadoDeCuentaCombustible12;

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
 *                   <element name="ConceptoEstadoDeCuentaCombustible" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="Traslados">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="Traslado" maxOccurs="unbounded">
 *                                         <complexType>
 *                                           <complexContent>
 *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               <attribute name="Impuesto" use="required">
 *                                                 <simpleType>
 *                                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     <whiteSpace value="collapse"/>
 *                                                     <enumeration value="IVA"/>
 *                                                     <enumeration value="IEPS"/>
 *                                                   </restriction>
 *                                                 </simpleType>
 *                                               </attribute>
 *                                               <attribute name="TasaOCuota" use="required">
 *                                                 <simpleType>
 *                                                   <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                     <fractionDigits value="6"/>
 *                                                     <whiteSpace value="collapse"/>
 *                                                   </restriction>
 *                                                 </simpleType>
 *                                               </attribute>
 *                                               <attribute name="Importe" use="required">
 *                                                 <simpleType>
 *                                                   <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                     <fractionDigits value="2"/>
 *                                                     <whiteSpace value="collapse"/>
 *                                                     <minInclusive value="0.01"/>
 *                                                     <pattern value="[0-9]{1,14}(.([0-9]{1,2}))"/>
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
 *                           <attribute name="Identificador" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <minLength value="1"/>
 *                                 <whiteSpace value="collapse"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="Fecha" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_FechaH" />
 *                           <attribute name="Rfc" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC" />
 *                           <attribute name="ClaveEstacion" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <whiteSpace value="collapse"/>
 *                                 <minLength value="1"/>
 *                                 <maxLength value="10"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="Cantidad" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 <minInclusive value="0.001"/>
 *                                 <fractionDigits value="3"/>
 *                                 <whiteSpace value="collapse"/>
 *                                 <pattern value="[0-9]{1,14}(.([0-9]{1,3}))"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="TipoCombustible" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Combustible}c_ClaveTipoCombustible" />
 *                           <attribute name="Unidad">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <whiteSpace value="collapse"/>
 *                                 <minLength value="1"/>
 *                                 <maxLength value="25"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="NombreCombustible" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <whiteSpace value="collapse"/>
 *                                 <minLength value="1"/>
 *                                 <maxLength value="300"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="FolioOperacion" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <whiteSpace value="collapse"/>
 *                                 <minLength value="1"/>
 *                                 <maxLength value="50"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="ValorUnitario" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 <minInclusive value="0.001"/>
 *                                 <fractionDigits value="3"/>
 *                                 <whiteSpace value="collapse"/>
 *                                 <pattern value="[0-9]{1,14}(.([0-9]{1,3}))"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="Importe" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 <fractionDigits value="2"/>
 *                                 <whiteSpace value="collapse"/>
 *                                 <pattern value="[0-9]{1,14}(.([0-9]{1,2}))"/>
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
 *       <attribute name="Version" use="required" fixed="1.2">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <whiteSpace value="collapse"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="TipoOperacion" use="required" fixed="Tarjeta">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <whiteSpace value="collapse"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="NumeroDeCuenta" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="50"/>
 *             <whiteSpace value="collapse"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="SubTotal" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             <fractionDigits value="2"/>
 *             <whiteSpace value="collapse"/>
 *             <pattern value="[0-9]{1,14}(.([0-9]{1,2}))"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Total" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             <fractionDigits value="2"/>
 *             <whiteSpace value="collapse"/>
 *             <pattern value="[0-9]{1,14}(.([0-9]{1,2}))"/>
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
@XmlRootElement(name = "EstadoDeCuentaCombustible")
public class EstadoDeCuentaCombustible {

    /**
     * Nodo requerido para enlistar los conceptos cubiertos por Estado de Cuenta de Combustible.
     * 
     */
    @XmlElement(name = "Conceptos", required = true)
    protected EstadoDeCuentaCombustible.Conceptos conceptos;
    /**
     * Atributo requerido que indica la versión del complemento.
     * 
     */
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    /**
     * Atributo requerido para expresar el tipo de operación de acuerdo con el medio de pago.
     * 
     */
    @XmlAttribute(name = "TipoOperacion", required = true)
    protected String tipoOperacion;
    /**
     * Atributo requerido para expresar el número de cuenta del adquirente del monedero electrónico
     * 
     */
    @XmlAttribute(name = "NumeroDeCuenta", required = true)
    protected String numeroDeCuenta;
    /**
     * Atributo requerido para representar la suma de todos los importes tipo ConceptoEstadoDeCuentaCombustible.
     * 
     */
    @XmlAttribute(name = "SubTotal", required = true)
    protected BigDecimal subTotal;
    /**
     * Atributo requerido para expresar el monto total de consumo de combustible.
     * 
     */
    @XmlAttribute(name = "Total", required = true)
    protected BigDecimal total;

    /**
     * Nodo requerido para enlistar los conceptos cubiertos por Estado de Cuenta de Combustible.
     * 
     * @return
     *     possible object is
     *     {@link EstadoDeCuentaCombustible.Conceptos }
     *     
     */
    public EstadoDeCuentaCombustible.Conceptos getConceptos() {
        return conceptos;
    }

    /**
     * Define el valor de la propiedad conceptos.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoDeCuentaCombustible.Conceptos }
     *     
     * @see #getConceptos()
     */
    public void setConceptos(EstadoDeCuentaCombustible.Conceptos value) {
        this.conceptos = value;
    }

    /**
     * Atributo requerido que indica la versión del complemento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.2";
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
            return "Tarjeta";
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
     * Atributo requerido para expresar el número de cuenta del adquirente del monedero electrónico
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
     * Atributo requerido para representar la suma de todos los importes tipo ConceptoEstadoDeCuentaCombustible.
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
     * Atributo requerido para expresar el monto total de consumo de combustible.
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
     *         <element name="ConceptoEstadoDeCuentaCombustible" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Traslados">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="Traslado" maxOccurs="unbounded">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <attribute name="Impuesto" use="required">
     *                                       <simpleType>
     *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           <whiteSpace value="collapse"/>
     *                                           <enumeration value="IVA"/>
     *                                           <enumeration value="IEPS"/>
     *                                         </restriction>
     *                                       </simpleType>
     *                                     </attribute>
     *                                     <attribute name="TasaOCuota" use="required">
     *                                       <simpleType>
     *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                           <fractionDigits value="6"/>
     *                                           <whiteSpace value="collapse"/>
     *                                         </restriction>
     *                                       </simpleType>
     *                                     </attribute>
     *                                     <attribute name="Importe" use="required">
     *                                       <simpleType>
     *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                           <fractionDigits value="2"/>
     *                                           <whiteSpace value="collapse"/>
     *                                           <minInclusive value="0.01"/>
     *                                           <pattern value="[0-9]{1,14}(.([0-9]{1,2}))"/>
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
     *                 <attribute name="Identificador" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <minLength value="1"/>
     *                       <whiteSpace value="collapse"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="Fecha" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_FechaH" />
     *                 <attribute name="Rfc" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC" />
     *                 <attribute name="ClaveEstacion" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <whiteSpace value="collapse"/>
     *                       <minLength value="1"/>
     *                       <maxLength value="10"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="Cantidad" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                       <minInclusive value="0.001"/>
     *                       <fractionDigits value="3"/>
     *                       <whiteSpace value="collapse"/>
     *                       <pattern value="[0-9]{1,14}(.([0-9]{1,3}))"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="TipoCombustible" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Combustible}c_ClaveTipoCombustible" />
     *                 <attribute name="Unidad">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <whiteSpace value="collapse"/>
     *                       <minLength value="1"/>
     *                       <maxLength value="25"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="NombreCombustible" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <whiteSpace value="collapse"/>
     *                       <minLength value="1"/>
     *                       <maxLength value="300"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="FolioOperacion" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <whiteSpace value="collapse"/>
     *                       <minLength value="1"/>
     *                       <maxLength value="50"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="ValorUnitario" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                       <minInclusive value="0.001"/>
     *                       <fractionDigits value="3"/>
     *                       <whiteSpace value="collapse"/>
     *                       <pattern value="[0-9]{1,14}(.([0-9]{1,3}))"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="Importe" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                       <fractionDigits value="2"/>
     *                       <whiteSpace value="collapse"/>
     *                       <pattern value="[0-9]{1,14}(.([0-9]{1,2}))"/>
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
        "conceptoEstadoDeCuentaCombustible"
    })
    public static class Conceptos {

        /**
         * Nodo requerido para la expresión de una transacción a ser reportada en el estado de cuenta del proveedor de monedero electrónico para operaciones de compra de combustibles.
         * 
         */
        @XmlElement(name = "ConceptoEstadoDeCuentaCombustible", required = true)
        protected List<EstadoDeCuentaCombustible.Conceptos.ConceptoEstadoDeCuentaCombustible> conceptoEstadoDeCuentaCombustible;

        /**
         * Nodo requerido para la expresión de una transacción a ser reportada en el estado de cuenta del proveedor de monedero electrónico para operaciones de compra de combustibles.
         * 
         * Gets the value of the conceptoEstadoDeCuentaCombustible property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conceptoEstadoDeCuentaCombustible property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getConceptoEstadoDeCuentaCombustible().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EstadoDeCuentaCombustible.Conceptos.ConceptoEstadoDeCuentaCombustible }
         * </p>
         * 
         * 
         * @return
         *     The value of the conceptoEstadoDeCuentaCombustible property.
         */
        public List<EstadoDeCuentaCombustible.Conceptos.ConceptoEstadoDeCuentaCombustible> getConceptoEstadoDeCuentaCombustible() {
            if (conceptoEstadoDeCuentaCombustible == null) {
                conceptoEstadoDeCuentaCombustible = new ArrayList<>();
            }
            return this.conceptoEstadoDeCuentaCombustible;
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
         *         <element name="Traslados">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="Traslado" maxOccurs="unbounded">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <attribute name="Impuesto" use="required">
         *                             <simpleType>
         *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 <whiteSpace value="collapse"/>
         *                                 <enumeration value="IVA"/>
         *                                 <enumeration value="IEPS"/>
         *                               </restriction>
         *                             </simpleType>
         *                           </attribute>
         *                           <attribute name="TasaOCuota" use="required">
         *                             <simpleType>
         *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                 <fractionDigits value="6"/>
         *                                 <whiteSpace value="collapse"/>
         *                               </restriction>
         *                             </simpleType>
         *                           </attribute>
         *                           <attribute name="Importe" use="required">
         *                             <simpleType>
         *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                 <fractionDigits value="2"/>
         *                                 <whiteSpace value="collapse"/>
         *                                 <minInclusive value="0.01"/>
         *                                 <pattern value="[0-9]{1,14}(.([0-9]{1,2}))"/>
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
         *       <attribute name="Identificador" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <minLength value="1"/>
         *             <whiteSpace value="collapse"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="Fecha" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_FechaH" />
         *       <attribute name="Rfc" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC" />
         *       <attribute name="ClaveEstacion" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <whiteSpace value="collapse"/>
         *             <minLength value="1"/>
         *             <maxLength value="10"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="Cantidad" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *             <minInclusive value="0.001"/>
         *             <fractionDigits value="3"/>
         *             <whiteSpace value="collapse"/>
         *             <pattern value="[0-9]{1,14}(.([0-9]{1,3}))"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="TipoCombustible" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Combustible}c_ClaveTipoCombustible" />
         *       <attribute name="Unidad">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <whiteSpace value="collapse"/>
         *             <minLength value="1"/>
         *             <maxLength value="25"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="NombreCombustible" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <whiteSpace value="collapse"/>
         *             <minLength value="1"/>
         *             <maxLength value="300"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="FolioOperacion" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <whiteSpace value="collapse"/>
         *             <minLength value="1"/>
         *             <maxLength value="50"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="ValorUnitario" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *             <minInclusive value="0.001"/>
         *             <fractionDigits value="3"/>
         *             <whiteSpace value="collapse"/>
         *             <pattern value="[0-9]{1,14}(.([0-9]{1,3}))"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="Importe" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *             <fractionDigits value="2"/>
         *             <whiteSpace value="collapse"/>
         *             <pattern value="[0-9]{1,14}(.([0-9]{1,2}))"/>
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
            "traslados"
        })
        public static class ConceptoEstadoDeCuentaCombustible {

            /**
             * Nodo requerido para enlistar los impuestos trasladados aplicables de combustibles.
             * 
             */
            @XmlElement(name = "Traslados", required = true)
            protected EstadoDeCuentaCombustible.Conceptos.ConceptoEstadoDeCuentaCombustible.Traslados traslados;
            /**
             * Atributo requerido para la expresión del identificador o número del monedero electrónico.
             * 
             */
            @XmlAttribute(name = "Identificador", required = true)
            protected String identificador;
            /**
             * Atributo requerido para la expresión de la Fecha y hora de expedición de la operación reportada. Se expresa en la forma aaaa-mm-ddThh:mm:ss, de acuerdo con la especificación ISO 8601.
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xs:minInclusive xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:catCombustible="http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Combustible" xmlns:ecc12="http://www.sat.gob.mx/EstadoDeCuentaCombustible12" xmlns:p28804_="https://jakarta.ee/xml/ns/jaxb" xmlns:p805066_="http://java.sun.com/xml/ns/jaxb/xjc" xmlns:tdCFDI="http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI" value="2015-01-01T00:00:00"/&gt;
             * </pre>
             * 
             */
            @XmlAttribute(name = "Fecha", required = true)
            @XmlJavaTypeAdapter(DateTimeAdapter.class)
            protected LocalDateTime fecha;
            /**
             * Atributo requerido del RFC del enajenante del combustible.
             * 
             */
            @XmlAttribute(name = "Rfc", required = true)
            protected String rfc;
            /**
             * Atributo requerido para expresar la clave de cliente de la estación de servicio, a 10 caracteres.
             * 
             */
            @XmlAttribute(name = "ClaveEstacion", required = true)
            protected String claveEstacion;
            /**
             * Atributo requerido para definir el volumen de combustible adquirido.
             * 
             */
            @XmlAttribute(name = "Cantidad", required = true)
            protected BigDecimal cantidad;
            /**
             * Atributo requerido para indicar la clave del tipo de combustible.
             * 
             */
            @XmlAttribute(name = "TipoCombustible", required = true)
            protected CClaveTipoCombustible tipoCombustible;
            /**
             * Atributo condicional para precisar la unidad de medida.
             * 
             */
            @XmlAttribute(name = "Unidad")
            protected String unidad;
            /**
             * Atributo requerido para expresar el nombre del combustible adquirido.
             * 
             */
            @XmlAttribute(name = "NombreCombustible", required = true)
            protected String nombreCombustible;
            /**
             * Atributo requerido para referir el número de folio de cada operación realizada por cada monedero electrónico.
             * 
             */
            @XmlAttribute(name = "FolioOperacion", required = true)
            protected String folioOperacion;
            /**
             * Atributo requerido para definir el precio unitario del combustible adquirido.
             * 
             */
            @XmlAttribute(name = "ValorUnitario", required = true)
            protected BigDecimal valorUnitario;
            /**
             * Atributo requerido para definir el monto total de consumo de combustible. Debe ser equivalente al resultado de multiplicar la cantidad por el valor unitario, redondeado a centésimas.
             * 
             */
            @XmlAttribute(name = "Importe", required = true)
            protected BigDecimal importe;

            /**
             * Nodo requerido para enlistar los impuestos trasladados aplicables de combustibles.
             * 
             * @return
             *     possible object is
             *     {@link EstadoDeCuentaCombustible.Conceptos.ConceptoEstadoDeCuentaCombustible.Traslados }
             *     
             */
            public EstadoDeCuentaCombustible.Conceptos.ConceptoEstadoDeCuentaCombustible.Traslados getTraslados() {
                return traslados;
            }

            /**
             * Define el valor de la propiedad traslados.
             * 
             * @param value
             *     allowed object is
             *     {@link EstadoDeCuentaCombustible.Conceptos.ConceptoEstadoDeCuentaCombustible.Traslados }
             *     
             * @see #getTraslados()
             */
            public void setTraslados(EstadoDeCuentaCombustible.Conceptos.ConceptoEstadoDeCuentaCombustible.Traslados value) {
                this.traslados = value;
            }

            /**
             * Atributo requerido para la expresión del identificador o número del monedero electrónico.
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
             * Atributo requerido para la expresión de la Fecha y hora de expedición de la operación reportada. Se expresa en la forma aaaa-mm-ddThh:mm:ss, de acuerdo con la especificación ISO 8601.
             * <pre>
             * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xs:minInclusive xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:catCombustible="http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Combustible" xmlns:ecc12="http://www.sat.gob.mx/EstadoDeCuentaCombustible12" xmlns:p28804_="https://jakarta.ee/xml/ns/jaxb" xmlns:p805066_="http://java.sun.com/xml/ns/jaxb/xjc" xmlns:tdCFDI="http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI" value="2015-01-01T00:00:00"/&gt;
             * </pre>
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
             * Atributo requerido del RFC del enajenante del combustible.
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
             * Atributo requerido para expresar la clave de cliente de la estación de servicio, a 10 caracteres.
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
             * Atributo condicional para precisar la unidad de medida.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnidad() {
                return unidad;
            }

            /**
             * Define el valor de la propiedad unidad.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getUnidad()
             */
            public void setUnidad(String value) {
                this.unidad = value;
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
             * Atributo requerido para definir el monto total de consumo de combustible. Debe ser equivalente al resultado de multiplicar la cantidad por el valor unitario, redondeado a centésimas.
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
             *         <element name="Traslado" maxOccurs="unbounded">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <attribute name="Impuesto" use="required">
             *                   <simpleType>
             *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       <whiteSpace value="collapse"/>
             *                       <enumeration value="IVA"/>
             *                       <enumeration value="IEPS"/>
             *                     </restriction>
             *                   </simpleType>
             *                 </attribute>
             *                 <attribute name="TasaOCuota" use="required">
             *                   <simpleType>
             *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                       <fractionDigits value="6"/>
             *                       <whiteSpace value="collapse"/>
             *                     </restriction>
             *                   </simpleType>
             *                 </attribute>
             *                 <attribute name="Importe" use="required">
             *                   <simpleType>
             *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                       <fractionDigits value="2"/>
             *                       <whiteSpace value="collapse"/>
             *                       <minInclusive value="0.01"/>
             *                       <pattern value="[0-9]{1,14}(.([0-9]{1,2}))"/>
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
                "traslado"
            })
            public static class Traslados {

                /**
                 * Nodo para la definición de información detallada de un traslado de impuesto específico.
                 * 
                 */
                @XmlElement(name = "Traslado", required = true)
                protected List<EstadoDeCuentaCombustible.Conceptos.ConceptoEstadoDeCuentaCombustible.Traslados.Traslado> traslado;

                /**
                 * Nodo para la definición de información detallada de un traslado de impuesto específico.
                 * 
                 * Gets the value of the traslado property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the traslado property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getTraslado().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link EstadoDeCuentaCombustible.Conceptos.ConceptoEstadoDeCuentaCombustible.Traslados.Traslado }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the traslado property.
                 */
                public List<EstadoDeCuentaCombustible.Conceptos.ConceptoEstadoDeCuentaCombustible.Traslados.Traslado> getTraslado() {
                    if (traslado == null) {
                        traslado = new ArrayList<>();
                    }
                    return this.traslado;
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
                 *       <attribute name="Impuesto" use="required">
                 *         <simpleType>
                 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             <whiteSpace value="collapse"/>
                 *             <enumeration value="IVA"/>
                 *             <enumeration value="IEPS"/>
                 *           </restriction>
                 *         </simpleType>
                 *       </attribute>
                 *       <attribute name="TasaOCuota" use="required">
                 *         <simpleType>
                 *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *             <fractionDigits value="6"/>
                 *             <whiteSpace value="collapse"/>
                 *           </restriction>
                 *         </simpleType>
                 *       </attribute>
                 *       <attribute name="Importe" use="required">
                 *         <simpleType>
                 *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *             <fractionDigits value="2"/>
                 *             <whiteSpace value="collapse"/>
                 *             <minInclusive value="0.01"/>
                 *             <pattern value="[0-9]{1,14}(.([0-9]{1,2}))"/>
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
                public static class Traslado {

                    /**
                     * Atributo requerido para definir el tipo de impuesto trasladado.
                     * 
                     */
                    @XmlAttribute(name = "Impuesto", required = true)
                    protected String impuesto;
                    /**
                     * Atributo requerido para señalar la tasa o la cuota del impuesto que se traslada por cada concepto amparado en el comprobante. Cuando se registre un porcentaje, por ejemplo 16%, debe expresarse como 0.16 y no como 16.00
                     * 
                     */
                    @XmlAttribute(name = "TasaOCuota", required = true)
                    protected BigDecimal tasaOCuota;
                    /**
                     * Atributo requerido para definir el importe o monto del impuesto trasladado.
                     * 
                     */
                    @XmlAttribute(name = "Importe", required = true)
                    protected BigDecimal importe;

                    /**
                     * Atributo requerido para definir el tipo de impuesto trasladado.
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
                     * Atributo requerido para señalar la tasa o la cuota del impuesto que se traslada por cada concepto amparado en el comprobante. Cuando se registre un porcentaje, por ejemplo 16%, debe expresarse como 0.16 y no como 16.00
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
                     * Atributo requerido para definir el importe o monto del impuesto trasladado.
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
