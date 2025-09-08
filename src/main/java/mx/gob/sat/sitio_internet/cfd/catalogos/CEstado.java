//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package mx.gob.sat.sitio_internet.cfd.catalogos;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Clase Java para c_Estado.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * <pre>{@code
 * <simpleType name="c_Estado">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <whiteSpace value="collapse"/>
 *     <enumeration value="AGU"/>
 *     <enumeration value="BCN"/>
 *     <enumeration value="BCS"/>
 *     <enumeration value="CAM"/>
 *     <enumeration value="CHP"/>
 *     <enumeration value="CHH"/>
 *     <enumeration value="COA"/>
 *     <enumeration value="COL"/>
 *     <enumeration value="DIF"/>
 *     <enumeration value="CMX"/>
 *     <enumeration value="DUR"/>
 *     <enumeration value="GUA"/>
 *     <enumeration value="GRO"/>
 *     <enumeration value="HID"/>
 *     <enumeration value="JAL"/>
 *     <enumeration value="MEX"/>
 *     <enumeration value="MIC"/>
 *     <enumeration value="MOR"/>
 *     <enumeration value="NAY"/>
 *     <enumeration value="NLE"/>
 *     <enumeration value="OAX"/>
 *     <enumeration value="PUE"/>
 *     <enumeration value="QUE"/>
 *     <enumeration value="ROO"/>
 *     <enumeration value="SLP"/>
 *     <enumeration value="SIN"/>
 *     <enumeration value="SON"/>
 *     <enumeration value="TAB"/>
 *     <enumeration value="TAM"/>
 *     <enumeration value="TLA"/>
 *     <enumeration value="VER"/>
 *     <enumeration value="YUC"/>
 *     <enumeration value="ZAC"/>
 *     <enumeration value="AL"/>
 *     <enumeration value="AK"/>
 *     <enumeration value="AZ"/>
 *     <enumeration value="AR"/>
 *     <enumeration value="CA"/>
 *     <enumeration value="NC"/>
 *     <enumeration value="SC"/>
 *     <enumeration value="CO"/>
 *     <enumeration value="CT"/>
 *     <enumeration value="ND"/>
 *     <enumeration value="SD"/>
 *     <enumeration value="DE"/>
 *     <enumeration value="FL"/>
 *     <enumeration value="GA"/>
 *     <enumeration value="HI"/>
 *     <enumeration value="ID"/>
 *     <enumeration value="IL"/>
 *     <enumeration value="IN"/>
 *     <enumeration value="IA"/>
 *     <enumeration value="KS"/>
 *     <enumeration value="KY"/>
 *     <enumeration value="LA"/>
 *     <enumeration value="ME"/>
 *     <enumeration value="MD"/>
 *     <enumeration value="MA"/>
 *     <enumeration value="MI"/>
 *     <enumeration value="MN"/>
 *     <enumeration value="MS"/>
 *     <enumeration value="MO"/>
 *     <enumeration value="MT"/>
 *     <enumeration value="NE"/>
 *     <enumeration value="NV"/>
 *     <enumeration value="NJ"/>
 *     <enumeration value="NY"/>
 *     <enumeration value="NH"/>
 *     <enumeration value="NM"/>
 *     <enumeration value="OH"/>
 *     <enumeration value="OK"/>
 *     <enumeration value="OR"/>
 *     <enumeration value="PA"/>
 *     <enumeration value="RI"/>
 *     <enumeration value="TN"/>
 *     <enumeration value="TX"/>
 *     <enumeration value="UT"/>
 *     <enumeration value="VT"/>
 *     <enumeration value="VA"/>
 *     <enumeration value="WV"/>
 *     <enumeration value="WA"/>
 *     <enumeration value="WI"/>
 *     <enumeration value="WY"/>
 *     <enumeration value="ON"/>
 *     <enumeration value="QC"/>
 *     <enumeration value="NS"/>
 *     <enumeration value="NB"/>
 *     <enumeration value="MB"/>
 *     <enumeration value="BC"/>
 *     <enumeration value="PE"/>
 *     <enumeration value="SK"/>
 *     <enumeration value="AB"/>
 *     <enumeration value="NL"/>
 *     <enumeration value="NT"/>
 *     <enumeration value="YT"/>
 *     <enumeration value="UN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "c_Estado", namespace = "http://www.sat.gob.mx/sitio_internet/cfd/catalogos")
@XmlEnum
public enum CEstado {

    AGU,
    BCN,
    BCS,
    CAM,
    CHP,
    CHH,
    COA,
    COL,
    DIF,
    CMX,
    DUR,
    GUA,
    GRO,
    HID,
    JAL,
    MEX,
    MIC,
    MOR,
    NAY,
    NLE,
    OAX,
    PUE,
    QUE,
    ROO,
    SLP,
    SIN,
    SON,
    TAB,
    TAM,
    TLA,
    VER,
    YUC,
    ZAC,
    AL,
    AK,
    AZ,
    AR,
    CA,
    NC,
    SC,
    CO,
    CT,
    ND,
    SD,
    DE,
    FL,
    GA,
    HI,
    ID,
    IL,
    IN,
    IA,
    KS,
    KY,
    LA,
    ME,
    MD,
    MA,
    MI,
    MN,
    MS,
    MO,
    MT,
    NE,
    NV,
    NJ,
    NY,
    NH,
    NM,
    OH,
    OK,
    OR,
    PA,
    RI,
    TN,
    TX,
    UT,
    VT,
    VA,
    WV,
    WA,
    WI,
    WY,
    ON,
    QC,
    NS,
    NB,
    MB,
    BC,
    PE,
    SK,
    AB,
    NL,
    NT,
    YT,
    UN;

    public String value() {
        return name();
    }

    public static CEstado fromValue(String v) {
        return valueOf(v);
    }

}
