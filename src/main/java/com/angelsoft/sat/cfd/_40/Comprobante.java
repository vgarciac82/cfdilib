//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package com.angelsoft.sat.cfd._40;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.angelsoft.sat.util.DateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import mx.gob.sat.sitio_internet.cfd.catalogos.CClaveUnidad;
import mx.gob.sat.sitio_internet.cfd.catalogos.CExportacion;
import mx.gob.sat.sitio_internet.cfd.catalogos.CFormaPago;
import mx.gob.sat.sitio_internet.cfd.catalogos.CImpuesto;
import mx.gob.sat.sitio_internet.cfd.catalogos.CMeses;
import mx.gob.sat.sitio_internet.cfd.catalogos.CMetodoPago;
import mx.gob.sat.sitio_internet.cfd.catalogos.CMoneda;
import mx.gob.sat.sitio_internet.cfd.catalogos.CObjetoImp;
import mx.gob.sat.sitio_internet.cfd.catalogos.CPais;
import mx.gob.sat.sitio_internet.cfd.catalogos.CPeriodicidad;
import mx.gob.sat.sitio_internet.cfd.catalogos.CRegimenFiscal;
import mx.gob.sat.sitio_internet.cfd.catalogos.CTipoDeComprobante;
import mx.gob.sat.sitio_internet.cfd.catalogos.CTipoFactor;
import mx.gob.sat.sitio_internet.cfd.catalogos.CTipoRelacion;
import mx.gob.sat.sitio_internet.cfd.catalogos.CUsoCFDI;


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
 *         <element name="InformacionGlobal" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="Periodicidad" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Periodicidad" />
 *                 <attribute name="Meses" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Meses" />
 *                 <attribute name="Año" use="required">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *                       <minInclusive value="2019"/>
 *                       <whiteSpace value="collapse"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="CfdiRelacionados" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="CfdiRelacionado" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <attribute name="UUID" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <length value="36"/>
 *                                 <whiteSpace value="collapse"/>
 *                                 <pattern value="[a-f0-9A-F]{8}-[a-f0-9A-F]{4}-[a-f0-9A-F]{4}-[a-f0-9A-F]{4}-[a-f0-9A-F]{12}"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="TipoRelacion" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoRelacion" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Emisor">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="Rfc" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC" />
 *                 <attribute name="Nombre" use="required">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <minLength value="1"/>
 *                       <maxLength value="300"/>
 *                       <whiteSpace value="collapse"/>
 *                       <pattern value="[^|]{1,300}"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="RegimenFiscal" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_RegimenFiscal" />
 *                 <attribute name="FacAtrAdquirente">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <whiteSpace value="collapse"/>
 *                       <length value="10"/>
 *                       <pattern value="[0-9]{10}"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Receptor">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="Rfc" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC" />
 *                 <attribute name="Nombre" use="required">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <minLength value="1"/>
 *                       <maxLength value="300"/>
 *                       <whiteSpace value="collapse"/>
 *                       <pattern value="[^|]{1,300}"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="DomicilioFiscalReceptor" use="required">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <length value="5"/>
 *                       <whiteSpace value="collapse"/>
 *                       <pattern value="[0-9]{5}"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="ResidenciaFiscal" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Pais" />
 *                 <attribute name="NumRegIdTrib">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       <minLength value="1"/>
 *                       <maxLength value="40"/>
 *                       <whiteSpace value="collapse"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *                 <attribute name="RegimenFiscalReceptor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_RegimenFiscal" />
 *                 <attribute name="UsoCFDI" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_UsoCFDI" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Conceptos">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Concepto" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="Impuestos" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="Traslados" minOccurs="0">
 *                                         <complexType>
 *                                           <complexContent>
 *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               <sequence>
 *                                                 <element name="Traslado" maxOccurs="unbounded">
 *                                                   <complexType>
 *                                                     <complexContent>
 *                                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         <attribute name="Base" use="required">
 *                                                           <simpleType>
 *                                                             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                               <fractionDigits value="6"/>
 *                                                               <minInclusive value="0.000001"/>
 *                                                               <whiteSpace value="collapse"/>
 *                                                             </restriction>
 *                                                           </simpleType>
 *                                                         </attribute>
 *                                                         <attribute name="Impuesto" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
 *                                                         <attribute name="TipoFactor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
 *                                                         <attribute name="TasaOCuota">
 *                                                           <simpleType>
 *                                                             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                               <fractionDigits value="6"/>
 *                                                               <minInclusive value="0.000000"/>
 *                                                               <whiteSpace value="collapse"/>
 *                                                             </restriction>
 *                                                           </simpleType>
 *                                                         </attribute>
 *                                                         <attribute name="Importe" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
 *                                                       </restriction>
 *                                                     </complexContent>
 *                                                   </complexType>
 *                                                 </element>
 *                                               </sequence>
 *                                             </restriction>
 *                                           </complexContent>
 *                                         </complexType>
 *                                       </element>
 *                                       <element name="Retenciones" minOccurs="0">
 *                                         <complexType>
 *                                           <complexContent>
 *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               <sequence>
 *                                                 <element name="Retencion" maxOccurs="unbounded">
 *                                                   <complexType>
 *                                                     <complexContent>
 *                                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         <attribute name="Base" use="required">
 *                                                           <simpleType>
 *                                                             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                               <fractionDigits value="6"/>
 *                                                               <minInclusive value="0.000001"/>
 *                                                               <whiteSpace value="collapse"/>
 *                                                             </restriction>
 *                                                           </simpleType>
 *                                                         </attribute>
 *                                                         <attribute name="Impuesto" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
 *                                                         <attribute name="TipoFactor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
 *                                                         <attribute name="TasaOCuota" use="required">
 *                                                           <simpleType>
 *                                                             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                               <whiteSpace value="collapse"/>
 *                                                               <minInclusive value="0.000000"/>
 *                                                               <fractionDigits value="6"/>
 *                                                             </restriction>
 *                                                           </simpleType>
 *                                                         </attribute>
 *                                                         <attribute name="Importe" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
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
 *                             <element name="ACuentaTerceros" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <attribute name="RfcACuentaTerceros" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC" />
 *                                     <attribute name="NombreACuentaTerceros" use="required">
 *                                       <simpleType>
 *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           <minLength value="1"/>
 *                                           <maxLength value="300"/>
 *                                           <whiteSpace value="collapse"/>
 *                                           <pattern value="[^|]{1,300}"/>
 *                                         </restriction>
 *                                       </simpleType>
 *                                     </attribute>
 *                                     <attribute name="RegimenFiscalACuentaTerceros" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_RegimenFiscal" />
 *                                     <attribute name="DomicilioFiscalACuentaTerceros" use="required">
 *                                       <simpleType>
 *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           <length value="5"/>
 *                                           <whiteSpace value="collapse"/>
 *                                           <pattern value="[0-9]{5}"/>
 *                                         </restriction>
 *                                       </simpleType>
 *                                     </attribute>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="InformacionAduanera" maxOccurs="unbounded" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <attribute name="NumeroPedimento" use="required">
 *                                       <simpleType>
 *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           <length value="21"/>
 *                                           <pattern value="[0-9]{2}  [0-9]{2}  [0-9]{4}  [0-9]{7}"/>
 *                                         </restriction>
 *                                       </simpleType>
 *                                     </attribute>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="CuentaPredial" maxOccurs="unbounded" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <attribute name="Numero" use="required">
 *                                       <simpleType>
 *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           <minLength value="1"/>
 *                                           <maxLength value="150"/>
 *                                           <whiteSpace value="collapse"/>
 *                                           <pattern value="[0-9a-zA-Z]{1,150}"/>
 *                                         </restriction>
 *                                       </simpleType>
 *                                     </attribute>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="ComplementoConcepto" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <any maxOccurs="unbounded"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="Parte" maxOccurs="unbounded" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="InformacionAduanera" maxOccurs="unbounded" minOccurs="0">
 *                                         <complexType>
 *                                           <complexContent>
 *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               <attribute name="NumeroPedimento" use="required">
 *                                                 <simpleType>
 *                                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     <length value="21"/>
 *                                                     <pattern value="[0-9]{2}  [0-9]{2}  [0-9]{4}  [0-9]{7}"/>
 *                                                   </restriction>
 *                                                 </simpleType>
 *                                               </attribute>
 *                                             </restriction>
 *                                           </complexContent>
 *                                         </complexType>
 *                                       </element>
 *                                     </sequence>
 *                                     <attribute name="ClaveProdServ" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_ClaveProdServ" />
 *                                     <attribute name="NoIdentificacion">
 *                                       <simpleType>
 *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           <minLength value="1"/>
 *                                           <maxLength value="100"/>
 *                                           <whiteSpace value="collapse"/>
 *                                           <pattern value="[^|]{1,100}"/>
 *                                         </restriction>
 *                                       </simpleType>
 *                                     </attribute>
 *                                     <attribute name="Cantidad" use="required">
 *                                       <simpleType>
 *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                           <fractionDigits value="6"/>
 *                                           <minInclusive value="0.000001"/>
 *                                           <whiteSpace value="collapse"/>
 *                                         </restriction>
 *                                       </simpleType>
 *                                     </attribute>
 *                                     <attribute name="Unidad">
 *                                       <simpleType>
 *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           <minLength value="1"/>
 *                                           <maxLength value="20"/>
 *                                           <whiteSpace value="collapse"/>
 *                                           <pattern value="[^|]{1,20}"/>
 *                                         </restriction>
 *                                       </simpleType>
 *                                     </attribute>
 *                                     <attribute name="Descripcion" use="required">
 *                                       <simpleType>
 *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           <minLength value="1"/>
 *                                           <maxLength value="1000"/>
 *                                           <whiteSpace value="collapse"/>
 *                                           <pattern value="[^|]{1,1000}"/>
 *                                         </restriction>
 *                                       </simpleType>
 *                                     </attribute>
 *                                     <attribute name="ValorUnitario" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
 *                                     <attribute name="Importe" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                           </sequence>
 *                           <attribute name="ClaveProdServ" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_ClaveProdServ" />
 *                           <attribute name="NoIdentificacion">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <whiteSpace value="collapse"/>
 *                                 <minLength value="1"/>
 *                                 <maxLength value="100"/>
 *                                 <pattern value="[^|]{1,100}"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="Cantidad" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 <fractionDigits value="6"/>
 *                                 <minInclusive value="0.000001"/>
 *                                 <whiteSpace value="collapse"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="ClaveUnidad" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_ClaveUnidad" />
 *                           <attribute name="Unidad">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <minLength value="1"/>
 *                                 <maxLength value="20"/>
 *                                 <whiteSpace value="collapse"/>
 *                                 <pattern value="[^|]{1,20}"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="Descripcion" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <minLength value="1"/>
 *                                 <maxLength value="1000"/>
 *                                 <whiteSpace value="collapse"/>
 *                                 <pattern value="[^|]{1,1000}"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="ValorUnitario" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
 *                           <attribute name="Importe" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
 *                           <attribute name="Descuento" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
 *                           <attribute name="ObjetoImp" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_ObjetoImp" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Impuestos" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Retenciones" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="Retencion" maxOccurs="unbounded">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <attribute name="Impuesto" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
 *                                     <attribute name="Importe" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="Traslados" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="Traslado" maxOccurs="unbounded">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <attribute name="Base" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
 *                                     <attribute name="Impuesto" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
 *                                     <attribute name="TipoFactor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
 *                                     <attribute name="TasaOCuota">
 *                                       <simpleType>
 *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                           <whiteSpace value="collapse"/>
 *                                           <minInclusive value="0.000000"/>
 *                                           <fractionDigits value="6"/>
 *                                         </restriction>
 *                                       </simpleType>
 *                                     </attribute>
 *                                     <attribute name="Importe" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
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
 *                 <attribute name="TotalImpuestosRetenidos" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
 *                 <attribute name="TotalImpuestosTrasladados" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Complemento" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <any maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Addenda" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <any maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="Version" use="required" fixed="4.0">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <whiteSpace value="collapse"/>
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
 *       <attribute name="Fecha" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_FechaH" />
 *       <attribute name="Sello" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <whiteSpace value="collapse"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="FormaPago" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_FormaPago" />
 *       <attribute name="NoCertificado" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <length value="20"/>
 *             <whiteSpace value="collapse"/>
 *             <pattern value="[0-9]{20}"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Certificado" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <whiteSpace value="collapse"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="CondicionesDePago">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <whiteSpace value="collapse"/>
 *             <minLength value="1"/>
 *             <maxLength value="1000"/>
 *             <pattern value="[^|]{1,1000}"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="SubTotal" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
 *       <attribute name="Descuento" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
 *       <attribute name="Moneda" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Moneda" />
 *       <attribute name="TipoCambio">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             <fractionDigits value="6"/>
 *             <minInclusive value="0.000001"/>
 *             <whiteSpace value="collapse"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Total" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
 *       <attribute name="TipoDeComprobante" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoDeComprobante" />
 *       <attribute name="Exportacion" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Exportacion" />
 *       <attribute name="MetodoPago" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_MetodoPago" />
 *       <attribute name="LugarExpedicion" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_CodigoPostal" />
 *       <attribute name="Confirmacion">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <whiteSpace value="collapse"/>
 *             <length value="5"/>
 *             <pattern value="[0-9a-zA-Z]{5}"/>
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
    "informacionGlobal",
    "cfdiRelacionados",
    "emisor",
    "receptor",
    "conceptos",
    "impuestos",
    "complemento",
    "addenda"
})
@XmlRootElement(name = "Comprobante")
public class Comprobante {

    /**
     * Nodo condicional para precisar la información relacionada con el comprobante global.
     * 
     */
    @XmlElement(name = "InformacionGlobal")
    protected Comprobante.InformacionGlobal informacionGlobal;
    /**
     * Nodo opcional para precisar la información de los comprobantes relacionados.
     * 
     */
    @XmlElement(name = "CfdiRelacionados")
    protected List<Comprobante.CfdiRelacionados> cfdiRelacionados;
    /**
     * Nodo requerido para expresar la información del contribuyente emisor del comprobante.
     * 
     */
    @XmlElement(name = "Emisor", required = true)
    protected Comprobante.Emisor emisor;
    /**
     * Nodo requerido para precisar la información del contribuyente receptor del comprobante.
     * 
     */
    @XmlElement(name = "Receptor", required = true)
    protected Comprobante.Receptor receptor;
    /**
     * Nodo requerido para listar los conceptos cubiertos por el comprobante.
     * 
     */
    @XmlElement(name = "Conceptos", required = true)
    protected Comprobante.Conceptos conceptos;
    /**
     * Nodo condicional para expresar el resumen de los impuestos aplicables.
     * 
     */
    @XmlElement(name = "Impuestos")
    protected Comprobante.Impuestos impuestos;
    /**
     * Nodo opcional donde se incluye el complemento Timbre Fiscal Digital de manera obligatoria y los nodos complementarios determinados por el SAT, de acuerdo con las disposiciones particulares para un sector o actividad específica.
     * 
     */
    @XmlElement(name = "Complemento")
    protected Comprobante.Complemento complemento;
    /**
     * Nodo opcional para recibir las extensiones al presente formato que sean de utilidad al contribuyente. Para las reglas de uso del mismo, referirse al formato origen.
     * 
     */
    @XmlElement(name = "Addenda")
    protected Comprobante.Addenda addenda;
    /**
     * Atributo requerido con valor prefijado a 4.0 que indica la versión del estándar bajo el que se encuentra expresado el comprobante.
     * 
     */
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    /**
     * Atributo opcional para precisar la serie para control interno del contribuyente. Este atributo acepta una cadena de caracteres.
     * 
     */
    @XmlAttribute(name = "Serie")
    protected String serie;
    /**
     * Atributo opcional para control interno del contribuyente que expresa el folio del comprobante, acepta una cadena de caracteres.
     * 
     */
    @XmlAttribute(name = "Folio")
    protected String folio;
    /**
     * Atributo requerido para la expresión de la fecha y hora de expedición del Comprobante Fiscal Digital por Internet. Se expresa en la forma AAAA-MM-DDThh:mm:ss y debe corresponder con la hora local donde se expide el comprobante.
     * 
     */
    @XmlAttribute(name = "Fecha", required = true)
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    protected LocalDateTime fecha;
    /**
     * Atributo requerido para contener el sello digital del comprobante fiscal, al que hacen referencia las reglas de resolución miscelánea vigente. El sello debe ser expresado como una cadena de texto en formato Base 64.
     * 
     */
    @XmlAttribute(name = "Sello", required = true)
    protected String sello;
    /**
     * Atributo condicional para expresar la clave de la forma de pago de los bienes o servicios amparados por el comprobante.
     * 
     */
    @XmlAttribute(name = "FormaPago")
    protected CFormaPago formaPago;
    /**
     * Atributo requerido para expresar el número de serie del certificado de sello digital que ampara al comprobante, de acuerdo con el acuse correspondiente a 20 posiciones otorgado por el sistema del SAT.
     * 
     */
    @XmlAttribute(name = "NoCertificado", required = true)
    protected String noCertificado;
    /**
     * Atributo requerido que sirve para incorporar el certificado de sello digital que ampara al comprobante, como texto en formato base 64.
     * 
     */
    @XmlAttribute(name = "Certificado", required = true)
    protected String certificado;
    /**
     * Atributo condicional para expresar las condiciones comerciales aplicables para el pago del comprobante fiscal digital por Internet. Este atributo puede ser condicionado mediante atributos o complementos.
     * 
     */
    @XmlAttribute(name = "CondicionesDePago")
    protected String condicionesDePago;
    /**
     * Atributo requerido para representar la suma de los importes de los conceptos antes de descuentos e impuesto. No se permiten valores negativos.
     * 
     */
    @XmlAttribute(name = "SubTotal", required = true)
    protected BigDecimal subTotal;
    /**
     * Atributo condicional para representar el importe total de los descuentos aplicables antes de impuestos. No se permiten valores negativos. Se debe registrar cuando existan conceptos con descuento.
     * 
     */
    @XmlAttribute(name = "Descuento")
    protected BigDecimal descuento;
    /**
     * Atributo requerido para identificar la clave de la moneda utilizada para expresar los montos, cuando se usa moneda nacional se registra MXN. Conforme con la especificación ISO 4217.
     * 
     */
    @XmlAttribute(name = "Moneda", required = true)
    protected CMoneda moneda;
    /**
     * Atributo condicional para representar el tipo de cambio FIX conforme con la moneda usada. Es requerido cuando la clave de moneda es distinta de MXN y de XXX. El valor debe reflejar el número de pesos mexicanos que equivalen a una unidad de la divisa señalada en el atributo moneda. Si el valor está fuera del porcentaje aplicable a la moneda tomado del catálogo c_Moneda, el emisor debe obtener del PAC que vaya a timbrar el CFDI, de manera no automática, una clave de confirmación para ratificar que el valor es correcto e integrar dicha clave en el atributo Confirmacion.
     * 
     */
    @XmlAttribute(name = "TipoCambio")
    protected BigDecimal tipoCambio;
    /**
     * Atributo requerido para representar la suma del subtotal, menos los descuentos aplicables, más las contribuciones recibidas (impuestos trasladados - federales y/o locales, derechos, productos, aprovechamientos, aportaciones de seguridad social, contribuciones de mejoras) menos los impuestos retenidos federales y/o locales. Si el valor es superior al límite que establezca el SAT en la Resolución Miscelánea Fiscal vigente, el emisor debe obtener del PAC que vaya a timbrar el CFDI, de manera no automática, una clave de confirmación para ratificar que el valor es correcto e integrar dicha clave en el atributo Confirmacion. No se permiten valores negativos.
     * 
     */
    @XmlAttribute(name = "Total", required = true)
    protected BigDecimal total;
    /**
     * Atributo requerido para expresar la clave del efecto del comprobante fiscal para el contribuyente emisor.
     * 
     */
    @XmlAttribute(name = "TipoDeComprobante", required = true)
    protected CTipoDeComprobante tipoDeComprobante;
    /**
     * Atributo requerido para expresar si el comprobante ampara una operación de exportación.
     * 
     */
    @XmlAttribute(name = "Exportacion", required = true)
    protected CExportacion exportacion;
    /**
     * Atributo condicional para precisar la clave del método de pago que aplica para este comprobante fiscal digital por Internet, conforme al Artículo 29-A fracción VII incisos a y b del CFF.
     * 
     */
    @XmlAttribute(name = "MetodoPago")
    protected CMetodoPago metodoPago;
    /**
     * Atributo requerido para incorporar el código postal del lugar de expedición del comprobante (domicilio de la matriz o de la sucursal).
     * 
     */
    @XmlAttribute(name = "LugarExpedicion", required = true)
    protected String lugarExpedicion;
    /**
     * Atributo condicional para registrar la clave de confirmación que entregue el PAC para expedir el comprobante con importes grandes, con un tipo de cambio fuera del rango establecido o con ambos casos. Es requerido cuando se registra un tipo de cambio o un total fuera del rango establecido.
     * 
     */
    @XmlAttribute(name = "Confirmacion")
    protected String confirmacion;

    /**
     * Nodo condicional para precisar la información relacionada con el comprobante global.
     * 
     * @return
     *     possible object is
     *     {@link Comprobante.InformacionGlobal }
     *     
     */
    public Comprobante.InformacionGlobal getInformacionGlobal() {
        return informacionGlobal;
    }

    /**
     * Define el valor de la propiedad informacionGlobal.
     * 
     * @param value
     *     allowed object is
     *     {@link Comprobante.InformacionGlobal }
     *     
     * @see #getInformacionGlobal()
     */
    public void setInformacionGlobal(Comprobante.InformacionGlobal value) {
        this.informacionGlobal = value;
    }

    /**
     * Nodo opcional para precisar la información de los comprobantes relacionados.
     * 
     * Gets the value of the cfdiRelacionados property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cfdiRelacionados property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCfdiRelacionados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comprobante.CfdiRelacionados }
     * </p>
     * 
     * 
     * @return
     *     The value of the cfdiRelacionados property.
     */
    public List<Comprobante.CfdiRelacionados> getCfdiRelacionados() {
        if (cfdiRelacionados == null) {
            cfdiRelacionados = new ArrayList<>();
        }
        return this.cfdiRelacionados;
    }

    /**
     * Nodo requerido para expresar la información del contribuyente emisor del comprobante.
     * 
     * @return
     *     possible object is
     *     {@link Comprobante.Emisor }
     *     
     */
    public Comprobante.Emisor getEmisor() {
        return emisor;
    }

    /**
     * Define el valor de la propiedad emisor.
     * 
     * @param value
     *     allowed object is
     *     {@link Comprobante.Emisor }
     *     
     * @see #getEmisor()
     */
    public void setEmisor(Comprobante.Emisor value) {
        this.emisor = value;
    }

    /**
     * Nodo requerido para precisar la información del contribuyente receptor del comprobante.
     * 
     * @return
     *     possible object is
     *     {@link Comprobante.Receptor }
     *     
     */
    public Comprobante.Receptor getReceptor() {
        return receptor;
    }

    /**
     * Define el valor de la propiedad receptor.
     * 
     * @param value
     *     allowed object is
     *     {@link Comprobante.Receptor }
     *     
     * @see #getReceptor()
     */
    public void setReceptor(Comprobante.Receptor value) {
        this.receptor = value;
    }

    /**
     * Nodo requerido para listar los conceptos cubiertos por el comprobante.
     * 
     * @return
     *     possible object is
     *     {@link Comprobante.Conceptos }
     *     
     */
    public Comprobante.Conceptos getConceptos() {
        return conceptos;
    }

    /**
     * Define el valor de la propiedad conceptos.
     * 
     * @param value
     *     allowed object is
     *     {@link Comprobante.Conceptos }
     *     
     * @see #getConceptos()
     */
    public void setConceptos(Comprobante.Conceptos value) {
        this.conceptos = value;
    }

    /**
     * Nodo condicional para expresar el resumen de los impuestos aplicables.
     * 
     * @return
     *     possible object is
     *     {@link Comprobante.Impuestos }
     *     
     */
    public Comprobante.Impuestos getImpuestos() {
        return impuestos;
    }

    /**
     * Define el valor de la propiedad impuestos.
     * 
     * @param value
     *     allowed object is
     *     {@link Comprobante.Impuestos }
     *     
     * @see #getImpuestos()
     */
    public void setImpuestos(Comprobante.Impuestos value) {
        this.impuestos = value;
    }

    /**
     * Nodo opcional donde se incluye el complemento Timbre Fiscal Digital de manera obligatoria y los nodos complementarios determinados por el SAT, de acuerdo con las disposiciones particulares para un sector o actividad específica.
     * 
     * @return
     *     possible object is
     *     {@link Comprobante.Complemento }
     *     
     */
    public Comprobante.Complemento getComplemento() {
        return complemento;
    }

    /**
     * Define el valor de la propiedad complemento.
     * 
     * @param value
     *     allowed object is
     *     {@link Comprobante.Complemento }
     *     
     * @see #getComplemento()
     */
    public void setComplemento(Comprobante.Complemento value) {
        this.complemento = value;
    }

    /**
     * Nodo opcional para recibir las extensiones al presente formato que sean de utilidad al contribuyente. Para las reglas de uso del mismo, referirse al formato origen.
     * 
     * @return
     *     possible object is
     *     {@link Comprobante.Addenda }
     *     
     */
    public Comprobante.Addenda getAddenda() {
        return addenda;
    }

    /**
     * Define el valor de la propiedad addenda.
     * 
     * @param value
     *     allowed object is
     *     {@link Comprobante.Addenda }
     *     
     * @see #getAddenda()
     */
    public void setAddenda(Comprobante.Addenda value) {
        this.addenda = value;
    }

    /**
     * Atributo requerido con valor prefijado a 4.0 que indica la versión del estándar bajo el que se encuentra expresado el comprobante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "4.0";
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
     * Atributo opcional para precisar la serie para control interno del contribuyente. Este atributo acepta una cadena de caracteres.
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
     * Atributo opcional para control interno del contribuyente que expresa el folio del comprobante, acepta una cadena de caracteres.
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
     * Atributo requerido para la expresión de la fecha y hora de expedición del Comprobante Fiscal Digital por Internet. Se expresa en la forma AAAA-MM-DDThh:mm:ss y debe corresponder con la hora local donde se expide el comprobante.
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
     * Atributo requerido para contener el sello digital del comprobante fiscal, al que hacen referencia las reglas de resolución miscelánea vigente. El sello debe ser expresado como una cadena de texto en formato Base 64.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSello() {
        return sello;
    }

    /**
     * Define el valor de la propiedad sello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSello()
     */
    public void setSello(String value) {
        this.sello = value;
    }

    /**
     * Atributo condicional para expresar la clave de la forma de pago de los bienes o servicios amparados por el comprobante.
     * 
     * @return
     *     possible object is
     *     {@link CFormaPago }
     *     
     */
    public CFormaPago getFormaPago() {
        return formaPago;
    }

    /**
     * Define el valor de la propiedad formaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link CFormaPago }
     *     
     * @see #getFormaPago()
     */
    public void setFormaPago(CFormaPago value) {
        this.formaPago = value;
    }

    /**
     * Atributo requerido para expresar el número de serie del certificado de sello digital que ampara al comprobante, de acuerdo con el acuse correspondiente a 20 posiciones otorgado por el sistema del SAT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoCertificado() {
        return noCertificado;
    }

    /**
     * Define el valor de la propiedad noCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNoCertificado()
     */
    public void setNoCertificado(String value) {
        this.noCertificado = value;
    }

    /**
     * Atributo requerido que sirve para incorporar el certificado de sello digital que ampara al comprobante, como texto en formato base 64.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificado() {
        return certificado;
    }

    /**
     * Define el valor de la propiedad certificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCertificado()
     */
    public void setCertificado(String value) {
        this.certificado = value;
    }

    /**
     * Atributo condicional para expresar las condiciones comerciales aplicables para el pago del comprobante fiscal digital por Internet. Este atributo puede ser condicionado mediante atributos o complementos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondicionesDePago() {
        return condicionesDePago;
    }

    /**
     * Define el valor de la propiedad condicionesDePago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCondicionesDePago()
     */
    public void setCondicionesDePago(String value) {
        this.condicionesDePago = value;
    }

    /**
     * Atributo requerido para representar la suma de los importes de los conceptos antes de descuentos e impuesto. No se permiten valores negativos.
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
     * Atributo condicional para representar el importe total de los descuentos aplicables antes de impuestos. No se permiten valores negativos. Se debe registrar cuando existan conceptos con descuento.
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

    /**
     * Atributo requerido para identificar la clave de la moneda utilizada para expresar los montos, cuando se usa moneda nacional se registra MXN. Conforme con la especificación ISO 4217.
     * 
     * @return
     *     possible object is
     *     {@link CMoneda }
     *     
     */
    public CMoneda getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     * @param value
     *     allowed object is
     *     {@link CMoneda }
     *     
     * @see #getMoneda()
     */
    public void setMoneda(CMoneda value) {
        this.moneda = value;
    }

    /**
     * Atributo condicional para representar el tipo de cambio FIX conforme con la moneda usada. Es requerido cuando la clave de moneda es distinta de MXN y de XXX. El valor debe reflejar el número de pesos mexicanos que equivalen a una unidad de la divisa señalada en el atributo moneda. Si el valor está fuera del porcentaje aplicable a la moneda tomado del catálogo c_Moneda, el emisor debe obtener del PAC que vaya a timbrar el CFDI, de manera no automática, una clave de confirmación para ratificar que el valor es correcto e integrar dicha clave en el atributo Confirmacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTipoCambio() {
        return tipoCambio;
    }

    /**
     * Define el valor de la propiedad tipoCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTipoCambio()
     */
    public void setTipoCambio(BigDecimal value) {
        this.tipoCambio = value;
    }

    /**
     * Atributo requerido para representar la suma del subtotal, menos los descuentos aplicables, más las contribuciones recibidas (impuestos trasladados - federales y/o locales, derechos, productos, aprovechamientos, aportaciones de seguridad social, contribuciones de mejoras) menos los impuestos retenidos federales y/o locales. Si el valor es superior al límite que establezca el SAT en la Resolución Miscelánea Fiscal vigente, el emisor debe obtener del PAC que vaya a timbrar el CFDI, de manera no automática, una clave de confirmación para ratificar que el valor es correcto e integrar dicha clave en el atributo Confirmacion. No se permiten valores negativos.
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
     * Atributo requerido para expresar la clave del efecto del comprobante fiscal para el contribuyente emisor.
     * 
     * @return
     *     possible object is
     *     {@link CTipoDeComprobante }
     *     
     */
    public CTipoDeComprobante getTipoDeComprobante() {
        return tipoDeComprobante;
    }

    /**
     * Define el valor de la propiedad tipoDeComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link CTipoDeComprobante }
     *     
     * @see #getTipoDeComprobante()
     */
    public void setTipoDeComprobante(CTipoDeComprobante value) {
        this.tipoDeComprobante = value;
    }

    /**
     * Atributo requerido para expresar si el comprobante ampara una operación de exportación.
     * 
     * @return
     *     possible object is
     *     {@link CExportacion }
     *     
     */
    public CExportacion getExportacion() {
        return exportacion;
    }

    /**
     * Define el valor de la propiedad exportacion.
     * 
     * @param value
     *     allowed object is
     *     {@link CExportacion }
     *     
     * @see #getExportacion()
     */
    public void setExportacion(CExportacion value) {
        this.exportacion = value;
    }

    /**
     * Atributo condicional para precisar la clave del método de pago que aplica para este comprobante fiscal digital por Internet, conforme al Artículo 29-A fracción VII incisos a y b del CFF.
     * 
     * @return
     *     possible object is
     *     {@link CMetodoPago }
     *     
     */
    public CMetodoPago getMetodoPago() {
        return metodoPago;
    }

    /**
     * Define el valor de la propiedad metodoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link CMetodoPago }
     *     
     * @see #getMetodoPago()
     */
    public void setMetodoPago(CMetodoPago value) {
        this.metodoPago = value;
    }

    /**
     * Atributo requerido para incorporar el código postal del lugar de expedición del comprobante (domicilio de la matriz o de la sucursal).
     * 
     * @return
     *     possible object is
     *     {@link CCodigoPostal }
     *     
     */
    public String getLugarExpedicion() {
        return lugarExpedicion;
    }

    /**
     * Define el valor de la propiedad lugarExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link CCodigoPostal }
     *     
     * @see #getLugarExpedicion()
     */
    public void setLugarExpedicion(String value) {
        this.lugarExpedicion = value;
    }

    /**
     * Atributo condicional para registrar la clave de confirmación que entregue el PAC para expedir el comprobante con importes grandes, con un tipo de cambio fuera del rango establecido o con ambos casos. Es requerido cuando se registra un tipo de cambio o un total fuera del rango establecido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmacion() {
        return confirmacion;
    }

    /**
     * Define el valor de la propiedad confirmacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getConfirmacion()
     */
    public void setConfirmacion(String value) {
        this.confirmacion = value;
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
     *         <any maxOccurs="unbounded"/>
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
        "any"
    })
    public static class Addenda {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * </p>
         * 
         * 
         * @return
         *     The value of the any property.
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<>();
            }
            return this.any;
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
     *         <element name="CfdiRelacionado" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <attribute name="UUID" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <length value="36"/>
     *                       <whiteSpace value="collapse"/>
     *                       <pattern value="[a-f0-9A-F]{8}-[a-f0-9A-F]{4}-[a-f0-9A-F]{4}-[a-f0-9A-F]{4}-[a-f0-9A-F]{12}"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *       <attribute name="TipoRelacion" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoRelacion" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cfdiRelacionado"
    })
    public static class CfdiRelacionados {

        /**
         * Nodo requerido para precisar la información de los comprobantes relacionados.
         * 
         */
        @XmlElement(name = "CfdiRelacionado", required = true)
        protected List<Comprobante.CfdiRelacionados.CfdiRelacionado> cfdiRelacionado;
        /**
         * Atributo requerido para indicar la clave de la relación que existe entre éste que se está generando y el o los CFDI previos.
         * 
         */
        @XmlAttribute(name = "TipoRelacion", required = true)
        protected CTipoRelacion tipoRelacion;

        /**
         * Nodo requerido para precisar la información de los comprobantes relacionados.
         * 
         * Gets the value of the cfdiRelacionado property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cfdiRelacionado property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getCfdiRelacionado().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Comprobante.CfdiRelacionados.CfdiRelacionado }
         * </p>
         * 
         * 
         * @return
         *     The value of the cfdiRelacionado property.
         */
        public List<Comprobante.CfdiRelacionados.CfdiRelacionado> getCfdiRelacionado() {
            if (cfdiRelacionado == null) {
                cfdiRelacionado = new ArrayList<>();
            }
            return this.cfdiRelacionado;
        }

        /**
         * Atributo requerido para indicar la clave de la relación que existe entre éste que se está generando y el o los CFDI previos.
         * 
         * @return
         *     possible object is
         *     {@link CTipoRelacion }
         *     
         */
        public CTipoRelacion getTipoRelacion() {
            return tipoRelacion;
        }

        /**
         * Define el valor de la propiedad tipoRelacion.
         * 
         * @param value
         *     allowed object is
         *     {@link CTipoRelacion }
         *     
         * @see #getTipoRelacion()
         */
        public void setTipoRelacion(CTipoRelacion value) {
            this.tipoRelacion = value;
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
         *       <attribute name="UUID" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <length value="36"/>
         *             <whiteSpace value="collapse"/>
         *             <pattern value="[a-f0-9A-F]{8}-[a-f0-9A-F]{4}-[a-f0-9A-F]{4}-[a-f0-9A-F]{4}-[a-f0-9A-F]{12}"/>
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
        public static class CfdiRelacionado {

            /**
             * Atributo requerido para registrar el folio fiscal (UUID) de un CFDI relacionado con el presente comprobante, por ejemplo: Si el CFDI relacionado es un comprobante de traslado que sirve para registrar el movimiento de la mercancía. Si este comprobante se usa como nota de crédito o nota de débito del comprobante relacionado. Si este comprobante es una devolución sobre el comprobante relacionado. Si éste sustituye a una factura cancelada.
             * 
             */
            @XmlAttribute(name = "UUID", required = true)
            protected String uuid;

            /**
             * Atributo requerido para registrar el folio fiscal (UUID) de un CFDI relacionado con el presente comprobante, por ejemplo: Si el CFDI relacionado es un comprobante de traslado que sirve para registrar el movimiento de la mercancía. Si este comprobante se usa como nota de crédito o nota de débito del comprobante relacionado. Si este comprobante es una devolución sobre el comprobante relacionado. Si éste sustituye a una factura cancelada.
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
     *         <any maxOccurs="unbounded" minOccurs="0"/>
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
        "any"
    })
    public static class Complemento {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * </p>
         * 
         * 
         * @return
         *     The value of the any property.
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<>();
            }
            return this.any;
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
     *         <element name="Concepto" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Impuestos" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="Traslados" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="Traslado" maxOccurs="unbounded">
     *                                         <complexType>
     *                                           <complexContent>
     *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               <attribute name="Base" use="required">
     *                                                 <simpleType>
     *                                                   <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                                     <fractionDigits value="6"/>
     *                                                     <minInclusive value="0.000001"/>
     *                                                     <whiteSpace value="collapse"/>
     *                                                   </restriction>
     *                                                 </simpleType>
     *                                               </attribute>
     *                                               <attribute name="Impuesto" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
     *                                               <attribute name="TipoFactor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
     *                                               <attribute name="TasaOCuota">
     *                                                 <simpleType>
     *                                                   <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                                     <fractionDigits value="6"/>
     *                                                     <minInclusive value="0.000000"/>
     *                                                     <whiteSpace value="collapse"/>
     *                                                   </restriction>
     *                                                 </simpleType>
     *                                               </attribute>
     *                                               <attribute name="Importe" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
     *                                             </restriction>
     *                                           </complexContent>
     *                                         </complexType>
     *                                       </element>
     *                                     </sequence>
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                             <element name="Retenciones" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="Retencion" maxOccurs="unbounded">
     *                                         <complexType>
     *                                           <complexContent>
     *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               <attribute name="Base" use="required">
     *                                                 <simpleType>
     *                                                   <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                                     <fractionDigits value="6"/>
     *                                                     <minInclusive value="0.000001"/>
     *                                                     <whiteSpace value="collapse"/>
     *                                                   </restriction>
     *                                                 </simpleType>
     *                                               </attribute>
     *                                               <attribute name="Impuesto" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
     *                                               <attribute name="TipoFactor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
     *                                               <attribute name="TasaOCuota" use="required">
     *                                                 <simpleType>
     *                                                   <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                                     <whiteSpace value="collapse"/>
     *                                                     <minInclusive value="0.000000"/>
     *                                                     <fractionDigits value="6"/>
     *                                                   </restriction>
     *                                                 </simpleType>
     *                                               </attribute>
     *                                               <attribute name="Importe" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
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
     *                   <element name="ACuentaTerceros" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <attribute name="RfcACuentaTerceros" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC" />
     *                           <attribute name="NombreACuentaTerceros" use="required">
     *                             <simpleType>
     *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 <minLength value="1"/>
     *                                 <maxLength value="300"/>
     *                                 <whiteSpace value="collapse"/>
     *                                 <pattern value="[^|]{1,300}"/>
     *                               </restriction>
     *                             </simpleType>
     *                           </attribute>
     *                           <attribute name="RegimenFiscalACuentaTerceros" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_RegimenFiscal" />
     *                           <attribute name="DomicilioFiscalACuentaTerceros" use="required">
     *                             <simpleType>
     *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 <length value="5"/>
     *                                 <whiteSpace value="collapse"/>
     *                                 <pattern value="[0-9]{5}"/>
     *                               </restriction>
     *                             </simpleType>
     *                           </attribute>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="InformacionAduanera" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <attribute name="NumeroPedimento" use="required">
     *                             <simpleType>
     *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 <length value="21"/>
     *                                 <pattern value="[0-9]{2}  [0-9]{2}  [0-9]{4}  [0-9]{7}"/>
     *                               </restriction>
     *                             </simpleType>
     *                           </attribute>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="CuentaPredial" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <attribute name="Numero" use="required">
     *                             <simpleType>
     *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 <minLength value="1"/>
     *                                 <maxLength value="150"/>
     *                                 <whiteSpace value="collapse"/>
     *                                 <pattern value="[0-9a-zA-Z]{1,150}"/>
     *                               </restriction>
     *                             </simpleType>
     *                           </attribute>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="ComplementoConcepto" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <any maxOccurs="unbounded"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="Parte" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="InformacionAduanera" maxOccurs="unbounded" minOccurs="0">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <attribute name="NumeroPedimento" use="required">
     *                                       <simpleType>
     *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           <length value="21"/>
     *                                           <pattern value="[0-9]{2}  [0-9]{2}  [0-9]{4}  [0-9]{7}"/>
     *                                         </restriction>
     *                                       </simpleType>
     *                                     </attribute>
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                           </sequence>
     *                           <attribute name="ClaveProdServ" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_ClaveProdServ" />
     *                           <attribute name="NoIdentificacion">
     *                             <simpleType>
     *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 <minLength value="1"/>
     *                                 <maxLength value="100"/>
     *                                 <whiteSpace value="collapse"/>
     *                                 <pattern value="[^|]{1,100}"/>
     *                               </restriction>
     *                             </simpleType>
     *                           </attribute>
     *                           <attribute name="Cantidad" use="required">
     *                             <simpleType>
     *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                 <fractionDigits value="6"/>
     *                                 <minInclusive value="0.000001"/>
     *                                 <whiteSpace value="collapse"/>
     *                               </restriction>
     *                             </simpleType>
     *                           </attribute>
     *                           <attribute name="Unidad">
     *                             <simpleType>
     *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 <minLength value="1"/>
     *                                 <maxLength value="20"/>
     *                                 <whiteSpace value="collapse"/>
     *                                 <pattern value="[^|]{1,20}"/>
     *                               </restriction>
     *                             </simpleType>
     *                           </attribute>
     *                           <attribute name="Descripcion" use="required">
     *                             <simpleType>
     *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 <minLength value="1"/>
     *                                 <maxLength value="1000"/>
     *                                 <whiteSpace value="collapse"/>
     *                                 <pattern value="[^|]{1,1000}"/>
     *                               </restriction>
     *                             </simpleType>
     *                           </attribute>
     *                           <attribute name="ValorUnitario" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
     *                           <attribute name="Importe" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                 </sequence>
     *                 <attribute name="ClaveProdServ" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_ClaveProdServ" />
     *                 <attribute name="NoIdentificacion">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <whiteSpace value="collapse"/>
     *                       <minLength value="1"/>
     *                       <maxLength value="100"/>
     *                       <pattern value="[^|]{1,100}"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="Cantidad" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                       <fractionDigits value="6"/>
     *                       <minInclusive value="0.000001"/>
     *                       <whiteSpace value="collapse"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="ClaveUnidad" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_ClaveUnidad" />
     *                 <attribute name="Unidad">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <minLength value="1"/>
     *                       <maxLength value="20"/>
     *                       <whiteSpace value="collapse"/>
     *                       <pattern value="[^|]{1,20}"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="Descripcion" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <minLength value="1"/>
     *                       <maxLength value="1000"/>
     *                       <whiteSpace value="collapse"/>
     *                       <pattern value="[^|]{1,1000}"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="ValorUnitario" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
     *                 <attribute name="Importe" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
     *                 <attribute name="Descuento" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
     *                 <attribute name="ObjetoImp" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_ObjetoImp" />
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
        "concepto"
    })
    public static class Conceptos {

        /**
         * Nodo requerido para registrar la información detallada de un bien o servicio amparado en el comprobante.
         * 
         */
        @XmlElement(name = "Concepto", required = true)
        protected List<Comprobante.Conceptos.Concepto> concepto;

        /**
         * Nodo requerido para registrar la información detallada de un bien o servicio amparado en el comprobante.
         * 
         * Gets the value of the concepto property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the concepto property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getConcepto().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Comprobante.Conceptos.Concepto }
         * </p>
         * 
         * 
         * @return
         *     The value of the concepto property.
         */
        public List<Comprobante.Conceptos.Concepto> getConcepto() {
            if (concepto == null) {
                concepto = new ArrayList<>();
            }
            return this.concepto;
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
         *         <element name="Impuestos" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="Traslados" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="Traslado" maxOccurs="unbounded">
         *                               <complexType>
         *                                 <complexContent>
         *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     <attribute name="Base" use="required">
         *                                       <simpleType>
         *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                           <fractionDigits value="6"/>
         *                                           <minInclusive value="0.000001"/>
         *                                           <whiteSpace value="collapse"/>
         *                                         </restriction>
         *                                       </simpleType>
         *                                     </attribute>
         *                                     <attribute name="Impuesto" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
         *                                     <attribute name="TipoFactor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
         *                                     <attribute name="TasaOCuota">
         *                                       <simpleType>
         *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                           <fractionDigits value="6"/>
         *                                           <minInclusive value="0.000000"/>
         *                                           <whiteSpace value="collapse"/>
         *                                         </restriction>
         *                                       </simpleType>
         *                                     </attribute>
         *                                     <attribute name="Importe" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
         *                                   </restriction>
         *                                 </complexContent>
         *                               </complexType>
         *                             </element>
         *                           </sequence>
         *                         </restriction>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                   <element name="Retenciones" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="Retencion" maxOccurs="unbounded">
         *                               <complexType>
         *                                 <complexContent>
         *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     <attribute name="Base" use="required">
         *                                       <simpleType>
         *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                           <fractionDigits value="6"/>
         *                                           <minInclusive value="0.000001"/>
         *                                           <whiteSpace value="collapse"/>
         *                                         </restriction>
         *                                       </simpleType>
         *                                     </attribute>
         *                                     <attribute name="Impuesto" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
         *                                     <attribute name="TipoFactor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
         *                                     <attribute name="TasaOCuota" use="required">
         *                                       <simpleType>
         *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                           <whiteSpace value="collapse"/>
         *                                           <minInclusive value="0.000000"/>
         *                                           <fractionDigits value="6"/>
         *                                         </restriction>
         *                                       </simpleType>
         *                                     </attribute>
         *                                     <attribute name="Importe" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
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
         *         <element name="ACuentaTerceros" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <attribute name="RfcACuentaTerceros" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC" />
         *                 <attribute name="NombreACuentaTerceros" use="required">
         *                   <simpleType>
         *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       <minLength value="1"/>
         *                       <maxLength value="300"/>
         *                       <whiteSpace value="collapse"/>
         *                       <pattern value="[^|]{1,300}"/>
         *                     </restriction>
         *                   </simpleType>
         *                 </attribute>
         *                 <attribute name="RegimenFiscalACuentaTerceros" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_RegimenFiscal" />
         *                 <attribute name="DomicilioFiscalACuentaTerceros" use="required">
         *                   <simpleType>
         *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       <length value="5"/>
         *                       <whiteSpace value="collapse"/>
         *                       <pattern value="[0-9]{5}"/>
         *                     </restriction>
         *                   </simpleType>
         *                 </attribute>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="InformacionAduanera" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <attribute name="NumeroPedimento" use="required">
         *                   <simpleType>
         *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       <length value="21"/>
         *                       <pattern value="[0-9]{2}  [0-9]{2}  [0-9]{4}  [0-9]{7}"/>
         *                     </restriction>
         *                   </simpleType>
         *                 </attribute>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="CuentaPredial" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <attribute name="Numero" use="required">
         *                   <simpleType>
         *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       <minLength value="1"/>
         *                       <maxLength value="150"/>
         *                       <whiteSpace value="collapse"/>
         *                       <pattern value="[0-9a-zA-Z]{1,150}"/>
         *                     </restriction>
         *                   </simpleType>
         *                 </attribute>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="ComplementoConcepto" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <any maxOccurs="unbounded"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="Parte" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="InformacionAduanera" maxOccurs="unbounded" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <attribute name="NumeroPedimento" use="required">
         *                             <simpleType>
         *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 <length value="21"/>
         *                                 <pattern value="[0-9]{2}  [0-9]{2}  [0-9]{4}  [0-9]{7}"/>
         *                               </restriction>
         *                             </simpleType>
         *                           </attribute>
         *                         </restriction>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                 </sequence>
         *                 <attribute name="ClaveProdServ" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_ClaveProdServ" />
         *                 <attribute name="NoIdentificacion">
         *                   <simpleType>
         *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       <minLength value="1"/>
         *                       <maxLength value="100"/>
         *                       <whiteSpace value="collapse"/>
         *                       <pattern value="[^|]{1,100}"/>
         *                     </restriction>
         *                   </simpleType>
         *                 </attribute>
         *                 <attribute name="Cantidad" use="required">
         *                   <simpleType>
         *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                       <fractionDigits value="6"/>
         *                       <minInclusive value="0.000001"/>
         *                       <whiteSpace value="collapse"/>
         *                     </restriction>
         *                   </simpleType>
         *                 </attribute>
         *                 <attribute name="Unidad">
         *                   <simpleType>
         *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       <minLength value="1"/>
         *                       <maxLength value="20"/>
         *                       <whiteSpace value="collapse"/>
         *                       <pattern value="[^|]{1,20}"/>
         *                     </restriction>
         *                   </simpleType>
         *                 </attribute>
         *                 <attribute name="Descripcion" use="required">
         *                   <simpleType>
         *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       <minLength value="1"/>
         *                       <maxLength value="1000"/>
         *                       <whiteSpace value="collapse"/>
         *                       <pattern value="[^|]{1,1000}"/>
         *                     </restriction>
         *                   </simpleType>
         *                 </attribute>
         *                 <attribute name="ValorUnitario" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
         *                 <attribute name="Importe" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *       </sequence>
         *       <attribute name="ClaveProdServ" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_ClaveProdServ" />
         *       <attribute name="NoIdentificacion">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <whiteSpace value="collapse"/>
         *             <minLength value="1"/>
         *             <maxLength value="100"/>
         *             <pattern value="[^|]{1,100}"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="Cantidad" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *             <fractionDigits value="6"/>
         *             <minInclusive value="0.000001"/>
         *             <whiteSpace value="collapse"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="ClaveUnidad" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_ClaveUnidad" />
         *       <attribute name="Unidad">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <minLength value="1"/>
         *             <maxLength value="20"/>
         *             <whiteSpace value="collapse"/>
         *             <pattern value="[^|]{1,20}"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="Descripcion" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <minLength value="1"/>
         *             <maxLength value="1000"/>
         *             <whiteSpace value="collapse"/>
         *             <pattern value="[^|]{1,1000}"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="ValorUnitario" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
         *       <attribute name="Importe" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
         *       <attribute name="Descuento" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
         *       <attribute name="ObjetoImp" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_ObjetoImp" />
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "impuestos",
            "aCuentaTerceros",
            "informacionAduanera",
            "cuentaPredial",
            "complementoConcepto",
            "parte"
        })
        public static class Concepto {

            /**
             * Nodo condicional para capturar los impuestos aplicables al presente concepto.
             * 
             */
            @XmlElement(name = "Impuestos")
            protected Comprobante.Conceptos.Concepto.Impuestos impuestos;
            /**
             * Nodo opcional para registrar información del contribuyente Tercero, a cuenta del que se realiza la operación.
             * 
             */
            @XmlElement(name = "ACuentaTerceros")
            protected Comprobante.Conceptos.Concepto.ACuentaTerceros aCuentaTerceros;
            /**
             * Nodo opcional para introducir la información aduanera aplicable cuando se trate de ventas de primera mano de mercancías importadas o se trate de operaciones de comercio exterior con bienes o servicios.
             * 
             */
            @XmlElement(name = "InformacionAduanera")
            protected List<Comprobante.Conceptos.Concepto.InformacionAduanera> informacionAduanera;
            /**
             * Nodo opcional para asentar el número de cuenta predial con el que fue registrado el inmueble, en el sistema catastral de la entidad federativa de que trate, o bien para incorporar los datos de identificación del certificado de participación inmobiliaria no amortizable.
             * 
             */
            @XmlElement(name = "CuentaPredial")
            protected List<Comprobante.Conceptos.Concepto.CuentaPredial> cuentaPredial;
            /**
             * Nodo opcional donde se incluyen los nodos complementarios de extensión al concepto definidos por el SAT, de acuerdo con las disposiciones particulares para un sector o actividad específica.
             * 
             */
            @XmlElement(name = "ComplementoConcepto")
            protected Comprobante.Conceptos.Concepto.ComplementoConcepto complementoConcepto;
            /**
             * Nodo opcional para expresar las partes o componentes que integran la totalidad del concepto expresado en el comprobante fiscal digital por Internet.
             * 
             */
            @XmlElement(name = "Parte")
            protected List<Comprobante.Conceptos.Concepto.Parte> parte;
            /**
             * Atributo requerido para expresar la clave del producto o del servicio amparado por el presente concepto. Es requerido y deben utilizar las claves del catálogo de productos y servicios, cuando los conceptos que registren por sus actividades correspondan con dichos conceptos.
             * 
             */
            @XmlAttribute(name = "ClaveProdServ", required = true)
            protected String claveProdServ;
            /**
             * Atributo opcional para expresar el número de parte, identificador del producto o del servicio, la clave de producto o servicio, SKU o equivalente, propia de la operación del emisor, amparado por el presente concepto. Opcionalmente se puede utilizar claves del estándar GTIN.
             * 
             */
            @XmlAttribute(name = "NoIdentificacion")
            protected String noIdentificacion;
            /**
             * Atributo requerido para precisar la cantidad de bienes o servicios del tipo particular definido por el presente concepto.
             * 
             */
            @XmlAttribute(name = "Cantidad", required = true)
            protected BigDecimal cantidad;
            /**
             * Atributo requerido para precisar la clave de unidad de medida estandarizada aplicable para la cantidad expresada en el concepto. La unidad debe corresponder con la descripción del concepto.
             * 
             */
            @XmlAttribute(name = "ClaveUnidad", required = true)
            protected CClaveUnidad claveUnidad;
            /**
             * Atributo opcional para precisar la unidad de medida propia de la operación del emisor, aplicable para la cantidad expresada en el concepto. La unidad debe corresponder con la descripción del concepto.
             * 
             */
            @XmlAttribute(name = "Unidad")
            protected String unidad;
            /**
             * Atributo requerido para precisar la descripción del bien o servicio cubierto por el presente concepto.
             * 
             */
            @XmlAttribute(name = "Descripcion", required = true)
            protected String descripcion;
            /**
             * Atributo requerido para precisar el valor o precio unitario del bien o servicio cubierto por el presente concepto.
             * 
             */
            @XmlAttribute(name = "ValorUnitario", required = true)
            protected BigDecimal valorUnitario;
            /**
             * Atributo requerido para precisar el importe total de los bienes o servicios del presente concepto. Debe ser equivalente al resultado de multiplicar la cantidad por el valor unitario expresado en el concepto. No se permiten valores negativos.
             * 
             */
            @XmlAttribute(name = "Importe", required = true)
            protected BigDecimal importe;
            /**
             * Atributo opcional para representar el importe de los descuentos aplicables al concepto. No se permiten valores negativos.
             * 
             */
            @XmlAttribute(name = "Descuento")
            protected BigDecimal descuento;
            /**
             * Atributo requerido para expresar si la operación comercial es objeto o no de impuesto.
             * 
             */
            @XmlAttribute(name = "ObjetoImp", required = true)
            protected CObjetoImp objetoImp;

            /**
             * Nodo condicional para capturar los impuestos aplicables al presente concepto.
             * 
             * @return
             *     possible object is
             *     {@link Comprobante.Conceptos.Concepto.Impuestos }
             *     
             */
            public Comprobante.Conceptos.Concepto.Impuestos getImpuestos() {
                return impuestos;
            }

            /**
             * Define el valor de la propiedad impuestos.
             * 
             * @param value
             *     allowed object is
             *     {@link Comprobante.Conceptos.Concepto.Impuestos }
             *     
             * @see #getImpuestos()
             */
            public void setImpuestos(Comprobante.Conceptos.Concepto.Impuestos value) {
                this.impuestos = value;
            }

            /**
             * Nodo opcional para registrar información del contribuyente Tercero, a cuenta del que se realiza la operación.
             * 
             * @return
             *     possible object is
             *     {@link Comprobante.Conceptos.Concepto.ACuentaTerceros }
             *     
             */
            public Comprobante.Conceptos.Concepto.ACuentaTerceros getACuentaTerceros() {
                return aCuentaTerceros;
            }

            /**
             * Define el valor de la propiedad aCuentaTerceros.
             * 
             * @param value
             *     allowed object is
             *     {@link Comprobante.Conceptos.Concepto.ACuentaTerceros }
             *     
             * @see #getACuentaTerceros()
             */
            public void setACuentaTerceros(Comprobante.Conceptos.Concepto.ACuentaTerceros value) {
                this.aCuentaTerceros = value;
            }

            /**
             * Nodo opcional para introducir la información aduanera aplicable cuando se trate de ventas de primera mano de mercancías importadas o se trate de operaciones de comercio exterior con bienes o servicios.
             * 
             * Gets the value of the informacionAduanera property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the informacionAduanera property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getInformacionAduanera().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Comprobante.Conceptos.Concepto.InformacionAduanera }
             * </p>
             * 
             * 
             * @return
             *     The value of the informacionAduanera property.
             */
            public List<Comprobante.Conceptos.Concepto.InformacionAduanera> getInformacionAduanera() {
                if (informacionAduanera == null) {
                    informacionAduanera = new ArrayList<>();
                }
                return this.informacionAduanera;
            }

            /**
             * Nodo opcional para asentar el número de cuenta predial con el que fue registrado el inmueble, en el sistema catastral de la entidad federativa de que trate, o bien para incorporar los datos de identificación del certificado de participación inmobiliaria no amortizable.
             * 
             * Gets the value of the cuentaPredial property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cuentaPredial property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getCuentaPredial().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Comprobante.Conceptos.Concepto.CuentaPredial }
             * </p>
             * 
             * 
             * @return
             *     The value of the cuentaPredial property.
             */
            public List<Comprobante.Conceptos.Concepto.CuentaPredial> getCuentaPredial() {
                if (cuentaPredial == null) {
                    cuentaPredial = new ArrayList<>();
                }
                return this.cuentaPredial;
            }

            /**
             * Nodo opcional donde se incluyen los nodos complementarios de extensión al concepto definidos por el SAT, de acuerdo con las disposiciones particulares para un sector o actividad específica.
             * 
             * @return
             *     possible object is
             *     {@link Comprobante.Conceptos.Concepto.ComplementoConcepto }
             *     
             */
            public Comprobante.Conceptos.Concepto.ComplementoConcepto getComplementoConcepto() {
                return complementoConcepto;
            }

            /**
             * Define el valor de la propiedad complementoConcepto.
             * 
             * @param value
             *     allowed object is
             *     {@link Comprobante.Conceptos.Concepto.ComplementoConcepto }
             *     
             * @see #getComplementoConcepto()
             */
            public void setComplementoConcepto(Comprobante.Conceptos.Concepto.ComplementoConcepto value) {
                this.complementoConcepto = value;
            }

            /**
             * Nodo opcional para expresar las partes o componentes que integran la totalidad del concepto expresado en el comprobante fiscal digital por Internet.
             * 
             * Gets the value of the parte property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the parte property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getParte().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Comprobante.Conceptos.Concepto.Parte }
             * </p>
             * 
             * 
             * @return
             *     The value of the parte property.
             */
            public List<Comprobante.Conceptos.Concepto.Parte> getParte() {
                if (parte == null) {
                    parte = new ArrayList<>();
                }
                return this.parte;
            }

            /**
             * Atributo requerido para expresar la clave del producto o del servicio amparado por el presente concepto. Es requerido y deben utilizar las claves del catálogo de productos y servicios, cuando los conceptos que registren por sus actividades correspondan con dichos conceptos.
             * 
             * @return
             *     possible object is
             *     {@link CClaveProdServ }
             *     
             */
            public String getClaveProdServ() {
                return claveProdServ;
            }

            /**
             * Define el valor de la propiedad claveProdServ.
             * 
             * @param value
             *     allowed object is
             *     {@link CClaveProdServ }
             *     
             * @see #getClaveProdServ()
             */
            public void setClaveProdServ(String value) {
                this.claveProdServ = value;
            }

            /**
             * Atributo opcional para expresar el número de parte, identificador del producto o del servicio, la clave de producto o servicio, SKU o equivalente, propia de la operación del emisor, amparado por el presente concepto. Opcionalmente se puede utilizar claves del estándar GTIN.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNoIdentificacion() {
                return noIdentificacion;
            }

            /**
             * Define el valor de la propiedad noIdentificacion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getNoIdentificacion()
             */
            public void setNoIdentificacion(String value) {
                this.noIdentificacion = value;
            }

            /**
             * Atributo requerido para precisar la cantidad de bienes o servicios del tipo particular definido por el presente concepto.
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
             * Atributo requerido para precisar la clave de unidad de medida estandarizada aplicable para la cantidad expresada en el concepto. La unidad debe corresponder con la descripción del concepto.
             * 
             * @return
             *     possible object is
             *     {@link CClaveUnidad }
             *     
             */
            public CClaveUnidad getClaveUnidad() {
                return claveUnidad;
            }

            /**
             * Define el valor de la propiedad claveUnidad.
             * 
             * @param value
             *     allowed object is
             *     {@link CClaveUnidad }
             *     
             * @see #getClaveUnidad()
             */
            public void setClaveUnidad(CClaveUnidad value) {
                this.claveUnidad = value;
            }

            /**
             * Atributo opcional para precisar la unidad de medida propia de la operación del emisor, aplicable para la cantidad expresada en el concepto. La unidad debe corresponder con la descripción del concepto.
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
             * Atributo requerido para precisar la descripción del bien o servicio cubierto por el presente concepto.
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
             * Atributo requerido para precisar el valor o precio unitario del bien o servicio cubierto por el presente concepto.
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
             * Atributo requerido para precisar el importe total de los bienes o servicios del presente concepto. Debe ser equivalente al resultado de multiplicar la cantidad por el valor unitario expresado en el concepto. No se permiten valores negativos.
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
             * Atributo opcional para representar el importe de los descuentos aplicables al concepto. No se permiten valores negativos.
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

            /**
             * Atributo requerido para expresar si la operación comercial es objeto o no de impuesto.
             * 
             * @return
             *     possible object is
             *     {@link CObjetoImp }
             *     
             */
            public CObjetoImp getObjetoImp() {
                return objetoImp;
            }

            /**
             * Define el valor de la propiedad objetoImp.
             * 
             * @param value
             *     allowed object is
             *     {@link CObjetoImp }
             *     
             * @see #getObjetoImp()
             */
            public void setObjetoImp(CObjetoImp value) {
                this.objetoImp = value;
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
             *       <attribute name="RfcACuentaTerceros" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC" />
             *       <attribute name="NombreACuentaTerceros" use="required">
             *         <simpleType>
             *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             <minLength value="1"/>
             *             <maxLength value="300"/>
             *             <whiteSpace value="collapse"/>
             *             <pattern value="[^|]{1,300}"/>
             *           </restriction>
             *         </simpleType>
             *       </attribute>
             *       <attribute name="RegimenFiscalACuentaTerceros" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_RegimenFiscal" />
             *       <attribute name="DomicilioFiscalACuentaTerceros" use="required">
             *         <simpleType>
             *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             <length value="5"/>
             *             <whiteSpace value="collapse"/>
             *             <pattern value="[0-9]{5}"/>
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
            public static class ACuentaTerceros {

                /**
                 * Atributo requerido para registrar la Clave del Registro Federal de Contribuyentes del contribuyente Tercero, a cuenta del que se realiza la operación.
                 * 
                 */
                @XmlAttribute(name = "RfcACuentaTerceros", required = true)
                protected String rfcACuentaTerceros;
                /**
                 * Atributo requerido para registrar el nombre, denominación o razón social del contribuyente Tercero correspondiente con el Rfc, a cuenta del que se realiza la operación.
                 * 
                 */
                @XmlAttribute(name = "NombreACuentaTerceros", required = true)
                protected String nombreACuentaTerceros;
                /**
                 * Atributo requerido para incorporar la clave del régimen del contribuyente Tercero, a cuenta del que se realiza la operación.
                 * 
                 */
                @XmlAttribute(name = "RegimenFiscalACuentaTerceros", required = true)
                protected CRegimenFiscal regimenFiscalACuentaTerceros;
                /**
                 * Atributo requerido para incorporar el código postal del domicilio fiscal del Tercero, a cuenta del que se realiza la operación.
                 * 
                 */
                @XmlAttribute(name = "DomicilioFiscalACuentaTerceros", required = true)
                protected String domicilioFiscalACuentaTerceros;

                /**
                 * Atributo requerido para registrar la Clave del Registro Federal de Contribuyentes del contribuyente Tercero, a cuenta del que se realiza la operación.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRfcACuentaTerceros() {
                    return rfcACuentaTerceros;
                }

                /**
                 * Define el valor de la propiedad rfcACuentaTerceros.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getRfcACuentaTerceros()
                 */
                public void setRfcACuentaTerceros(String value) {
                    this.rfcACuentaTerceros = value;
                }

                /**
                 * Atributo requerido para registrar el nombre, denominación o razón social del contribuyente Tercero correspondiente con el Rfc, a cuenta del que se realiza la operación.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNombreACuentaTerceros() {
                    return nombreACuentaTerceros;
                }

                /**
                 * Define el valor de la propiedad nombreACuentaTerceros.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getNombreACuentaTerceros()
                 */
                public void setNombreACuentaTerceros(String value) {
                    this.nombreACuentaTerceros = value;
                }

                /**
                 * Atributo requerido para incorporar la clave del régimen del contribuyente Tercero, a cuenta del que se realiza la operación.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CRegimenFiscal }
                 *     
                 */
                public CRegimenFiscal getRegimenFiscalACuentaTerceros() {
                    return regimenFiscalACuentaTerceros;
                }

                /**
                 * Define el valor de la propiedad regimenFiscalACuentaTerceros.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CRegimenFiscal }
                 *     
                 * @see #getRegimenFiscalACuentaTerceros()
                 */
                public void setRegimenFiscalACuentaTerceros(CRegimenFiscal value) {
                    this.regimenFiscalACuentaTerceros = value;
                }

                /**
                 * Atributo requerido para incorporar el código postal del domicilio fiscal del Tercero, a cuenta del que se realiza la operación.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDomicilioFiscalACuentaTerceros() {
                    return domicilioFiscalACuentaTerceros;
                }

                /**
                 * Define el valor de la propiedad domicilioFiscalACuentaTerceros.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getDomicilioFiscalACuentaTerceros()
                 */
                public void setDomicilioFiscalACuentaTerceros(String value) {
                    this.domicilioFiscalACuentaTerceros = value;
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
             *         <any maxOccurs="unbounded"/>
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
                "any"
            })
            public static class ComplementoConcepto {

                @XmlAnyElement(lax = true)
                protected List<Object> any;

                /**
                 * Gets the value of the any property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the any property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getAny().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the any property.
                 */
                public List<Object> getAny() {
                    if (any == null) {
                        any = new ArrayList<>();
                    }
                    return this.any;
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
             *       <attribute name="Numero" use="required">
             *         <simpleType>
             *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             <minLength value="1"/>
             *             <maxLength value="150"/>
             *             <whiteSpace value="collapse"/>
             *             <pattern value="[0-9a-zA-Z]{1,150}"/>
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
            public static class CuentaPredial {

                /**
                 * Atributo requerido para precisar el número de la cuenta predial del inmueble cubierto por el presente concepto, o bien para incorporar los datos de identificación del certificado de participación inmobiliaria no amortizable, tratándose de arrendamiento.
                 * 
                 */
                @XmlAttribute(name = "Numero", required = true)
                protected String numero;

                /**
                 * Atributo requerido para precisar el número de la cuenta predial del inmueble cubierto por el presente concepto, o bien para incorporar los datos de identificación del certificado de participación inmobiliaria no amortizable, tratándose de arrendamiento.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumero() {
                    return numero;
                }

                /**
                 * Define el valor de la propiedad numero.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getNumero()
                 */
                public void setNumero(String value) {
                    this.numero = value;
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
             *         <element name="Traslados" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="Traslado" maxOccurs="unbounded">
             *                     <complexType>
             *                       <complexContent>
             *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           <attribute name="Base" use="required">
             *                             <simpleType>
             *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                                 <fractionDigits value="6"/>
             *                                 <minInclusive value="0.000001"/>
             *                                 <whiteSpace value="collapse"/>
             *                               </restriction>
             *                             </simpleType>
             *                           </attribute>
             *                           <attribute name="Impuesto" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
             *                           <attribute name="TipoFactor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
             *                           <attribute name="TasaOCuota">
             *                             <simpleType>
             *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                                 <fractionDigits value="6"/>
             *                                 <minInclusive value="0.000000"/>
             *                                 <whiteSpace value="collapse"/>
             *                               </restriction>
             *                             </simpleType>
             *                           </attribute>
             *                           <attribute name="Importe" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
             *                         </restriction>
             *                       </complexContent>
             *                     </complexType>
             *                   </element>
             *                 </sequence>
             *               </restriction>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="Retenciones" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="Retencion" maxOccurs="unbounded">
             *                     <complexType>
             *                       <complexContent>
             *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           <attribute name="Base" use="required">
             *                             <simpleType>
             *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                                 <fractionDigits value="6"/>
             *                                 <minInclusive value="0.000001"/>
             *                                 <whiteSpace value="collapse"/>
             *                               </restriction>
             *                             </simpleType>
             *                           </attribute>
             *                           <attribute name="Impuesto" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
             *                           <attribute name="TipoFactor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
             *                           <attribute name="TasaOCuota" use="required">
             *                             <simpleType>
             *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                                 <whiteSpace value="collapse"/>
             *                                 <minInclusive value="0.000000"/>
             *                                 <fractionDigits value="6"/>
             *                               </restriction>
             *                             </simpleType>
             *                           </attribute>
             *                           <attribute name="Importe" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
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
                "traslados",
                "retenciones"
            })
            public static class Impuestos {

                /**
                 * Nodo opcional para asentar los impuestos trasladados aplicables al presente concepto.
                 * 
                 */
                @XmlElement(name = "Traslados")
                protected Comprobante.Conceptos.Concepto.Impuestos.Traslados traslados;
                /**
                 * Nodo opcional para asentar los impuestos retenidos aplicables al presente concepto.
                 * 
                 */
                @XmlElement(name = "Retenciones")
                protected Comprobante.Conceptos.Concepto.Impuestos.Retenciones retenciones;

                /**
                 * Nodo opcional para asentar los impuestos trasladados aplicables al presente concepto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Comprobante.Conceptos.Concepto.Impuestos.Traslados }
                 *     
                 */
                public Comprobante.Conceptos.Concepto.Impuestos.Traslados getTraslados() {
                    return traslados;
                }

                /**
                 * Define el valor de la propiedad traslados.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Comprobante.Conceptos.Concepto.Impuestos.Traslados }
                 *     
                 * @see #getTraslados()
                 */
                public void setTraslados(Comprobante.Conceptos.Concepto.Impuestos.Traslados value) {
                    this.traslados = value;
                }

                /**
                 * Nodo opcional para asentar los impuestos retenidos aplicables al presente concepto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Comprobante.Conceptos.Concepto.Impuestos.Retenciones }
                 *     
                 */
                public Comprobante.Conceptos.Concepto.Impuestos.Retenciones getRetenciones() {
                    return retenciones;
                }

                /**
                 * Define el valor de la propiedad retenciones.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Comprobante.Conceptos.Concepto.Impuestos.Retenciones }
                 *     
                 * @see #getRetenciones()
                 */
                public void setRetenciones(Comprobante.Conceptos.Concepto.Impuestos.Retenciones value) {
                    this.retenciones = value;
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
                 *         <element name="Retencion" maxOccurs="unbounded">
                 *           <complexType>
                 *             <complexContent>
                 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 <attribute name="Base" use="required">
                 *                   <simpleType>
                 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *                       <fractionDigits value="6"/>
                 *                       <minInclusive value="0.000001"/>
                 *                       <whiteSpace value="collapse"/>
                 *                     </restriction>
                 *                   </simpleType>
                 *                 </attribute>
                 *                 <attribute name="Impuesto" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
                 *                 <attribute name="TipoFactor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
                 *                 <attribute name="TasaOCuota" use="required">
                 *                   <simpleType>
                 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *                       <whiteSpace value="collapse"/>
                 *                       <minInclusive value="0.000000"/>
                 *                       <fractionDigits value="6"/>
                 *                     </restriction>
                 *                   </simpleType>
                 *                 </attribute>
                 *                 <attribute name="Importe" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
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
                    "retencion"
                })
                public static class Retenciones {

                    /**
                     * Nodo requerido para asentar la información detallada de una retención de impuestos aplicable al presente concepto.
                     * 
                     */
                    @XmlElement(name = "Retencion", required = true)
                    protected List<Comprobante.Conceptos.Concepto.Impuestos.Retenciones.Retencion> retencion;

                    /**
                     * Nodo requerido para asentar la información detallada de una retención de impuestos aplicable al presente concepto.
                     * 
                     * Gets the value of the retencion property.
                     * 
                     * <p>This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the retencion property.</p>
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * </p>
                     * <pre>
                     * getRetencion().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Comprobante.Conceptos.Concepto.Impuestos.Retenciones.Retencion }
                     * </p>
                     * 
                     * 
                     * @return
                     *     The value of the retencion property.
                     */
                    public List<Comprobante.Conceptos.Concepto.Impuestos.Retenciones.Retencion> getRetencion() {
                        if (retencion == null) {
                            retencion = new ArrayList<>();
                        }
                        return this.retencion;
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
                     *       <attribute name="Base" use="required">
                     *         <simpleType>
                     *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                     *             <fractionDigits value="6"/>
                     *             <minInclusive value="0.000001"/>
                     *             <whiteSpace value="collapse"/>
                     *           </restriction>
                     *         </simpleType>
                     *       </attribute>
                     *       <attribute name="Impuesto" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
                     *       <attribute name="TipoFactor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
                     *       <attribute name="TasaOCuota" use="required">
                     *         <simpleType>
                     *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                     *             <whiteSpace value="collapse"/>
                     *             <minInclusive value="0.000000"/>
                     *             <fractionDigits value="6"/>
                     *           </restriction>
                     *         </simpleType>
                     *       </attribute>
                     *       <attribute name="Importe" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
                     *     </restriction>
                     *   </complexContent>
                     * </complexType>
                     * }</pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Retencion {

                        /**
                         * Atributo requerido para señalar la base para el cálculo de la retención, la determinación de la base se realiza de acuerdo con las disposiciones fiscales vigentes. No se permiten valores negativos.
                         * 
                         */
                        @XmlAttribute(name = "Base", required = true)
                        protected BigDecimal base;
                        /**
                         * Atributo requerido para señalar la clave del tipo de impuesto retenido aplicable al concepto.
                         * 
                         */
                        @XmlAttribute(name = "Impuesto", required = true)
                        protected CImpuesto impuesto;
                        /**
                         * Atributo requerido para señalar la clave del tipo de factor que se aplica a la base del impuesto.
                         * 
                         */
                        @XmlAttribute(name = "TipoFactor", required = true)
                        protected CTipoFactor tipoFactor;
                        /**
                         * Atributo requerido para señalar la tasa o cuota del impuesto que se retiene para el presente concepto.
                         * 
                         */
                        @XmlAttribute(name = "TasaOCuota", required = true)
                        protected BigDecimal tasaOCuota;
                        /**
                         * Atributo requerido para señalar el importe del impuesto retenido que aplica al concepto. No se permiten valores negativos.
                         * 
                         */
                        @XmlAttribute(name = "Importe", required = true)
                        protected BigDecimal importe;

                        /**
                         * Atributo requerido para señalar la base para el cálculo de la retención, la determinación de la base se realiza de acuerdo con las disposiciones fiscales vigentes. No se permiten valores negativos.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getBase() {
                            return base;
                        }

                        /**
                         * Define el valor de la propiedad base.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         * @see #getBase()
                         */
                        public void setBase(BigDecimal value) {
                            this.base = value;
                        }

                        /**
                         * Atributo requerido para señalar la clave del tipo de impuesto retenido aplicable al concepto.
                         * 
                         * @return
                         *     possible object is
                         *     {@link CImpuesto }
                         *     
                         */
                        public CImpuesto getImpuesto() {
                            return impuesto;
                        }

                        /**
                         * Define el valor de la propiedad impuesto.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link CImpuesto }
                         *     
                         * @see #getImpuesto()
                         */
                        public void setImpuesto(CImpuesto value) {
                            this.impuesto = value;
                        }

                        /**
                         * Atributo requerido para señalar la clave del tipo de factor que se aplica a la base del impuesto.
                         * 
                         * @return
                         *     possible object is
                         *     {@link CTipoFactor }
                         *     
                         */
                        public CTipoFactor getTipoFactor() {
                            return tipoFactor;
                        }

                        /**
                         * Define el valor de la propiedad tipoFactor.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link CTipoFactor }
                         *     
                         * @see #getTipoFactor()
                         */
                        public void setTipoFactor(CTipoFactor value) {
                            this.tipoFactor = value;
                        }

                        /**
                         * Atributo requerido para señalar la tasa o cuota del impuesto que se retiene para el presente concepto.
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
                         * Atributo requerido para señalar el importe del impuesto retenido que aplica al concepto. No se permiten valores negativos.
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
                 *         <element name="Traslado" maxOccurs="unbounded">
                 *           <complexType>
                 *             <complexContent>
                 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 <attribute name="Base" use="required">
                 *                   <simpleType>
                 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *                       <fractionDigits value="6"/>
                 *                       <minInclusive value="0.000001"/>
                 *                       <whiteSpace value="collapse"/>
                 *                     </restriction>
                 *                   </simpleType>
                 *                 </attribute>
                 *                 <attribute name="Impuesto" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
                 *                 <attribute name="TipoFactor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
                 *                 <attribute name="TasaOCuota">
                 *                   <simpleType>
                 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *                       <fractionDigits value="6"/>
                 *                       <minInclusive value="0.000000"/>
                 *                       <whiteSpace value="collapse"/>
                 *                     </restriction>
                 *                   </simpleType>
                 *                 </attribute>
                 *                 <attribute name="Importe" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
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
                     * Nodo requerido para asentar la información detallada de un traslado de impuestos aplicable al presente concepto.
                     * 
                     */
                    @XmlElement(name = "Traslado", required = true)
                    protected List<Comprobante.Conceptos.Concepto.Impuestos.Traslados.Traslado> traslado;

                    /**
                     * Nodo requerido para asentar la información detallada de un traslado de impuestos aplicable al presente concepto.
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
                     * {@link Comprobante.Conceptos.Concepto.Impuestos.Traslados.Traslado }
                     * </p>
                     * 
                     * 
                     * @return
                     *     The value of the traslado property.
                     */
                    public List<Comprobante.Conceptos.Concepto.Impuestos.Traslados.Traslado> getTraslado() {
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
                     *       <attribute name="Base" use="required">
                     *         <simpleType>
                     *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                     *             <fractionDigits value="6"/>
                     *             <minInclusive value="0.000001"/>
                     *             <whiteSpace value="collapse"/>
                     *           </restriction>
                     *         </simpleType>
                     *       </attribute>
                     *       <attribute name="Impuesto" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
                     *       <attribute name="TipoFactor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
                     *       <attribute name="TasaOCuota">
                     *         <simpleType>
                     *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                     *             <fractionDigits value="6"/>
                     *             <minInclusive value="0.000000"/>
                     *             <whiteSpace value="collapse"/>
                     *           </restriction>
                     *         </simpleType>
                     *       </attribute>
                     *       <attribute name="Importe" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
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
                         * Atributo requerido para señalar la base para el cálculo del impuesto, la determinación de la base se realiza de acuerdo con las disposiciones fiscales vigentes. No se permiten valores negativos.
                         * 
                         */
                        @XmlAttribute(name = "Base", required = true)
                        protected BigDecimal base;
                        /**
                         * Atributo requerido para señalar la clave del tipo de impuesto trasladado aplicable al concepto.
                         * 
                         */
                        @XmlAttribute(name = "Impuesto", required = true)
                        protected CImpuesto impuesto;
                        /**
                         * Atributo requerido para señalar la clave del tipo de factor que se aplica a la base del impuesto.
                         * 
                         */
                        @XmlAttribute(name = "TipoFactor", required = true)
                        protected CTipoFactor tipoFactor;
                        /**
                         * Atributo condicional para señalar el valor de la tasa o cuota del impuesto que se traslada para el presente concepto. Es requerido cuando el atributo TipoFactor tenga una clave que corresponda a Tasa o Cuota.
                         * 
                         */
                        @XmlAttribute(name = "TasaOCuota")
                        protected BigDecimal tasaOCuota;
                        /**
                         * Atributo condicional para señalar el importe del impuesto trasladado que aplica al concepto. No se permiten valores negativos. Es requerido cuando TipoFactor sea Tasa o Cuota.
                         * 
                         */
                        @XmlAttribute(name = "Importe")
                        protected BigDecimal importe;

                        /**
                         * Atributo requerido para señalar la base para el cálculo del impuesto, la determinación de la base se realiza de acuerdo con las disposiciones fiscales vigentes. No se permiten valores negativos.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getBase() {
                            return base;
                        }

                        /**
                         * Define el valor de la propiedad base.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         * @see #getBase()
                         */
                        public void setBase(BigDecimal value) {
                            this.base = value;
                        }

                        /**
                         * Atributo requerido para señalar la clave del tipo de impuesto trasladado aplicable al concepto.
                         * 
                         * @return
                         *     possible object is
                         *     {@link CImpuesto }
                         *     
                         */
                        public CImpuesto getImpuesto() {
                            return impuesto;
                        }

                        /**
                         * Define el valor de la propiedad impuesto.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link CImpuesto }
                         *     
                         * @see #getImpuesto()
                         */
                        public void setImpuesto(CImpuesto value) {
                            this.impuesto = value;
                        }

                        /**
                         * Atributo requerido para señalar la clave del tipo de factor que se aplica a la base del impuesto.
                         * 
                         * @return
                         *     possible object is
                         *     {@link CTipoFactor }
                         *     
                         */
                        public CTipoFactor getTipoFactor() {
                            return tipoFactor;
                        }

                        /**
                         * Define el valor de la propiedad tipoFactor.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link CTipoFactor }
                         *     
                         * @see #getTipoFactor()
                         */
                        public void setTipoFactor(CTipoFactor value) {
                            this.tipoFactor = value;
                        }

                        /**
                         * Atributo condicional para señalar el valor de la tasa o cuota del impuesto que se traslada para el presente concepto. Es requerido cuando el atributo TipoFactor tenga una clave que corresponda a Tasa o Cuota.
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
                         * Atributo condicional para señalar el importe del impuesto trasladado que aplica al concepto. No se permiten valores negativos. Es requerido cuando TipoFactor sea Tasa o Cuota.
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


            /**
             * <p>Clase Java para anonymous complex type.</p>
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       <attribute name="NumeroPedimento" use="required">
             *         <simpleType>
             *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             <length value="21"/>
             *             <pattern value="[0-9]{2}  [0-9]{2}  [0-9]{4}  [0-9]{7}"/>
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
            public static class InformacionAduanera {

                /**
                 * Atributo requerido para expresar el número del pedimento que ampara la importación del bien que se expresa en el siguiente formato: últimos 2 dígitos del año de validación seguidos por dos espacios, 2 dígitos de la aduana de despacho seguidos por dos espacios, 4 dígitos del número de la patente seguidos por dos espacios, 1 dígito que corresponde al último dígito del año en curso, salvo que se trate de un pedimento consolidado iniciado en el año inmediato anterior o del pedimento original de una rectificación, seguido de 6 dígitos de la numeración progresiva por aduana.
                 * 
                 */
                @XmlAttribute(name = "NumeroPedimento", required = true)
                protected String numeroPedimento;

                /**
                 * Atributo requerido para expresar el número del pedimento que ampara la importación del bien que se expresa en el siguiente formato: últimos 2 dígitos del año de validación seguidos por dos espacios, 2 dígitos de la aduana de despacho seguidos por dos espacios, 4 dígitos del número de la patente seguidos por dos espacios, 1 dígito que corresponde al último dígito del año en curso, salvo que se trate de un pedimento consolidado iniciado en el año inmediato anterior o del pedimento original de una rectificación, seguido de 6 dígitos de la numeración progresiva por aduana.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumeroPedimento() {
                    return numeroPedimento;
                }

                /**
                 * Define el valor de la propiedad numeroPedimento.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getNumeroPedimento()
                 */
                public void setNumeroPedimento(String value) {
                    this.numeroPedimento = value;
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
             *         <element name="InformacionAduanera" maxOccurs="unbounded" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <attribute name="NumeroPedimento" use="required">
             *                   <simpleType>
             *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       <length value="21"/>
             *                       <pattern value="[0-9]{2}  [0-9]{2}  [0-9]{4}  [0-9]{7}"/>
             *                     </restriction>
             *                   </simpleType>
             *                 </attribute>
             *               </restriction>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *       </sequence>
             *       <attribute name="ClaveProdServ" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_ClaveProdServ" />
             *       <attribute name="NoIdentificacion">
             *         <simpleType>
             *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             <minLength value="1"/>
             *             <maxLength value="100"/>
             *             <whiteSpace value="collapse"/>
             *             <pattern value="[^|]{1,100}"/>
             *           </restriction>
             *         </simpleType>
             *       </attribute>
             *       <attribute name="Cantidad" use="required">
             *         <simpleType>
             *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *             <fractionDigits value="6"/>
             *             <minInclusive value="0.000001"/>
             *             <whiteSpace value="collapse"/>
             *           </restriction>
             *         </simpleType>
             *       </attribute>
             *       <attribute name="Unidad">
             *         <simpleType>
             *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             <minLength value="1"/>
             *             <maxLength value="20"/>
             *             <whiteSpace value="collapse"/>
             *             <pattern value="[^|]{1,20}"/>
             *           </restriction>
             *         </simpleType>
             *       </attribute>
             *       <attribute name="Descripcion" use="required">
             *         <simpleType>
             *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             <minLength value="1"/>
             *             <maxLength value="1000"/>
             *             <whiteSpace value="collapse"/>
             *             <pattern value="[^|]{1,1000}"/>
             *           </restriction>
             *         </simpleType>
             *       </attribute>
             *       <attribute name="ValorUnitario" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
             *       <attribute name="Importe" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
             *     </restriction>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "informacionAduanera"
            })
            public static class Parte {

                /**
                 * Nodo opcional para introducir la información aduanera aplicable cuando se trate de ventas de primera mano de mercancías importadas o se trate de operaciones de comercio exterior con bienes o servicios.
                 * 
                 */
                @XmlElement(name = "InformacionAduanera")
                protected List<Comprobante.Conceptos.Concepto.Parte.InformacionAduanera> informacionAduanera;
                /**
                 * Atributo requerido para expresar la clave del producto o del servicio amparado por la presente parte. Es requerido y deben utilizar las claves del catálogo de productos y servicios, cuando los conceptos que registren por sus actividades correspondan con dichos conceptos.
                 * 
                 */
                @XmlAttribute(name = "ClaveProdServ", required = true)
                protected String claveProdServ;
                /**
                 * Atributo opcional para expresar el número de serie, número de parte del bien o identificador del producto o del servicio amparado por la presente parte. Opcionalmente se puede utilizar claves del estándar GTIN.
                 * 
                 */
                @XmlAttribute(name = "NoIdentificacion")
                protected String noIdentificacion;
                /**
                 * Atributo requerido para precisar la cantidad de bienes o servicios del tipo particular definido por la presente parte.
                 * 
                 */
                @XmlAttribute(name = "Cantidad", required = true)
                protected BigDecimal cantidad;
                /**
                 * Atributo opcional para precisar la unidad de medida propia de la operación del emisor, aplicable para la cantidad expresada en la parte. La unidad debe corresponder con la descripción de la parte.
                 * 
                 */
                @XmlAttribute(name = "Unidad")
                protected String unidad;
                /**
                 * Atributo requerido para precisar la descripción del bien o servicio cubierto por la presente parte.
                 * 
                 */
                @XmlAttribute(name = "Descripcion", required = true)
                protected String descripcion;
                /**
                 * Atributo opcional para precisar el valor o precio unitario del bien o servicio cubierto por la presente parte. No se permiten valores negativos.
                 * 
                 */
                @XmlAttribute(name = "ValorUnitario")
                protected BigDecimal valorUnitario;
                /**
                 * Atributo opcional para precisar el importe total de los bienes o servicios de la presente parte. Debe ser equivalente al resultado de multiplicar la cantidad por el valor unitario expresado en la parte. No se permiten valores negativos.
                 * 
                 */
                @XmlAttribute(name = "Importe")
                protected BigDecimal importe;

                /**
                 * Nodo opcional para introducir la información aduanera aplicable cuando se trate de ventas de primera mano de mercancías importadas o se trate de operaciones de comercio exterior con bienes o servicios.
                 * 
                 * Gets the value of the informacionAduanera property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the informacionAduanera property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getInformacionAduanera().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Comprobante.Conceptos.Concepto.Parte.InformacionAduanera }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the informacionAduanera property.
                 */
                public List<Comprobante.Conceptos.Concepto.Parte.InformacionAduanera> getInformacionAduanera() {
                    if (informacionAduanera == null) {
                        informacionAduanera = new ArrayList<>();
                    }
                    return this.informacionAduanera;
                }

                /**
                 * Atributo requerido para expresar la clave del producto o del servicio amparado por la presente parte. Es requerido y deben utilizar las claves del catálogo de productos y servicios, cuando los conceptos que registren por sus actividades correspondan con dichos conceptos.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CClaveProdServ }
                 *     
                 */
                public String getClaveProdServ() {
                    return claveProdServ;
                }

                /**
                 * Define el valor de la propiedad claveProdServ.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CClaveProdServ }
                 *     
                 * @see #getClaveProdServ()
                 */
                public void setClaveProdServ(String value) {
                    this.claveProdServ = value;
                }

                /**
                 * Atributo opcional para expresar el número de serie, número de parte del bien o identificador del producto o del servicio amparado por la presente parte. Opcionalmente se puede utilizar claves del estándar GTIN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNoIdentificacion() {
                    return noIdentificacion;
                }

                /**
                 * Define el valor de la propiedad noIdentificacion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getNoIdentificacion()
                 */
                public void setNoIdentificacion(String value) {
                    this.noIdentificacion = value;
                }

                /**
                 * Atributo requerido para precisar la cantidad de bienes o servicios del tipo particular definido por la presente parte.
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
                 * Atributo opcional para precisar la unidad de medida propia de la operación del emisor, aplicable para la cantidad expresada en la parte. La unidad debe corresponder con la descripción de la parte.
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
                 * Atributo requerido para precisar la descripción del bien o servicio cubierto por la presente parte.
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
                 * Atributo opcional para precisar el valor o precio unitario del bien o servicio cubierto por la presente parte. No se permiten valores negativos.
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
                 * Atributo opcional para precisar el importe total de los bienes o servicios de la presente parte. Debe ser equivalente al resultado de multiplicar la cantidad por el valor unitario expresado en la parte. No se permiten valores negativos.
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
                 *       <attribute name="NumeroPedimento" use="required">
                 *         <simpleType>
                 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             <length value="21"/>
                 *             <pattern value="[0-9]{2}  [0-9]{2}  [0-9]{4}  [0-9]{7}"/>
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
                public static class InformacionAduanera {

                    /**
                     * Atributo requerido para expresar el número del pedimento que ampara la importación del bien que se expresa en el siguiente formato: últimos 2 dígitos del año de validación seguidos por dos espacios, 2 dígitos de la aduana de despacho seguidos por dos espacios, 4 dígitos del número de la patente seguidos por dos espacios, 1 dígito que corresponde al último dígito del año en curso, salvo que se trate de un pedimento consolidado iniciado en el año inmediato anterior o del pedimento original de una rectificación, seguido de 6 dígitos de la numeración progresiva por aduana.
                     * 
                     */
                    @XmlAttribute(name = "NumeroPedimento", required = true)
                    protected String numeroPedimento;

                    /**
                     * Atributo requerido para expresar el número del pedimento que ampara la importación del bien que se expresa en el siguiente formato: últimos 2 dígitos del año de validación seguidos por dos espacios, 2 dígitos de la aduana de despacho seguidos por dos espacios, 4 dígitos del número de la patente seguidos por dos espacios, 1 dígito que corresponde al último dígito del año en curso, salvo que se trate de un pedimento consolidado iniciado en el año inmediato anterior o del pedimento original de una rectificación, seguido de 6 dígitos de la numeración progresiva por aduana.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNumeroPedimento() {
                        return numeroPedimento;
                    }

                    /**
                     * Define el valor de la propiedad numeroPedimento.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     * @see #getNumeroPedimento()
                     */
                    public void setNumeroPedimento(String value) {
                        this.numeroPedimento = value;
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
     *       <attribute name="Rfc" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC" />
     *       <attribute name="Nombre" use="required">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <minLength value="1"/>
     *             <maxLength value="300"/>
     *             <whiteSpace value="collapse"/>
     *             <pattern value="[^|]{1,300}"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="RegimenFiscal" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_RegimenFiscal" />
     *       <attribute name="FacAtrAdquirente">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <whiteSpace value="collapse"/>
     *             <length value="10"/>
     *             <pattern value="[0-9]{10}"/>
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
    public static class Emisor {

        /**
         * Atributo requerido para registrar la Clave del Registro Federal de Contribuyentes correspondiente al contribuyente emisor del comprobante.
         * 
         */
        @XmlAttribute(name = "Rfc", required = true)
        protected String rfc;
        /**
         * Atributo requerido para registrar el nombre, denominación o razón social del contribuyente inscrito en el RFC, del emisor del comprobante.
         * 
         */
        @XmlAttribute(name = "Nombre", required = true)
        protected String nombre;
        /**
         * Atributo requerido para incorporar la clave del régimen del contribuyente emisor al que aplicará el efecto fiscal de este comprobante.
         * 
         */
        @XmlAttribute(name = "RegimenFiscal", required = true)
        protected CRegimenFiscal regimenFiscal;
        /**
         * Atributo condicional para expresar el número de operación proporcionado por el SAT cuando se trate de un comprobante a través de un PCECFDI o un PCGCFDISP.
         * 
         */
        @XmlAttribute(name = "FacAtrAdquirente")
        protected String facAtrAdquirente;

        /**
         * Atributo requerido para registrar la Clave del Registro Federal de Contribuyentes correspondiente al contribuyente emisor del comprobante.
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
         * Atributo requerido para registrar el nombre, denominación o razón social del contribuyente inscrito en el RFC, del emisor del comprobante.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getNombre()
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

        /**
         * Atributo requerido para incorporar la clave del régimen del contribuyente emisor al que aplicará el efecto fiscal de este comprobante.
         * 
         * @return
         *     possible object is
         *     {@link CRegimenFiscal }
         *     
         */
        public CRegimenFiscal getRegimenFiscal() {
            return regimenFiscal;
        }

        /**
         * Define el valor de la propiedad regimenFiscal.
         * 
         * @param value
         *     allowed object is
         *     {@link CRegimenFiscal }
         *     
         * @see #getRegimenFiscal()
         */
        public void setRegimenFiscal(CRegimenFiscal value) {
            this.regimenFiscal = value;
        }

        /**
         * Atributo condicional para expresar el número de operación proporcionado por el SAT cuando se trate de un comprobante a través de un PCECFDI o un PCGCFDISP.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFacAtrAdquirente() {
            return facAtrAdquirente;
        }

        /**
         * Define el valor de la propiedad facAtrAdquirente.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getFacAtrAdquirente()
         */
        public void setFacAtrAdquirente(String value) {
            this.facAtrAdquirente = value;
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
     *         <element name="Retenciones" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Retencion" maxOccurs="unbounded">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <attribute name="Impuesto" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
     *                           <attribute name="Importe" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Traslados" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Traslado" maxOccurs="unbounded">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <attribute name="Base" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
     *                           <attribute name="Impuesto" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
     *                           <attribute name="TipoFactor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
     *                           <attribute name="TasaOCuota">
     *                             <simpleType>
     *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                 <whiteSpace value="collapse"/>
     *                                 <minInclusive value="0.000000"/>
     *                                 <fractionDigits value="6"/>
     *                               </restriction>
     *                             </simpleType>
     *                           </attribute>
     *                           <attribute name="Importe" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
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
     *       <attribute name="TotalImpuestosRetenidos" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
     *       <attribute name="TotalImpuestosTrasladados" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "retenciones",
        "traslados"
    })
    public static class Impuestos {

        /**
         * Nodo condicional para capturar los impuestos retenidos aplicables. Es requerido cuando en los conceptos se registre algún impuesto retenido.
         * 
         */
        @XmlElement(name = "Retenciones")
        protected Comprobante.Impuestos.Retenciones retenciones;
        /**
         * Nodo condicional para capturar los impuestos trasladados aplicables. Es requerido cuando en los conceptos se registre un impuesto trasladado.
         * 
         */
        @XmlElement(name = "Traslados")
        protected Comprobante.Impuestos.Traslados traslados;
        /**
         * Atributo condicional para expresar el total de los impuestos retenidos que se desprenden de los conceptos expresados en el comprobante fiscal digital por Internet. No se permiten valores negativos. Es requerido cuando en los conceptos se registren impuestos retenidos.
         * 
         */
        @XmlAttribute(name = "TotalImpuestosRetenidos")
        protected BigDecimal totalImpuestosRetenidos;
        /**
         * Atributo condicional para expresar el total de los impuestos trasladados que se desprenden de los conceptos expresados en el comprobante fiscal digital por Internet. No se permiten valores negativos. Es requerido cuando en los conceptos se registren impuestos trasladados.
         * 
         */
        @XmlAttribute(name = "TotalImpuestosTrasladados")
        protected BigDecimal totalImpuestosTrasladados;

        /**
         * Nodo condicional para capturar los impuestos retenidos aplicables. Es requerido cuando en los conceptos se registre algún impuesto retenido.
         * 
         * @return
         *     possible object is
         *     {@link Comprobante.Impuestos.Retenciones }
         *     
         */
        public Comprobante.Impuestos.Retenciones getRetenciones() {
            return retenciones;
        }

        /**
         * Define el valor de la propiedad retenciones.
         * 
         * @param value
         *     allowed object is
         *     {@link Comprobante.Impuestos.Retenciones }
         *     
         * @see #getRetenciones()
         */
        public void setRetenciones(Comprobante.Impuestos.Retenciones value) {
            this.retenciones = value;
        }

        /**
         * Nodo condicional para capturar los impuestos trasladados aplicables. Es requerido cuando en los conceptos se registre un impuesto trasladado.
         * 
         * @return
         *     possible object is
         *     {@link Comprobante.Impuestos.Traslados }
         *     
         */
        public Comprobante.Impuestos.Traslados getTraslados() {
            return traslados;
        }

        /**
         * Define el valor de la propiedad traslados.
         * 
         * @param value
         *     allowed object is
         *     {@link Comprobante.Impuestos.Traslados }
         *     
         * @see #getTraslados()
         */
        public void setTraslados(Comprobante.Impuestos.Traslados value) {
            this.traslados = value;
        }

        /**
         * Atributo condicional para expresar el total de los impuestos retenidos que se desprenden de los conceptos expresados en el comprobante fiscal digital por Internet. No se permiten valores negativos. Es requerido cuando en los conceptos se registren impuestos retenidos.
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
         * Atributo condicional para expresar el total de los impuestos trasladados que se desprenden de los conceptos expresados en el comprobante fiscal digital por Internet. No se permiten valores negativos. Es requerido cuando en los conceptos se registren impuestos trasladados.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalImpuestosTrasladados() {
            return totalImpuestosTrasladados;
        }

        /**
         * Define el valor de la propiedad totalImpuestosTrasladados.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getTotalImpuestosTrasladados()
         */
        public void setTotalImpuestosTrasladados(BigDecimal value) {
            this.totalImpuestosTrasladados = value;
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
         *         <element name="Retencion" maxOccurs="unbounded">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <attribute name="Impuesto" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
         *                 <attribute name="Importe" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
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
            "retencion"
        })
        public static class Retenciones {

            /**
             * Nodo requerido para la información detallada de una retención de impuesto específico.
             * 
             */
            @XmlElement(name = "Retencion", required = true)
            protected List<Comprobante.Impuestos.Retenciones.Retencion> retencion;

            /**
             * Nodo requerido para la información detallada de una retención de impuesto específico.
             * 
             * Gets the value of the retencion property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the retencion property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getRetencion().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Comprobante.Impuestos.Retenciones.Retencion }
             * </p>
             * 
             * 
             * @return
             *     The value of the retencion property.
             */
            public List<Comprobante.Impuestos.Retenciones.Retencion> getRetencion() {
                if (retencion == null) {
                    retencion = new ArrayList<>();
                }
                return this.retencion;
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
             *       <attribute name="Impuesto" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
             *       <attribute name="Importe" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
             *     </restriction>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Retencion {

                /**
                 * Atributo requerido para señalar la clave del tipo de impuesto retenido.
                 * 
                 */
                @XmlAttribute(name = "Impuesto", required = true)
                protected CImpuesto impuesto;
                /**
                 * Atributo requerido para señalar el monto del impuesto retenido. No se permiten valores negativos.
                 * 
                 */
                @XmlAttribute(name = "Importe", required = true)
                protected BigDecimal importe;

                /**
                 * Atributo requerido para señalar la clave del tipo de impuesto retenido.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CImpuesto }
                 *     
                 */
                public CImpuesto getImpuesto() {
                    return impuesto;
                }

                /**
                 * Define el valor de la propiedad impuesto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CImpuesto }
                 *     
                 * @see #getImpuesto()
                 */
                public void setImpuesto(CImpuesto value) {
                    this.impuesto = value;
                }

                /**
                 * Atributo requerido para señalar el monto del impuesto retenido. No se permiten valores negativos.
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
         *         <element name="Traslado" maxOccurs="unbounded">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <attribute name="Base" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
         *                 <attribute name="Impuesto" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
         *                 <attribute name="TipoFactor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
         *                 <attribute name="TasaOCuota">
         *                   <simpleType>
         *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                       <whiteSpace value="collapse"/>
         *                       <minInclusive value="0.000000"/>
         *                       <fractionDigits value="6"/>
         *                     </restriction>
         *                   </simpleType>
         *                 </attribute>
         *                 <attribute name="Importe" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
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
             * Nodo requerido para la información detallada de un traslado de impuesto específico.
             * 
             */
            @XmlElement(name = "Traslado", required = true)
            protected List<Comprobante.Impuestos.Traslados.Traslado> traslado;

            /**
             * Nodo requerido para la información detallada de un traslado de impuesto específico.
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
             * {@link Comprobante.Impuestos.Traslados.Traslado }
             * </p>
             * 
             * 
             * @return
             *     The value of the traslado property.
             */
            public List<Comprobante.Impuestos.Traslados.Traslado> getTraslado() {
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
             *       <attribute name="Base" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
             *       <attribute name="Impuesto" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Impuesto" />
             *       <attribute name="TipoFactor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_TipoFactor" />
             *       <attribute name="TasaOCuota">
             *         <simpleType>
             *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *             <whiteSpace value="collapse"/>
             *             <minInclusive value="0.000000"/>
             *             <fractionDigits value="6"/>
             *           </restriction>
             *         </simpleType>
             *       </attribute>
             *       <attribute name="Importe" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" />
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
                 * Atributo requerido para señalar la suma de los atributos Base de los conceptos del impuesto trasladado. No se permiten valores negativos.
                 * 
                 */
                @XmlAttribute(name = "Base", required = true)
                protected BigDecimal base;
                /**
                 * Atributo requerido para señalar la clave del tipo de impuesto trasladado.
                 * 
                 */
                @XmlAttribute(name = "Impuesto", required = true)
                protected CImpuesto impuesto;
                /**
                 * Atributo requerido para señalar la clave del tipo de factor que se aplica a la base del impuesto.
                 * 
                 */
                @XmlAttribute(name = "TipoFactor", required = true)
                protected CTipoFactor tipoFactor;
                /**
                 * Atributo condicional para señalar el valor de la tasa o cuota del impuesto que se traslada por los conceptos amparados en el comprobante.
                 * 
                 */
                @XmlAttribute(name = "TasaOCuota")
                protected BigDecimal tasaOCuota;
                /**
                 * Atributo condicional para señalar la suma del importe del impuesto trasladado, agrupado por impuesto, TipoFactor y TasaOCuota. No se permiten valores negativos.
                 * 
                 */
                @XmlAttribute(name = "Importe")
                protected BigDecimal importe;

                /**
                 * Atributo requerido para señalar la suma de los atributos Base de los conceptos del impuesto trasladado. No se permiten valores negativos.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getBase() {
                    return base;
                }

                /**
                 * Define el valor de la propiedad base.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getBase()
                 */
                public void setBase(BigDecimal value) {
                    this.base = value;
                }

                /**
                 * Atributo requerido para señalar la clave del tipo de impuesto trasladado.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CImpuesto }
                 *     
                 */
                public CImpuesto getImpuesto() {
                    return impuesto;
                }

                /**
                 * Define el valor de la propiedad impuesto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CImpuesto }
                 *     
                 * @see #getImpuesto()
                 */
                public void setImpuesto(CImpuesto value) {
                    this.impuesto = value;
                }

                /**
                 * Atributo requerido para señalar la clave del tipo de factor que se aplica a la base del impuesto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CTipoFactor }
                 *     
                 */
                public CTipoFactor getTipoFactor() {
                    return tipoFactor;
                }

                /**
                 * Define el valor de la propiedad tipoFactor.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CTipoFactor }
                 *     
                 * @see #getTipoFactor()
                 */
                public void setTipoFactor(CTipoFactor value) {
                    this.tipoFactor = value;
                }

                /**
                 * Atributo condicional para señalar el valor de la tasa o cuota del impuesto que se traslada por los conceptos amparados en el comprobante.
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
                 * Atributo condicional para señalar la suma del importe del impuesto trasladado, agrupado por impuesto, TipoFactor y TasaOCuota. No se permiten valores negativos.
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


    /**
     * <p>Clase Java para anonymous complex type.</p>
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <attribute name="Periodicidad" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Periodicidad" />
     *       <attribute name="Meses" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Meses" />
     *       <attribute name="Año" use="required">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}short">
     *             <minInclusive value="2019"/>
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
    public static class InformacionGlobal {

        /**
         * Atributo requerido para expresar el período al que corresponde la información del comprobante global.
         * 
         */
        @XmlAttribute(name = "Periodicidad", required = true)
        protected CPeriodicidad periodicidad;
        /**
         * Atributo requerido para expresar el mes o los meses al que corresponde la información del comprobante global.
         * 
         */
        @XmlAttribute(name = "Meses", required = true)
        protected CMeses meses;
        /**
         * Atributo requerido para expresar el año al que corresponde la información del comprobante global.
         * 
         */
        @XmlAttribute(name = "A\u00f1o", required = true)
        protected short año;

        /**
         * Atributo requerido para expresar el período al que corresponde la información del comprobante global.
         * 
         * @return
         *     possible object is
         *     {@link CPeriodicidad }
         *     
         */
        public CPeriodicidad getPeriodicidad() {
            return periodicidad;
        }

        /**
         * Define el valor de la propiedad periodicidad.
         * 
         * @param value
         *     allowed object is
         *     {@link CPeriodicidad }
         *     
         * @see #getPeriodicidad()
         */
        public void setPeriodicidad(CPeriodicidad value) {
            this.periodicidad = value;
        }

        /**
         * Atributo requerido para expresar el mes o los meses al que corresponde la información del comprobante global.
         * 
         * @return
         *     possible object is
         *     {@link CMeses }
         *     
         */
        public CMeses getMeses() {
            return meses;
        }

        /**
         * Define el valor de la propiedad meses.
         * 
         * @param value
         *     allowed object is
         *     {@link CMeses }
         *     
         * @see #getMeses()
         */
        public void setMeses(CMeses value) {
            this.meses = value;
        }

        /**
         * Atributo requerido para expresar el año al que corresponde la información del comprobante global.
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
     *       <attribute name="Rfc" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC" />
     *       <attribute name="Nombre" use="required">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <minLength value="1"/>
     *             <maxLength value="300"/>
     *             <whiteSpace value="collapse"/>
     *             <pattern value="[^|]{1,300}"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="DomicilioFiscalReceptor" use="required">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <length value="5"/>
     *             <whiteSpace value="collapse"/>
     *             <pattern value="[0-9]{5}"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="ResidenciaFiscal" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Pais" />
     *       <attribute name="NumRegIdTrib">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             <minLength value="1"/>
     *             <maxLength value="40"/>
     *             <whiteSpace value="collapse"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *       <attribute name="RegimenFiscalReceptor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_RegimenFiscal" />
     *       <attribute name="UsoCFDI" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_UsoCFDI" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Receptor {

        /**
         * Atributo requerido para registrar la Clave del Registro Federal de Contribuyentes correspondiente al contribuyente receptor del comprobante.
         * 
         */
        @XmlAttribute(name = "Rfc", required = true)
        protected String rfc;
        /**
         * Atributo requerido para registrar el nombre(s), primer apellido, segundo apellido, según corresponda, denominación o razón social del contribuyente, inscrito en el RFC, del receptor del comprobante.
         * 
         */
        @XmlAttribute(name = "Nombre", required = true)
        protected String nombre;
        /**
         * Atributo requerido para registrar el código postal del domicilio fiscal del receptor del comprobante.
         * 
         */
        @XmlAttribute(name = "DomicilioFiscalReceptor", required = true)
        protected String domicilioFiscalReceptor;
        /**
         * Atributo condicional para registrar la clave del país de residencia para efectos fiscales del receptor del comprobante, cuando se trate de un extranjero, y que es conforme con la especificación ISO 3166-1 alpha-3. Es requerido cuando se incluya el complemento de comercio exterior o se registre el atributo NumRegIdTrib.
         * 
         */
        @XmlAttribute(name = "ResidenciaFiscal")
        protected CPais residenciaFiscal;
        /**
         * Atributo condicional para expresar el número de registro de identidad fiscal del receptor cuando sea residente en el extranjero. Es requerido cuando se incluya el complemento de comercio exterior.
         * 
         */
        @XmlAttribute(name = "NumRegIdTrib")
        protected String numRegIdTrib;
        /**
         * Atributo requerido para incorporar la clave del régimen fiscal del contribuyente receptor al que aplicará el efecto fiscal de este comprobante.
         * 
         */
        @XmlAttribute(name = "RegimenFiscalReceptor", required = true)
        protected CRegimenFiscal regimenFiscalReceptor;
        /**
         * Atributo requerido para expresar la clave del uso que dará a esta factura el receptor del CFDI.
         * 
         */
        @XmlAttribute(name = "UsoCFDI", required = true)
        protected CUsoCFDI usoCFDI;

        /**
         * Atributo requerido para registrar la Clave del Registro Federal de Contribuyentes correspondiente al contribuyente receptor del comprobante.
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
         * Atributo requerido para registrar el nombre(s), primer apellido, segundo apellido, según corresponda, denominación o razón social del contribuyente, inscrito en el RFC, del receptor del comprobante.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getNombre()
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

        /**
         * Atributo requerido para registrar el código postal del domicilio fiscal del receptor del comprobante.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDomicilioFiscalReceptor() {
            return domicilioFiscalReceptor;
        }

        /**
         * Define el valor de la propiedad domicilioFiscalReceptor.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getDomicilioFiscalReceptor()
         */
        public void setDomicilioFiscalReceptor(String value) {
            this.domicilioFiscalReceptor = value;
        }

        /**
         * Atributo condicional para registrar la clave del país de residencia para efectos fiscales del receptor del comprobante, cuando se trate de un extranjero, y que es conforme con la especificación ISO 3166-1 alpha-3. Es requerido cuando se incluya el complemento de comercio exterior o se registre el atributo NumRegIdTrib.
         * 
         * @return
         *     possible object is
         *     {@link CPais }
         *     
         */
        public CPais getResidenciaFiscal() {
            return residenciaFiscal;
        }

        /**
         * Define el valor de la propiedad residenciaFiscal.
         * 
         * @param value
         *     allowed object is
         *     {@link CPais }
         *     
         * @see #getResidenciaFiscal()
         */
        public void setResidenciaFiscal(CPais value) {
            this.residenciaFiscal = value;
        }

        /**
         * Atributo condicional para expresar el número de registro de identidad fiscal del receptor cuando sea residente en el extranjero. Es requerido cuando se incluya el complemento de comercio exterior.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumRegIdTrib() {
            return numRegIdTrib;
        }

        /**
         * Define el valor de la propiedad numRegIdTrib.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getNumRegIdTrib()
         */
        public void setNumRegIdTrib(String value) {
            this.numRegIdTrib = value;
        }

        /**
         * Atributo requerido para incorporar la clave del régimen fiscal del contribuyente receptor al que aplicará el efecto fiscal de este comprobante.
         * 
         * @return
         *     possible object is
         *     {@link CRegimenFiscal }
         *     
         */
        public CRegimenFiscal getRegimenFiscalReceptor() {
            return regimenFiscalReceptor;
        }

        /**
         * Define el valor de la propiedad regimenFiscalReceptor.
         * 
         * @param value
         *     allowed object is
         *     {@link CRegimenFiscal }
         *     
         * @see #getRegimenFiscalReceptor()
         */
        public void setRegimenFiscalReceptor(CRegimenFiscal value) {
            this.regimenFiscalReceptor = value;
        }

        /**
         * Atributo requerido para expresar la clave del uso que dará a esta factura el receptor del CFDI.
         * 
         * @return
         *     possible object is
         *     {@link CUsoCFDI }
         *     
         */
        public CUsoCFDI getUsoCFDI() {
            return usoCFDI;
        }

        /**
         * Define el valor de la propiedad usoCFDI.
         * 
         * @param value
         *     allowed object is
         *     {@link CUsoCFDI }
         *     
         * @see #getUsoCFDI()
         */
        public void setUsoCFDI(CUsoCFDI value) {
            this.usoCFDI = value;
        }

    }

}
