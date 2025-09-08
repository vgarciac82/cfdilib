//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package com.angelsoft.sat.common.nomina12;

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
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import mx.gob.sat.sitio_internet.cfd.catalogos.CEstado;
import mx.gob.sat.sitio_internet.cfd.catalogos.nomina.CBanco;
import mx.gob.sat.sitio_internet.cfd.catalogos.nomina.COrigenRecurso;
import mx.gob.sat.sitio_internet.cfd.catalogos.nomina.CPeriodicidadPago;
import mx.gob.sat.sitio_internet.cfd.catalogos.nomina.CRiesgoPuesto;
import mx.gob.sat.sitio_internet.cfd.catalogos.nomina.CTipoContrato;
import mx.gob.sat.sitio_internet.cfd.catalogos.nomina.CTipoDeduccion;
import mx.gob.sat.sitio_internet.cfd.catalogos.nomina.CTipoHoras;
import mx.gob.sat.sitio_internet.cfd.catalogos.nomina.CTipoIncapacidad;
import mx.gob.sat.sitio_internet.cfd.catalogos.nomina.CTipoJornada;
import mx.gob.sat.sitio_internet.cfd.catalogos.nomina.CTipoNomina;
import mx.gob.sat.sitio_internet.cfd.catalogos.nomina.CTipoOtroPago;
import mx.gob.sat.sitio_internet.cfd.catalogos.nomina.CTipoPercepcion;
import mx.gob.sat.sitio_internet.cfd.catalogos.nomina.CTipoRegimen;


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
 *         <element name="Emisor" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="EntidadSNCF" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <attribute name="OrigenRecurso" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_OrigenRecurso" />
 *                           <attribute name="MontoRecursoPropio" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="Curp" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_CURP" />
 *                 <attribute name="RegistroPatronal">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <minLength value="1"/>
 *                       <maxLength value="20"/>
 *                       <whiteSpace value="collapse"/>
 *                       <pattern value="[^|]{1,20}"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="RfcPatronOrigen" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Receptor">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="SubContratacion" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <attribute name="RfcLabora" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC" />
 *                           <attribute name="PorcentajeTiempo" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 <minInclusive value="0.001"/>
 *                                 <maxInclusive value="100.000"/>
 *                                 <whiteSpace value="collapse"/>
 *                                 <pattern value="[0-9]{1,3}(.([0-9]{1,3}))?"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="Curp" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_CURP" />
 *                 <attribute name="NumSeguridadSocial">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <minLength value="1"/>
 *                       <maxLength value="15"/>
 *                       <whiteSpace value="collapse"/>
 *                       <pattern value="[0-9]{1,15}"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="FechaInicioRelLaboral" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Fecha" />
 *                 <attribute name="Antigüedad">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <whiteSpace value="collapse"/>
 *                       <pattern value="P(([1-9][0-9]{0,3})|0)W|P([1-9][0-9]?Y)?(([1-9]|1[012])M)?(0|[1-9]|[12][0-9]|3[01])D"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="TipoContrato" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_TipoContrato" />
 *                 <attribute name="Sindicalizado">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <whiteSpace value="collapse"/>
 *                       <enumeration value="Sí"/>
 *                       <enumeration value="No"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="TipoJornada" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_TipoJornada" />
 *                 <attribute name="TipoRegimen" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_TipoRegimen" />
 *                 <attribute name="NumEmpleado" use="required">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <minLength value="1"/>
 *                       <maxLength value="15"/>
 *                       <whiteSpace value="collapse"/>
 *                       <pattern value="[^|]{1,15}"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="Departamento">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <minLength value="1"/>
 *                       <maxLength value="100"/>
 *                       <whiteSpace value="collapse"/>
 *                       <pattern value="[^|]{1,100}"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="Puesto">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <minLength value="1"/>
 *                       <maxLength value="100"/>
 *                       <whiteSpace value="collapse"/>
 *                       <pattern value="[^|]{1,100}"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="RiesgoPuesto" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_RiesgoPuesto" />
 *                 <attribute name="PeriodicidadPago" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_PeriodicidadPago" />
 *                 <attribute name="Banco" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_Banco" />
 *                 <attribute name="CuentaBancaria" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_CuentaBancaria" />
 *                 <attribute name="SalarioBaseCotApor" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                 <attribute name="SalarioDiarioIntegrado" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                 <attribute name="ClaveEntFed" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Estado" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Percepciones" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Percepcion" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="AccionesOTitulos" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <attribute name="ValorMercado" use="required">
 *                                       <simpleType>
 *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                           <fractionDigits value="6"/>
 *                                           <minInclusive value="0.000001"/>
 *                                           <whiteSpace value="collapse"/>
 *                                         </restriction>
 *                                       </simpleType>
 *                                     </attribute>
 *                                     <attribute name="PrecioAlOtorgarse" use="required">
 *                                       <simpleType>
 *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                           <fractionDigits value="6"/>
 *                                           <minInclusive value="0.000001"/>
 *                                           <whiteSpace value="collapse"/>
 *                                         </restriction>
 *                                       </simpleType>
 *                                     </attribute>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="HorasExtra" maxOccurs="unbounded" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <attribute name="Dias" use="required">
 *                                       <simpleType>
 *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                           <minInclusive value="1"/>
 *                                           <whiteSpace value="collapse"/>
 *                                         </restriction>
 *                                       </simpleType>
 *                                     </attribute>
 *                                     <attribute name="TipoHoras" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_TipoHoras" />
 *                                     <attribute name="HorasExtra" use="required">
 *                                       <simpleType>
 *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                           <minInclusive value="1"/>
 *                                           <whiteSpace value="collapse"/>
 *                                         </restriction>
 *                                       </simpleType>
 *                                     </attribute>
 *                                     <attribute name="ImportePagado" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                           </sequence>
 *                           <attribute name="TipoPercepcion" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_TipoPercepcion" />
 *                           <attribute name="Clave" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <minLength value="3"/>
 *                                 <maxLength value="15"/>
 *                                 <whiteSpace value="collapse"/>
 *                                 <pattern value="[^|]{3,15}"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="Concepto" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <minLength value="1"/>
 *                                 <maxLength value="100"/>
 *                                 <whiteSpace value="collapse"/>
 *                                 <pattern value="[^|]{1,100}"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="ImporteGravado" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                           <attribute name="ImporteExento" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="JubilacionPensionRetiro" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <attribute name="TotalUnaExhibicion" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                           <attribute name="TotalParcialidad" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                           <attribute name="MontoDiario" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                           <attribute name="IngresoAcumulable" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                           <attribute name="IngresoNoAcumulable" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="SeparacionIndemnizacion" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <attribute name="TotalPagado" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                           <attribute name="NumAñosServicio" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                 <minInclusive value="0"/>
 *                                 <maxInclusive value="99"/>
 *                                 <whiteSpace value="collapse"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="UltimoSueldoMensOrd" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                           <attribute name="IngresoAcumulable" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                           <attribute name="IngresoNoAcumulable" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="TotalSueldos" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                 <attribute name="TotalSeparacionIndemnizacion" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                 <attribute name="TotalJubilacionPensionRetiro" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                 <attribute name="TotalGravado" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                 <attribute name="TotalExento" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
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
 *                           <attribute name="TipoDeduccion" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_TipoDeduccion" />
 *                           <attribute name="Clave" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <minLength value="3"/>
 *                                 <maxLength value="15"/>
 *                                 <pattern value="[^|]{3,15}"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="Concepto" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <minLength value="1"/>
 *                                 <maxLength value="100"/>
 *                                 <pattern value="[^|]{1,100}"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="Importe" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="TotalOtrasDeducciones" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                 <attribute name="TotalImpuestosRetenidos" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="OtrosPagos" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="OtroPago" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="SubsidioAlEmpleo" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <attribute name="SubsidioCausado" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="CompensacionSaldosAFavor" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <attribute name="SaldoAFavor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                                     <attribute name="Año" use="required">
 *                                       <simpleType>
 *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *                                           <minInclusive value="2016"/>
 *                                           <whiteSpace value="collapse"/>
 *                                         </restriction>
 *                                       </simpleType>
 *                                     </attribute>
 *                                     <attribute name="RemanenteSalFav" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                           </sequence>
 *                           <attribute name="TipoOtroPago" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_TipoOtroPago" />
 *                           <attribute name="Clave" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <minLength value="3"/>
 *                                 <maxLength value="15"/>
 *                                 <whiteSpace value="collapse"/>
 *                                 <pattern value="[^|]{3,15}"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="Concepto" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <minLength value="1"/>
 *                                 <maxLength value="100"/>
 *                                 <whiteSpace value="collapse"/>
 *                                 <pattern value="[^|]{1,100}"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="Importe" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
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
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                 <minInclusive value="1"/>
 *                                 <whiteSpace value="collapse"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="TipoIncapacidad" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_TipoIncapacidad" />
 *                           <attribute name="ImporteMonetario" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
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
 *       <attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1.2" />
 *       <attribute name="TipoNomina" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_TipoNomina" />
 *       <attribute name="FechaPago" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Fecha" />
 *       <attribute name="FechaInicialPago" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Fecha" />
 *       <attribute name="FechaFinalPago" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Fecha" />
 *       <attribute name="NumDiasPagados" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             <minInclusive value="0.001"/>
 *             <maxInclusive value="36160.000"/>
 *             <fractionDigits value="3"/>
 *             <whiteSpace value="collapse"/>
 *             <pattern value="(([1-9][0-9]{0,4})|[0])(.[0-9]{3})?"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="TotalPercepciones" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *       <attribute name="TotalDeducciones" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *       <attribute name="TotalOtrosPagos" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "emisor",
    "receptor",
    "percepciones",
    "deducciones",
    "otrosPagos",
    "incapacidades"
})
@XmlRootElement(name = "Nomina")
public class Nomina {

    /**
     * Nodo condicional para expresar la información del contribuyente emisor del comprobante de nómina.
     * 
     */
    @XmlElement(name = "Emisor")
    protected Nomina.Emisor emisor;
    /**
     * Nodo requerido para precisar la información del contribuyente receptor del comprobante de nómina.
     * 
     */
    @XmlElement(name = "Receptor", required = true)
    protected Nomina.Receptor receptor;
    /**
     * Nodo condicional para expresar las percepciones aplicables.
     * 
     */
    @XmlElement(name = "Percepciones")
    protected Nomina.Percepciones percepciones;
    /**
     * Nodo opcional para expresar las deducciones aplicables.
     * 
     */
    @XmlElement(name = "Deducciones")
    protected Nomina.Deducciones deducciones;
    /**
     * Nodo condicional para expresar otros pagos aplicables.
     * 
     */
    @XmlElement(name = "OtrosPagos")
    protected Nomina.OtrosPagos otrosPagos;
    /**
     * Nodo condicional para expresar información de las incapacidades.
     * 
     */
    @XmlElement(name = "Incapacidades")
    protected Nomina.Incapacidades incapacidades;
    /**
     * Atributo requerido para la expresión de la versión del complemento.
     * 
     */
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    /**
     * Atributo requerido para indicar el tipo de nómina, puede ser O= Nómina ordinaria o E= Nómina extraordinaria.
     * 
     */
    @XmlAttribute(name = "TipoNomina", required = true)
    protected CTipoNomina tipoNomina;
    /**
     * Atributo requerido para la expresión de la fecha efectiva de erogación del gasto. Se expresa en la forma AAAA-MM-DD, de acuerdo con la especificación ISO 8601.
     * 
     */
    @XmlAttribute(name = "FechaPago", required = true)
    @XmlJavaTypeAdapter(DateAdapter.class)
    protected LocalDate fechaPago;
    /**
     * Atributo requerido para la expresión de la fecha inicial del período de pago. Se expresa en la forma AAAA-MM-DD, de acuerdo con la especificación ISO 8601.
     * 
     */
    @XmlAttribute(name = "FechaInicialPago", required = true)
    @XmlJavaTypeAdapter(DateAdapter.class)
    protected LocalDate fechaInicialPago;
    /**
     * Atributo requerido para la expresión de la fecha final del período de pago. Se expresa en la forma AAAA-MM-DD, de acuerdo con la especificación ISO 8601.
     * 
     */
    @XmlAttribute(name = "FechaFinalPago", required = true)
    @XmlJavaTypeAdapter(DateAdapter.class)
    protected LocalDate fechaFinalPago;
    /**
     * Atributo requerido para la expresión del número o la fracción de días pagados.
     * 
     */
    @XmlAttribute(name = "NumDiasPagados", required = true)
    protected BigDecimal numDiasPagados;
    /**
     * Atributo condicional para representar la suma de las percepciones.
     * 
     */
    @XmlAttribute(name = "TotalPercepciones")
    protected BigDecimal totalPercepciones;
    /**
     * Atributo condicional para representar la suma de las deducciones aplicables.
     * 
     */
    @XmlAttribute(name = "TotalDeducciones")
    protected BigDecimal totalDeducciones;
    /**
     * Atributo condicional para representar la suma de otros pagos.
     * 
     */
    @XmlAttribute(name = "TotalOtrosPagos")
    protected BigDecimal totalOtrosPagos;

    /**
     * Nodo condicional para expresar la información del contribuyente emisor del comprobante de nómina.
     * 
     * @return
     *     possible object is
     *     {@link Nomina.Emisor }
     *     
     */
    public Nomina.Emisor getEmisor() {
        return emisor;
    }

    /**
     * Define el valor de la propiedad emisor.
     * 
     * @param value
     *     allowed object is
     *     {@link Nomina.Emisor }
     *     
     * @see #getEmisor()
     */
    public void setEmisor(Nomina.Emisor value) {
        this.emisor = value;
    }

    /**
     * Nodo requerido para precisar la información del contribuyente receptor del comprobante de nómina.
     * 
     * @return
     *     possible object is
     *     {@link Nomina.Receptor }
     *     
     */
    public Nomina.Receptor getReceptor() {
        return receptor;
    }

    /**
     * Define el valor de la propiedad receptor.
     * 
     * @param value
     *     allowed object is
     *     {@link Nomina.Receptor }
     *     
     * @see #getReceptor()
     */
    public void setReceptor(Nomina.Receptor value) {
        this.receptor = value;
    }

    /**
     * Nodo condicional para expresar las percepciones aplicables.
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
     * Nodo opcional para expresar las deducciones aplicables.
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
     * Nodo condicional para expresar otros pagos aplicables.
     * 
     * @return
     *     possible object is
     *     {@link Nomina.OtrosPagos }
     *     
     */
    public Nomina.OtrosPagos getOtrosPagos() {
        return otrosPagos;
    }

    /**
     * Define el valor de la propiedad otrosPagos.
     * 
     * @param value
     *     allowed object is
     *     {@link Nomina.OtrosPagos }
     *     
     * @see #getOtrosPagos()
     */
    public void setOtrosPagos(Nomina.OtrosPagos value) {
        this.otrosPagos = value;
    }

    /**
     * Nodo condicional para expresar información de las incapacidades.
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
     * Atributo requerido para la expresión de la versión del complemento.
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
     * Atributo requerido para indicar el tipo de nómina, puede ser O= Nómina ordinaria o E= Nómina extraordinaria.
     * 
     * @return
     *     possible object is
     *     {@link CTipoNomina }
     *     
     */
    public CTipoNomina getTipoNomina() {
        return tipoNomina;
    }

    /**
     * Define el valor de la propiedad tipoNomina.
     * 
     * @param value
     *     allowed object is
     *     {@link CTipoNomina }
     *     
     * @see #getTipoNomina()
     */
    public void setTipoNomina(CTipoNomina value) {
        this.tipoNomina = value;
    }

    /**
     * Atributo requerido para la expresión de la fecha efectiva de erogación del gasto. Se expresa en la forma AAAA-MM-DD, de acuerdo con la especificación ISO 8601.
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
     * Atributo requerido para la expresión de la fecha inicial del período de pago. Se expresa en la forma AAAA-MM-DD, de acuerdo con la especificación ISO 8601.
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
     * Atributo requerido para la expresión de la fecha final del período de pago. Se expresa en la forma AAAA-MM-DD, de acuerdo con la especificación ISO 8601.
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
     * Atributo requerido para la expresión del número o la fracción de días pagados.
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
     * Atributo condicional para representar la suma de las percepciones.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPercepciones() {
        return totalPercepciones;
    }

    /**
     * Define el valor de la propiedad totalPercepciones.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalPercepciones()
     */
    public void setTotalPercepciones(BigDecimal value) {
        this.totalPercepciones = value;
    }

    /**
     * Atributo condicional para representar la suma de las deducciones aplicables.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDeducciones() {
        return totalDeducciones;
    }

    /**
     * Define el valor de la propiedad totalDeducciones.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalDeducciones()
     */
    public void setTotalDeducciones(BigDecimal value) {
        this.totalDeducciones = value;
    }

    /**
     * Atributo condicional para representar la suma de otros pagos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalOtrosPagos() {
        return totalOtrosPagos;
    }

    /**
     * Define el valor de la propiedad totalOtrosPagos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalOtrosPagos()
     */
    public void setTotalOtrosPagos(BigDecimal value) {
        this.totalOtrosPagos = value;
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
     *                 <attribute name="TipoDeduccion" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_TipoDeduccion" />
     *                 <attribute name="Clave" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <minLength value="3"/>
     *                       <maxLength value="15"/>
     *                       <pattern value="[^|]{3,15}"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="Concepto" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <minLength value="1"/>
     *                       <maxLength value="100"/>
     *                       <pattern value="[^|]{1,100}"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="Importe" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *       <attribute name="TotalOtrasDeducciones" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *       <attribute name="TotalImpuestosRetenidos" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
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
         * Nodo requerido para expresar la información detallada de una deducción.
         * 
         */
        @XmlElement(name = "Deduccion", required = true)
        protected List<Nomina.Deducciones.Deduccion> deduccion;
        /**
         * Atributo condicional para expresar el total de deducciones que se relacionan en el comprobante, donde la clave de tipo de deducción sea distinta a la 002 correspondiente a ISR.
         * 
         */
        @XmlAttribute(name = "TotalOtrasDeducciones")
        protected BigDecimal totalOtrasDeducciones;
        /**
         * Atributo condicional para expresar el total de los impuestos federales retenidos, es decir, donde la clave de tipo de deducción sea 002 correspondiente a ISR.
         * 
         */
        @XmlAttribute(name = "TotalImpuestosRetenidos")
        protected BigDecimal totalImpuestosRetenidos;

        /**
         * Nodo requerido para expresar la información detallada de una deducción.
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
         * Atributo condicional para expresar el total de deducciones que se relacionan en el comprobante, donde la clave de tipo de deducción sea distinta a la 002 correspondiente a ISR.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalOtrasDeducciones() {
            return totalOtrasDeducciones;
        }

        /**
         * Define el valor de la propiedad totalOtrasDeducciones.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getTotalOtrasDeducciones()
         */
        public void setTotalOtrasDeducciones(BigDecimal value) {
            this.totalOtrasDeducciones = value;
        }

        /**
         * Atributo condicional para expresar el total de los impuestos federales retenidos, es decir, donde la clave de tipo de deducción sea 002 correspondiente a ISR.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalImpuestosRetenidos() {
            return totalImpuestosRetenidos;
        }

        /**
         * Define el valor de la propiedad totalImpuestosRetenidos.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getTotalImpuestosRetenidos()
         */
        public void setTotalImpuestosRetenidos(BigDecimal value) {
            this.totalImpuestosRetenidos = value;
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
         *       <attribute name="TipoDeduccion" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_TipoDeduccion" />
         *       <attribute name="Clave" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <minLength value="3"/>
         *             <maxLength value="15"/>
         *             <pattern value="[^|]{3,15}"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="Concepto" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <minLength value="1"/>
         *             <maxLength value="100"/>
         *             <pattern value="[^|]{1,100}"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="Importe" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
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
             * Atributo requerido para registrar la clave agrupadora que clasifica la deducción.
             * 
             */
            @XmlAttribute(name = "TipoDeduccion", required = true)
            protected CTipoDeduccion tipoDeduccion;
            /**
             * Atributo requerido para la clave de deducción de nómina propia de la contabilidad de cada patrón, puede conformarse desde 3 hasta 15 caracteres.
             * 
             */
            @XmlAttribute(name = "Clave", required = true)
            protected String clave;
            /**
             * Atributo requerido para la descripción del concepto de deducción.
             * 
             */
            @XmlAttribute(name = "Concepto", required = true)
            protected String concepto;
            /**
             * Atributo requerido para registrar el importe del concepto de deducción.
             * 
             */
            @XmlAttribute(name = "Importe", required = true)
            protected BigDecimal importe;

            /**
             * Atributo requerido para registrar la clave agrupadora que clasifica la deducción.
             * 
             * @return
             *     possible object is
             *     {@link CTipoDeduccion }
             *     
             */
            public CTipoDeduccion getTipoDeduccion() {
                return tipoDeduccion;
            }

            /**
             * Define el valor de la propiedad tipoDeduccion.
             * 
             * @param value
             *     allowed object is
             *     {@link CTipoDeduccion }
             *     
             * @see #getTipoDeduccion()
             */
            public void setTipoDeduccion(CTipoDeduccion value) {
                this.tipoDeduccion = value;
            }

            /**
             * Atributo requerido para la clave de deducción de nómina propia de la contabilidad de cada patrón, puede conformarse desde 3 hasta 15 caracteres.
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
             * Atributo requerido para la descripción del concepto de deducción.
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
             * Atributo requerido para registrar el importe del concepto de deducción.
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
     *         <element name="EntidadSNCF" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <attribute name="OrigenRecurso" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_OrigenRecurso" />
     *                 <attribute name="MontoRecursoPropio" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *       <attribute name="Curp" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_CURP" />
     *       <attribute name="RegistroPatronal">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <minLength value="1"/>
     *             <maxLength value="20"/>
     *             <whiteSpace value="collapse"/>
     *             <pattern value="[^|]{1,20}"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="RfcPatronOrigen" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entidadSNCF"
    })
    public static class Emisor {

        /**
         * Nodo condicional para que las entidades adheridas al Sistema Nacional de Coordinación Fiscal realicen la identificación del origen de los recursos utilizados en el pago de nómina del personal que presta o desempeña un servicio personal subordinado en las dependencias de la entidad federativa, del municipio o demarcación territorial de la Ciudad de México, así como en sus respectivos organismos autónomos y entidades paraestatales y paramunicipales
         * 
         */
        @XmlElement(name = "EntidadSNCF")
        protected Nomina.Emisor.EntidadSNCF entidadSNCF;
        /**
         * Atributo condicional para expresar la CURP del emisor del comprobante de nómina cuando es una persona física.
         * 
         */
        @XmlAttribute(name = "Curp")
        protected String curp;
        /**
         * Atributo condicional para expresar el registro patronal, clave de ramo - pagaduría o la que le asigne la institución de seguridad social al patrón, a 20 posiciones máximo. Se debe ingresar cuando se cuente con él, o se esté obligado conforme a otras disposiciones distintas a las fiscales.
         * 
         */
        @XmlAttribute(name = "RegistroPatronal")
        protected String registroPatronal;
        /**
         * Atributo opcional para expresar el RFC de la persona que fungió como patrón cuando el pago al trabajador se realice a través de un tercero como vehículo o herramienta de pago.
         * 
         */
        @XmlAttribute(name = "RfcPatronOrigen")
        protected String rfcPatronOrigen;

        /**
         * Nodo condicional para que las entidades adheridas al Sistema Nacional de Coordinación Fiscal realicen la identificación del origen de los recursos utilizados en el pago de nómina del personal que presta o desempeña un servicio personal subordinado en las dependencias de la entidad federativa, del municipio o demarcación territorial de la Ciudad de México, así como en sus respectivos organismos autónomos y entidades paraestatales y paramunicipales
         * 
         * @return
         *     possible object is
         *     {@link Nomina.Emisor.EntidadSNCF }
         *     
         */
        public Nomina.Emisor.EntidadSNCF getEntidadSNCF() {
            return entidadSNCF;
        }

        /**
         * Define el valor de la propiedad entidadSNCF.
         * 
         * @param value
         *     allowed object is
         *     {@link Nomina.Emisor.EntidadSNCF }
         *     
         * @see #getEntidadSNCF()
         */
        public void setEntidadSNCF(Nomina.Emisor.EntidadSNCF value) {
            this.entidadSNCF = value;
        }

        /**
         * Atributo condicional para expresar la CURP del emisor del comprobante de nómina cuando es una persona física.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurp() {
            return curp;
        }

        /**
         * Define el valor de la propiedad curp.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCurp()
         */
        public void setCurp(String value) {
            this.curp = value;
        }

        /**
         * Atributo condicional para expresar el registro patronal, clave de ramo - pagaduría o la que le asigne la institución de seguridad social al patrón, a 20 posiciones máximo. Se debe ingresar cuando se cuente con él, o se esté obligado conforme a otras disposiciones distintas a las fiscales.
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
         * Atributo opcional para expresar el RFC de la persona que fungió como patrón cuando el pago al trabajador se realice a través de un tercero como vehículo o herramienta de pago.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRfcPatronOrigen() {
            return rfcPatronOrigen;
        }

        /**
         * Define el valor de la propiedad rfcPatronOrigen.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getRfcPatronOrigen()
         */
        public void setRfcPatronOrigen(String value) {
            this.rfcPatronOrigen = value;
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
         *       <attribute name="OrigenRecurso" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_OrigenRecurso" />
         *       <attribute name="MontoRecursoPropio" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class EntidadSNCF {

            /**
             * Atributo requerido para identificar el origen del recurso utilizado para el pago de nómina del personal que presta o desempeña un servicio personal subordinado o asimilado a salarios en las dependencias.
             * 
             */
            @XmlAttribute(name = "OrigenRecurso", required = true)
            protected COrigenRecurso origenRecurso;
            /**
             * Atributo condicional para expresar el monto del recurso pagado con cargo a sus participaciones u otros ingresos locales (importe bruto de los ingresos propios, es decir total de gravados y exentos), cuando el origen es mixto.
             * 
             */
            @XmlAttribute(name = "MontoRecursoPropio")
            protected BigDecimal montoRecursoPropio;

            /**
             * Atributo requerido para identificar el origen del recurso utilizado para el pago de nómina del personal que presta o desempeña un servicio personal subordinado o asimilado a salarios en las dependencias.
             * 
             * @return
             *     possible object is
             *     {@link COrigenRecurso }
             *     
             */
            public COrigenRecurso getOrigenRecurso() {
                return origenRecurso;
            }

            /**
             * Define el valor de la propiedad origenRecurso.
             * 
             * @param value
             *     allowed object is
             *     {@link COrigenRecurso }
             *     
             * @see #getOrigenRecurso()
             */
            public void setOrigenRecurso(COrigenRecurso value) {
                this.origenRecurso = value;
            }

            /**
             * Atributo condicional para expresar el monto del recurso pagado con cargo a sus participaciones u otros ingresos locales (importe bruto de los ingresos propios, es decir total de gravados y exentos), cuando el origen es mixto.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoRecursoPropio() {
                return montoRecursoPropio;
            }

            /**
             * Define el valor de la propiedad montoRecursoPropio.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getMontoRecursoPropio()
             */
            public void setMontoRecursoPropio(BigDecimal value) {
                this.montoRecursoPropio = value;
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
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                       <minInclusive value="1"/>
     *                       <whiteSpace value="collapse"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="TipoIncapacidad" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_TipoIncapacidad" />
     *                 <attribute name="ImporteMonetario" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
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
         * Nodo requerido para expresar información de las incapacidades.
         * 
         */
        @XmlElement(name = "Incapacidad", required = true)
        protected List<Nomina.Incapacidades.Incapacidad> incapacidad;

        /**
         * Nodo requerido para expresar información de las incapacidades.
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
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *             <minInclusive value="1"/>
         *             <whiteSpace value="collapse"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="TipoIncapacidad" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_TipoIncapacidad" />
         *       <attribute name="ImporteMonetario" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
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
             * Atributo requerido para expresar el número de días enteros que el trabajador se incapacitó en el periodo.
             * 
             */
            @XmlAttribute(name = "DiasIncapacidad", required = true)
            protected int diasIncapacidad;
            /**
             * Atributo requerido para expresar la razón de la incapacidad.
             * 
             */
            @XmlAttribute(name = "TipoIncapacidad", required = true)
            protected CTipoIncapacidad tipoIncapacidad;
            /**
             * Atributo condicional para expresar el monto del importe monetario de la incapacidad.
             * 
             */
            @XmlAttribute(name = "ImporteMonetario")
            protected BigDecimal importeMonetario;

            /**
             * Atributo requerido para expresar el número de días enteros que el trabajador se incapacitó en el periodo.
             * 
             */
            public int getDiasIncapacidad() {
                return diasIncapacidad;
            }

            /**
             * Define el valor de la propiedad diasIncapacidad.
             * 
             */
            public void setDiasIncapacidad(int value) {
                this.diasIncapacidad = value;
            }

            /**
             * Atributo requerido para expresar la razón de la incapacidad.
             * 
             * @return
             *     possible object is
             *     {@link CTipoIncapacidad }
             *     
             */
            public CTipoIncapacidad getTipoIncapacidad() {
                return tipoIncapacidad;
            }

            /**
             * Define el valor de la propiedad tipoIncapacidad.
             * 
             * @param value
             *     allowed object is
             *     {@link CTipoIncapacidad }
             *     
             * @see #getTipoIncapacidad()
             */
            public void setTipoIncapacidad(CTipoIncapacidad value) {
                this.tipoIncapacidad = value;
            }

            /**
             * Atributo condicional para expresar el monto del importe monetario de la incapacidad.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getImporteMonetario() {
                return importeMonetario;
            }

            /**
             * Define el valor de la propiedad importeMonetario.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getImporteMonetario()
             */
            public void setImporteMonetario(BigDecimal value) {
                this.importeMonetario = value;
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
     *         <element name="OtroPago" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="SubsidioAlEmpleo" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <attribute name="SubsidioCausado" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="CompensacionSaldosAFavor" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <attribute name="SaldoAFavor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *                           <attribute name="Año" use="required">
     *                             <simpleType>
     *                               <restriction base="{http://www.w3.org/2001/XMLSchema}short">
     *                                 <minInclusive value="2016"/>
     *                                 <whiteSpace value="collapse"/>
     *                               </restriction>
     *                             </simpleType>
     *                           </attribute>
     *                           <attribute name="RemanenteSalFav" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                 </sequence>
     *                 <attribute name="TipoOtroPago" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_TipoOtroPago" />
     *                 <attribute name="Clave" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <minLength value="3"/>
     *                       <maxLength value="15"/>
     *                       <whiteSpace value="collapse"/>
     *                       <pattern value="[^|]{3,15}"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="Concepto" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <minLength value="1"/>
     *                       <maxLength value="100"/>
     *                       <whiteSpace value="collapse"/>
     *                       <pattern value="[^|]{1,100}"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="Importe" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
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
        "otroPago"
    })
    public static class OtrosPagos {

        /**
         * Nodo requerido para expresar la información detallada del otro pago.
         * 
         */
        @XmlElement(name = "OtroPago", required = true)
        protected List<Nomina.OtrosPagos.OtroPago> otroPago;

        /**
         * Nodo requerido para expresar la información detallada del otro pago.
         * 
         * Gets the value of the otroPago property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otroPago property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getOtroPago().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Nomina.OtrosPagos.OtroPago }
         * </p>
         * 
         * 
         * @return
         *     The value of the otroPago property.
         */
        public List<Nomina.OtrosPagos.OtroPago> getOtroPago() {
            if (otroPago == null) {
                otroPago = new ArrayList<>();
            }
            return this.otroPago;
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
         *         <element name="SubsidioAlEmpleo" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <attribute name="SubsidioCausado" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="CompensacionSaldosAFavor" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <attribute name="SaldoAFavor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
         *                 <attribute name="Año" use="required">
         *                   <simpleType>
         *                     <restriction base="{http://www.w3.org/2001/XMLSchema}short">
         *                       <minInclusive value="2016"/>
         *                       <whiteSpace value="collapse"/>
         *                     </restriction>
         *                   </simpleType>
         *                 </attribute>
         *                 <attribute name="RemanenteSalFav" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *       </sequence>
         *       <attribute name="TipoOtroPago" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_TipoOtroPago" />
         *       <attribute name="Clave" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <minLength value="3"/>
         *             <maxLength value="15"/>
         *             <whiteSpace value="collapse"/>
         *             <pattern value="[^|]{3,15}"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="Concepto" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <minLength value="1"/>
         *             <maxLength value="100"/>
         *             <whiteSpace value="collapse"/>
         *             <pattern value="[^|]{1,100}"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="Importe" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "subsidioAlEmpleo",
            "compensacionSaldosAFavor"
        })
        public static class OtroPago {

            /**
             * Nodo condicional para expresar la información referente al subsidio al empleo del trabajador.
             * 
             */
            @XmlElement(name = "SubsidioAlEmpleo")
            protected Nomina.OtrosPagos.OtroPago.SubsidioAlEmpleo subsidioAlEmpleo;
            /**
             * Nodo condicional para expresar la información referente a la compensación de saldos a favor de un trabajador.
             * 
             */
            @XmlElement(name = "CompensacionSaldosAFavor")
            protected Nomina.OtrosPagos.OtroPago.CompensacionSaldosAFavor compensacionSaldosAFavor;
            /**
             * Atributo requerido para expresar la clave agrupadora bajo la cual se clasifica el otro pago.
             * 
             */
            @XmlAttribute(name = "TipoOtroPago", required = true)
            protected CTipoOtroPago tipoOtroPago;
            /**
             * Atributo requerido, representa la clave de otro pago de nómina propia de la contabilidad de cada patrón, puede conformarse desde 3 hasta 15 caracteres.
             * 
             */
            @XmlAttribute(name = "Clave", required = true)
            protected String clave;
            /**
             * Atributo requerido para la descripción del concepto de otro pago.
             * 
             */
            @XmlAttribute(name = "Concepto", required = true)
            protected String concepto;
            /**
             * Atributo requerido para expresar el importe del concepto de otro pago.
             * 
             */
            @XmlAttribute(name = "Importe", required = true)
            protected BigDecimal importe;

            /**
             * Nodo condicional para expresar la información referente al subsidio al empleo del trabajador.
             * 
             * @return
             *     possible object is
             *     {@link Nomina.OtrosPagos.OtroPago.SubsidioAlEmpleo }
             *     
             */
            public Nomina.OtrosPagos.OtroPago.SubsidioAlEmpleo getSubsidioAlEmpleo() {
                return subsidioAlEmpleo;
            }

            /**
             * Define el valor de la propiedad subsidioAlEmpleo.
             * 
             * @param value
             *     allowed object is
             *     {@link Nomina.OtrosPagos.OtroPago.SubsidioAlEmpleo }
             *     
             * @see #getSubsidioAlEmpleo()
             */
            public void setSubsidioAlEmpleo(Nomina.OtrosPagos.OtroPago.SubsidioAlEmpleo value) {
                this.subsidioAlEmpleo = value;
            }

            /**
             * Nodo condicional para expresar la información referente a la compensación de saldos a favor de un trabajador.
             * 
             * @return
             *     possible object is
             *     {@link Nomina.OtrosPagos.OtroPago.CompensacionSaldosAFavor }
             *     
             */
            public Nomina.OtrosPagos.OtroPago.CompensacionSaldosAFavor getCompensacionSaldosAFavor() {
                return compensacionSaldosAFavor;
            }

            /**
             * Define el valor de la propiedad compensacionSaldosAFavor.
             * 
             * @param value
             *     allowed object is
             *     {@link Nomina.OtrosPagos.OtroPago.CompensacionSaldosAFavor }
             *     
             * @see #getCompensacionSaldosAFavor()
             */
            public void setCompensacionSaldosAFavor(Nomina.OtrosPagos.OtroPago.CompensacionSaldosAFavor value) {
                this.compensacionSaldosAFavor = value;
            }

            /**
             * Atributo requerido para expresar la clave agrupadora bajo la cual se clasifica el otro pago.
             * 
             * @return
             *     possible object is
             *     {@link CTipoOtroPago }
             *     
             */
            public CTipoOtroPago getTipoOtroPago() {
                return tipoOtroPago;
            }

            /**
             * Define el valor de la propiedad tipoOtroPago.
             * 
             * @param value
             *     allowed object is
             *     {@link CTipoOtroPago }
             *     
             * @see #getTipoOtroPago()
             */
            public void setTipoOtroPago(CTipoOtroPago value) {
                this.tipoOtroPago = value;
            }

            /**
             * Atributo requerido, representa la clave de otro pago de nómina propia de la contabilidad de cada patrón, puede conformarse desde 3 hasta 15 caracteres.
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
             * Atributo requerido para la descripción del concepto de otro pago.
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
             * Atributo requerido para expresar el importe del concepto de otro pago.
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
             *       <attribute name="SaldoAFavor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
             *       <attribute name="Año" use="required">
             *         <simpleType>
             *           <restriction base="{http://www.w3.org/2001/XMLSchema}short">
             *             <minInclusive value="2016"/>
             *             <whiteSpace value="collapse"/>
             *           </restriction>
             *         </simpleType>
             *       </attribute>
             *       <attribute name="RemanenteSalFav" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
             *     </restriction>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CompensacionSaldosAFavor {

                /**
                 * Atributo requerido para expresar el saldo a favor determinado por el patrón al trabajador en periodos o ejercicios anteriores.
                 * 
                 */
                @XmlAttribute(name = "SaldoAFavor", required = true)
                protected BigDecimal saldoAFavor;
                /**
                 * Atributo requerido para expresar el año en que se determinó el saldo a favor del trabajador por el patrón que se incluye en el campo “RemanenteSalFav”.
                 * 
                 */
                @XmlAttribute(name = "A\u00f1o", required = true)
                protected short año;
                /**
                 * Atributo requerido para expresar el remanente del saldo a favor del trabajador.
                 * 
                 */
                @XmlAttribute(name = "RemanenteSalFav", required = true)
                protected BigDecimal remanenteSalFav;

                /**
                 * Atributo requerido para expresar el saldo a favor determinado por el patrón al trabajador en periodos o ejercicios anteriores.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getSaldoAFavor() {
                    return saldoAFavor;
                }

                /**
                 * Define el valor de la propiedad saldoAFavor.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getSaldoAFavor()
                 */
                public void setSaldoAFavor(BigDecimal value) {
                    this.saldoAFavor = value;
                }

                /**
                 * Atributo requerido para expresar el año en que se determinó el saldo a favor del trabajador por el patrón que se incluye en el campo “RemanenteSalFav”.
                 * 
                 */
                public short getAño() {
                    return año;
                }

                /**
                 * Define el valor de la propiedad año.
                 * 
                 */
                public void setAño(short value) {
                    this.año = value;
                }

                /**
                 * Atributo requerido para expresar el remanente del saldo a favor del trabajador.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getRemanenteSalFav() {
                    return remanenteSalFav;
                }

                /**
                 * Define el valor de la propiedad remanenteSalFav.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getRemanenteSalFav()
                 */
                public void setRemanenteSalFav(BigDecimal value) {
                    this.remanenteSalFav = value;
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
             *       <attribute name="SubsidioCausado" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
             *     </restriction>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class SubsidioAlEmpleo {

                /**
                 * Atributo requerido para expresar el subsidio causado conforme a la tabla del subsidio para el empleo publicada en el Anexo 8 de la RMF vigente.
                 * 
                 */
                @XmlAttribute(name = "SubsidioCausado", required = true)
                protected BigDecimal subsidioCausado;

                /**
                 * Atributo requerido para expresar el subsidio causado conforme a la tabla del subsidio para el empleo publicada en el Anexo 8 de la RMF vigente.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getSubsidioCausado() {
                    return subsidioCausado;
                }

                /**
                 * Define el valor de la propiedad subsidioCausado.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getSubsidioCausado()
                 */
                public void setSubsidioCausado(BigDecimal value) {
                    this.subsidioCausado = value;
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
     *         <element name="Percepcion" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="AccionesOTitulos" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <attribute name="ValorMercado" use="required">
     *                             <simpleType>
     *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                 <fractionDigits value="6"/>
     *                                 <minInclusive value="0.000001"/>
     *                                 <whiteSpace value="collapse"/>
     *                               </restriction>
     *                             </simpleType>
     *                           </attribute>
     *                           <attribute name="PrecioAlOtorgarse" use="required">
     *                             <simpleType>
     *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                 <fractionDigits value="6"/>
     *                                 <minInclusive value="0.000001"/>
     *                                 <whiteSpace value="collapse"/>
     *                               </restriction>
     *                             </simpleType>
     *                           </attribute>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="HorasExtra" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <attribute name="Dias" use="required">
     *                             <simpleType>
     *                               <restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                                 <minInclusive value="1"/>
     *                                 <whiteSpace value="collapse"/>
     *                               </restriction>
     *                             </simpleType>
     *                           </attribute>
     *                           <attribute name="TipoHoras" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_TipoHoras" />
     *                           <attribute name="HorasExtra" use="required">
     *                             <simpleType>
     *                               <restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                                 <minInclusive value="1"/>
     *                                 <whiteSpace value="collapse"/>
     *                               </restriction>
     *                             </simpleType>
     *                           </attribute>
     *                           <attribute name="ImportePagado" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                 </sequence>
     *                 <attribute name="TipoPercepcion" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_TipoPercepcion" />
     *                 <attribute name="Clave" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <minLength value="3"/>
     *                       <maxLength value="15"/>
     *                       <whiteSpace value="collapse"/>
     *                       <pattern value="[^|]{3,15}"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="Concepto" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <minLength value="1"/>
     *                       <maxLength value="100"/>
     *                       <whiteSpace value="collapse"/>
     *                       <pattern value="[^|]{1,100}"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="ImporteGravado" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *                 <attribute name="ImporteExento" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="JubilacionPensionRetiro" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <attribute name="TotalUnaExhibicion" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *                 <attribute name="TotalParcialidad" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *                 <attribute name="MontoDiario" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *                 <attribute name="IngresoAcumulable" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *                 <attribute name="IngresoNoAcumulable" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="SeparacionIndemnizacion" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <attribute name="TotalPagado" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *                 <attribute name="NumAñosServicio" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                       <minInclusive value="0"/>
     *                       <maxInclusive value="99"/>
     *                       <whiteSpace value="collapse"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="UltimoSueldoMensOrd" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *                 <attribute name="IngresoAcumulable" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *                 <attribute name="IngresoNoAcumulable" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *       <attribute name="TotalSueldos" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *       <attribute name="TotalSeparacionIndemnizacion" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *       <attribute name="TotalJubilacionPensionRetiro" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *       <attribute name="TotalGravado" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *       <attribute name="TotalExento" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "percepcion",
        "jubilacionPensionRetiro",
        "separacionIndemnizacion"
    })
    public static class Percepciones {

        /**
         * Nodo requerido para expresar la información detallada de una percepción
         * 
         */
        @XmlElement(name = "Percepcion", required = true)
        protected List<Nomina.Percepciones.Percepcion> percepcion;
        /**
         * Nodo condicional para expresar la información detallada de pagos por jubilación, pensiones o haberes de retiro.
         * 
         */
        @XmlElement(name = "JubilacionPensionRetiro")
        protected Nomina.Percepciones.JubilacionPensionRetiro jubilacionPensionRetiro;
        /**
         * Nodo condicional para expresar la información detallada de otros pagos por separación.
         * 
         */
        @XmlElement(name = "SeparacionIndemnizacion")
        protected Nomina.Percepciones.SeparacionIndemnizacion separacionIndemnizacion;
        /**
         * Atributo condicional para expresar el total de percepciones brutas (gravadas y exentas) por sueldos y salarios y conceptos asimilados a salarios.
         * 
         */
        @XmlAttribute(name = "TotalSueldos")
        protected BigDecimal totalSueldos;
        /**
         * Atributo condicional para expresar el importe exento y gravado de las claves tipo percepción 022 Prima por Antigüedad, 023 Pagos por separación y 025 Indemnizaciones.
         * 
         */
        @XmlAttribute(name = "TotalSeparacionIndemnizacion")
        protected BigDecimal totalSeparacionIndemnizacion;
        /**
         * Atributo condicional para expresar el importe exento y gravado de las claves tipo percepción 039 Jubilaciones, pensiones o haberes de retiro en una exhibición y 044 Jubilaciones, pensiones o haberes de retiro en parcialidades.
         * 
         */
        @XmlAttribute(name = "TotalJubilacionPensionRetiro")
        protected BigDecimal totalJubilacionPensionRetiro;
        /**
         * Atributo requerido para expresar el total de percepciones gravadas que se relacionan en el comprobante.
         * 
         */
        @XmlAttribute(name = "TotalGravado", required = true)
        protected BigDecimal totalGravado;
        /**
         * Atributo requerido para expresar el total de percepciones exentas que se relacionan en el comprobante.
         * 
         */
        @XmlAttribute(name = "TotalExento", required = true)
        protected BigDecimal totalExento;

        /**
         * Nodo requerido para expresar la información detallada de una percepción
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
         * Nodo condicional para expresar la información detallada de pagos por jubilación, pensiones o haberes de retiro.
         * 
         * @return
         *     possible object is
         *     {@link Nomina.Percepciones.JubilacionPensionRetiro }
         *     
         */
        public Nomina.Percepciones.JubilacionPensionRetiro getJubilacionPensionRetiro() {
            return jubilacionPensionRetiro;
        }

        /**
         * Define el valor de la propiedad jubilacionPensionRetiro.
         * 
         * @param value
         *     allowed object is
         *     {@link Nomina.Percepciones.JubilacionPensionRetiro }
         *     
         * @see #getJubilacionPensionRetiro()
         */
        public void setJubilacionPensionRetiro(Nomina.Percepciones.JubilacionPensionRetiro value) {
            this.jubilacionPensionRetiro = value;
        }

        /**
         * Nodo condicional para expresar la información detallada de otros pagos por separación.
         * 
         * @return
         *     possible object is
         *     {@link Nomina.Percepciones.SeparacionIndemnizacion }
         *     
         */
        public Nomina.Percepciones.SeparacionIndemnizacion getSeparacionIndemnizacion() {
            return separacionIndemnizacion;
        }

        /**
         * Define el valor de la propiedad separacionIndemnizacion.
         * 
         * @param value
         *     allowed object is
         *     {@link Nomina.Percepciones.SeparacionIndemnizacion }
         *     
         * @see #getSeparacionIndemnizacion()
         */
        public void setSeparacionIndemnizacion(Nomina.Percepciones.SeparacionIndemnizacion value) {
            this.separacionIndemnizacion = value;
        }

        /**
         * Atributo condicional para expresar el total de percepciones brutas (gravadas y exentas) por sueldos y salarios y conceptos asimilados a salarios.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalSueldos() {
            return totalSueldos;
        }

        /**
         * Define el valor de la propiedad totalSueldos.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getTotalSueldos()
         */
        public void setTotalSueldos(BigDecimal value) {
            this.totalSueldos = value;
        }

        /**
         * Atributo condicional para expresar el importe exento y gravado de las claves tipo percepción 022 Prima por Antigüedad, 023 Pagos por separación y 025 Indemnizaciones.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalSeparacionIndemnizacion() {
            return totalSeparacionIndemnizacion;
        }

        /**
         * Define el valor de la propiedad totalSeparacionIndemnizacion.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getTotalSeparacionIndemnizacion()
         */
        public void setTotalSeparacionIndemnizacion(BigDecimal value) {
            this.totalSeparacionIndemnizacion = value;
        }

        /**
         * Atributo condicional para expresar el importe exento y gravado de las claves tipo percepción 039 Jubilaciones, pensiones o haberes de retiro en una exhibición y 044 Jubilaciones, pensiones o haberes de retiro en parcialidades.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalJubilacionPensionRetiro() {
            return totalJubilacionPensionRetiro;
        }

        /**
         * Define el valor de la propiedad totalJubilacionPensionRetiro.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getTotalJubilacionPensionRetiro()
         */
        public void setTotalJubilacionPensionRetiro(BigDecimal value) {
            this.totalJubilacionPensionRetiro = value;
        }

        /**
         * Atributo requerido para expresar el total de percepciones gravadas que se relacionan en el comprobante.
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
         * Atributo requerido para expresar el total de percepciones exentas que se relacionan en el comprobante.
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
         *       <attribute name="TotalUnaExhibicion" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
         *       <attribute name="TotalParcialidad" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
         *       <attribute name="MontoDiario" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
         *       <attribute name="IngresoAcumulable" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
         *       <attribute name="IngresoNoAcumulable" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class JubilacionPensionRetiro {

            /**
             * Atributo condicional que indica el monto total del pago cuando se realiza en una sola exhibición.
             * 
             */
            @XmlAttribute(name = "TotalUnaExhibicion")
            protected BigDecimal totalUnaExhibicion;
            /**
             * Atributo condicional para expresar los ingresos totales por pago cuando se hace en parcialidades.
             * 
             */
            @XmlAttribute(name = "TotalParcialidad")
            protected BigDecimal totalParcialidad;
            /**
             * Atributo condicional para expresar el monto diario percibido por jubilación, pensiones o haberes de retiro cuando se realiza en parcialidades.
             * 
             */
            @XmlAttribute(name = "MontoDiario")
            protected BigDecimal montoDiario;
            /**
             * Atributo requerido para expresar los ingresos acumulables.
             * 
             */
            @XmlAttribute(name = "IngresoAcumulable", required = true)
            protected BigDecimal ingresoAcumulable;
            /**
             * Atributo requerido para expresar los ingresos no acumulables.
             * 
             */
            @XmlAttribute(name = "IngresoNoAcumulable", required = true)
            protected BigDecimal ingresoNoAcumulable;

            /**
             * Atributo condicional que indica el monto total del pago cuando se realiza en una sola exhibición.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalUnaExhibicion() {
                return totalUnaExhibicion;
            }

            /**
             * Define el valor de la propiedad totalUnaExhibicion.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getTotalUnaExhibicion()
             */
            public void setTotalUnaExhibicion(BigDecimal value) {
                this.totalUnaExhibicion = value;
            }

            /**
             * Atributo condicional para expresar los ingresos totales por pago cuando se hace en parcialidades.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalParcialidad() {
                return totalParcialidad;
            }

            /**
             * Define el valor de la propiedad totalParcialidad.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getTotalParcialidad()
             */
            public void setTotalParcialidad(BigDecimal value) {
                this.totalParcialidad = value;
            }

            /**
             * Atributo condicional para expresar el monto diario percibido por jubilación, pensiones o haberes de retiro cuando se realiza en parcialidades.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoDiario() {
                return montoDiario;
            }

            /**
             * Define el valor de la propiedad montoDiario.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getMontoDiario()
             */
            public void setMontoDiario(BigDecimal value) {
                this.montoDiario = value;
            }

            /**
             * Atributo requerido para expresar los ingresos acumulables.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getIngresoAcumulable() {
                return ingresoAcumulable;
            }

            /**
             * Define el valor de la propiedad ingresoAcumulable.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getIngresoAcumulable()
             */
            public void setIngresoAcumulable(BigDecimal value) {
                this.ingresoAcumulable = value;
            }

            /**
             * Atributo requerido para expresar los ingresos no acumulables.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getIngresoNoAcumulable() {
                return ingresoNoAcumulable;
            }

            /**
             * Define el valor de la propiedad ingresoNoAcumulable.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getIngresoNoAcumulable()
             */
            public void setIngresoNoAcumulable(BigDecimal value) {
                this.ingresoNoAcumulable = value;
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
         *         <element name="AccionesOTitulos" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <attribute name="ValorMercado" use="required">
         *                   <simpleType>
         *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                       <fractionDigits value="6"/>
         *                       <minInclusive value="0.000001"/>
         *                       <whiteSpace value="collapse"/>
         *                     </restriction>
         *                   </simpleType>
         *                 </attribute>
         *                 <attribute name="PrecioAlOtorgarse" use="required">
         *                   <simpleType>
         *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                       <fractionDigits value="6"/>
         *                       <minInclusive value="0.000001"/>
         *                       <whiteSpace value="collapse"/>
         *                     </restriction>
         *                   </simpleType>
         *                 </attribute>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="HorasExtra" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <attribute name="Dias" use="required">
         *                   <simpleType>
         *                     <restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *                       <minInclusive value="1"/>
         *                       <whiteSpace value="collapse"/>
         *                     </restriction>
         *                   </simpleType>
         *                 </attribute>
         *                 <attribute name="TipoHoras" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_TipoHoras" />
         *                 <attribute name="HorasExtra" use="required">
         *                   <simpleType>
         *                     <restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *                       <minInclusive value="1"/>
         *                       <whiteSpace value="collapse"/>
         *                     </restriction>
         *                   </simpleType>
         *                 </attribute>
         *                 <attribute name="ImportePagado" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *       </sequence>
         *       <attribute name="TipoPercepcion" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_TipoPercepcion" />
         *       <attribute name="Clave" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <minLength value="3"/>
         *             <maxLength value="15"/>
         *             <whiteSpace value="collapse"/>
         *             <pattern value="[^|]{3,15}"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="Concepto" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <minLength value="1"/>
         *             <maxLength value="100"/>
         *             <whiteSpace value="collapse"/>
         *             <pattern value="[^|]{1,100}"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="ImporteGravado" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
         *       <attribute name="ImporteExento" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "accionesOTitulos",
            "horasExtra"
        })
        public static class Percepcion {

            /**
             * Nodo condicional para expresar ingresos por acciones o títulos valor que representan bienes. Se vuelve requerido cuando existan ingresos por sueldos derivados de adquisición de acciones o títulos (Art. 94, fracción VII LISR).
             * 
             */
            @XmlElement(name = "AccionesOTitulos")
            protected Nomina.Percepciones.Percepcion.AccionesOTitulos accionesOTitulos;
            /**
             * Nodo condicional para expresar las horas extra aplicables.
             * 
             */
            @XmlElement(name = "HorasExtra")
            protected List<Nomina.Percepciones.Percepcion.HorasExtra> horasExtra;
            /**
             * Atributo requerido para expresar la Clave agrupadora bajo la cual se clasifica la percepción.
             * 
             */
            @XmlAttribute(name = "TipoPercepcion", required = true)
            protected CTipoPercepcion tipoPercepcion;
            /**
             * Atributo requerido para expresar la clave de percepción de nómina propia de la contabilidad de cada patrón, puede conformarse desde 3 hasta 15 caracteres.
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
             * Atributo requerido, representa el importe gravado de un concepto de percepción.
             * 
             */
            @XmlAttribute(name = "ImporteGravado", required = true)
            protected BigDecimal importeGravado;
            /**
             * Atributo requerido, representa el importe exento de un concepto de percepción.
             * 
             */
            @XmlAttribute(name = "ImporteExento", required = true)
            protected BigDecimal importeExento;

            /**
             * Nodo condicional para expresar ingresos por acciones o títulos valor que representan bienes. Se vuelve requerido cuando existan ingresos por sueldos derivados de adquisición de acciones o títulos (Art. 94, fracción VII LISR).
             * 
             * @return
             *     possible object is
             *     {@link Nomina.Percepciones.Percepcion.AccionesOTitulos }
             *     
             */
            public Nomina.Percepciones.Percepcion.AccionesOTitulos getAccionesOTitulos() {
                return accionesOTitulos;
            }

            /**
             * Define el valor de la propiedad accionesOTitulos.
             * 
             * @param value
             *     allowed object is
             *     {@link Nomina.Percepciones.Percepcion.AccionesOTitulos }
             *     
             * @see #getAccionesOTitulos()
             */
            public void setAccionesOTitulos(Nomina.Percepciones.Percepcion.AccionesOTitulos value) {
                this.accionesOTitulos = value;
            }

            /**
             * Nodo condicional para expresar las horas extra aplicables.
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
             * {@link Nomina.Percepciones.Percepcion.HorasExtra }
             * </p>
             * 
             * 
             * @return
             *     The value of the horasExtra property.
             */
            public List<Nomina.Percepciones.Percepcion.HorasExtra> getHorasExtra() {
                if (horasExtra == null) {
                    horasExtra = new ArrayList<>();
                }
                return this.horasExtra;
            }

            /**
             * Atributo requerido para expresar la Clave agrupadora bajo la cual se clasifica la percepción.
             * 
             * @return
             *     possible object is
             *     {@link CTipoPercepcion }
             *     
             */
            public CTipoPercepcion getTipoPercepcion() {
                return tipoPercepcion;
            }

            /**
             * Define el valor de la propiedad tipoPercepcion.
             * 
             * @param value
             *     allowed object is
             *     {@link CTipoPercepcion }
             *     
             * @see #getTipoPercepcion()
             */
            public void setTipoPercepcion(CTipoPercepcion value) {
                this.tipoPercepcion = value;
            }

            /**
             * Atributo requerido para expresar la clave de percepción de nómina propia de la contabilidad de cada patrón, puede conformarse desde 3 hasta 15 caracteres.
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
             * Atributo requerido, representa el importe gravado de un concepto de percepción.
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
             * Atributo requerido, representa el importe exento de un concepto de percepción.
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


            /**
             * <p>Clase Java para anonymous complex type.</p>
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       <attribute name="ValorMercado" use="required">
             *         <simpleType>
             *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *             <fractionDigits value="6"/>
             *             <minInclusive value="0.000001"/>
             *             <whiteSpace value="collapse"/>
             *           </restriction>
             *         </simpleType>
             *       </attribute>
             *       <attribute name="PrecioAlOtorgarse" use="required">
             *         <simpleType>
             *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *             <fractionDigits value="6"/>
             *             <minInclusive value="0.000001"/>
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
            public static class AccionesOTitulos {

                /**
                 * Atributo requerido para expresar el valor de mercado de las Acciones o Títulos valor al ejercer la opción.
                 * 
                 */
                @XmlAttribute(name = "ValorMercado", required = true)
                protected BigDecimal valorMercado;
                /**
                 * Atributo requerido para expresar el precio establecido al otorgarse la opción de ingresos en acciones o títulos valor.
                 * 
                 */
                @XmlAttribute(name = "PrecioAlOtorgarse", required = true)
                protected BigDecimal precioAlOtorgarse;

                /**
                 * Atributo requerido para expresar el valor de mercado de las Acciones o Títulos valor al ejercer la opción.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorMercado() {
                    return valorMercado;
                }

                /**
                 * Define el valor de la propiedad valorMercado.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getValorMercado()
                 */
                public void setValorMercado(BigDecimal value) {
                    this.valorMercado = value;
                }

                /**
                 * Atributo requerido para expresar el precio establecido al otorgarse la opción de ingresos en acciones o títulos valor.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPrecioAlOtorgarse() {
                    return precioAlOtorgarse;
                }

                /**
                 * Define el valor de la propiedad precioAlOtorgarse.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getPrecioAlOtorgarse()
                 */
                public void setPrecioAlOtorgarse(BigDecimal value) {
                    this.precioAlOtorgarse = value;
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
             *       <attribute name="Dias" use="required">
             *         <simpleType>
             *           <restriction base="{http://www.w3.org/2001/XMLSchema}int">
             *             <minInclusive value="1"/>
             *             <whiteSpace value="collapse"/>
             *           </restriction>
             *         </simpleType>
             *       </attribute>
             *       <attribute name="TipoHoras" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_TipoHoras" />
             *       <attribute name="HorasExtra" use="required">
             *         <simpleType>
             *           <restriction base="{http://www.w3.org/2001/XMLSchema}int">
             *             <minInclusive value="1"/>
             *             <whiteSpace value="collapse"/>
             *           </restriction>
             *         </simpleType>
             *       </attribute>
             *       <attribute name="ImportePagado" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
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
                 * Atributo requerido para expresar el número de días en que el trabajador realizó horas extra en el periodo.
                 * 
                 */
                @XmlAttribute(name = "Dias", required = true)
                protected int dias;
                /**
                 * Atributo requerido para expresar el tipo de pago de las horas extra.
                 * 
                 */
                @XmlAttribute(name = "TipoHoras", required = true)
                protected CTipoHoras tipoHoras;
                /**
                 * Atributo requerido para expresar el número de horas extra trabajadas en el periodo.
                 * 
                 */
                @XmlAttribute(name = "HorasExtra", required = true)
                protected int horasExtra;
                /**
                 * Atributo requerido para expresar el importe pagado por las horas extra.
                 * 
                 */
                @XmlAttribute(name = "ImportePagado", required = true)
                protected BigDecimal importePagado;

                /**
                 * Atributo requerido para expresar el número de días en que el trabajador realizó horas extra en el periodo.
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
                 * Atributo requerido para expresar el tipo de pago de las horas extra.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CTipoHoras }
                 *     
                 */
                public CTipoHoras getTipoHoras() {
                    return tipoHoras;
                }

                /**
                 * Define el valor de la propiedad tipoHoras.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CTipoHoras }
                 *     
                 * @see #getTipoHoras()
                 */
                public void setTipoHoras(CTipoHoras value) {
                    this.tipoHoras = value;
                }

                /**
                 * Atributo requerido para expresar el número de horas extra trabajadas en el periodo.
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
                 * Atributo requerido para expresar el importe pagado por las horas extra.
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
         *       <attribute name="TotalPagado" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
         *       <attribute name="NumAñosServicio" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *             <minInclusive value="0"/>
         *             <maxInclusive value="99"/>
         *             <whiteSpace value="collapse"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="UltimoSueldoMensOrd" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
         *       <attribute name="IngresoAcumulable" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
         *       <attribute name="IngresoNoAcumulable" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SeparacionIndemnizacion {

            /**
             * Atributo requerido que indica el monto total del pago.
             * 
             */
            @XmlAttribute(name = "TotalPagado", required = true)
            protected BigDecimal totalPagado;
            /**
             * Atributo requerido para expresar el número de años de servicio del trabajador. Se redondea al entero superior si la cifra contiene años y meses y hay más de 6 meses.
             * 
             */
            @XmlAttribute(name = "NumA\u00f1osServicio", required = true)
            protected int numAñosServicio;
            /**
             * Atributo requerido que indica el último sueldo mensual ordinario.
             * 
             */
            @XmlAttribute(name = "UltimoSueldoMensOrd", required = true)
            protected BigDecimal ultimoSueldoMensOrd;
            /**
             * Atributo requerido para expresar los ingresos acumulables.
             * 
             */
            @XmlAttribute(name = "IngresoAcumulable", required = true)
            protected BigDecimal ingresoAcumulable;
            /**
             * Atributo requerido que indica los ingresos no acumulables.
             * 
             */
            @XmlAttribute(name = "IngresoNoAcumulable", required = true)
            protected BigDecimal ingresoNoAcumulable;

            /**
             * Atributo requerido que indica el monto total del pago.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalPagado() {
                return totalPagado;
            }

            /**
             * Define el valor de la propiedad totalPagado.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getTotalPagado()
             */
            public void setTotalPagado(BigDecimal value) {
                this.totalPagado = value;
            }

            /**
             * Atributo requerido para expresar el número de años de servicio del trabajador. Se redondea al entero superior si la cifra contiene años y meses y hay más de 6 meses.
             * 
             */
            public int getNumAñosServicio() {
                return numAñosServicio;
            }

            /**
             * Define el valor de la propiedad numAñosServicio.
             * 
             */
            public void setNumAñosServicio(int value) {
                this.numAñosServicio = value;
            }

            /**
             * Atributo requerido que indica el último sueldo mensual ordinario.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUltimoSueldoMensOrd() {
                return ultimoSueldoMensOrd;
            }

            /**
             * Define el valor de la propiedad ultimoSueldoMensOrd.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getUltimoSueldoMensOrd()
             */
            public void setUltimoSueldoMensOrd(BigDecimal value) {
                this.ultimoSueldoMensOrd = value;
            }

            /**
             * Atributo requerido para expresar los ingresos acumulables.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getIngresoAcumulable() {
                return ingresoAcumulable;
            }

            /**
             * Define el valor de la propiedad ingresoAcumulable.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getIngresoAcumulable()
             */
            public void setIngresoAcumulable(BigDecimal value) {
                this.ingresoAcumulable = value;
            }

            /**
             * Atributo requerido que indica los ingresos no acumulables.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getIngresoNoAcumulable() {
                return ingresoNoAcumulable;
            }

            /**
             * Define el valor de la propiedad ingresoNoAcumulable.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getIngresoNoAcumulable()
             */
            public void setIngresoNoAcumulable(BigDecimal value) {
                this.ingresoNoAcumulable = value;
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
     *         <element name="SubContratacion" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <attribute name="RfcLabora" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC" />
     *                 <attribute name="PorcentajeTiempo" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                       <minInclusive value="0.001"/>
     *                       <maxInclusive value="100.000"/>
     *                       <whiteSpace value="collapse"/>
     *                       <pattern value="[0-9]{1,3}(.([0-9]{1,3}))?"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *       <attribute name="Curp" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_CURP" />
     *       <attribute name="NumSeguridadSocial">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <minLength value="1"/>
     *             <maxLength value="15"/>
     *             <whiteSpace value="collapse"/>
     *             <pattern value="[0-9]{1,15}"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="FechaInicioRelLaboral" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Fecha" />
     *       <attribute name="Antigüedad">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <whiteSpace value="collapse"/>
     *             <pattern value="P(([1-9][0-9]{0,3})|0)W|P([1-9][0-9]?Y)?(([1-9]|1[012])M)?(0|[1-9]|[12][0-9]|3[01])D"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="TipoContrato" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_TipoContrato" />
     *       <attribute name="Sindicalizado">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <whiteSpace value="collapse"/>
     *             <enumeration value="Sí"/>
     *             <enumeration value="No"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="TipoJornada" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_TipoJornada" />
     *       <attribute name="TipoRegimen" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_TipoRegimen" />
     *       <attribute name="NumEmpleado" use="required">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <minLength value="1"/>
     *             <maxLength value="15"/>
     *             <whiteSpace value="collapse"/>
     *             <pattern value="[^|]{1,15}"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="Departamento">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <minLength value="1"/>
     *             <maxLength value="100"/>
     *             <whiteSpace value="collapse"/>
     *             <pattern value="[^|]{1,100}"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="Puesto">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <minLength value="1"/>
     *             <maxLength value="100"/>
     *             <whiteSpace value="collapse"/>
     *             <pattern value="[^|]{1,100}"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="RiesgoPuesto" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_RiesgoPuesto" />
     *       <attribute name="PeriodicidadPago" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_PeriodicidadPago" />
     *       <attribute name="Banco" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina}c_Banco" />
     *       <attribute name="CuentaBancaria" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_CuentaBancaria" />
     *       <attribute name="SalarioBaseCotApor" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *       <attribute name="SalarioDiarioIntegrado" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_ImporteMXN" />
     *       <attribute name="ClaveEntFed" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Estado" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subContratacion"
    })
    public static class Receptor {

        /**
         * Nodo condicional para expresar la lista de las personas que los subcontrataron.
         * 
         */
        @XmlElement(name = "SubContratacion")
        protected List<Nomina.Receptor.SubContratacion> subContratacion;
        /**
         * Atributo requerido para expresar la CURP del receptor del comprobante de nómina.
         * 
         */
        @XmlAttribute(name = "Curp", required = true)
        protected String curp;
        /**
         * Atributo condicional para expresar el número de seguridad social del trabajador. Se debe ingresar cuando se cuente con él, o se esté obligado conforme a otras disposiciones distintas a las fiscales.
         * 
         */
        @XmlAttribute(name = "NumSeguridadSocial")
        protected String numSeguridadSocial;
        /**
         * Atributo condicional para expresar la fecha de inicio de la relación laboral entre el empleador y el empleado. Se expresa en la forma AAAA-MM-DD, de acuerdo con la especificación ISO 8601. Se debe ingresar cuando se cuente con él, o se esté obligado conforme a otras disposiciones distintas a las fiscales.
         * 
         */
        @XmlAttribute(name = "FechaInicioRelLaboral")
        @XmlJavaTypeAdapter(DateAdapter.class)
        protected LocalDate fechaInicioRelLaboral;
        /**
         * Atributo condicional para expresar el número de semanas o el periodo de años, meses y días que el empleado ha mantenido relación laboral con el empleador. Se debe ingresar cuando se cuente con él, o se esté obligado conforme a otras disposiciones distintas a las fiscales.
         * 
         */
        @XmlAttribute(name = "Antig\u00fcedad")
        protected String antigüedad;
        /**
         * Atributo requerido para expresar el tipo de contrato que tiene el trabajador.
         * 
         */
        @XmlAttribute(name = "TipoContrato", required = true)
        protected CTipoContrato tipoContrato;
        /**
         * Atributo opcional para indicar si el trabajador está asociado a un sindicato. Si se omite se asume que no está asociado a algún sindicato.
         * 
         */
        @XmlAttribute(name = "Sindicalizado")
        protected String sindicalizado;
        /**
         * Atributo condicional para expresar el tipo de jornada que cubre el trabajador. Se debe ingresar cuando se esté obligado conforme a otras disposiciones distintas a las fiscales.
         * 
         */
        @XmlAttribute(name = "TipoJornada")
        protected CTipoJornada tipoJornada;
        /**
         * Atributo requerido para la expresión de la clave del régimen por el cual se tiene contratado al trabajador.
         * 
         */
        @XmlAttribute(name = "TipoRegimen", required = true)
        protected CTipoRegimen tipoRegimen;
        /**
         * Atributo requerido para expresar el número de empleado de 1 a 15 posiciones.
         * 
         */
        @XmlAttribute(name = "NumEmpleado", required = true)
        protected String numEmpleado;
        /**
         * Atributo opcional para la expresión del departamento o área a la que pertenece el trabajador.
         * 
         */
        @XmlAttribute(name = "Departamento")
        protected String departamento;
        /**
         * Atributo opcional para la expresión del puesto asignado al empleado o actividad que realiza.
         * 
         */
        @XmlAttribute(name = "Puesto")
        protected String puesto;
        /**
         * Atributo opcional para expresar la clave conforme a la Clase en que deben inscribirse los patrones, de acuerdo con las actividades que desempeñan sus trabajadores, según lo previsto en el artículo 196 del Reglamento en Materia de Afiliación Clasificación de Empresas, Recaudación y Fiscalización, o conforme con la normatividad del Instituto de Seguridad Social del trabajador.  Se debe ingresar cuando se cuente con él, o se esté obligado conforme a otras disposiciones distintas a las fiscales.
         * 
         */
        @XmlAttribute(name = "RiesgoPuesto")
        protected CRiesgoPuesto riesgoPuesto;
        /**
         * Atributo requerido para la forma en que se establece el pago del salario.
         * 
         */
        @XmlAttribute(name = "PeriodicidadPago", required = true)
        protected CPeriodicidadPago periodicidadPago;
        /**
         * Atributo condicional para la expresión de la clave del Banco conforme al catálogo, donde se realiza el depósito de nómina.
         * 
         */
        @XmlAttribute(name = "Banco")
        protected CBanco banco;
        /**
         * Atributo condicional para la expresión de la cuenta bancaria a 11 posiciones o número de teléfono celular a 10 posiciones o número de tarjeta de crédito, débito o servicios a 15 ó 16 posiciones o la CLABE a 18 posiciones o número de monedero electrónico, donde se realiza el depósito de nómina.
         * 
         */
        @XmlAttribute(name = "CuentaBancaria")
        protected BigInteger cuentaBancaria;
        /**
         * Atributo opcional para expresar la retribución otorgada al trabajador, que se integra por los pagos hechos en efectivo por cuota diaria, gratificaciones, percepciones, alimentación, habitación, primas, comisiones, prestaciones en especie y cualquiera otra cantidad o prestación que se entregue al trabajador por su trabajo, sin considerar los conceptos que se excluyen de conformidad con el Artículo 27 de la Ley del Seguro Social, o la integración de los pagos conforme la normatividad del Instituto de Seguridad Social del trabajador. (Se emplea para pagar las cuotas y aportaciones de Seguridad Social). Se debe ingresar cuando se esté obligado conforme a otras disposiciones distintas a las fiscales.
         * 
         */
        @XmlAttribute(name = "SalarioBaseCotApor")
        protected BigDecimal salarioBaseCotApor;
        /**
         * Atributo opcional para expresar el salario que se integra con los pagos hechos en efectivo por cuota diaria, gratificaciones, percepciones, habitación, primas, comisiones, prestaciones en especie y cualquier otra cantidad o prestación que se entregue al trabajador por su trabajo, de conformidad con el Art. 84 de la Ley Federal del Trabajo. (Se utiliza para el cálculo de las indemnizaciones). Se debe ingresar cuando se esté obligado conforme a otras disposiciones distintas a las fiscales.
         * 
         */
        @XmlAttribute(name = "SalarioDiarioIntegrado")
        protected BigDecimal salarioDiarioIntegrado;
        /**
         * Atributo requerido para expresar la clave de la entidad federativa en donde el receptor del recibo prestó el servicio.
         * 
         */
        @XmlAttribute(name = "ClaveEntFed", required = true)
        protected CEstado claveEntFed;

        /**
         * Nodo condicional para expresar la lista de las personas que los subcontrataron.
         * 
         * Gets the value of the subContratacion property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subContratacion property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getSubContratacion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Nomina.Receptor.SubContratacion }
         * </p>
         * 
         * 
         * @return
         *     The value of the subContratacion property.
         */
        public List<Nomina.Receptor.SubContratacion> getSubContratacion() {
            if (subContratacion == null) {
                subContratacion = new ArrayList<>();
            }
            return this.subContratacion;
        }

        /**
         * Atributo requerido para expresar la CURP del receptor del comprobante de nómina.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurp() {
            return curp;
        }

        /**
         * Define el valor de la propiedad curp.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCurp()
         */
        public void setCurp(String value) {
            this.curp = value;
        }

        /**
         * Atributo condicional para expresar el número de seguridad social del trabajador. Se debe ingresar cuando se cuente con él, o se esté obligado conforme a otras disposiciones distintas a las fiscales.
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
         * Atributo condicional para expresar la fecha de inicio de la relación laboral entre el empleador y el empleado. Se expresa en la forma AAAA-MM-DD, de acuerdo con la especificación ISO 8601. Se debe ingresar cuando se cuente con él, o se esté obligado conforme a otras disposiciones distintas a las fiscales.
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
         * Atributo condicional para expresar el número de semanas o el periodo de años, meses y días que el empleado ha mantenido relación laboral con el empleador. Se debe ingresar cuando se cuente con él, o se esté obligado conforme a otras disposiciones distintas a las fiscales.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAntigüedad() {
            return antigüedad;
        }

        /**
         * Define el valor de la propiedad antigüedad.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAntigüedad()
         */
        public void setAntigüedad(String value) {
            this.antigüedad = value;
        }

        /**
         * Atributo requerido para expresar el tipo de contrato que tiene el trabajador.
         * 
         * @return
         *     possible object is
         *     {@link CTipoContrato }
         *     
         */
        public CTipoContrato getTipoContrato() {
            return tipoContrato;
        }

        /**
         * Define el valor de la propiedad tipoContrato.
         * 
         * @param value
         *     allowed object is
         *     {@link CTipoContrato }
         *     
         * @see #getTipoContrato()
         */
        public void setTipoContrato(CTipoContrato value) {
            this.tipoContrato = value;
        }

        /**
         * Atributo opcional para indicar si el trabajador está asociado a un sindicato. Si se omite se asume que no está asociado a algún sindicato.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSindicalizado() {
            return sindicalizado;
        }

        /**
         * Define el valor de la propiedad sindicalizado.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getSindicalizado()
         */
        public void setSindicalizado(String value) {
            this.sindicalizado = value;
        }

        /**
         * Atributo condicional para expresar el tipo de jornada que cubre el trabajador. Se debe ingresar cuando se esté obligado conforme a otras disposiciones distintas a las fiscales.
         * 
         * @return
         *     possible object is
         *     {@link CTipoJornada }
         *     
         */
        public CTipoJornada getTipoJornada() {
            return tipoJornada;
        }

        /**
         * Define el valor de la propiedad tipoJornada.
         * 
         * @param value
         *     allowed object is
         *     {@link CTipoJornada }
         *     
         * @see #getTipoJornada()
         */
        public void setTipoJornada(CTipoJornada value) {
            this.tipoJornada = value;
        }

        /**
         * Atributo requerido para la expresión de la clave del régimen por el cual se tiene contratado al trabajador.
         * 
         * @return
         *     possible object is
         *     {@link CTipoRegimen }
         *     
         */
        public CTipoRegimen getTipoRegimen() {
            return tipoRegimen;
        }

        /**
         * Define el valor de la propiedad tipoRegimen.
         * 
         * @param value
         *     allowed object is
         *     {@link CTipoRegimen }
         *     
         * @see #getTipoRegimen()
         */
        public void setTipoRegimen(CTipoRegimen value) {
            this.tipoRegimen = value;
        }

        /**
         * Atributo requerido para expresar el número de empleado de 1 a 15 posiciones.
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
         * Atributo opcional para la expresión del departamento o área a la que pertenece el trabajador.
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
         * Atributo opcional para la expresión del puesto asignado al empleado o actividad que realiza.
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
         * Atributo opcional para expresar la clave conforme a la Clase en que deben inscribirse los patrones, de acuerdo con las actividades que desempeñan sus trabajadores, según lo previsto en el artículo 196 del Reglamento en Materia de Afiliación Clasificación de Empresas, Recaudación y Fiscalización, o conforme con la normatividad del Instituto de Seguridad Social del trabajador.  Se debe ingresar cuando se cuente con él, o se esté obligado conforme a otras disposiciones distintas a las fiscales.
         * 
         * @return
         *     possible object is
         *     {@link CRiesgoPuesto }
         *     
         */
        public CRiesgoPuesto getRiesgoPuesto() {
            return riesgoPuesto;
        }

        /**
         * Define el valor de la propiedad riesgoPuesto.
         * 
         * @param value
         *     allowed object is
         *     {@link CRiesgoPuesto }
         *     
         * @see #getRiesgoPuesto()
         */
        public void setRiesgoPuesto(CRiesgoPuesto value) {
            this.riesgoPuesto = value;
        }

        /**
         * Atributo requerido para la forma en que se establece el pago del salario.
         * 
         * @return
         *     possible object is
         *     {@link CPeriodicidadPago }
         *     
         */
        public CPeriodicidadPago getPeriodicidadPago() {
            return periodicidadPago;
        }

        /**
         * Define el valor de la propiedad periodicidadPago.
         * 
         * @param value
         *     allowed object is
         *     {@link CPeriodicidadPago }
         *     
         * @see #getPeriodicidadPago()
         */
        public void setPeriodicidadPago(CPeriodicidadPago value) {
            this.periodicidadPago = value;
        }

        /**
         * Atributo condicional para la expresión de la clave del Banco conforme al catálogo, donde se realiza el depósito de nómina.
         * 
         * @return
         *     possible object is
         *     {@link CBanco }
         *     
         */
        public CBanco getBanco() {
            return banco;
        }

        /**
         * Define el valor de la propiedad banco.
         * 
         * @param value
         *     allowed object is
         *     {@link CBanco }
         *     
         * @see #getBanco()
         */
        public void setBanco(CBanco value) {
            this.banco = value;
        }

        /**
         * Atributo condicional para la expresión de la cuenta bancaria a 11 posiciones o número de teléfono celular a 10 posiciones o número de tarjeta de crédito, débito o servicios a 15 ó 16 posiciones o la CLABE a 18 posiciones o número de monedero electrónico, donde se realiza el depósito de nómina.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCuentaBancaria() {
            return cuentaBancaria;
        }

        /**
         * Define el valor de la propiedad cuentaBancaria.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         * @see #getCuentaBancaria()
         */
        public void setCuentaBancaria(BigInteger value) {
            this.cuentaBancaria = value;
        }

        /**
         * Atributo opcional para expresar la retribución otorgada al trabajador, que se integra por los pagos hechos en efectivo por cuota diaria, gratificaciones, percepciones, alimentación, habitación, primas, comisiones, prestaciones en especie y cualquiera otra cantidad o prestación que se entregue al trabajador por su trabajo, sin considerar los conceptos que se excluyen de conformidad con el Artículo 27 de la Ley del Seguro Social, o la integración de los pagos conforme la normatividad del Instituto de Seguridad Social del trabajador. (Se emplea para pagar las cuotas y aportaciones de Seguridad Social). Se debe ingresar cuando se esté obligado conforme a otras disposiciones distintas a las fiscales.
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
         * Atributo opcional para expresar el salario que se integra con los pagos hechos en efectivo por cuota diaria, gratificaciones, percepciones, habitación, primas, comisiones, prestaciones en especie y cualquier otra cantidad o prestación que se entregue al trabajador por su trabajo, de conformidad con el Art. 84 de la Ley Federal del Trabajo. (Se utiliza para el cálculo de las indemnizaciones). Se debe ingresar cuando se esté obligado conforme a otras disposiciones distintas a las fiscales.
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
         * Atributo requerido para expresar la clave de la entidad federativa en donde el receptor del recibo prestó el servicio.
         * 
         * @return
         *     possible object is
         *     {@link CEstado }
         *     
         */
        public CEstado getClaveEntFed() {
            return claveEntFed;
        }

        /**
         * Define el valor de la propiedad claveEntFed.
         * 
         * @param value
         *     allowed object is
         *     {@link CEstado }
         *     
         * @see #getClaveEntFed()
         */
        public void setClaveEntFed(CEstado value) {
            this.claveEntFed = value;
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
         *       <attribute name="RfcLabora" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC" />
         *       <attribute name="PorcentajeTiempo" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *             <minInclusive value="0.001"/>
         *             <maxInclusive value="100.000"/>
         *             <whiteSpace value="collapse"/>
         *             <pattern value="[0-9]{1,3}(.([0-9]{1,3}))?"/>
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
        public static class SubContratacion {

            /**
             * Atributo requerido para expresar el RFC de la persona que subcontrata.
             * 
             */
            @XmlAttribute(name = "RfcLabora", required = true)
            protected String rfcLabora;
            /**
             * Atributo requerido para expresar el porcentaje del tiempo que prestó sus servicios con el RFC que lo subcontrata.
             * 
             */
            @XmlAttribute(name = "PorcentajeTiempo", required = true)
            protected BigDecimal porcentajeTiempo;

            /**
             * Atributo requerido para expresar el RFC de la persona que subcontrata.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRfcLabora() {
                return rfcLabora;
            }

            /**
             * Define el valor de la propiedad rfcLabora.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getRfcLabora()
             */
            public void setRfcLabora(String value) {
                this.rfcLabora = value;
            }

            /**
             * Atributo requerido para expresar el porcentaje del tiempo que prestó sus servicios con el RFC que lo subcontrata.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPorcentajeTiempo() {
                return porcentajeTiempo;
            }

            /**
             * Define el valor de la propiedad porcentajeTiempo.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getPorcentajeTiempo()
             */
            public void setPorcentajeTiempo(BigDecimal value) {
                this.porcentajeTiempo = value;
            }

        }

    }

}
