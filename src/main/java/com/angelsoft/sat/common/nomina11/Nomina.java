//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package com.angelsoft.sat.common.nomina11;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.angelsoft.sat.util.DateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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
 *       <sequence>
 *         <element name="Percepciones" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Percepcion" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <attribute name="TipoPercepcion" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                 <minInclusive value="1"/>
 *                                 <pattern value="[0-9]{3}"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="Clave" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <minLength value="3"/>
 *                                 <maxLength value="15"/>
 *                                 <whiteSpace value="collapse"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="Concepto" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <minLength value="1"/>
 *                                 <maxLength value="100"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="ImporteGravado" use="required" type="{http://www.sat.gob.mx/nomina}t_Importe" />
 *                           <attribute name="ImporteExento" use="required" type="{http://www.sat.gob.mx/nomina}t_Importe" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="TotalGravado" use="required" type="{http://www.sat.gob.mx/nomina}t_Importe" />
 *                 <attribute name="TotalExento" use="required" type="{http://www.sat.gob.mx/nomina}t_Importe" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Deducciones" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Deduccion" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <attribute name="TipoDeduccion" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                 <minInclusive value="1"/>
 *                                 <pattern value="[0-9]{3}"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="Clave" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <minLength value="3"/>
 *                                 <maxLength value="15"/>
 *                                 <whiteSpace value="collapse"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="Concepto" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <minLength value="1"/>
 *                                 <maxLength value="100"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="ImporteGravado" use="required" type="{http://www.sat.gob.mx/nomina}t_Importe" />
 *                           <attribute name="ImporteExento" use="required" type="{http://www.sat.gob.mx/nomina}t_Importe" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="TotalGravado" use="required" type="{http://www.sat.gob.mx/nomina}t_Importe" />
 *                 <attribute name="TotalExento" use="required" type="{http://www.sat.gob.mx/nomina}t_Importe" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Incapacidades" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Incapacidad" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <attribute name="DiasIncapacidad" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 <fractionDigits value="6"/>
 *                                 <minInclusive value="1"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="TipoIncapacidad" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           <attribute name="Descuento" use="required" type="{http://www.sat.gob.mx/nomina}t_Importe" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="HorasExtras" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="HorasExtra" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <attribute name="Dias" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           <attribute name="TipoHoras" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <whiteSpace value="collapse"/>
 *                                 <enumeration value="Dobles"/>
 *                                 <enumeration value="Triples"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="HorasExtra" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           <attribute name="ImportePagado" use="required" type="{http://www.sat.gob.mx/nomina}t_Importe" />
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
 *       <attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1.1" />
 *       <attribute name="RegistroPatronal">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="20"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="NumEmpleado" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="15"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="CURP" use="required" type="{http://www.sat.gob.mx/nomina}t_CURP" />
 *       <attribute name="TipoRegimen" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             <minInclusive value="1"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="NumSeguridadSocial">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="15"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="FechaPago" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="FechaInicialPago" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="FechaFinalPago" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="NumDiasPagados" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             <fractionDigits value="6"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Departamento">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="100"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="CLABE" type="{http://www.sat.gob.mx/nomina}t_Clabe" />
 *       <attribute name="Banco">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             <minInclusive value="1"/>
 *             <pattern value="[0-9]{3}"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="FechaInicioRelLaboral" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       <attribute name="Antiguedad" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="Puesto" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="TipoContrato" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="TipoJornada" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="PeriodicidadPago" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <minLength value="1"/>
 *             <maxLength value="100"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="SalarioBaseCotApor" type="{http://www.sat.gob.mx/nomina}t_Importe" />
 *       <attribute name="RiesgoPuesto">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             <minInclusive value="1"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="SalarioDiarioIntegrado" type="{http://www.sat.gob.mx/nomina}t_Importe" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "percepciones",
    "deducciones",
    "incapacidades",
    "horasExtras"
})
@XmlRootElement(name = "Nomina")
public class Nomina {

    /**
     * Nodo opcional para expresar las percepciones aplicables
     * 
     */
    @XmlElement(name = "Percepciones")
    protected Nomina.Percepciones percepciones;
    /**
     * Nodo opcional para expresar las deducciones aplicables
     * 
     */
    @XmlElement(name = "Deducciones")
    protected Nomina.Deducciones deducciones;
    /**
     * Nodo opcional para expresar las incapacidades aplicables
     * 
     */
    @XmlElement(name = "Incapacidades")
    protected Nomina.Incapacidades incapacidades;
    /**
     * Nodo opcional para expresar las horas extras aplicables
     * 
     */
    @XmlElement(name = "HorasExtras")
    protected Nomina.HorasExtras horasExtras;
    /**
     * Atributo requerido para la expresión de la versión del complemento
     * 
     */
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    /**
     * Atributo opcional para expresar el registro patronal a 20 posiciones máximo
     * 
     */
    @XmlAttribute(name = "RegistroPatronal")
    protected String registroPatronal;
    /**
     * Atributo requerido para expresar el número de empleado de 1 a 15 posiciones
     * 
     */
    @XmlAttribute(name = "NumEmpleado", required = true)
    protected String numEmpleado;
    /**
     * Atributo requerido para la expresión de la CURP del trabajador
     * 
     */
    @XmlAttribute(name = "CURP", required = true)
    protected String curp;
    /**
     * Atributo requerido para la expresión de la clave del régimen por el cual se tiene contratado al trabajador, conforme al catálogo publicado en el portal del SAT en internet
     * 
     */
    @XmlAttribute(name = "TipoRegimen", required = true)
    protected int tipoRegimen;
    /**
     * Atributo opcional para la expresión del número de seguridad social aplicable al trabajador
     * 
     */
    @XmlAttribute(name = "NumSeguridadSocial")
    protected String numSeguridadSocial;
    /**
     * Atributo requerido para la expresión de la fecha efectiva de erogación del gasto. Se expresa en la forma aaaa-mm-dd, de acuerdo con la especificación ISO 8601.
     * 
     */
    @XmlAttribute(name = "FechaPago", required = true)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate fechaPago;
    /**
     * Atributo requerido para la expresión de la fecha inicial del pago. Se expresa en la forma aaaa-mm-dd, de acuerdo con la especificación ISO 8601.
     * 
     */
    @XmlAttribute(name = "FechaInicialPago", required = true)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate fechaInicialPago;
    /**
     * Atributo requerido para la expresión de la fecha final del pago. Se expresa en la forma aaaa-mm-dd, de acuerdo con la especificación ISO 8601.
     * 
     */
    @XmlAttribute(name = "FechaFinalPago", required = true)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate fechaFinalPago;
    /**
     * Atributo requerido para la expresión del número de días pagados
     * 
     */
    @XmlAttribute(name = "NumDiasPagados", required = true)
    protected BigDecimal numDiasPagados;
    /**
     * Atributo opcional para la expresión del departamento o área a la que pertenece el trabajador
     * 
     */
    @XmlAttribute(name = "Departamento")
    protected String departamento;
    /**
     * Atributo opcional para la expresión de la CLABE
     * 
     */
    @XmlAttribute(name = "CLABE")
    protected BigInteger clabe;
    /**
     * Atributo opcional para la expresión del Banco conforme al catálogo, donde se realiza un depósito de nómina
     * 
     */
    @XmlAttribute(name = "Banco")
    protected Integer banco;
    /**
     * Atributo opcional para expresar la fecha de inicio de la relación laboral entre el empleador y el empleado
     * 
     */
    @XmlAttribute(name = "FechaInicioRelLaboral")
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate fechaInicioRelLaboral;
    /**
     * Número de semanas que el empleado ha mantenido relación laboral con el empleador
     * 
     */
    @XmlAttribute(name = "Antiguedad")
    protected Integer antiguedad;
    /**
     * Puesto asignado al empleado o actividad que realiza
     * 
     */
    @XmlAttribute(name = "Puesto")
    protected String puesto;
    /**
     * Tipo de contrato que tiene el trabajador: Base, Eventual, Confianza, Sindicalizado, a prueba, etc.
     * 
     */
    @XmlAttribute(name = "TipoContrato")
    protected String tipoContrato;
    /**
     * Tipo de jornada que cubre el trabajador: Diurna, nocturna, mixta, por hora, reducida, continuada, partida, por turnos, etc.
     * 
     */
    @XmlAttribute(name = "TipoJornada")
    protected String tipoJornada;
    /**
     * Forma en que se establece el pago del salario: diario, semanal, quincenal, catorcenal mensual, bimestral, unidad de obra, comisión, precio alzado, etc.
     * 
     */
    @XmlAttribute(name = "PeriodicidadPago", required = true)
    protected String periodicidadPago;
    /**
     * Retribución otorgada al trabajador, que se integra por los pagos hechos en efectivo por cuota diaria, gratificaciones, percepciones, alimentación, habitación, primas, comisiones, prestaciones en especie y cualquiera otra cantidad o prestación que se entregue al trabajador por su trabajo, sin considerar los conceptos que se excluyen de conformidad con el Artículo 27 de la Ley del Seguro Social. (Se emplea para pagar las cuotas y aportaciones de Seguridad Social).
     * 
     */
    @XmlAttribute(name = "SalarioBaseCotApor")
    protected BigDecimal salarioBaseCotApor;
    /**
     * Clave conforme a la Clase en que deben inscribirse los patrones, de acuerdo a las actividades que desempeñan sus trabajadores, según lo previsto en el artículo 196 del Reglamento en Materia de Afiliación Clasificación de Empresas, Recaudación y Fiscalización. Catálogo publicado en el portal del SAT en internet
     * 
     */
    @XmlAttribute(name = "RiesgoPuesto")
    protected Integer riesgoPuesto;
    /**
     * El salario se integra con los pagos hechos en efectivo por cuota diaria, gratificaciones, percepciones, habitación, primas, comisiones, prestaciones en especie y cualquiera otra cantidad o prestación que se entregue al trabajador por su trabajo, de conformidad con el Art. 84 de la Ley Federal del Trabajo. (Se utiliza para el cálculo de las indemnizaciones).
     * 
     */
    @XmlAttribute(name = "SalarioDiarioIntegrado")
    protected BigDecimal salarioDiarioIntegrado;

    /**
     * Nodo opcional para expresar las percepciones aplicables
     * 
     * @return
     *     possible object is
     *     {@link Nomina.Percepciones }
     *     
     */
    public Nomina.Percepciones getPercepciones() {
        return percepciones;
    }

    /**
     * Define el valor de la propiedad percepciones.
     * 
     * @param value
     *     allowed object is
     *     {@link Nomina.Percepciones }
     *     
     * @see #getPercepciones()
     */
    public void setPercepciones(Nomina.Percepciones value) {
        this.percepciones = value;
    }

    /**
     * Nodo opcional para expresar las deducciones aplicables
     * 
     * @return
     *     possible object is
     *     {@link Nomina.Deducciones }
     *     
     */
    public Nomina.Deducciones getDeducciones() {
        return deducciones;
    }

    /**
     * Define el valor de la propiedad deducciones.
     * 
     * @param value
     *     allowed object is
     *     {@link Nomina.Deducciones }
     *     
     * @see #getDeducciones()
     */
    public void setDeducciones(Nomina.Deducciones value) {
        this.deducciones = value;
    }

    /**
     * Nodo opcional para expresar las incapacidades aplicables
     * 
     * @return
     *     possible object is
     *     {@link Nomina.Incapacidades }
     *     
     */
    public Nomina.Incapacidades getIncapacidades() {
        return incapacidades;
    }

    /**
     * Define el valor de la propiedad incapacidades.
     * 
     * @param value
     *     allowed object is
     *     {@link Nomina.Incapacidades }
     *     
     * @see #getIncapacidades()
     */
    public void setIncapacidades(Nomina.Incapacidades value) {
        this.incapacidades = value;
    }

    /**
     * Nodo opcional para expresar las horas extras aplicables
     * 
     * @return
     *     possible object is
     *     {@link Nomina.HorasExtras }
     *     
     */
    public Nomina.HorasExtras getHorasExtras() {
        return horasExtras;
    }

    /**
     * Define el valor de la propiedad horasExtras.
     * 
     * @param value
     *     allowed object is
     *     {@link Nomina.HorasExtras }
     *     
     * @see #getHorasExtras()
     */
    public void setHorasExtras(Nomina.HorasExtras value) {
        this.horasExtras = value;
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
     * Atributo opcional para expresar el registro patronal a 20 posiciones máximo
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistroPatronal() {
        return registroPatronal;
    }

    /**
     * Define el valor de la propiedad registroPatronal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRegistroPatronal()
     */
    public void setRegistroPatronal(String value) {
        this.registroPatronal = value;
    }

    /**
     * Atributo requerido para expresar el número de empleado de 1 a 15 posiciones
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumEmpleado() {
        return numEmpleado;
    }

    /**
     * Define el valor de la propiedad numEmpleado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNumEmpleado()
     */
    public void setNumEmpleado(String value) {
        this.numEmpleado = value;
    }

    /**
     * Atributo requerido para la expresión de la CURP del trabajador
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURP() {
        return curp;
    }

    /**
     * Define el valor de la propiedad curp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCURP()
     */
    public void setCURP(String value) {
        this.curp = value;
    }

    /**
     * Atributo requerido para la expresión de la clave del régimen por el cual se tiene contratado al trabajador, conforme al catálogo publicado en el portal del SAT en internet
     * 
     */
    public int getTipoRegimen() {
        return tipoRegimen;
    }

    /**
     * Define el valor de la propiedad tipoRegimen.
     * 
     */
    public void setTipoRegimen(int value) {
        this.tipoRegimen = value;
    }

    /**
     * Atributo opcional para la expresión del número de seguridad social aplicable al trabajador
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumSeguridadSocial() {
        return numSeguridadSocial;
    }

    /**
     * Define el valor de la propiedad numSeguridadSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNumSeguridadSocial()
     */
    public void setNumSeguridadSocial(String value) {
        this.numSeguridadSocial = value;
    }

    /**
     * Atributo requerido para la expresión de la fecha efectiva de erogación del gasto. Se expresa en la forma aaaa-mm-dd, de acuerdo con la especificación ISO 8601.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getFechaPago() {
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
    public void setFechaPago(LocalDate value) {
        this.fechaPago = value;
    }

    /**
     * Atributo requerido para la expresión de la fecha inicial del pago. Se expresa en la forma aaaa-mm-dd, de acuerdo con la especificación ISO 8601.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getFechaInicialPago() {
        return fechaInicialPago;
    }

    /**
     * Define el valor de la propiedad fechaInicialPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFechaInicialPago()
     */
    public void setFechaInicialPago(LocalDate value) {
        this.fechaInicialPago = value;
    }

    /**
     * Atributo requerido para la expresión de la fecha final del pago. Se expresa en la forma aaaa-mm-dd, de acuerdo con la especificación ISO 8601.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getFechaFinalPago() {
        return fechaFinalPago;
    }

    /**
     * Define el valor de la propiedad fechaFinalPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFechaFinalPago()
     */
    public void setFechaFinalPago(LocalDate value) {
        this.fechaFinalPago = value;
    }

    /**
     * Atributo requerido para la expresión del número de días pagados
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumDiasPagados() {
        return numDiasPagados;
    }

    /**
     * Define el valor de la propiedad numDiasPagados.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getNumDiasPagados()
     */
    public void setNumDiasPagados(BigDecimal value) {
        this.numDiasPagados = value;
    }

    /**
     * Atributo opcional para la expresión del departamento o área a la que pertenece el trabajador
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Define el valor de la propiedad departamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDepartamento()
     */
    public void setDepartamento(String value) {
        this.departamento = value;
    }

    /**
     * Atributo opcional para la expresión de la CLABE
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCLABE() {
        return clabe;
    }

    /**
     * Define el valor de la propiedad clabe.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getCLABE()
     */
    public void setCLABE(BigInteger value) {
        this.clabe = value;
    }

    /**
     * Atributo opcional para la expresión del Banco conforme al catálogo, donde se realiza un depósito de nómina
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBanco() {
        return banco;
    }

    /**
     * Define el valor de la propiedad banco.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getBanco()
     */
    public void setBanco(Integer value) {
        this.banco = value;
    }

    /**
     * Atributo opcional para expresar la fecha de inicio de la relación laboral entre el empleador y el empleado
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getFechaInicioRelLaboral() {
        return fechaInicioRelLaboral;
    }

    /**
     * Define el valor de la propiedad fechaInicioRelLaboral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFechaInicioRelLaboral()
     */
    public void setFechaInicioRelLaboral(LocalDate value) {
        this.fechaInicioRelLaboral = value;
    }

    /**
     * Número de semanas que el empleado ha mantenido relación laboral con el empleador
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAntiguedad() {
        return antiguedad;
    }

    /**
     * Define el valor de la propiedad antiguedad.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getAntiguedad()
     */
    public void setAntiguedad(Integer value) {
        this.antiguedad = value;
    }

    /**
     * Puesto asignado al empleado o actividad que realiza
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * Define el valor de la propiedad puesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPuesto()
     */
    public void setPuesto(String value) {
        this.puesto = value;
    }

    /**
     * Tipo de contrato que tiene el trabajador: Base, Eventual, Confianza, Sindicalizado, a prueba, etc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoContrato() {
        return tipoContrato;
    }

    /**
     * Define el valor de la propiedad tipoContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTipoContrato()
     */
    public void setTipoContrato(String value) {
        this.tipoContrato = value;
    }

    /**
     * Tipo de jornada que cubre el trabajador: Diurna, nocturna, mixta, por hora, reducida, continuada, partida, por turnos, etc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoJornada() {
        return tipoJornada;
    }

    /**
     * Define el valor de la propiedad tipoJornada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTipoJornada()
     */
    public void setTipoJornada(String value) {
        this.tipoJornada = value;
    }

    /**
     * Forma en que se establece el pago del salario: diario, semanal, quincenal, catorcenal mensual, bimestral, unidad de obra, comisión, precio alzado, etc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodicidadPago() {
        return periodicidadPago;
    }

    /**
     * Define el valor de la propiedad periodicidadPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPeriodicidadPago()
     */
    public void setPeriodicidadPago(String value) {
        this.periodicidadPago = value;
    }

    /**
     * Retribución otorgada al trabajador, que se integra por los pagos hechos en efectivo por cuota diaria, gratificaciones, percepciones, alimentación, habitación, primas, comisiones, prestaciones en especie y cualquiera otra cantidad o prestación que se entregue al trabajador por su trabajo, sin considerar los conceptos que se excluyen de conformidad con el Artículo 27 de la Ley del Seguro Social. (Se emplea para pagar las cuotas y aportaciones de Seguridad Social).
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalarioBaseCotApor() {
        return salarioBaseCotApor;
    }

    /**
     * Define el valor de la propiedad salarioBaseCotApor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getSalarioBaseCotApor()
     */
    public void setSalarioBaseCotApor(BigDecimal value) {
        this.salarioBaseCotApor = value;
    }

    /**
     * Clave conforme a la Clase en que deben inscribirse los patrones, de acuerdo a las actividades que desempeñan sus trabajadores, según lo previsto en el artículo 196 del Reglamento en Materia de Afiliación Clasificación de Empresas, Recaudación y Fiscalización. Catálogo publicado en el portal del SAT en internet
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRiesgoPuesto() {
        return riesgoPuesto;
    }

    /**
     * Define el valor de la propiedad riesgoPuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getRiesgoPuesto()
     */
    public void setRiesgoPuesto(Integer value) {
        this.riesgoPuesto = value;
    }

    /**
     * El salario se integra con los pagos hechos en efectivo por cuota diaria, gratificaciones, percepciones, habitación, primas, comisiones, prestaciones en especie y cualquiera otra cantidad o prestación que se entregue al trabajador por su trabajo, de conformidad con el Art. 84 de la Ley Federal del Trabajo. (Se utiliza para el cálculo de las indemnizaciones).
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalarioDiarioIntegrado() {
        return salarioDiarioIntegrado;
    }

    /**
     * Define el valor de la propiedad salarioDiarioIntegrado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getSalarioDiarioIntegrado()
     */
    public void setSalarioDiarioIntegrado(BigDecimal value) {
        this.salarioDiarioIntegrado = value;
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
     *         <element name="Deduccion" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <attribute name="TipoDeduccion" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                       <minInclusive value="1"/>
     *                       <pattern value="[0-9]{3}"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="Clave" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <minLength value="3"/>
     *                       <maxLength value="15"/>
     *                       <whiteSpace value="collapse"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="Concepto" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <minLength value="1"/>
     *                       <maxLength value="100"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="ImporteGravado" use="required" type="{http://www.sat.gob.mx/nomina}t_Importe" />
     *                 <attribute name="ImporteExento" use="required" type="{http://www.sat.gob.mx/nomina}t_Importe" />
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *       <attribute name="TotalGravado" use="required" type="{http://www.sat.gob.mx/nomina}t_Importe" />
     *       <attribute name="TotalExento" use="required" type="{http://www.sat.gob.mx/nomina}t_Importe" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "deduccion"
    })
    public static class Deducciones {

        /**
         * Nodo para expresar la información detallada de una deducción
         * 
         */
        @XmlElement(name = "Deduccion", required = true)
        protected List<Nomina.Deducciones.Deduccion> deduccion;
        /**
         * Atributo requerido para expresar el total de deducciones gravadas que se relacionan en el comprobante
         * 
         */
        @XmlAttribute(name = "TotalGravado", required = true)
        protected BigDecimal totalGravado;
        /**
         * Atributo requerido para expresar el total de deducciones exentas que se relacionan en el comprobante
         * 
         */
        @XmlAttribute(name = "TotalExento", required = true)
        protected BigDecimal totalExento;

        /**
         * Nodo para expresar la información detallada de una deducción
         * 
         * Gets the value of the deduccion property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the deduccion property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getDeduccion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Nomina.Deducciones.Deduccion }
         * </p>
         * 
         * 
         * @return
         *     The value of the deduccion property.
         */
        public List<Nomina.Deducciones.Deduccion> getDeduccion() {
            if (deduccion == null) {
                deduccion = new ArrayList<>();
            }
            return this.deduccion;
        }

        /**
         * Atributo requerido para expresar el total de deducciones gravadas que se relacionan en el comprobante
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalGravado() {
            return totalGravado;
        }

        /**
         * Define el valor de la propiedad totalGravado.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getTotalGravado()
         */
        public void setTotalGravado(BigDecimal value) {
            this.totalGravado = value;
        }

        /**
         * Atributo requerido para expresar el total de deducciones exentas que se relacionan en el comprobante
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalExento() {
            return totalExento;
        }

        /**
         * Define el valor de la propiedad totalExento.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getTotalExento()
         */
        public void setTotalExento(BigDecimal value) {
            this.totalExento = value;
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
         *       <attribute name="TipoDeduccion" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *             <minInclusive value="1"/>
         *             <pattern value="[0-9]{3}"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="Clave" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <minLength value="3"/>
         *             <maxLength value="15"/>
         *             <whiteSpace value="collapse"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="Concepto" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <minLength value="1"/>
         *             <maxLength value="100"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="ImporteGravado" use="required" type="{http://www.sat.gob.mx/nomina}t_Importe" />
         *       <attribute name="ImporteExento" use="required" type="{http://www.sat.gob.mx/nomina}t_Importe" />
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Deduccion {

            /**
             * Clave agrupadora. Clasifica la deducción conforme al catálogo publicado en el portal del SAT en internet
             * 
             */
            @XmlAttribute(name = "TipoDeduccion", required = true)
            protected int tipoDeduccion;
            /**
             * Atributo requerido para la clave de deducción de nómina propia de la contabilidad de cada patrón, puede conformarse desde 3 hasta 15 caracteres
             * 
             */
            @XmlAttribute(name = "Clave", required = true)
            protected String clave;
            /**
             * Atributo requerido para la descripción del concepto de deducción
             * 
             */
            @XmlAttribute(name = "Concepto", required = true)
            protected String concepto;
            /**
             * Atributo requerido, representa el importe gravado de un concepto de deducción
             * 
             */
            @XmlAttribute(name = "ImporteGravado", required = true)
            protected BigDecimal importeGravado;
            /**
             * Atributo requerido, representa el importe exento de un concepto de deducción
             * 
             */
            @XmlAttribute(name = "ImporteExento", required = true)
            protected BigDecimal importeExento;

            /**
             * Clave agrupadora. Clasifica la deducción conforme al catálogo publicado en el portal del SAT en internet
             * 
             */
            public int getTipoDeduccion() {
                return tipoDeduccion;
            }

            /**
             * Define el valor de la propiedad tipoDeduccion.
             * 
             */
            public void setTipoDeduccion(int value) {
                this.tipoDeduccion = value;
            }

            /**
             * Atributo requerido para la clave de deducción de nómina propia de la contabilidad de cada patrón, puede conformarse desde 3 hasta 15 caracteres
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClave() {
                return clave;
            }

            /**
             * Define el valor de la propiedad clave.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getClave()
             */
            public void setClave(String value) {
                this.clave = value;
            }

            /**
             * Atributo requerido para la descripción del concepto de deducción
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConcepto() {
                return concepto;
            }

            /**
             * Define el valor de la propiedad concepto.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getConcepto()
             */
            public void setConcepto(String value) {
                this.concepto = value;
            }

            /**
             * Atributo requerido, representa el importe gravado de un concepto de deducción
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getImporteGravado() {
                return importeGravado;
            }

            /**
             * Define el valor de la propiedad importeGravado.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getImporteGravado()
             */
            public void setImporteGravado(BigDecimal value) {
                this.importeGravado = value;
            }

            /**
             * Atributo requerido, representa el importe exento de un concepto de deducción
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getImporteExento() {
                return importeExento;
            }

            /**
             * Define el valor de la propiedad importeExento.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getImporteExento()
             */
            public void setImporteExento(BigDecimal value) {
                this.importeExento = value;
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
     *         <element name="HorasExtra" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <attribute name="Dias" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 <attribute name="TipoHoras" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <whiteSpace value="collapse"/>
     *                       <enumeration value="Dobles"/>
     *                       <enumeration value="Triples"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="HorasExtra" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 <attribute name="ImportePagado" use="required" type="{http://www.sat.gob.mx/nomina}t_Importe" />
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
        "horasExtra"
    })
    public static class HorasExtras {

        /**
         * Nodo opcional para expresar información de las horas extras
         * 
         */
        @XmlElement(name = "HorasExtra", required = true)
        protected List<Nomina.HorasExtras.HorasExtra> horasExtra;

        /**
         * Nodo opcional para expresar información de las horas extras
         * 
         * Gets the value of the horasExtra property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the horasExtra property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getHorasExtra().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Nomina.HorasExtras.HorasExtra }
         * </p>
         * 
         * 
         * @return
         *     The value of the horasExtra property.
         */
        public List<Nomina.HorasExtras.HorasExtra> getHorasExtra() {
            if (horasExtra == null) {
                horasExtra = new ArrayList<>();
            }
            return this.horasExtra;
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
         *       <attribute name="Dias" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       <attribute name="TipoHoras" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <whiteSpace value="collapse"/>
         *             <enumeration value="Dobles"/>
         *             <enumeration value="Triples"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="HorasExtra" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       <attribute name="ImportePagado" use="required" type="{http://www.sat.gob.mx/nomina}t_Importe" />
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class HorasExtra {

            /**
             * Número de días en que el trabajador realizó horas extra en el periodo
             * 
             */
            @XmlAttribute(name = "Dias", required = true)
            protected int dias;
            /**
             * Tipo de pago de las horas extra: dobles o triples
             * 
             */
            @XmlAttribute(name = "TipoHoras", required = true)
            protected String tipoHoras;
            /**
             * Número de horas extra trabajadas en el periodo
             * 
             */
            @XmlAttribute(name = "HorasExtra", required = true)
            protected int horasExtra;
            /**
             * Importe pagado por las horas extra
             * 
             */
            @XmlAttribute(name = "ImportePagado", required = true)
            protected BigDecimal importePagado;

            /**
             * Número de días en que el trabajador realizó horas extra en el periodo
             * 
             */
            public int getDias() {
                return dias;
            }

            /**
             * Define el valor de la propiedad dias.
             * 
             */
            public void setDias(int value) {
                this.dias = value;
            }

            /**
             * Tipo de pago de las horas extra: dobles o triples
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoHoras() {
                return tipoHoras;
            }

            /**
             * Define el valor de la propiedad tipoHoras.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getTipoHoras()
             */
            public void setTipoHoras(String value) {
                this.tipoHoras = value;
            }

            /**
             * Número de horas extra trabajadas en el periodo
             * 
             */
            public int getHorasExtra() {
                return horasExtra;
            }

            /**
             * Define el valor de la propiedad horasExtra.
             * 
             */
            public void setHorasExtra(int value) {
                this.horasExtra = value;
            }

            /**
             * Importe pagado por las horas extra
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getImportePagado() {
                return importePagado;
            }

            /**
             * Define el valor de la propiedad importePagado.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getImportePagado()
             */
            public void setImportePagado(BigDecimal value) {
                this.importePagado = value;
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
     *         <element name="Incapacidad" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <attribute name="DiasIncapacidad" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                       <fractionDigits value="6"/>
     *                       <minInclusive value="1"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="TipoIncapacidad" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 <attribute name="Descuento" use="required" type="{http://www.sat.gob.mx/nomina}t_Importe" />
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
        "incapacidad"
    })
    public static class Incapacidades {

        /**
         * Nodo opcional para expresar información de las incapacidades
         * 
         */
        @XmlElement(name = "Incapacidad", required = true)
        protected List<Nomina.Incapacidades.Incapacidad> incapacidad;

        /**
         * Nodo opcional para expresar información de las incapacidades
         * 
         * Gets the value of the incapacidad property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the incapacidad property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getIncapacidad().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Nomina.Incapacidades.Incapacidad }
         * </p>
         * 
         * 
         * @return
         *     The value of the incapacidad property.
         */
        public List<Nomina.Incapacidades.Incapacidad> getIncapacidad() {
            if (incapacidad == null) {
                incapacidad = new ArrayList<>();
            }
            return this.incapacidad;
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
         *       <attribute name="DiasIncapacidad" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *             <fractionDigits value="6"/>
         *             <minInclusive value="1"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="TipoIncapacidad" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       <attribute name="Descuento" use="required" type="{http://www.sat.gob.mx/nomina}t_Importe" />
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Incapacidad {

            /**
             * Número de días que el trabajador se incapacitó en el periodo
             * 
             */
            @XmlAttribute(name = "DiasIncapacidad", required = true)
            protected BigDecimal diasIncapacidad;
            /**
             * Razón de la incapacidad: Catálogo publicado en el portal del SAT en internet
             * 
             */
            @XmlAttribute(name = "TipoIncapacidad", required = true)
            protected int tipoIncapacidad;
            /**
             * Monto del descuento por la incapacidad
             * 
             */
            @XmlAttribute(name = "Descuento", required = true)
            protected BigDecimal descuento;

            /**
             * Número de días que el trabajador se incapacitó en el periodo
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDiasIncapacidad() {
                return diasIncapacidad;
            }

            /**
             * Define el valor de la propiedad diasIncapacidad.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getDiasIncapacidad()
             */
            public void setDiasIncapacidad(BigDecimal value) {
                this.diasIncapacidad = value;
            }

            /**
             * Razón de la incapacidad: Catálogo publicado en el portal del SAT en internet
             * 
             */
            public int getTipoIncapacidad() {
                return tipoIncapacidad;
            }

            /**
             * Define el valor de la propiedad tipoIncapacidad.
             * 
             */
            public void setTipoIncapacidad(int value) {
                this.tipoIncapacidad = value;
            }

            /**
             * Monto del descuento por la incapacidad
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDescuento() {
                return descuento;
            }

            /**
             * Define el valor de la propiedad descuento.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getDescuento()
             */
            public void setDescuento(BigDecimal value) {
                this.descuento = value;
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
     *         <element name="Percepcion" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <attribute name="TipoPercepcion" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                       <minInclusive value="1"/>
     *                       <pattern value="[0-9]{3}"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="Clave" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <minLength value="3"/>
     *                       <maxLength value="15"/>
     *                       <whiteSpace value="collapse"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="Concepto" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <minLength value="1"/>
     *                       <maxLength value="100"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="ImporteGravado" use="required" type="{http://www.sat.gob.mx/nomina}t_Importe" />
     *                 <attribute name="ImporteExento" use="required" type="{http://www.sat.gob.mx/nomina}t_Importe" />
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *       <attribute name="TotalGravado" use="required" type="{http://www.sat.gob.mx/nomina}t_Importe" />
     *       <attribute name="TotalExento" use="required" type="{http://www.sat.gob.mx/nomina}t_Importe" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "percepcion"
    })
    public static class Percepciones {

        /**
         * Nodo para expresar la información detallada de una percepción
         * 
         */
        @XmlElement(name = "Percepcion", required = true)
        protected List<Nomina.Percepciones.Percepcion> percepcion;
        /**
         * Atributo requerido para expresar el total de percepciones gravadas que se relacionan en el comprobante
         * 
         */
        @XmlAttribute(name = "TotalGravado", required = true)
        protected BigDecimal totalGravado;
        /**
         * Atributo requerido para expresar el total de percepciones exentas que se relacionan en el comprobante
         * 
         */
        @XmlAttribute(name = "TotalExento", required = true)
        protected BigDecimal totalExento;

        /**
         * Nodo para expresar la información detallada de una percepción
         * 
         * Gets the value of the percepcion property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the percepcion property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getPercepcion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Nomina.Percepciones.Percepcion }
         * </p>
         * 
         * 
         * @return
         *     The value of the percepcion property.
         */
        public List<Nomina.Percepciones.Percepcion> getPercepcion() {
            if (percepcion == null) {
                percepcion = new ArrayList<>();
            }
            return this.percepcion;
        }

        /**
         * Atributo requerido para expresar el total de percepciones gravadas que se relacionan en el comprobante
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalGravado() {
            return totalGravado;
        }

        /**
         * Define el valor de la propiedad totalGravado.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getTotalGravado()
         */
        public void setTotalGravado(BigDecimal value) {
            this.totalGravado = value;
        }

        /**
         * Atributo requerido para expresar el total de percepciones exentas que se relacionan en el comprobante
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalExento() {
            return totalExento;
        }

        /**
         * Define el valor de la propiedad totalExento.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getTotalExento()
         */
        public void setTotalExento(BigDecimal value) {
            this.totalExento = value;
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
         *       <attribute name="TipoPercepcion" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *             <minInclusive value="1"/>
         *             <pattern value="[0-9]{3}"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="Clave" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <minLength value="3"/>
         *             <maxLength value="15"/>
         *             <whiteSpace value="collapse"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="Concepto" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <minLength value="1"/>
         *             <maxLength value="100"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="ImporteGravado" use="required" type="{http://www.sat.gob.mx/nomina}t_Importe" />
         *       <attribute name="ImporteExento" use="required" type="{http://www.sat.gob.mx/nomina}t_Importe" />
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Percepcion {

            /**
             * Clave agrupadora. Clasifica la percepción conforme al catálogo publicado en el portal del SAT en internet
             * 
             */
            @XmlAttribute(name = "TipoPercepcion", required = true)
            protected int tipoPercepcion;
            /**
             * Atributo requerido, representa la clave de percepción de nómina propia de la contabilidad de cada patrón, puede conformarse desde 3 hasta 15 caracteres
             * 
             */
            @XmlAttribute(name = "Clave", required = true)
            protected String clave;
            /**
             * Atributo requerido para la descripción del concepto de percepción
             * 
             */
            @XmlAttribute(name = "Concepto", required = true)
            protected String concepto;
            /**
             * Atributo requerido, representa el importe gravado de un concepto de percepción
             * 
             */
            @XmlAttribute(name = "ImporteGravado", required = true)
            protected BigDecimal importeGravado;
            /**
             * Atributo requerido, representa el importe exento de un concepto de percepción
             * 
             */
            @XmlAttribute(name = "ImporteExento", required = true)
            protected BigDecimal importeExento;

            /**
             * Clave agrupadora. Clasifica la percepción conforme al catálogo publicado en el portal del SAT en internet
             * 
             */
            public int getTipoPercepcion() {
                return tipoPercepcion;
            }

            /**
             * Define el valor de la propiedad tipoPercepcion.
             * 
             */
            public void setTipoPercepcion(int value) {
                this.tipoPercepcion = value;
            }

            /**
             * Atributo requerido, representa la clave de percepción de nómina propia de la contabilidad de cada patrón, puede conformarse desde 3 hasta 15 caracteres
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClave() {
                return clave;
            }

            /**
             * Define el valor de la propiedad clave.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getClave()
             */
            public void setClave(String value) {
                this.clave = value;
            }

            /**
             * Atributo requerido para la descripción del concepto de percepción
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConcepto() {
                return concepto;
            }

            /**
             * Define el valor de la propiedad concepto.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getConcepto()
             */
            public void setConcepto(String value) {
                this.concepto = value;
            }

            /**
             * Atributo requerido, representa el importe gravado de un concepto de percepción
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getImporteGravado() {
                return importeGravado;
            }

            /**
             * Define el valor de la propiedad importeGravado.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getImporteGravado()
             */
            public void setImporteGravado(BigDecimal value) {
                this.importeGravado = value;
            }

            /**
             * Atributo requerido, representa el importe exento de un concepto de percepción
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getImporteExento() {
                return importeExento;
            }

            /**
             * Define el valor de la propiedad importeExento.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getImporteExento()
             */
            public void setImporteExento(BigDecimal value) {
                this.importeExento = value;
            }

        }

    }

}
