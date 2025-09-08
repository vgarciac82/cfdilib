//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package com.angelsoft.sat.common.ecb10;

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
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *       <sequence>
 *         <element name="Movimientos">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice maxOccurs="unbounded">
 *                   <element name="MovimientoECB">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <attribute name="fecha" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *                                 <whiteSpace value="collapse"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="referencia">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <whiteSpace value="collapse"/>
 *                                 <minLength value="1"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="descripcion" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <minLength value="1"/>
 *                                 <whiteSpace value="collapse"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="importe" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 <whiteSpace value="collapse"/>
 *                                 <fractionDigits value="2"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="moneda">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <whiteSpace value="collapse"/>
 *                                 <minLength value="1"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="saldoInicial">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 <whiteSpace value="collapse"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="saldoAlCorte">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 <whiteSpace value="collapse"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="MovimientoECBFiscal">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <attribute name="fecha" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *                                 <whiteSpace value="collapse"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="referencia">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <whiteSpace value="collapse"/>
 *                                 <minLength value="1"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="descripcion" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <minLength value="1"/>
 *                                 <whiteSpace value="collapse"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="RFCenajenante" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <whiteSpace value="collapse"/>
 *                                 <minLength value="12"/>
 *                                 <maxLength value="13"/>
 *                                 <pattern value="[A-Z,Ñ,&]{3,4}[0-9]{2}[0-1][0-9][0-3][0-9][A-Z,0-9]{2}[0-9,A]"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="Importe" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 <whiteSpace value="collapse"/>
 *                                 <fractionDigits value="2"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="moneda">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <whiteSpace value="collapse"/>
 *                                 <minLength value="1"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="saldoInicial">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 <whiteSpace value="collapse"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="saldoAlCorte">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 <whiteSpace value="collapse"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="version" use="required" fixed="1.0">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <whiteSpace value="collapse"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="numeroCuenta" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             <whiteSpace value="collapse"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="nombreCliente" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <whiteSpace value="collapse"/>
 *             <minLength value="1"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="periodo" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <whiteSpace value="collapse"/>
 *             <minLength value="1"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="sucursal">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <whiteSpace value="collapse"/>
 *             <minLength value="1"/>
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
    "movimientos"
})
@XmlRootElement(name = "EstadoDeCuentaBancario")
public class EstadoDeCuentaBancario {

    /**
     * Nodo requerido para enlistar los conceptos cubiertos por Estado de Cuenta Bancario.
     * 
     */
    @XmlElement(name = "Movimientos", required = true)
    protected EstadoDeCuentaBancario.Movimientos movimientos;
    /**
     * Atributo requerido con valor prefijado a 1.0 que indica la versión del estándar bajo el que se encuentra expresado el complemento al comprobante.
     * 
     */
    @XmlAttribute(name = "version", required = true)
    protected String version;
    /**
     * Atributo requerido para indicar el número de cuenta del producto bancario.
     * 
     */
    @XmlAttribute(name = "numeroCuenta", required = true)
    protected BigInteger numeroCuenta;
    /**
     * Atributo requerido para indicar el nombre del cuentahabiente de la institución bancaria.
     * 
     */
    @XmlAttribute(name = "nombreCliente", required = true)
    protected String nombreCliente;
    /**
     * Atributo requerido para indicar periodo de los cargos o abonos al instrumento bancario.
     * 
     */
    @XmlAttribute(name = "periodo", required = true)
    protected String periodo;
    /**
     * Atributo opcional para indicar la sucursal a la cual pertenece el cuentahabiente.
     * 
     */
    @XmlAttribute(name = "sucursal")
    protected String sucursal;

    /**
     * Nodo requerido para enlistar los conceptos cubiertos por Estado de Cuenta Bancario.
     * 
     * @return
     *     possible object is
     *     {@link EstadoDeCuentaBancario.Movimientos }
     *     
     */
    public EstadoDeCuentaBancario.Movimientos getMovimientos() {
        return movimientos;
    }

    /**
     * Define el valor de la propiedad movimientos.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoDeCuentaBancario.Movimientos }
     *     
     * @see #getMovimientos()
     */
    public void setMovimientos(EstadoDeCuentaBancario.Movimientos value) {
        this.movimientos = value;
    }

    /**
     * Atributo requerido con valor prefijado a 1.0 que indica la versión del estándar bajo el que se encuentra expresado el complemento al comprobante.
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
     * Atributo requerido para indicar el número de cuenta del producto bancario.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Define el valor de la propiedad numeroCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getNumeroCuenta()
     */
    public void setNumeroCuenta(BigInteger value) {
        this.numeroCuenta = value;
    }

    /**
     * Atributo requerido para indicar el nombre del cuentahabiente de la institución bancaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Define el valor de la propiedad nombreCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNombreCliente()
     */
    public void setNombreCliente(String value) {
        this.nombreCliente = value;
    }

    /**
     * Atributo requerido para indicar periodo de los cargos o abonos al instrumento bancario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * Define el valor de la propiedad periodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPeriodo()
     */
    public void setPeriodo(String value) {
        this.periodo = value;
    }

    /**
     * Atributo opcional para indicar la sucursal a la cual pertenece el cuentahabiente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSucursal() {
        return sucursal;
    }

    /**
     * Define el valor de la propiedad sucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSucursal()
     */
    public void setSucursal(String value) {
        this.sucursal = value;
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
     *       <choice maxOccurs="unbounded">
     *         <element name="MovimientoECB">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <attribute name="fecha" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
     *                       <whiteSpace value="collapse"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="referencia">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <whiteSpace value="collapse"/>
     *                       <minLength value="1"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="descripcion" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <minLength value="1"/>
     *                       <whiteSpace value="collapse"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="importe" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                       <whiteSpace value="collapse"/>
     *                       <fractionDigits value="2"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="moneda">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <whiteSpace value="collapse"/>
     *                       <minLength value="1"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="saldoInicial">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                       <whiteSpace value="collapse"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="saldoAlCorte">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                       <whiteSpace value="collapse"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="MovimientoECBFiscal">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <attribute name="fecha" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
     *                       <whiteSpace value="collapse"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="referencia">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <whiteSpace value="collapse"/>
     *                       <minLength value="1"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="descripcion" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <minLength value="1"/>
     *                       <whiteSpace value="collapse"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="RFCenajenante" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <whiteSpace value="collapse"/>
     *                       <minLength value="12"/>
     *                       <maxLength value="13"/>
     *                       <pattern value="[A-Z,Ñ,&]{3,4}[0-9]{2}[0-1][0-9][0-3][0-9][A-Z,0-9]{2}[0-9,A]"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="Importe" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                       <whiteSpace value="collapse"/>
     *                       <fractionDigits value="2"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="moneda">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <whiteSpace value="collapse"/>
     *                       <minLength value="1"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="saldoInicial">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                       <whiteSpace value="collapse"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="saldoAlCorte">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                       <whiteSpace value="collapse"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "movimientoECBOrMovimientoECBFiscal"
    })
    public static class Movimientos {

        @XmlElements({
            @XmlElement(name = "MovimientoECB", type = EstadoDeCuentaBancario.Movimientos.MovimientoECB.class),
            @XmlElement(name = "MovimientoECBFiscal", type = EstadoDeCuentaBancario.Movimientos.MovimientoECBFiscal.class)
        })
        protected List<Object> movimientoECBOrMovimientoECBFiscal;

        /**
         * Gets the value of the movimientoECBOrMovimientoECBFiscal property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the movimientoECBOrMovimientoECBFiscal property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getMovimientoECBOrMovimientoECBFiscal().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EstadoDeCuentaBancario.Movimientos.MovimientoECB }
         * {@link EstadoDeCuentaBancario.Movimientos.MovimientoECBFiscal }
         * </p>
         * 
         * 
         * @return
         *     The value of the movimientoECBOrMovimientoECBFiscal property.
         */
        public List<Object> getMovimientoECBOrMovimientoECBFiscal() {
            if (movimientoECBOrMovimientoECBFiscal == null) {
                movimientoECBOrMovimientoECBFiscal = new ArrayList<>();
            }
            return this.movimientoECBOrMovimientoECBFiscal;
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
         *       <attribute name="fecha" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
         *             <whiteSpace value="collapse"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="referencia">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <whiteSpace value="collapse"/>
         *             <minLength value="1"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="descripcion" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <minLength value="1"/>
         *             <whiteSpace value="collapse"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="importe" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *             <whiteSpace value="collapse"/>
         *             <fractionDigits value="2"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="moneda">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <whiteSpace value="collapse"/>
         *             <minLength value="1"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="saldoInicial">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *             <whiteSpace value="collapse"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="saldoAlCorte">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
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
        public static class MovimientoECB {

            /**
             * Atributo requerido únicamente para la expresión de la fecha (mes/día) de la operación realizada por el cuentahabiente.
             * 
             */
            @XmlAttribute(name = "fecha", required = true)
            @XmlJavaTypeAdapter(DateTimeAdapter.class)
            protected LocalDateTime fecha;
            /**
             * Atributo opcional para indicar el número de referencia o autorización con el que se identifica la operación realizada por el cuentahabiente.
             * 
             */
            @XmlAttribute(name = "referencia")
            protected String referencia;
            /**
             * Atributo requerido para precisar la descripción del bien o servicio cubierto por el cargo a la cuenta bancaria.
             * 
             */
            @XmlAttribute(name = "descripcion", required = true)
            protected String descripcion;
            /**
             * Atributo requerido para indicar el importe de la operación realizada por el cuentahabiente por medio del instrumento bancario.
             * 
             */
            @XmlAttribute(name = "importe", required = true)
            protected BigDecimal importe;
            /**
             * Atributo opcional para indicar en que moneda se realizó la operación. Si no se especifica dato alguno, se entenderá que el importe está expresado en moneda nacional.
             * 
             */
            @XmlAttribute(name = "moneda")
            protected String moneda;
            /**
             * Atributo opcional para indicar el saldo inicial del instrumento bancario del cuentahabiente.
             * 
             */
            @XmlAttribute(name = "saldoInicial")
            protected BigDecimal saldoInicial;
            /**
             * Atributo opcional para indicar el saldo al corte del instrumento bancario del cuentahabiente.
             * 
             */
            @XmlAttribute(name = "saldoAlCorte")
            protected BigDecimal saldoAlCorte;

            /**
             * Atributo requerido únicamente para la expresión de la fecha (mes/día) de la operación realizada por el cuentahabiente.
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
             * Atributo opcional para indicar el número de referencia o autorización con el que se identifica la operación realizada por el cuentahabiente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReferencia() {
                return referencia;
            }

            /**
             * Define el valor de la propiedad referencia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getReferencia()
             */
            public void setReferencia(String value) {
                this.referencia = value;
            }

            /**
             * Atributo requerido para precisar la descripción del bien o servicio cubierto por el cargo a la cuenta bancaria.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescripcion() {
                return descripcion;
            }

            /**
             * Define el valor de la propiedad descripcion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getDescripcion()
             */
            public void setDescripcion(String value) {
                this.descripcion = value;
            }

            /**
             * Atributo requerido para indicar el importe de la operación realizada por el cuentahabiente por medio del instrumento bancario.
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
             * Atributo opcional para indicar en que moneda se realizó la operación. Si no se especifica dato alguno, se entenderá que el importe está expresado en moneda nacional.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMoneda() {
                return moneda;
            }

            /**
             * Define el valor de la propiedad moneda.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getMoneda()
             */
            public void setMoneda(String value) {
                this.moneda = value;
            }

            /**
             * Atributo opcional para indicar el saldo inicial del instrumento bancario del cuentahabiente.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSaldoInicial() {
                return saldoInicial;
            }

            /**
             * Define el valor de la propiedad saldoInicial.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getSaldoInicial()
             */
            public void setSaldoInicial(BigDecimal value) {
                this.saldoInicial = value;
            }

            /**
             * Atributo opcional para indicar el saldo al corte del instrumento bancario del cuentahabiente.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSaldoAlCorte() {
                return saldoAlCorte;
            }

            /**
             * Define el valor de la propiedad saldoAlCorte.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getSaldoAlCorte()
             */
            public void setSaldoAlCorte(BigDecimal value) {
                this.saldoAlCorte = value;
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
         *       <attribute name="fecha" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
         *             <whiteSpace value="collapse"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="referencia">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <whiteSpace value="collapse"/>
         *             <minLength value="1"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="descripcion" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <minLength value="1"/>
         *             <whiteSpace value="collapse"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="RFCenajenante" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <whiteSpace value="collapse"/>
         *             <minLength value="12"/>
         *             <maxLength value="13"/>
         *             <pattern value="[A-Z,Ñ,&]{3,4}[0-9]{2}[0-1][0-9][0-3][0-9][A-Z,0-9]{2}[0-9,A]"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="Importe" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *             <whiteSpace value="collapse"/>
         *             <fractionDigits value="2"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="moneda">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <whiteSpace value="collapse"/>
         *             <minLength value="1"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="saldoInicial">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *             <whiteSpace value="collapse"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="saldoAlCorte">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
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
        public static class MovimientoECBFiscal {

            /**
             * Atributo requerido únicamente para la expresión de la fecha (mes/día) de la operación realizada por el cuentahabiente.
             * 
             */
            @XmlAttribute(name = "fecha", required = true)
            @XmlJavaTypeAdapter(DateTimeAdapter.class)
            protected LocalDateTime fecha;
            /**
             * Atributo opcional para indicar el número de referencia o autorización con el que se identifica la operación realizada por el cuentahabiente.
             * 
             */
            @XmlAttribute(name = "referencia")
            protected String referencia;
            /**
             * Atributo requerido para precisar la descripción del bien o servicio cubierto por el cargo a la cuenta bancaria.
             * 
             */
            @XmlAttribute(name = "descripcion", required = true)
            protected String descripcion;
            /**
             * Atributo requerido para indicar el RFC del enajenante, sin el cual no se puede acreditar la compra de bienes o servicios por medio del estado de cuenta bancario.
             * 
             */
            @XmlAttribute(name = "RFCenajenante", required = true)
            protected String rfCenajenante;
            /**
             * Atributo requerido para indicar el importe de la operación realizada por el cuentahabiente por medio del instrumento bancario.
             * 
             */
            @XmlAttribute(name = "Importe", required = true)
            protected BigDecimal importe;
            /**
             * Atributo opcional para indicar en que moneda se realizó la operación. Si no se especifica dato alguno, se entenderá que el importe está expresado en moneda nacional.
             * 
             */
            @XmlAttribute(name = "moneda")
            protected String moneda;
            /**
             * Atributo opcional para indicar el saldo inicial del instrumento bancario del cuentahabiente.
             * 
             */
            @XmlAttribute(name = "saldoInicial")
            protected BigDecimal saldoInicial;
            /**
             * Atributo opcional para indicar el saldo al corte del instrumento bancario del cuentahabiente.
             * 
             */
            @XmlAttribute(name = "saldoAlCorte")
            protected BigDecimal saldoAlCorte;

            /**
             * Atributo requerido únicamente para la expresión de la fecha (mes/día) de la operación realizada por el cuentahabiente.
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
             * Atributo opcional para indicar el número de referencia o autorización con el que se identifica la operación realizada por el cuentahabiente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReferencia() {
                return referencia;
            }

            /**
             * Define el valor de la propiedad referencia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getReferencia()
             */
            public void setReferencia(String value) {
                this.referencia = value;
            }

            /**
             * Atributo requerido para precisar la descripción del bien o servicio cubierto por el cargo a la cuenta bancaria.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescripcion() {
                return descripcion;
            }

            /**
             * Define el valor de la propiedad descripcion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getDescripcion()
             */
            public void setDescripcion(String value) {
                this.descripcion = value;
            }

            /**
             * Atributo requerido para indicar el RFC del enajenante, sin el cual no se puede acreditar la compra de bienes o servicios por medio del estado de cuenta bancario.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRFCenajenante() {
                return rfCenajenante;
            }

            /**
             * Define el valor de la propiedad rfCenajenante.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getRFCenajenante()
             */
            public void setRFCenajenante(String value) {
                this.rfCenajenante = value;
            }

            /**
             * Atributo requerido para indicar el importe de la operación realizada por el cuentahabiente por medio del instrumento bancario.
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
             * Atributo opcional para indicar en que moneda se realizó la operación. Si no se especifica dato alguno, se entenderá que el importe está expresado en moneda nacional.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMoneda() {
                return moneda;
            }

            /**
             * Define el valor de la propiedad moneda.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getMoneda()
             */
            public void setMoneda(String value) {
                this.moneda = value;
            }

            /**
             * Atributo opcional para indicar el saldo inicial del instrumento bancario del cuentahabiente.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSaldoInicial() {
                return saldoInicial;
            }

            /**
             * Define el valor de la propiedad saldoInicial.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getSaldoInicial()
             */
            public void setSaldoInicial(BigDecimal value) {
                this.saldoInicial = value;
            }

            /**
             * Atributo opcional para indicar el saldo al corte del instrumento bancario del cuentahabiente.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSaldoAlCorte() {
                return saldoAlCorte;
            }

            /**
             * Define el valor de la propiedad saldoAlCorte.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getSaldoAlCorte()
             */
            public void setSaldoAlCorte(BigDecimal value) {
                this.saldoAlCorte = value;
            }

        }

    }

}
