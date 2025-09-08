//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package com.angelsoft.sat.common.Pagos20;

import java.math.BigDecimal;
import java.math.BigInteger;
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
import mx.gob.sat.sitio_internet.cfd.catalogos.CFormaPago;
import mx.gob.sat.sitio_internet.cfd.catalogos.CImpuesto;
import mx.gob.sat.sitio_internet.cfd.catalogos.CMoneda;
import mx.gob.sat.sitio_internet.cfd.catalogos.CObjetoImp;
import mx.gob.sat.sitio_internet.cfd.catalogos.CTipoFactor;
import mx.gob.sat.sitio_internet.cfd.catalogos.pagos.CTipoCadenaPago;


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
 *         <element name="Totales">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="TotalRetencionesIVA" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                 <attribute name="TotalRetencionesISR" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                 <attribute name="TotalRetencionesIEPS" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                 <attribute name="TotalTrasladosBaseIVA16" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                 <attribute name="TotalTrasladosImpuestoIVA16" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                 <attribute name="TotalTrasladosBaseIVA8" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                 <attribute name="TotalTrasladosImpuestoIVA8" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                 <attribute name="TotalTrasladosBaseIVA0" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                 <attribute name="TotalTrasladosImpuestoIVA0" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                 <attribute name="TotalTrasladosBaseIVAExento" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                 <attribute name="MontoTotalPagos" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Pago" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="DoctoRelacionado" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="ImpuestosDR" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="RetencionesDR" minOccurs="0">
 *                                         <complexType>
 *                                           <complexContent>
 *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               <sequence>
 *                                                 <element name="RetencionDR" maxOccurs="unbounded">
 *                                                   <complexType>
 *                                                     <complexContent>
 *                                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         <attribute name="BaseDR" use="required">
 *                                                           <simpleType>
 *                                                             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                               <minInclusive value="0.000001"/>
 *                                                               <fractionDigits value="6"/>
 *                                                               <whiteSpace value="collapse"/>
 *                                                             </restriction>
 *                                                           </simpleType>
 *                                                         </attribute>
 *                                                         <attribute name="ImpuestoDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
 *                                                         <attribute name="TipoFactorDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
 *                                                         <attribute name="TasaOCuotaDR" use="required">
 *                                                           <simpleType>
 *                                                             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                               <minInclusive value="0.000000"/>
 *                                                               <fractionDigits value="6"/>
 *                                                               <whiteSpace value="collapse"/>
 *                                                             </restriction>
 *                                                           </simpleType>
 *                                                         </attribute>
 *                                                         <attribute name="ImporteDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
 *                                                       </restriction>
 *                                                     </complexContent>
 *                                                   </complexType>
 *                                                 </element>
 *                                               </sequence>
 *                                             </restriction>
 *                                           </complexContent>
 *                                         </complexType>
 *                                       </element>
 *                                       <element name="TrasladosDR" minOccurs="0">
 *                                         <complexType>
 *                                           <complexContent>
 *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               <sequence>
 *                                                 <element name="TrasladoDR" maxOccurs="unbounded">
 *                                                   <complexType>
 *                                                     <complexContent>
 *                                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         <attribute name="BaseDR" use="required">
 *                                                           <simpleType>
 *                                                             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                               <minInclusive value="0.000001"/>
 *                                                               <fractionDigits value="6"/>
 *                                                               <whiteSpace value="collapse"/>
 *                                                             </restriction>
 *                                                           </simpleType>
 *                                                         </attribute>
 *                                                         <attribute name="ImpuestoDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
 *                                                         <attribute name="TipoFactorDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
 *                                                         <attribute name="TasaOCuotaDR">
 *                                                           <simpleType>
 *                                                             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                               <minInclusive value="0.000000"/>
 *                                                               <fractionDigits value="6"/>
 *                                                               <whiteSpace value="collapse"/>
 *                                                             </restriction>
 *                                                           </simpleType>
 *                                                         </attribute>
 *                                                         <attribute name="ImporteDR" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
 *                                                       </restriction>
 *                                                     </complexContent>
 *                                                   </complexType>
 *                                                 </element>
 *                                               </sequence>
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
 *                           <attribute name="IdDocumento" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <minLength value="16"/>
 *                                 <maxLength value="36"/>
 *                                 <whiteSpace value="collapse"/>
 *                                 <pattern value="([a-f0-9A-F]{8}-[a-f0-9A-F]{4}-[a-f0-9A-F]{4}-[a-f0-9A-F]{4}-[a-f0-9A-F]{12})|([0-9]{3}-[0-9]{2}-[0-9]{9})"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="Serie">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <minLength value="1"/>
 *                                 <maxLength value="25"/>
 *                                 <whiteSpace value="collapse"/>
 *                                 <pattern value="[^|]{1,25}"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="Folio">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <minLength value="1"/>
 *                                 <maxLength value="40"/>
 *                                 <whiteSpace value="collapse"/>
 *                                 <pattern value="[^|]{1,40}"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="MonedaDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Moneda" />
 *                           <attribute name="EquivalenciaDR">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 <fractionDigits value="10"/>
 *                                 <minInclusive value="0.0000000001"/>
 *                                 <whiteSpace value="collapse"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="NumParcialidad" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                 <whiteSpace value="collapse"/>
 *                                 <pattern value="[1-9][0-9]{0,2}"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="ImpSaldoAnt" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
 *                           <attribute name="ImpPagado" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
 *                           <attribute name="ImpSaldoInsoluto" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
 *                           <attribute name="ObjetoImpDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_ObjetoImp" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="ImpuestosP" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="RetencionesP" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="RetencionP" maxOccurs="unbounded">
 *                                         <complexType>
 *                                           <complexContent>
 *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               <attribute name="ImpuestoP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
 *                                               <attribute name="ImporteP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
 *                                             </restriction>
 *                                           </complexContent>
 *                                         </complexType>
 *                                       </element>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="TrasladosP" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="TrasladoP" maxOccurs="unbounded">
 *                                         <complexType>
 *                                           <complexContent>
 *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               <attribute name="BaseP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
 *                                               <attribute name="ImpuestoP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
 *                                               <attribute name="TipoFactorP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
 *                                               <attribute name="TasaOCuotaP">
 *                                                 <simpleType>
 *                                                   <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                     <fractionDigits value="6"/>
 *                                                     <minInclusive value="0.000000"/>
 *                                                     <whiteSpace value="collapse"/>
 *                                                   </restriction>
 *                                                 </simpleType>
 *                                               </attribute>
 *                                               <attribute name="ImporteP" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
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
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="FechaPago" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_FechaH" />
 *                 <attribute name="FormaDePagoP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_FormaPago" />
 *                 <attribute name="MonedaP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Moneda" />
 *                 <attribute name="TipoCambioP">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                       <fractionDigits value="6"/>
 *                       <minInclusive value="0.000001"/>
 *                       <whiteSpace value="collapse"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="Monto" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
 *                 <attribute name="NumOperacion">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <minLength value="1"/>
 *                       <maxLength value="100"/>
 *                       <pattern value="[^|]{1,100}"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="RfcEmisorCtaOrd">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <minLength value="12"/>
 *                       <maxLength value="13"/>
 *                       <whiteSpace value="collapse"/>
 *                       <pattern value="XEXX010101000|[A-Z&Ñ]{3}[0-9]{2}(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])[A-Z0-9]{2}[0-9A]"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="NomBancoOrdExt">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <minLength value="1"/>
 *                       <maxLength value="300"/>
 *                       <whiteSpace value="collapse"/>
 *                       <pattern value="[^|]{1,300}"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="CtaOrdenante">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <minLength value="10"/>
 *                       <maxLength value="50"/>
 *                       <whiteSpace value="collapse"/>
 *                       <pattern value="[A-Z0-9_]{10,50}"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="RfcEmisorCtaBen" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC_PM" />
 *                 <attribute name="CtaBeneficiario">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <minLength value="10"/>
 *                       <maxLength value="50"/>
 *                       <whiteSpace value="collapse"/>
 *                       <pattern value="[A-Z0-9_]{10,50}"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="TipoCadPago" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Pagos}c_TipoCadenaPago" />
 *                 <attribute name="CertPago">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *                       <whiteSpace value="collapse"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="CadPago">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <minLength value="1"/>
 *                       <maxLength value="8192"/>
 *                       <whiteSpace value="collapse"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="SelloPago">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *                       <whiteSpace value="collapse"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="Version" use="required" fixed="2.0">
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
@XmlType(name = "", propOrder = {
    "totales",
    "pago"
})
@XmlRootElement(name = "Pagos")
public class Pagos {

    /**
     * Nodo requerido para especificar el monto total de los pagos y el total de los impuestos, deben ser expresados en MXN.
     * 
     */
    @XmlElement(name = "Totales", required = true)
    protected Pagos.Totales totales;
    /**
     * Elemento requerido para incorporar la información de la recepción de pagos.
     * 
     */
    @XmlElement(name = "Pago", required = true)
    protected List<Pagos.Pago> pago;
    /**
     * Atributo requerido que indica la versión del complemento para recepción de pagos.
     * 
     */
    @XmlAttribute(name = "Version", required = true)
    protected String version;

    /**
     * Nodo requerido para especificar el monto total de los pagos y el total de los impuestos, deben ser expresados en MXN.
     * 
     * @return
     *     possible object is
     *     {@link Pagos.Totales }
     *     
     */
    public Pagos.Totales getTotales() {
        return totales;
    }

    /**
     * Define el valor de la propiedad totales.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagos.Totales }
     *     
     * @see #getTotales()
     */
    public void setTotales(Pagos.Totales value) {
        this.totales = value;
    }

    /**
     * Elemento requerido para incorporar la información de la recepción de pagos.
     * 
     * Gets the value of the pago property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pago property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPago().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pagos.Pago }
     * </p>
     * 
     * 
     * @return
     *     The value of the pago property.
     */
    public List<Pagos.Pago> getPago() {
        if (pago == null) {
            pago = new ArrayList<>();
        }
        return this.pago;
    }

    /**
     * Atributo requerido que indica la versión del complemento para recepción de pagos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.0";
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
     * <p>Clase Java para anonymous complex type.</p>
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="DoctoRelacionado" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="ImpuestosDR" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="RetencionesDR" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="RetencionDR" maxOccurs="unbounded">
     *                                         <complexType>
     *                                           <complexContent>
     *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               <attribute name="BaseDR" use="required">
     *                                                 <simpleType>
     *                                                   <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                                     <minInclusive value="0.000001"/>
     *                                                     <fractionDigits value="6"/>
     *                                                     <whiteSpace value="collapse"/>
     *                                                   </restriction>
     *                                                 </simpleType>
     *                                               </attribute>
     *                                               <attribute name="ImpuestoDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
     *                                               <attribute name="TipoFactorDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
     *                                               <attribute name="TasaOCuotaDR" use="required">
     *                                                 <simpleType>
     *                                                   <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                                     <minInclusive value="0.000000"/>
     *                                                     <fractionDigits value="6"/>
     *                                                     <whiteSpace value="collapse"/>
     *                                                   </restriction>
     *                                                 </simpleType>
     *                                               </attribute>
     *                                               <attribute name="ImporteDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
     *                                             </restriction>
     *                                           </complexContent>
     *                                         </complexType>
     *                                       </element>
     *                                     </sequence>
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                             <element name="TrasladosDR" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="TrasladoDR" maxOccurs="unbounded">
     *                                         <complexType>
     *                                           <complexContent>
     *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               <attribute name="BaseDR" use="required">
     *                                                 <simpleType>
     *                                                   <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                                     <minInclusive value="0.000001"/>
     *                                                     <fractionDigits value="6"/>
     *                                                     <whiteSpace value="collapse"/>
     *                                                   </restriction>
     *                                                 </simpleType>
     *                                               </attribute>
     *                                               <attribute name="ImpuestoDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
     *                                               <attribute name="TipoFactorDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
     *                                               <attribute name="TasaOCuotaDR">
     *                                                 <simpleType>
     *                                                   <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                                     <minInclusive value="0.000000"/>
     *                                                     <fractionDigits value="6"/>
     *                                                     <whiteSpace value="collapse"/>
     *                                                   </restriction>
     *                                                 </simpleType>
     *                                               </attribute>
     *                                               <attribute name="ImporteDR" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
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
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                 </sequence>
     *                 <attribute name="IdDocumento" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <minLength value="16"/>
     *                       <maxLength value="36"/>
     *                       <whiteSpace value="collapse"/>
     *                       <pattern value="([a-f0-9A-F]{8}-[a-f0-9A-F]{4}-[a-f0-9A-F]{4}-[a-f0-9A-F]{4}-[a-f0-9A-F]{12})|([0-9]{3}-[0-9]{2}-[0-9]{9})"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="Serie">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <minLength value="1"/>
     *                       <maxLength value="25"/>
     *                       <whiteSpace value="collapse"/>
     *                       <pattern value="[^|]{1,25}"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="Folio">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <minLength value="1"/>
     *                       <maxLength value="40"/>
     *                       <whiteSpace value="collapse"/>
     *                       <pattern value="[^|]{1,40}"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="MonedaDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Moneda" />
     *                 <attribute name="EquivalenciaDR">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                       <fractionDigits value="10"/>
     *                       <minInclusive value="0.0000000001"/>
     *                       <whiteSpace value="collapse"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="NumParcialidad" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                       <whiteSpace value="collapse"/>
     *                       <pattern value="[1-9][0-9]{0,2}"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="ImpSaldoAnt" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
     *                 <attribute name="ImpPagado" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
     *                 <attribute name="ImpSaldoInsoluto" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
     *                 <attribute name="ObjetoImpDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_ObjetoImp" />
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="ImpuestosP" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="RetencionesP" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="RetencionP" maxOccurs="unbounded">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <attribute name="ImpuestoP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
     *                                     <attribute name="ImporteP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="TrasladosP" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="TrasladoP" maxOccurs="unbounded">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <attribute name="BaseP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
     *                                     <attribute name="ImpuestoP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
     *                                     <attribute name="TipoFactorP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
     *                                     <attribute name="TasaOCuotaP">
     *                                       <simpleType>
     *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                           <fractionDigits value="6"/>
     *                                           <minInclusive value="0.000000"/>
     *                                           <whiteSpace value="collapse"/>
     *                                         </restriction>
     *                                       </simpleType>
     *                                     </attribute>
     *                                     <attribute name="ImporteP" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
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
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *       <attribute name="FechaPago" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_FechaH" />
     *       <attribute name="FormaDePagoP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_FormaPago" />
     *       <attribute name="MonedaP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Moneda" />
     *       <attribute name="TipoCambioP">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *             <fractionDigits value="6"/>
     *             <minInclusive value="0.000001"/>
     *             <whiteSpace value="collapse"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="Monto" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
     *       <attribute name="NumOperacion">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <minLength value="1"/>
     *             <maxLength value="100"/>
     *             <pattern value="[^|]{1,100}"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="RfcEmisorCtaOrd">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <minLength value="12"/>
     *             <maxLength value="13"/>
     *             <whiteSpace value="collapse"/>
     *             <pattern value="XEXX010101000|[A-Z&Ñ]{3}[0-9]{2}(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])[A-Z0-9]{2}[0-9A]"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="NomBancoOrdExt">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <minLength value="1"/>
     *             <maxLength value="300"/>
     *             <whiteSpace value="collapse"/>
     *             <pattern value="[^|]{1,300}"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="CtaOrdenante">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <minLength value="10"/>
     *             <maxLength value="50"/>
     *             <whiteSpace value="collapse"/>
     *             <pattern value="[A-Z0-9_]{10,50}"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="RfcEmisorCtaBen" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC_PM" />
     *       <attribute name="CtaBeneficiario">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <minLength value="10"/>
     *             <maxLength value="50"/>
     *             <whiteSpace value="collapse"/>
     *             <pattern value="[A-Z0-9_]{10,50}"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="TipoCadPago" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Pagos}c_TipoCadenaPago" />
     *       <attribute name="CertPago">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
     *             <whiteSpace value="collapse"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="CadPago">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <minLength value="1"/>
     *             <maxLength value="8192"/>
     *             <whiteSpace value="collapse"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="SelloPago">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
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
        "doctoRelacionado",
        "impuestosP"
    })
    public static class Pago {

        /**
         * Nodo requerido para expresar la lista de documentos relacionados con los pagos. Por cada documento que se relacione se debe generar un nodo DoctoRelacionado.
         * 
         */
        @XmlElement(name = "DoctoRelacionado", required = true)
        protected List<Pagos.Pago.DoctoRelacionado> doctoRelacionado;
        /**
         * Nodo condicional para registrar el resumen de los impuestos aplicables conforme al monto del pago recibido, expresados a la moneda de pago.
         * 
         */
        @XmlElement(name = "ImpuestosP")
        protected Pagos.Pago.ImpuestosP impuestosP;
        /**
         * Atributo requerido para expresar la fecha y hora en la que el beneficiario recibe el pago. Se expresa en la forma aaaa-mm-ddThh:mm:ss, de acuerdo con la especificación ISO 8601.En caso de no contar con la hora se debe registrar 12:00:00.
         * 
         */
        @XmlAttribute(name = "FechaPago", required = true)
        @XmlJavaTypeAdapter(DateTimeAdapter.class)
        protected LocalDateTime fechaPago;
        /**
         * Atributo requerido para expresar la clave de la forma en que se realiza el pago.
         * 
         */
        @XmlAttribute(name = "FormaDePagoP", required = true)
        protected CFormaPago formaDePagoP;
        /**
         * Atributo requerido para identificar la clave de la moneda utilizada para realizar el pago conforme a la especificación ISO 4217. Cuando se usa moneda nacional se registra MXN. El atributo Pagos:Pago:Monto debe ser expresado en la moneda registrada en este atributo.
         * 
         */
        @XmlAttribute(name = "MonedaP", required = true)
        protected CMoneda monedaP;
        /**
         * Atributo condicional para expresar el tipo de cambio de la moneda a la fecha en que se realizó el pago. El valor debe reflejar el número de pesos mexicanos que equivalen a una unidad de la divisa señalada en el atributo MonedaP. Es requerido cuando el atributo MonedaP es diferente a MXN.
         * 
         */
        @XmlAttribute(name = "TipoCambioP")
        protected BigDecimal tipoCambioP;
        /**
         * Atributo requerido para expresar el importe del pago.
         * 
         */
        @XmlAttribute(name = "Monto", required = true)
        protected BigDecimal monto;
        /**
         * Atributo condicional para expresar el número de cheque, número de autorización, número de referencia, clave de rastreo en caso de ser SPEI, línea de captura o algún número de referencia análogo que identifique la operación que ampara el pago efectuado.
         * 
         */
        @XmlAttribute(name = "NumOperacion")
        protected String numOperacion;
        /**
         * Atributo condicional para expresar la clave RFC de la entidad emisora de la cuenta origen, es decir, la operadora, el banco, la institución financiera, emisor de monedero electrónico, etc., en caso de ser extranjero colocar XEXX010101000, considerar las reglas de obligatoriedad publicadas en la página del SAT para éste atributo de acuerdo con el catálogo catCFDI:c_FormaPago.
         * 
         */
        @XmlAttribute(name = "RfcEmisorCtaOrd")
        protected String rfcEmisorCtaOrd;
        /**
         * Atributo condicional para expresar el nombre del banco ordenante, es requerido en caso de ser extranjero. Considerar las reglas de obligatoriedad publicadas en la página del SAT para éste atributo de acuerdo con el catálogo catCFDI:c_FormaPago.
         * 
         */
        @XmlAttribute(name = "NomBancoOrdExt")
        protected String nomBancoOrdExt;
        /**
         * Atributo condicional para incorporar el número de la cuenta con la que se realizó el pago. Considerar las reglas de obligatoriedad publicadas en la página del SAT para éste atributo de acuerdo con el catálogo catCFDI:c_FormaPago.
         * 
         */
        @XmlAttribute(name = "CtaOrdenante")
        protected String ctaOrdenante;
        /**
         * Atributo condicional para expresar la clave RFC de la entidad operadora de la cuenta destino, es decir, la operadora, el banco, la institución financiera, emisor de monedero electrónico, etc. Considerar las reglas de obligatoriedad publicadas en la página del SAT para éste atributo de acuerdo con el catálogo catCFDI:c_FormaPago.
         * 
         */
        @XmlAttribute(name = "RfcEmisorCtaBen")
        protected String rfcEmisorCtaBen;
        /**
         * Atributo condicional para incorporar el número de cuenta en donde se recibió el pago. Considerar las reglas de obligatoriedad publicadas en la página del SAT para éste atributo de acuerdo con el catálogo catCFDI:c_FormaPago.
         * 
         */
        @XmlAttribute(name = "CtaBeneficiario")
        protected String ctaBeneficiario;
        /**
         * Atributo condicional para identificar la clave del tipo de cadena de pago que genera la entidad receptora del pago. Considerar las reglas de obligatoriedad publicadas en la página del SAT para éste atributo de acuerdo con el catálogo catCFDI:c_FormaPago.
         * 
         */
        @XmlAttribute(name = "TipoCadPago")
        protected CTipoCadenaPago tipoCadPago;
        /**
         * Atributo condicional que sirve para incorporar el certificado que ampara al pago, como una cadena de texto en formato base 64. Es requerido en caso de que el atributo TipoCadPago contenga información.
         * 
         */
        @XmlAttribute(name = "CertPago")
        protected byte[] certPago;
        /**
         * Atributo condicional para expresar la cadena original del comprobante de pago generado por la entidad emisora de la cuenta beneficiaria. Es requerido en caso de que el atributo TipoCadPago contenga información.
         * 
         */
        @XmlAttribute(name = "CadPago")
        protected String cadPago;
        /**
         * Atributo condicional para integrar el sello digital que se asocie al pago. La entidad que emite el comprobante de pago, ingresa una cadena original y el sello digital en una sección de dicho comprobante, este sello digital es el que se debe registrar en este atributo. Debe ser expresado como una cadena de texto en formato base 64. Es requerido en caso de que el atributo TipoCadPago contenga información.
         * 
         */
        @XmlAttribute(name = "SelloPago")
        protected byte[] selloPago;

        /**
         * Nodo requerido para expresar la lista de documentos relacionados con los pagos. Por cada documento que se relacione se debe generar un nodo DoctoRelacionado.
         * 
         * Gets the value of the doctoRelacionado property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the doctoRelacionado property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getDoctoRelacionado().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Pagos.Pago.DoctoRelacionado }
         * </p>
         * 
         * 
         * @return
         *     The value of the doctoRelacionado property.
         */
        public List<Pagos.Pago.DoctoRelacionado> getDoctoRelacionado() {
            if (doctoRelacionado == null) {
                doctoRelacionado = new ArrayList<>();
            }
            return this.doctoRelacionado;
        }

        /**
         * Nodo condicional para registrar el resumen de los impuestos aplicables conforme al monto del pago recibido, expresados a la moneda de pago.
         * 
         * @return
         *     possible object is
         *     {@link Pagos.Pago.ImpuestosP }
         *     
         */
        public Pagos.Pago.ImpuestosP getImpuestosP() {
            return impuestosP;
        }

        /**
         * Define el valor de la propiedad impuestosP.
         * 
         * @param value
         *     allowed object is
         *     {@link Pagos.Pago.ImpuestosP }
         *     
         * @see #getImpuestosP()
         */
        public void setImpuestosP(Pagos.Pago.ImpuestosP value) {
            this.impuestosP = value;
        }

        /**
         * Atributo requerido para expresar la fecha y hora en la que el beneficiario recibe el pago. Se expresa en la forma aaaa-mm-ddThh:mm:ss, de acuerdo con la especificación ISO 8601.En caso de no contar con la hora se debe registrar 12:00:00.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public LocalDateTime getFechaPago() {
            return fechaPago;
        }

        /**
         * Define el valor de la propiedad fechaPago.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getFechaPago()
         */
        public void setFechaPago(LocalDateTime value) {
            this.fechaPago = value;
        }

        /**
         * Atributo requerido para expresar la clave de la forma en que se realiza el pago.
         * 
         * @return
         *     possible object is
         *     {@link CFormaPago }
         *     
         */
        public CFormaPago getFormaDePagoP() {
            return formaDePagoP;
        }

        /**
         * Define el valor de la propiedad formaDePagoP.
         * 
         * @param value
         *     allowed object is
         *     {@link CFormaPago }
         *     
         * @see #getFormaDePagoP()
         */
        public void setFormaDePagoP(CFormaPago value) {
            this.formaDePagoP = value;
        }

        /**
         * Atributo requerido para identificar la clave de la moneda utilizada para realizar el pago conforme a la especificación ISO 4217. Cuando se usa moneda nacional se registra MXN. El atributo Pagos:Pago:Monto debe ser expresado en la moneda registrada en este atributo.
         * 
         * @return
         *     possible object is
         *     {@link CMoneda }
         *     
         */
        public CMoneda getMonedaP() {
            return monedaP;
        }

        /**
         * Define el valor de la propiedad monedaP.
         * 
         * @param value
         *     allowed object is
         *     {@link CMoneda }
         *     
         * @see #getMonedaP()
         */
        public void setMonedaP(CMoneda value) {
            this.monedaP = value;
        }

        /**
         * Atributo condicional para expresar el tipo de cambio de la moneda a la fecha en que se realizó el pago. El valor debe reflejar el número de pesos mexicanos que equivalen a una unidad de la divisa señalada en el atributo MonedaP. Es requerido cuando el atributo MonedaP es diferente a MXN.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTipoCambioP() {
            return tipoCambioP;
        }

        /**
         * Define el valor de la propiedad tipoCambioP.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getTipoCambioP()
         */
        public void setTipoCambioP(BigDecimal value) {
            this.tipoCambioP = value;
        }

        /**
         * Atributo requerido para expresar el importe del pago.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMonto() {
            return monto;
        }

        /**
         * Define el valor de la propiedad monto.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getMonto()
         */
        public void setMonto(BigDecimal value) {
            this.monto = value;
        }

        /**
         * Atributo condicional para expresar el número de cheque, número de autorización, número de referencia, clave de rastreo en caso de ser SPEI, línea de captura o algún número de referencia análogo que identifique la operación que ampara el pago efectuado.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumOperacion() {
            return numOperacion;
        }

        /**
         * Define el valor de la propiedad numOperacion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getNumOperacion()
         */
        public void setNumOperacion(String value) {
            this.numOperacion = value;
        }

        /**
         * Atributo condicional para expresar la clave RFC de la entidad emisora de la cuenta origen, es decir, la operadora, el banco, la institución financiera, emisor de monedero electrónico, etc., en caso de ser extranjero colocar XEXX010101000, considerar las reglas de obligatoriedad publicadas en la página del SAT para éste atributo de acuerdo con el catálogo catCFDI:c_FormaPago.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRfcEmisorCtaOrd() {
            return rfcEmisorCtaOrd;
        }

        /**
         * Define el valor de la propiedad rfcEmisorCtaOrd.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getRfcEmisorCtaOrd()
         */
        public void setRfcEmisorCtaOrd(String value) {
            this.rfcEmisorCtaOrd = value;
        }

        /**
         * Atributo condicional para expresar el nombre del banco ordenante, es requerido en caso de ser extranjero. Considerar las reglas de obligatoriedad publicadas en la página del SAT para éste atributo de acuerdo con el catálogo catCFDI:c_FormaPago.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomBancoOrdExt() {
            return nomBancoOrdExt;
        }

        /**
         * Define el valor de la propiedad nomBancoOrdExt.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getNomBancoOrdExt()
         */
        public void setNomBancoOrdExt(String value) {
            this.nomBancoOrdExt = value;
        }

        /**
         * Atributo condicional para incorporar el número de la cuenta con la que se realizó el pago. Considerar las reglas de obligatoriedad publicadas en la página del SAT para éste atributo de acuerdo con el catálogo catCFDI:c_FormaPago.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCtaOrdenante() {
            return ctaOrdenante;
        }

        /**
         * Define el valor de la propiedad ctaOrdenante.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCtaOrdenante()
         */
        public void setCtaOrdenante(String value) {
            this.ctaOrdenante = value;
        }

        /**
         * Atributo condicional para expresar la clave RFC de la entidad operadora de la cuenta destino, es decir, la operadora, el banco, la institución financiera, emisor de monedero electrónico, etc. Considerar las reglas de obligatoriedad publicadas en la página del SAT para éste atributo de acuerdo con el catálogo catCFDI:c_FormaPago.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRfcEmisorCtaBen() {
            return rfcEmisorCtaBen;
        }

        /**
         * Define el valor de la propiedad rfcEmisorCtaBen.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getRfcEmisorCtaBen()
         */
        public void setRfcEmisorCtaBen(String value) {
            this.rfcEmisorCtaBen = value;
        }

        /**
         * Atributo condicional para incorporar el número de cuenta en donde se recibió el pago. Considerar las reglas de obligatoriedad publicadas en la página del SAT para éste atributo de acuerdo con el catálogo catCFDI:c_FormaPago.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCtaBeneficiario() {
            return ctaBeneficiario;
        }

        /**
         * Define el valor de la propiedad ctaBeneficiario.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCtaBeneficiario()
         */
        public void setCtaBeneficiario(String value) {
            this.ctaBeneficiario = value;
        }

        /**
         * Atributo condicional para identificar la clave del tipo de cadena de pago que genera la entidad receptora del pago. Considerar las reglas de obligatoriedad publicadas en la página del SAT para éste atributo de acuerdo con el catálogo catCFDI:c_FormaPago.
         * 
         * @return
         *     possible object is
         *     {@link CTipoCadenaPago }
         *     
         */
        public CTipoCadenaPago getTipoCadPago() {
            return tipoCadPago;
        }

        /**
         * Define el valor de la propiedad tipoCadPago.
         * 
         * @param value
         *     allowed object is
         *     {@link CTipoCadenaPago }
         *     
         * @see #getTipoCadPago()
         */
        public void setTipoCadPago(CTipoCadenaPago value) {
            this.tipoCadPago = value;
        }

        /**
         * Atributo condicional que sirve para incorporar el certificado que ampara al pago, como una cadena de texto en formato base 64. Es requerido en caso de que el atributo TipoCadPago contenga información.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getCertPago() {
            return certPago;
        }

        /**
         * Define el valor de la propiedad certPago.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         * @see #getCertPago()
         */
        public void setCertPago(byte[] value) {
            this.certPago = value;
        }

        /**
         * Atributo condicional para expresar la cadena original del comprobante de pago generado por la entidad emisora de la cuenta beneficiaria. Es requerido en caso de que el atributo TipoCadPago contenga información.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCadPago() {
            return cadPago;
        }

        /**
         * Define el valor de la propiedad cadPago.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCadPago()
         */
        public void setCadPago(String value) {
            this.cadPago = value;
        }

        /**
         * Atributo condicional para integrar el sello digital que se asocie al pago. La entidad que emite el comprobante de pago, ingresa una cadena original y el sello digital en una sección de dicho comprobante, este sello digital es el que se debe registrar en este atributo. Debe ser expresado como una cadena de texto en formato base 64. Es requerido en caso de que el atributo TipoCadPago contenga información.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getSelloPago() {
            return selloPago;
        }

        /**
         * Define el valor de la propiedad selloPago.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         * @see #getSelloPago()
         */
        public void setSelloPago(byte[] value) {
            this.selloPago = value;
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
         *         <element name="ImpuestosDR" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="RetencionesDR" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="RetencionDR" maxOccurs="unbounded">
         *                               <complexType>
         *                                 <complexContent>
         *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     <attribute name="BaseDR" use="required">
         *                                       <simpleType>
         *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                           <minInclusive value="0.000001"/>
         *                                           <fractionDigits value="6"/>
         *                                           <whiteSpace value="collapse"/>
         *                                         </restriction>
         *                                       </simpleType>
         *                                     </attribute>
         *                                     <attribute name="ImpuestoDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
         *                                     <attribute name="TipoFactorDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
         *                                     <attribute name="TasaOCuotaDR" use="required">
         *                                       <simpleType>
         *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                           <minInclusive value="0.000000"/>
         *                                           <fractionDigits value="6"/>
         *                                           <whiteSpace value="collapse"/>
         *                                         </restriction>
         *                                       </simpleType>
         *                                     </attribute>
         *                                     <attribute name="ImporteDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
         *                                   </restriction>
         *                                 </complexContent>
         *                               </complexType>
         *                             </element>
         *                           </sequence>
         *                         </restriction>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                   <element name="TrasladosDR" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="TrasladoDR" maxOccurs="unbounded">
         *                               <complexType>
         *                                 <complexContent>
         *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     <attribute name="BaseDR" use="required">
         *                                       <simpleType>
         *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                           <minInclusive value="0.000001"/>
         *                                           <fractionDigits value="6"/>
         *                                           <whiteSpace value="collapse"/>
         *                                         </restriction>
         *                                       </simpleType>
         *                                     </attribute>
         *                                     <attribute name="ImpuestoDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
         *                                     <attribute name="TipoFactorDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
         *                                     <attribute name="TasaOCuotaDR">
         *                                       <simpleType>
         *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                           <minInclusive value="0.000000"/>
         *                                           <fractionDigits value="6"/>
         *                                           <whiteSpace value="collapse"/>
         *                                         </restriction>
         *                                       </simpleType>
         *                                     </attribute>
         *                                     <attribute name="ImporteDR" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
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
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *       </sequence>
         *       <attribute name="IdDocumento" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <minLength value="16"/>
         *             <maxLength value="36"/>
         *             <whiteSpace value="collapse"/>
         *             <pattern value="([a-f0-9A-F]{8}-[a-f0-9A-F]{4}-[a-f0-9A-F]{4}-[a-f0-9A-F]{4}-[a-f0-9A-F]{12})|([0-9]{3}-[0-9]{2}-[0-9]{9})"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="Serie">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <minLength value="1"/>
         *             <maxLength value="25"/>
         *             <whiteSpace value="collapse"/>
         *             <pattern value="[^|]{1,25}"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="Folio">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <minLength value="1"/>
         *             <maxLength value="40"/>
         *             <whiteSpace value="collapse"/>
         *             <pattern value="[^|]{1,40}"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="MonedaDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Moneda" />
         *       <attribute name="EquivalenciaDR">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *             <fractionDigits value="10"/>
         *             <minInclusive value="0.0000000001"/>
         *             <whiteSpace value="collapse"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="NumParcialidad" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *             <whiteSpace value="collapse"/>
         *             <pattern value="[1-9][0-9]{0,2}"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="ImpSaldoAnt" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
         *       <attribute name="ImpPagado" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
         *       <attribute name="ImpSaldoInsoluto" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
         *       <attribute name="ObjetoImpDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_ObjetoImp" />
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "impuestosDR"
        })
        public static class DoctoRelacionado {

            /**
             * Nodo condicional para registrar los impuestos aplicables conforme al monto del pago recibido, expresados a la moneda del documento relacionado.
             * 
             */
            @XmlElement(name = "ImpuestosDR")
            protected Pagos.Pago.DoctoRelacionado.ImpuestosDR impuestosDR;
            /**
             * Atributo requerido para expresar el identificador del documento relacionado con el pago. Este dato puede ser un Folio Fiscal de la Factura Electrónica o bien el número de operación de un documento digital.
             * 
             */
            @XmlAttribute(name = "IdDocumento", required = true)
            protected String idDocumento;
            /**
             * Atributo opcional para precisar la serie del comprobante para control interno del contribuyente, acepta una cadena de caracteres.
             * 
             */
            @XmlAttribute(name = "Serie")
            protected String serie;
            /**
             * Atributo opcional para precisar el folio del comprobante para control interno del contribuyente, acepta una cadena de caracteres.
             * 
             */
            @XmlAttribute(name = "Folio")
            protected String folio;
            /**
             * Atributo requerido para identificar la clave de la moneda utilizada en los importes del documento relacionado, cuando se usa moneda nacional o el documento relacionado no especifica la moneda se registra MXN. Los importes registrados en los atributos “ImpSaldoAnt”, “ImpPagado” e “ImpSaldoInsoluto” de éste nodo, deben corresponder a esta moneda. Conforme con la especificación ISO 4217.
             * 
             */
            @XmlAttribute(name = "MonedaDR", required = true)
            protected CMoneda monedaDR;
            /**
             * Atributo condicional para expresar el tipo de cambio conforme con la moneda registrada en el documento relacionado. Es requerido cuando la moneda del documento relacionado es distinta de la moneda de pago. Se debe registrar el número de unidades de la moneda señalada en el documento relacionado que equivalen a una unidad de la moneda del pago. Por ejemplo: El documento relacionado se registra en USD. El pago se realiza por 100 EUR. Este atributo se registra como 1.0465711361 USD/EUR. El importe pagado equivale a 100 EUR * 1.0465711361 USD/EUR = 104.66 USD.
             * 
             */
            @XmlAttribute(name = "EquivalenciaDR")
            protected BigDecimal equivalenciaDR;
            /**
             * Atributo requerido para expresar el número de parcialidad que corresponde al pago.
             * 
             */
            @XmlAttribute(name = "NumParcialidad", required = true)
            protected BigInteger numParcialidad;
            /**
             * Atributo requerido para expresar el monto del saldo insoluto de la parcialidad anterior. En el caso de que sea la primer parcialidad este atributo debe contener el importe total del documento relacionado.
             * 
             */
            @XmlAttribute(name = "ImpSaldoAnt", required = true)
            protected BigDecimal impSaldoAnt;
            /**
             * Atributo requerido para expresar el importe pagado para el documento relacionado.
             * 
             */
            @XmlAttribute(name = "ImpPagado", required = true)
            protected BigDecimal impPagado;
            /**
             * Atributo requerido para expresar la diferencia entre el importe del saldo anterior y el monto del pago.
             * 
             */
            @XmlAttribute(name = "ImpSaldoInsoluto", required = true)
            protected BigDecimal impSaldoInsoluto;
            /**
             * Atributo requerido para expresar si el pago del documento relacionado es objeto o no de impuesto.
             * 
             */
            @XmlAttribute(name = "ObjetoImpDR", required = true)
            protected CObjetoImp objetoImpDR;

            /**
             * Nodo condicional para registrar los impuestos aplicables conforme al monto del pago recibido, expresados a la moneda del documento relacionado.
             * 
             * @return
             *     possible object is
             *     {@link Pagos.Pago.DoctoRelacionado.ImpuestosDR }
             *     
             */
            public Pagos.Pago.DoctoRelacionado.ImpuestosDR getImpuestosDR() {
                return impuestosDR;
            }

            /**
             * Define el valor de la propiedad impuestosDR.
             * 
             * @param value
             *     allowed object is
             *     {@link Pagos.Pago.DoctoRelacionado.ImpuestosDR }
             *     
             * @see #getImpuestosDR()
             */
            public void setImpuestosDR(Pagos.Pago.DoctoRelacionado.ImpuestosDR value) {
                this.impuestosDR = value;
            }

            /**
             * Atributo requerido para expresar el identificador del documento relacionado con el pago. Este dato puede ser un Folio Fiscal de la Factura Electrónica o bien el número de operación de un documento digital.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdDocumento() {
                return idDocumento;
            }

            /**
             * Define el valor de la propiedad idDocumento.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getIdDocumento()
             */
            public void setIdDocumento(String value) {
                this.idDocumento = value;
            }

            /**
             * Atributo opcional para precisar la serie del comprobante para control interno del contribuyente, acepta una cadena de caracteres.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSerie() {
                return serie;
            }

            /**
             * Define el valor de la propiedad serie.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getSerie()
             */
            public void setSerie(String value) {
                this.serie = value;
            }

            /**
             * Atributo opcional para precisar el folio del comprobante para control interno del contribuyente, acepta una cadena de caracteres.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFolio() {
                return folio;
            }

            /**
             * Define el valor de la propiedad folio.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getFolio()
             */
            public void setFolio(String value) {
                this.folio = value;
            }

            /**
             * Atributo requerido para identificar la clave de la moneda utilizada en los importes del documento relacionado, cuando se usa moneda nacional o el documento relacionado no especifica la moneda se registra MXN. Los importes registrados en los atributos “ImpSaldoAnt”, “ImpPagado” e “ImpSaldoInsoluto” de éste nodo, deben corresponder a esta moneda. Conforme con la especificación ISO 4217.
             * 
             * @return
             *     possible object is
             *     {@link CMoneda }
             *     
             */
            public CMoneda getMonedaDR() {
                return monedaDR;
            }

            /**
             * Define el valor de la propiedad monedaDR.
             * 
             * @param value
             *     allowed object is
             *     {@link CMoneda }
             *     
             * @see #getMonedaDR()
             */
            public void setMonedaDR(CMoneda value) {
                this.monedaDR = value;
            }

            /**
             * Atributo condicional para expresar el tipo de cambio conforme con la moneda registrada en el documento relacionado. Es requerido cuando la moneda del documento relacionado es distinta de la moneda de pago. Se debe registrar el número de unidades de la moneda señalada en el documento relacionado que equivalen a una unidad de la moneda del pago. Por ejemplo: El documento relacionado se registra en USD. El pago se realiza por 100 EUR. Este atributo se registra como 1.0465711361 USD/EUR. El importe pagado equivale a 100 EUR * 1.0465711361 USD/EUR = 104.66 USD.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getEquivalenciaDR() {
                return equivalenciaDR;
            }

            /**
             * Define el valor de la propiedad equivalenciaDR.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getEquivalenciaDR()
             */
            public void setEquivalenciaDR(BigDecimal value) {
                this.equivalenciaDR = value;
            }

            /**
             * Atributo requerido para expresar el número de parcialidad que corresponde al pago.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNumParcialidad() {
                return numParcialidad;
            }

            /**
             * Define el valor de la propiedad numParcialidad.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             * @see #getNumParcialidad()
             */
            public void setNumParcialidad(BigInteger value) {
                this.numParcialidad = value;
            }

            /**
             * Atributo requerido para expresar el monto del saldo insoluto de la parcialidad anterior. En el caso de que sea la primer parcialidad este atributo debe contener el importe total del documento relacionado.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getImpSaldoAnt() {
                return impSaldoAnt;
            }

            /**
             * Define el valor de la propiedad impSaldoAnt.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getImpSaldoAnt()
             */
            public void setImpSaldoAnt(BigDecimal value) {
                this.impSaldoAnt = value;
            }

            /**
             * Atributo requerido para expresar el importe pagado para el documento relacionado.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getImpPagado() {
                return impPagado;
            }

            /**
             * Define el valor de la propiedad impPagado.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getImpPagado()
             */
            public void setImpPagado(BigDecimal value) {
                this.impPagado = value;
            }

            /**
             * Atributo requerido para expresar la diferencia entre el importe del saldo anterior y el monto del pago.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getImpSaldoInsoluto() {
                return impSaldoInsoluto;
            }

            /**
             * Define el valor de la propiedad impSaldoInsoluto.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getImpSaldoInsoluto()
             */
            public void setImpSaldoInsoluto(BigDecimal value) {
                this.impSaldoInsoluto = value;
            }

            /**
             * Atributo requerido para expresar si el pago del documento relacionado es objeto o no de impuesto.
             * 
             * @return
             *     possible object is
             *     {@link CObjetoImp }
             *     
             */
            public CObjetoImp getObjetoImpDR() {
                return objetoImpDR;
            }

            /**
             * Define el valor de la propiedad objetoImpDR.
             * 
             * @param value
             *     allowed object is
             *     {@link CObjetoImp }
             *     
             * @see #getObjetoImpDR()
             */
            public void setObjetoImpDR(CObjetoImp value) {
                this.objetoImpDR = value;
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
             *         <element name="RetencionesDR" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="RetencionDR" maxOccurs="unbounded">
             *                     <complexType>
             *                       <complexContent>
             *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           <attribute name="BaseDR" use="required">
             *                             <simpleType>
             *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                                 <minInclusive value="0.000001"/>
             *                                 <fractionDigits value="6"/>
             *                                 <whiteSpace value="collapse"/>
             *                               </restriction>
             *                             </simpleType>
             *                           </attribute>
             *                           <attribute name="ImpuestoDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
             *                           <attribute name="TipoFactorDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
             *                           <attribute name="TasaOCuotaDR" use="required">
             *                             <simpleType>
             *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                                 <minInclusive value="0.000000"/>
             *                                 <fractionDigits value="6"/>
             *                                 <whiteSpace value="collapse"/>
             *                               </restriction>
             *                             </simpleType>
             *                           </attribute>
             *                           <attribute name="ImporteDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
             *                         </restriction>
             *                       </complexContent>
             *                     </complexType>
             *                   </element>
             *                 </sequence>
             *               </restriction>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="TrasladosDR" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="TrasladoDR" maxOccurs="unbounded">
             *                     <complexType>
             *                       <complexContent>
             *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           <attribute name="BaseDR" use="required">
             *                             <simpleType>
             *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                                 <minInclusive value="0.000001"/>
             *                                 <fractionDigits value="6"/>
             *                                 <whiteSpace value="collapse"/>
             *                               </restriction>
             *                             </simpleType>
             *                           </attribute>
             *                           <attribute name="ImpuestoDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
             *                           <attribute name="TipoFactorDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
             *                           <attribute name="TasaOCuotaDR">
             *                             <simpleType>
             *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                                 <minInclusive value="0.000000"/>
             *                                 <fractionDigits value="6"/>
             *                                 <whiteSpace value="collapse"/>
             *                               </restriction>
             *                             </simpleType>
             *                           </attribute>
             *                           <attribute name="ImporteDR" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
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
             *     </restriction>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "retencionesDR",
                "trasladosDR"
            })
            public static class ImpuestosDR {

                /**
                 * Nodo opcional para capturar los impuestos retenidos aplicables conforme al monto del pago recibido.
                 * 
                 */
                @XmlElement(name = "RetencionesDR")
                protected Pagos.Pago.DoctoRelacionado.ImpuestosDR.RetencionesDR retencionesDR;
                /**
                 * Nodo opcional para capturar los impuestos trasladados aplicables conforme al monto del pago recibido.
                 * 
                 */
                @XmlElement(name = "TrasladosDR")
                protected Pagos.Pago.DoctoRelacionado.ImpuestosDR.TrasladosDR trasladosDR;

                /**
                 * Nodo opcional para capturar los impuestos retenidos aplicables conforme al monto del pago recibido.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Pagos.Pago.DoctoRelacionado.ImpuestosDR.RetencionesDR }
                 *     
                 */
                public Pagos.Pago.DoctoRelacionado.ImpuestosDR.RetencionesDR getRetencionesDR() {
                    return retencionesDR;
                }

                /**
                 * Define el valor de la propiedad retencionesDR.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Pagos.Pago.DoctoRelacionado.ImpuestosDR.RetencionesDR }
                 *     
                 * @see #getRetencionesDR()
                 */
                public void setRetencionesDR(Pagos.Pago.DoctoRelacionado.ImpuestosDR.RetencionesDR value) {
                    this.retencionesDR = value;
                }

                /**
                 * Nodo opcional para capturar los impuestos trasladados aplicables conforme al monto del pago recibido.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Pagos.Pago.DoctoRelacionado.ImpuestosDR.TrasladosDR }
                 *     
                 */
                public Pagos.Pago.DoctoRelacionado.ImpuestosDR.TrasladosDR getTrasladosDR() {
                    return trasladosDR;
                }

                /**
                 * Define el valor de la propiedad trasladosDR.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Pagos.Pago.DoctoRelacionado.ImpuestosDR.TrasladosDR }
                 *     
                 * @see #getTrasladosDR()
                 */
                public void setTrasladosDR(Pagos.Pago.DoctoRelacionado.ImpuestosDR.TrasladosDR value) {
                    this.trasladosDR = value;
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
                 *         <element name="RetencionDR" maxOccurs="unbounded">
                 *           <complexType>
                 *             <complexContent>
                 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 <attribute name="BaseDR" use="required">
                 *                   <simpleType>
                 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *                       <minInclusive value="0.000001"/>
                 *                       <fractionDigits value="6"/>
                 *                       <whiteSpace value="collapse"/>
                 *                     </restriction>
                 *                   </simpleType>
                 *                 </attribute>
                 *                 <attribute name="ImpuestoDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
                 *                 <attribute name="TipoFactorDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
                 *                 <attribute name="TasaOCuotaDR" use="required">
                 *                   <simpleType>
                 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *                       <minInclusive value="0.000000"/>
                 *                       <fractionDigits value="6"/>
                 *                       <whiteSpace value="collapse"/>
                 *                     </restriction>
                 *                   </simpleType>
                 *                 </attribute>
                 *                 <attribute name="ImporteDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
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
                    "retencionDR"
                })
                public static class RetencionesDR {

                    /**
                     * Nodo requerido para registrar la información detallada de una retención de impuesto específico conforme al monto del pago recibido.
                     * 
                     */
                    @XmlElement(name = "RetencionDR", required = true)
                    protected List<Pagos.Pago.DoctoRelacionado.ImpuestosDR.RetencionesDR.RetencionDR> retencionDR;

                    /**
                     * Nodo requerido para registrar la información detallada de una retención de impuesto específico conforme al monto del pago recibido.
                     * 
                     * Gets the value of the retencionDR property.
                     * 
                     * <p>This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the retencionDR property.</p>
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * </p>
                     * <pre>
                     * getRetencionDR().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Pagos.Pago.DoctoRelacionado.ImpuestosDR.RetencionesDR.RetencionDR }
                     * </p>
                     * 
                     * 
                     * @return
                     *     The value of the retencionDR property.
                     */
                    public List<Pagos.Pago.DoctoRelacionado.ImpuestosDR.RetencionesDR.RetencionDR> getRetencionDR() {
                        if (retencionDR == null) {
                            retencionDR = new ArrayList<>();
                        }
                        return this.retencionDR;
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
                     *       <attribute name="BaseDR" use="required">
                     *         <simpleType>
                     *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                     *             <minInclusive value="0.000001"/>
                     *             <fractionDigits value="6"/>
                     *             <whiteSpace value="collapse"/>
                     *           </restriction>
                     *         </simpleType>
                     *       </attribute>
                     *       <attribute name="ImpuestoDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
                     *       <attribute name="TipoFactorDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
                     *       <attribute name="TasaOCuotaDR" use="required">
                     *         <simpleType>
                     *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                     *             <minInclusive value="0.000000"/>
                     *             <fractionDigits value="6"/>
                     *             <whiteSpace value="collapse"/>
                     *           </restriction>
                     *         </simpleType>
                     *       </attribute>
                     *       <attribute name="ImporteDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
                     *     </restriction>
                     *   </complexContent>
                     * </complexType>
                     * }</pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class RetencionDR {

                        /**
                         * Atributo requerido para señalar la base para el cálculo de la retención conforme al monto del pago, aplicable al documento relacionado, la determinación de la base se realiza de acuerdo con las disposiciones fiscales vigentes. No se permiten valores negativos.
                         * 
                         */
                        @XmlAttribute(name = "BaseDR", required = true)
                        protected BigDecimal baseDR;
                        /**
                         * Atributo requerido para señalar la clave del tipo de impuesto retenido conforme al monto del pago, aplicable al documento relacionado.
                         * 
                         */
                        @XmlAttribute(name = "ImpuestoDR", required = true)
                        protected CImpuesto impuestoDR;
                        /**
                         * Atributo requerido para señalar la clave del tipo de factor que se aplica a la base del impuesto.
                         * 
                         */
                        @XmlAttribute(name = "TipoFactorDR", required = true)
                        protected CTipoFactor tipoFactorDR;
                        /**
                         * Atributo requerido para señalar el valor de la tasa o cuota del impuesto que se retiene.
                         * 
                         */
                        @XmlAttribute(name = "TasaOCuotaDR", required = true)
                        protected BigDecimal tasaOCuotaDR;
                        /**
                         * Atributo requerido para señalar el importe del impuesto retenido conforme al monto del pago, aplicable al documento relacionado. No se permiten valores negativos.
                         * 
                         */
                        @XmlAttribute(name = "ImporteDR", required = true)
                        protected BigDecimal importeDR;

                        /**
                         * Atributo requerido para señalar la base para el cálculo de la retención conforme al monto del pago, aplicable al documento relacionado, la determinación de la base se realiza de acuerdo con las disposiciones fiscales vigentes. No se permiten valores negativos.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getBaseDR() {
                            return baseDR;
                        }

                        /**
                         * Define el valor de la propiedad baseDR.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         * @see #getBaseDR()
                         */
                        public void setBaseDR(BigDecimal value) {
                            this.baseDR = value;
                        }

                        /**
                         * Atributo requerido para señalar la clave del tipo de impuesto retenido conforme al monto del pago, aplicable al documento relacionado.
                         * 
                         * @return
                         *     possible object is
                         *     {@link CImpuesto }
                         *     
                         */
                        public CImpuesto getImpuestoDR() {
                            return impuestoDR;
                        }

                        /**
                         * Define el valor de la propiedad impuestoDR.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link CImpuesto }
                         *     
                         * @see #getImpuestoDR()
                         */
                        public void setImpuestoDR(CImpuesto value) {
                            this.impuestoDR = value;
                        }

                        /**
                         * Atributo requerido para señalar la clave del tipo de factor que se aplica a la base del impuesto.
                         * 
                         * @return
                         *     possible object is
                         *     {@link CTipoFactor }
                         *     
                         */
                        public CTipoFactor getTipoFactorDR() {
                            return tipoFactorDR;
                        }

                        /**
                         * Define el valor de la propiedad tipoFactorDR.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link CTipoFactor }
                         *     
                         * @see #getTipoFactorDR()
                         */
                        public void setTipoFactorDR(CTipoFactor value) {
                            this.tipoFactorDR = value;
                        }

                        /**
                         * Atributo requerido para señalar el valor de la tasa o cuota del impuesto que se retiene.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getTasaOCuotaDR() {
                            return tasaOCuotaDR;
                        }

                        /**
                         * Define el valor de la propiedad tasaOCuotaDR.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         * @see #getTasaOCuotaDR()
                         */
                        public void setTasaOCuotaDR(BigDecimal value) {
                            this.tasaOCuotaDR = value;
                        }

                        /**
                         * Atributo requerido para señalar el importe del impuesto retenido conforme al monto del pago, aplicable al documento relacionado. No se permiten valores negativos.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getImporteDR() {
                            return importeDR;
                        }

                        /**
                         * Define el valor de la propiedad importeDR.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         * @see #getImporteDR()
                         */
                        public void setImporteDR(BigDecimal value) {
                            this.importeDR = value;
                        }

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
                 *       <sequence>
                 *         <element name="TrasladoDR" maxOccurs="unbounded">
                 *           <complexType>
                 *             <complexContent>
                 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 <attribute name="BaseDR" use="required">
                 *                   <simpleType>
                 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *                       <minInclusive value="0.000001"/>
                 *                       <fractionDigits value="6"/>
                 *                       <whiteSpace value="collapse"/>
                 *                     </restriction>
                 *                   </simpleType>
                 *                 </attribute>
                 *                 <attribute name="ImpuestoDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
                 *                 <attribute name="TipoFactorDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
                 *                 <attribute name="TasaOCuotaDR">
                 *                   <simpleType>
                 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *                       <minInclusive value="0.000000"/>
                 *                       <fractionDigits value="6"/>
                 *                       <whiteSpace value="collapse"/>
                 *                     </restriction>
                 *                   </simpleType>
                 *                 </attribute>
                 *                 <attribute name="ImporteDR" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
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
                    "trasladoDR"
                })
                public static class TrasladosDR {

                    /**
                     * Nodo requerido para asentar la información detallada de un traslado de impuesto específico conforme al monto del pago recibido.
                     * 
                     */
                    @XmlElement(name = "TrasladoDR", required = true)
                    protected List<Pagos.Pago.DoctoRelacionado.ImpuestosDR.TrasladosDR.TrasladoDR> trasladoDR;

                    /**
                     * Nodo requerido para asentar la información detallada de un traslado de impuesto específico conforme al monto del pago recibido.
                     * 
                     * Gets the value of the trasladoDR property.
                     * 
                     * <p>This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the trasladoDR property.</p>
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * </p>
                     * <pre>
                     * getTrasladoDR().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Pagos.Pago.DoctoRelacionado.ImpuestosDR.TrasladosDR.TrasladoDR }
                     * </p>
                     * 
                     * 
                     * @return
                     *     The value of the trasladoDR property.
                     */
                    public List<Pagos.Pago.DoctoRelacionado.ImpuestosDR.TrasladosDR.TrasladoDR> getTrasladoDR() {
                        if (trasladoDR == null) {
                            trasladoDR = new ArrayList<>();
                        }
                        return this.trasladoDR;
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
                     *       <attribute name="BaseDR" use="required">
                     *         <simpleType>
                     *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                     *             <minInclusive value="0.000001"/>
                     *             <fractionDigits value="6"/>
                     *             <whiteSpace value="collapse"/>
                     *           </restriction>
                     *         </simpleType>
                     *       </attribute>
                     *       <attribute name="ImpuestoDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
                     *       <attribute name="TipoFactorDR" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
                     *       <attribute name="TasaOCuotaDR">
                     *         <simpleType>
                     *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                     *             <minInclusive value="0.000000"/>
                     *             <fractionDigits value="6"/>
                     *             <whiteSpace value="collapse"/>
                     *           </restriction>
                     *         </simpleType>
                     *       </attribute>
                     *       <attribute name="ImporteDR" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
                     *     </restriction>
                     *   </complexContent>
                     * </complexType>
                     * }</pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class TrasladoDR {

                        /**
                         * Atributo requerido para señalar la base para el cálculo del impuesto trasladado conforme al monto del pago, aplicable al documento relacionado, la determinación de la base se realiza de acuerdo con las disposiciones fiscales vigentes. No se permiten valores negativos.
                         * 
                         */
                        @XmlAttribute(name = "BaseDR", required = true)
                        protected BigDecimal baseDR;
                        /**
                         * Atributo requerido para señalar la clave del tipo de impuesto trasladado conforme al monto del pago, aplicable al documento relacionado.
                         * 
                         */
                        @XmlAttribute(name = "ImpuestoDR", required = true)
                        protected CImpuesto impuestoDR;
                        /**
                         * Atributo requerido para señalar la clave del tipo de factor que se aplica a la base del impuesto.
                         * 
                         */
                        @XmlAttribute(name = "TipoFactorDR", required = true)
                        protected CTipoFactor tipoFactorDR;
                        /**
                         * Atributo condicional para señalar el valor de la tasa o cuota del impuesto que se traslada. Es requerido cuando el atributo TipoFactorDR contenga una clave que corresponda a Tasa o Cuota.
                         * 
                         */
                        @XmlAttribute(name = "TasaOCuotaDR")
                        protected BigDecimal tasaOCuotaDR;
                        /**
                         * Atributo condicional para señalar el importe del impuesto trasladado conforme al monto del pago, aplicable al documento relacionado. No se permiten valores negativos. Es requerido cuando el tipo factor sea Tasa o Cuota.
                         * 
                         */
                        @XmlAttribute(name = "ImporteDR")
                        protected BigDecimal importeDR;

                        /**
                         * Atributo requerido para señalar la base para el cálculo del impuesto trasladado conforme al monto del pago, aplicable al documento relacionado, la determinación de la base se realiza de acuerdo con las disposiciones fiscales vigentes. No se permiten valores negativos.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getBaseDR() {
                            return baseDR;
                        }

                        /**
                         * Define el valor de la propiedad baseDR.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         * @see #getBaseDR()
                         */
                        public void setBaseDR(BigDecimal value) {
                            this.baseDR = value;
                        }

                        /**
                         * Atributo requerido para señalar la clave del tipo de impuesto trasladado conforme al monto del pago, aplicable al documento relacionado.
                         * 
                         * @return
                         *     possible object is
                         *     {@link CImpuesto }
                         *     
                         */
                        public CImpuesto getImpuestoDR() {
                            return impuestoDR;
                        }

                        /**
                         * Define el valor de la propiedad impuestoDR.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link CImpuesto }
                         *     
                         * @see #getImpuestoDR()
                         */
                        public void setImpuestoDR(CImpuesto value) {
                            this.impuestoDR = value;
                        }

                        /**
                         * Atributo requerido para señalar la clave del tipo de factor que se aplica a la base del impuesto.
                         * 
                         * @return
                         *     possible object is
                         *     {@link CTipoFactor }
                         *     
                         */
                        public CTipoFactor getTipoFactorDR() {
                            return tipoFactorDR;
                        }

                        /**
                         * Define el valor de la propiedad tipoFactorDR.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link CTipoFactor }
                         *     
                         * @see #getTipoFactorDR()
                         */
                        public void setTipoFactorDR(CTipoFactor value) {
                            this.tipoFactorDR = value;
                        }

                        /**
                         * Atributo condicional para señalar el valor de la tasa o cuota del impuesto que se traslada. Es requerido cuando el atributo TipoFactorDR contenga una clave que corresponda a Tasa o Cuota.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getTasaOCuotaDR() {
                            return tasaOCuotaDR;
                        }

                        /**
                         * Define el valor de la propiedad tasaOCuotaDR.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         * @see #getTasaOCuotaDR()
                         */
                        public void setTasaOCuotaDR(BigDecimal value) {
                            this.tasaOCuotaDR = value;
                        }

                        /**
                         * Atributo condicional para señalar el importe del impuesto trasladado conforme al monto del pago, aplicable al documento relacionado. No se permiten valores negativos. Es requerido cuando el tipo factor sea Tasa o Cuota.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getImporteDR() {
                            return importeDR;
                        }

                        /**
                         * Define el valor de la propiedad importeDR.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         * @see #getImporteDR()
                         */
                        public void setImporteDR(BigDecimal value) {
                            this.importeDR = value;
                        }

                    }

                }

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
         *       <sequence>
         *         <element name="RetencionesP" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="RetencionP" maxOccurs="unbounded">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <attribute name="ImpuestoP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
         *                           <attribute name="ImporteP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
         *                         </restriction>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="TrasladosP" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="TrasladoP" maxOccurs="unbounded">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <attribute name="BaseP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
         *                           <attribute name="ImpuestoP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
         *                           <attribute name="TipoFactorP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
         *                           <attribute name="TasaOCuotaP">
         *                             <simpleType>
         *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                 <fractionDigits value="6"/>
         *                                 <minInclusive value="0.000000"/>
         *                                 <whiteSpace value="collapse"/>
         *                               </restriction>
         *                             </simpleType>
         *                           </attribute>
         *                           <attribute name="ImporteP" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
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
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "retencionesP",
            "trasladosP"
        })
        public static class ImpuestosP {

            /**
             * Nodo condicional para señalar los impuestos retenidos aplicables conforme al monto del pago recibido. Es requerido cuando en los documentos relacionados se registre algún impuesto retenido.
             * 
             */
            @XmlElement(name = "RetencionesP")
            protected Pagos.Pago.ImpuestosP.RetencionesP retencionesP;
            /**
             * Nodo condicional para capturar los impuestos trasladados aplicables conforme al monto del pago recibido. Es requerido cuando en los documentos relacionados se registre un impuesto trasladado.
             * 
             */
            @XmlElement(name = "TrasladosP")
            protected Pagos.Pago.ImpuestosP.TrasladosP trasladosP;

            /**
             * Nodo condicional para señalar los impuestos retenidos aplicables conforme al monto del pago recibido. Es requerido cuando en los documentos relacionados se registre algún impuesto retenido.
             * 
             * @return
             *     possible object is
             *     {@link Pagos.Pago.ImpuestosP.RetencionesP }
             *     
             */
            public Pagos.Pago.ImpuestosP.RetencionesP getRetencionesP() {
                return retencionesP;
            }

            /**
             * Define el valor de la propiedad retencionesP.
             * 
             * @param value
             *     allowed object is
             *     {@link Pagos.Pago.ImpuestosP.RetencionesP }
             *     
             * @see #getRetencionesP()
             */
            public void setRetencionesP(Pagos.Pago.ImpuestosP.RetencionesP value) {
                this.retencionesP = value;
            }

            /**
             * Nodo condicional para capturar los impuestos trasladados aplicables conforme al monto del pago recibido. Es requerido cuando en los documentos relacionados se registre un impuesto trasladado.
             * 
             * @return
             *     possible object is
             *     {@link Pagos.Pago.ImpuestosP.TrasladosP }
             *     
             */
            public Pagos.Pago.ImpuestosP.TrasladosP getTrasladosP() {
                return trasladosP;
            }

            /**
             * Define el valor de la propiedad trasladosP.
             * 
             * @param value
             *     allowed object is
             *     {@link Pagos.Pago.ImpuestosP.TrasladosP }
             *     
             * @see #getTrasladosP()
             */
            public void setTrasladosP(Pagos.Pago.ImpuestosP.TrasladosP value) {
                this.trasladosP = value;
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
             *         <element name="RetencionP" maxOccurs="unbounded">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <attribute name="ImpuestoP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
             *                 <attribute name="ImporteP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
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
                "retencionP"
            })
            public static class RetencionesP {

                /**
                 * Nodo requerido para señalar la información detallada de una retención de impuesto específico conforme al monto del pago recibido.
                 * 
                 */
                @XmlElement(name = "RetencionP", required = true)
                protected List<Pagos.Pago.ImpuestosP.RetencionesP.RetencionP> retencionP;

                /**
                 * Nodo requerido para señalar la información detallada de una retención de impuesto específico conforme al monto del pago recibido.
                 * 
                 * Gets the value of the retencionP property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the retencionP property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getRetencionP().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Pagos.Pago.ImpuestosP.RetencionesP.RetencionP }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the retencionP property.
                 */
                public List<Pagos.Pago.ImpuestosP.RetencionesP.RetencionP> getRetencionP() {
                    if (retencionP == null) {
                        retencionP = new ArrayList<>();
                    }
                    return this.retencionP;
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
                 *       <attribute name="ImpuestoP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
                 *       <attribute name="ImporteP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
                 *     </restriction>
                 *   </complexContent>
                 * </complexType>
                 * }</pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class RetencionP {

                    /**
                     * Atributo requerido para señalar la clave del tipo de impuesto retenido conforme al monto del pago.
                     * 
                     */
                    @XmlAttribute(name = "ImpuestoP", required = true)
                    protected CImpuesto impuestoP;
                    /**
                     * Atributo requerido para señalar el importe del impuesto retenido conforme al monto del pago. No se permiten valores negativos.
                     * 
                     */
                    @XmlAttribute(name = "ImporteP", required = true)
                    protected BigDecimal importeP;

                    /**
                     * Atributo requerido para señalar la clave del tipo de impuesto retenido conforme al monto del pago.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CImpuesto }
                     *     
                     */
                    public CImpuesto getImpuestoP() {
                        return impuestoP;
                    }

                    /**
                     * Define el valor de la propiedad impuestoP.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CImpuesto }
                     *     
                     * @see #getImpuestoP()
                     */
                    public void setImpuestoP(CImpuesto value) {
                        this.impuestoP = value;
                    }

                    /**
                     * Atributo requerido para señalar el importe del impuesto retenido conforme al monto del pago. No se permiten valores negativos.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getImporteP() {
                        return importeP;
                    }

                    /**
                     * Define el valor de la propiedad importeP.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     * @see #getImporteP()
                     */
                    public void setImporteP(BigDecimal value) {
                        this.importeP = value;
                    }

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
             *       <sequence>
             *         <element name="TrasladoP" maxOccurs="unbounded">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <attribute name="BaseP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
             *                 <attribute name="ImpuestoP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
             *                 <attribute name="TipoFactorP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
             *                 <attribute name="TasaOCuotaP">
             *                   <simpleType>
             *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                       <fractionDigits value="6"/>
             *                       <minInclusive value="0.000000"/>
             *                       <whiteSpace value="collapse"/>
             *                     </restriction>
             *                   </simpleType>
             *                 </attribute>
             *                 <attribute name="ImporteP" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
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
                "trasladoP"
            })
            public static class TrasladosP {

                /**
                 * Nodo requerido para señalar la información detallada de un traslado de impuesto específico conforme al monto del pago recibido.
                 * 
                 */
                @XmlElement(name = "TrasladoP", required = true)
                protected List<Pagos.Pago.ImpuestosP.TrasladosP.TrasladoP> trasladoP;

                /**
                 * Nodo requerido para señalar la información detallada de un traslado de impuesto específico conforme al monto del pago recibido.
                 * 
                 * Gets the value of the trasladoP property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the trasladoP property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getTrasladoP().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Pagos.Pago.ImpuestosP.TrasladosP.TrasladoP }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the trasladoP property.
                 */
                public List<Pagos.Pago.ImpuestosP.TrasladosP.TrasladoP> getTrasladoP() {
                    if (trasladoP == null) {
                        trasladoP = new ArrayList<>();
                    }
                    return this.trasladoP;
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
                 *       <attribute name="BaseP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
                 *       <attribute name="ImpuestoP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
                 *       <attribute name="TipoFactorP" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
                 *       <attribute name="TasaOCuotaP">
                 *         <simpleType>
                 *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *             <fractionDigits value="6"/>
                 *             <minInclusive value="0.000000"/>
                 *             <whiteSpace value="collapse"/>
                 *           </restriction>
                 *         </simpleType>
                 *       </attribute>
                 *       <attribute name="ImporteP" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
                 *     </restriction>
                 *   </complexContent>
                 * </complexType>
                 * }</pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class TrasladoP {

                    /**
                     * Atributo requerido para señalar la suma de los atributos BaseDR de los documentos relacionados del impuesto trasladado. No se permiten valores negativos.
                     * 
                     */
                    @XmlAttribute(name = "BaseP", required = true)
                    protected BigDecimal baseP;
                    /**
                     * Atributo requerido para señalar la clave del tipo de impuesto trasladado conforme al monto del pago.
                     * 
                     */
                    @XmlAttribute(name = "ImpuestoP", required = true)
                    protected CImpuesto impuestoP;
                    /**
                     * Atributo requerido para señalar la clave del tipo de factor que se aplica a la base del impuesto.
                     * 
                     */
                    @XmlAttribute(name = "TipoFactorP", required = true)
                    protected CTipoFactor tipoFactorP;
                    /**
                     * Atributo condicional para señalar el valor de la tasa o cuota del impuesto que se traslada en los documentos relacionados.
                     * 
                     */
                    @XmlAttribute(name = "TasaOCuotaP")
                    protected BigDecimal tasaOCuotaP;
                    /**
                     * Atributo condicional para señalar la suma del impuesto trasladado, agrupado por ImpuestoP, TipoFactorP y TasaOCuotaP. No se permiten valores negativos.
                     * 
                     */
                    @XmlAttribute(name = "ImporteP")
                    protected BigDecimal importeP;

                    /**
                     * Atributo requerido para señalar la suma de los atributos BaseDR de los documentos relacionados del impuesto trasladado. No se permiten valores negativos.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getBaseP() {
                        return baseP;
                    }

                    /**
                     * Define el valor de la propiedad baseP.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     * @see #getBaseP()
                     */
                    public void setBaseP(BigDecimal value) {
                        this.baseP = value;
                    }

                    /**
                     * Atributo requerido para señalar la clave del tipo de impuesto trasladado conforme al monto del pago.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CImpuesto }
                     *     
                     */
                    public CImpuesto getImpuestoP() {
                        return impuestoP;
                    }

                    /**
                     * Define el valor de la propiedad impuestoP.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CImpuesto }
                     *     
                     * @see #getImpuestoP()
                     */
                    public void setImpuestoP(CImpuesto value) {
                        this.impuestoP = value;
                    }

                    /**
                     * Atributo requerido para señalar la clave del tipo de factor que se aplica a la base del impuesto.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CTipoFactor }
                     *     
                     */
                    public CTipoFactor getTipoFactorP() {
                        return tipoFactorP;
                    }

                    /**
                     * Define el valor de la propiedad tipoFactorP.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CTipoFactor }
                     *     
                     * @see #getTipoFactorP()
                     */
                    public void setTipoFactorP(CTipoFactor value) {
                        this.tipoFactorP = value;
                    }

                    /**
                     * Atributo condicional para señalar el valor de la tasa o cuota del impuesto que se traslada en los documentos relacionados.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getTasaOCuotaP() {
                        return tasaOCuotaP;
                    }

                    /**
                     * Define el valor de la propiedad tasaOCuotaP.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     * @see #getTasaOCuotaP()
                     */
                    public void setTasaOCuotaP(BigDecimal value) {
                        this.tasaOCuotaP = value;
                    }

                    /**
                     * Atributo condicional para señalar la suma del impuesto trasladado, agrupado por ImpuestoP, TipoFactorP y TasaOCuotaP. No se permiten valores negativos.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getImporteP() {
                        return importeP;
                    }

                    /**
                     * Define el valor de la propiedad importeP.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     * @see #getImporteP()
                     */
                    public void setImporteP(BigDecimal value) {
                        this.importeP = value;
                    }

                }

            }

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
     *       <attribute name="TotalRetencionesIVA" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *       <attribute name="TotalRetencionesISR" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *       <attribute name="TotalRetencionesIEPS" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *       <attribute name="TotalTrasladosBaseIVA16" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *       <attribute name="TotalTrasladosImpuestoIVA16" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *       <attribute name="TotalTrasladosBaseIVA8" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *       <attribute name="TotalTrasladosImpuestoIVA8" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *       <attribute name="TotalTrasladosBaseIVA0" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *       <attribute name="TotalTrasladosImpuestoIVA0" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *       <attribute name="TotalTrasladosBaseIVAExento" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *       <attribute name="MontoTotalPagos" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Totales {

        /**
         * Atributo condicional para expresar el total de los impuestos retenidos de IVA que se desprenden de los pagos. No se permiten valores negativos.
         * 
         */
        @XmlAttribute(name = "TotalRetencionesIVA")
        protected BigDecimal totalRetencionesIVA;
        /**
         * Atributo condicional para expresar el total de los impuestos retenidos de ISR que se desprenden de los pagos. No se permiten valores negativos.
         * 
         */
        @XmlAttribute(name = "TotalRetencionesISR")
        protected BigDecimal totalRetencionesISR;
        /**
         * Atributo condicional para expresar el total de los impuestos retenidos de IEPS que se desprenden de los pagos. No se permiten valores negativos.
         * 
         */
        @XmlAttribute(name = "TotalRetencionesIEPS")
        protected BigDecimal totalRetencionesIEPS;
        /**
         * Atributo condicional para expresar el total de la base de IVA trasladado a la tasa del 16% que se desprende de los pagos. No se permiten valores negativos.
         * 
         */
        @XmlAttribute(name = "TotalTrasladosBaseIVA16")
        protected BigDecimal totalTrasladosBaseIVA16;
        /**
         * Atributo condicional para expresar el total de los impuestos de IVA trasladado a la tasa del 16% que se desprenden de los pagos. No se permiten valores negativos.
         * 
         */
        @XmlAttribute(name = "TotalTrasladosImpuestoIVA16")
        protected BigDecimal totalTrasladosImpuestoIVA16;
        /**
         * Atributo condicional para expresar el total de la base de IVA trasladado a la tasa del 8% que se desprende de los pagos. No se permiten valores negativos.
         * 
         */
        @XmlAttribute(name = "TotalTrasladosBaseIVA8")
        protected BigDecimal totalTrasladosBaseIVA8;
        /**
         * Atributo condicional para expresar el total de los impuestos de IVA trasladado a la tasa del 8% que se desprenden de los pagos. No se permiten valores negativos.
         * 
         */
        @XmlAttribute(name = "TotalTrasladosImpuestoIVA8")
        protected BigDecimal totalTrasladosImpuestoIVA8;
        /**
         * Atributo condicional para expresar el total de la base de IVA trasladado a la tasa del 0% que se desprende de los pagos. No se permiten valores negativos.
         * 
         */
        @XmlAttribute(name = "TotalTrasladosBaseIVA0")
        protected BigDecimal totalTrasladosBaseIVA0;
        /**
         * Atributo condicional para expresar el total de los impuestos de IVA trasladado a la tasa del 0% que se desprenden de los pagos. No se permiten valores negativos.
         * 
         */
        @XmlAttribute(name = "TotalTrasladosImpuestoIVA0")
        protected BigDecimal totalTrasladosImpuestoIVA0;
        /**
         * Atributo condicional para expresar el total de la base de IVA trasladado exento que se desprende de los pagos. No se permiten valores negativos.
         * 
         */
        @XmlAttribute(name = "TotalTrasladosBaseIVAExento")
        protected BigDecimal totalTrasladosBaseIVAExento;
        /**
         * Atributo requerido para expresar el total de los pagos que se desprenden de los nodos Pago. No se permiten valores negativos.
         * 
         */
        @XmlAttribute(name = "MontoTotalPagos", required = true)
        protected BigDecimal montoTotalPagos;

        /**
         * Atributo condicional para expresar el total de los impuestos retenidos de IVA que se desprenden de los pagos. No se permiten valores negativos.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalRetencionesIVA() {
            return totalRetencionesIVA;
        }

        /**
         * Define el valor de la propiedad totalRetencionesIVA.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getTotalRetencionesIVA()
         */
        public void setTotalRetencionesIVA(BigDecimal value) {
            this.totalRetencionesIVA = value;
        }

        /**
         * Atributo condicional para expresar el total de los impuestos retenidos de ISR que se desprenden de los pagos. No se permiten valores negativos.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalRetencionesISR() {
            return totalRetencionesISR;
        }

        /**
         * Define el valor de la propiedad totalRetencionesISR.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getTotalRetencionesISR()
         */
        public void setTotalRetencionesISR(BigDecimal value) {
            this.totalRetencionesISR = value;
        }

        /**
         * Atributo condicional para expresar el total de los impuestos retenidos de IEPS que se desprenden de los pagos. No se permiten valores negativos.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalRetencionesIEPS() {
            return totalRetencionesIEPS;
        }

        /**
         * Define el valor de la propiedad totalRetencionesIEPS.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getTotalRetencionesIEPS()
         */
        public void setTotalRetencionesIEPS(BigDecimal value) {
            this.totalRetencionesIEPS = value;
        }

        /**
         * Atributo condicional para expresar el total de la base de IVA trasladado a la tasa del 16% que se desprende de los pagos. No se permiten valores negativos.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalTrasladosBaseIVA16() {
            return totalTrasladosBaseIVA16;
        }

        /**
         * Define el valor de la propiedad totalTrasladosBaseIVA16.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getTotalTrasladosBaseIVA16()
         */
        public void setTotalTrasladosBaseIVA16(BigDecimal value) {
            this.totalTrasladosBaseIVA16 = value;
        }

        /**
         * Atributo condicional para expresar el total de los impuestos de IVA trasladado a la tasa del 16% que se desprenden de los pagos. No se permiten valores negativos.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalTrasladosImpuestoIVA16() {
            return totalTrasladosImpuestoIVA16;
        }

        /**
         * Define el valor de la propiedad totalTrasladosImpuestoIVA16.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getTotalTrasladosImpuestoIVA16()
         */
        public void setTotalTrasladosImpuestoIVA16(BigDecimal value) {
            this.totalTrasladosImpuestoIVA16 = value;
        }

        /**
         * Atributo condicional para expresar el total de la base de IVA trasladado a la tasa del 8% que se desprende de los pagos. No se permiten valores negativos.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalTrasladosBaseIVA8() {
            return totalTrasladosBaseIVA8;
        }

        /**
         * Define el valor de la propiedad totalTrasladosBaseIVA8.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getTotalTrasladosBaseIVA8()
         */
        public void setTotalTrasladosBaseIVA8(BigDecimal value) {
            this.totalTrasladosBaseIVA8 = value;
        }

        /**
         * Atributo condicional para expresar el total de los impuestos de IVA trasladado a la tasa del 8% que se desprenden de los pagos. No se permiten valores negativos.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalTrasladosImpuestoIVA8() {
            return totalTrasladosImpuestoIVA8;
        }

        /**
         * Define el valor de la propiedad totalTrasladosImpuestoIVA8.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getTotalTrasladosImpuestoIVA8()
         */
        public void setTotalTrasladosImpuestoIVA8(BigDecimal value) {
            this.totalTrasladosImpuestoIVA8 = value;
        }

        /**
         * Atributo condicional para expresar el total de la base de IVA trasladado a la tasa del 0% que se desprende de los pagos. No se permiten valores negativos.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalTrasladosBaseIVA0() {
            return totalTrasladosBaseIVA0;
        }

        /**
         * Define el valor de la propiedad totalTrasladosBaseIVA0.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getTotalTrasladosBaseIVA0()
         */
        public void setTotalTrasladosBaseIVA0(BigDecimal value) {
            this.totalTrasladosBaseIVA0 = value;
        }

        /**
         * Atributo condicional para expresar el total de los impuestos de IVA trasladado a la tasa del 0% que se desprenden de los pagos. No se permiten valores negativos.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalTrasladosImpuestoIVA0() {
            return totalTrasladosImpuestoIVA0;
        }

        /**
         * Define el valor de la propiedad totalTrasladosImpuestoIVA0.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getTotalTrasladosImpuestoIVA0()
         */
        public void setTotalTrasladosImpuestoIVA0(BigDecimal value) {
            this.totalTrasladosImpuestoIVA0 = value;
        }

        /**
         * Atributo condicional para expresar el total de la base de IVA trasladado exento que se desprende de los pagos. No se permiten valores negativos.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalTrasladosBaseIVAExento() {
            return totalTrasladosBaseIVAExento;
        }

        /**
         * Define el valor de la propiedad totalTrasladosBaseIVAExento.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getTotalTrasladosBaseIVAExento()
         */
        public void setTotalTrasladosBaseIVAExento(BigDecimal value) {
            this.totalTrasladosBaseIVAExento = value;
        }

        /**
         * Atributo requerido para expresar el total de los pagos que se desprenden de los nodos Pago. No se permiten valores negativos.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMontoTotalPagos() {
            return montoTotalPagos;
        }

        /**
         * Define el valor de la propiedad montoTotalPagos.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getMontoTotalPagos()
         */
        public void setMontoTotalPagos(BigDecimal value) {
            this.montoTotalPagos = value;
        }

    }

}
