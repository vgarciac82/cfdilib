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
 * <p>Clase Java para c_Pais.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * <pre>{@code
 * <simpleType name="c_Pais">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <whiteSpace value="collapse"/>
 *     <enumeration value="AFG"/>
 *     <enumeration value="ALA"/>
 *     <enumeration value="ALB"/>
 *     <enumeration value="DEU"/>
 *     <enumeration value="AND"/>
 *     <enumeration value="AGO"/>
 *     <enumeration value="AIA"/>
 *     <enumeration value="ATA"/>
 *     <enumeration value="ATG"/>
 *     <enumeration value="SAU"/>
 *     <enumeration value="DZA"/>
 *     <enumeration value="ARG"/>
 *     <enumeration value="ARM"/>
 *     <enumeration value="ABW"/>
 *     <enumeration value="AUS"/>
 *     <enumeration value="AUT"/>
 *     <enumeration value="AZE"/>
 *     <enumeration value="BHS"/>
 *     <enumeration value="BGD"/>
 *     <enumeration value="BRB"/>
 *     <enumeration value="BHR"/>
 *     <enumeration value="BEL"/>
 *     <enumeration value="BLZ"/>
 *     <enumeration value="BEN"/>
 *     <enumeration value="BMU"/>
 *     <enumeration value="BLR"/>
 *     <enumeration value="MMR"/>
 *     <enumeration value="BOL"/>
 *     <enumeration value="BIH"/>
 *     <enumeration value="BWA"/>
 *     <enumeration value="BRA"/>
 *     <enumeration value="BRN"/>
 *     <enumeration value="BGR"/>
 *     <enumeration value="BFA"/>
 *     <enumeration value="BDI"/>
 *     <enumeration value="BTN"/>
 *     <enumeration value="CPV"/>
 *     <enumeration value="KHM"/>
 *     <enumeration value="CMR"/>
 *     <enumeration value="CAN"/>
 *     <enumeration value="QAT"/>
 *     <enumeration value="BES"/>
 *     <enumeration value="TCD"/>
 *     <enumeration value="CHL"/>
 *     <enumeration value="CHN"/>
 *     <enumeration value="CYP"/>
 *     <enumeration value="COL"/>
 *     <enumeration value="COM"/>
 *     <enumeration value="PRK"/>
 *     <enumeration value="KOR"/>
 *     <enumeration value="CIV"/>
 *     <enumeration value="CRI"/>
 *     <enumeration value="HRV"/>
 *     <enumeration value="CUB"/>
 *     <enumeration value="CUW"/>
 *     <enumeration value="DNK"/>
 *     <enumeration value="DMA"/>
 *     <enumeration value="ECU"/>
 *     <enumeration value="EGY"/>
 *     <enumeration value="SLV"/>
 *     <enumeration value="ARE"/>
 *     <enumeration value="ERI"/>
 *     <enumeration value="SVK"/>
 *     <enumeration value="SVN"/>
 *     <enumeration value="ESP"/>
 *     <enumeration value="USA"/>
 *     <enumeration value="EST"/>
 *     <enumeration value="ETH"/>
 *     <enumeration value="PHL"/>
 *     <enumeration value="FIN"/>
 *     <enumeration value="FJI"/>
 *     <enumeration value="FRA"/>
 *     <enumeration value="GAB"/>
 *     <enumeration value="GMB"/>
 *     <enumeration value="GEO"/>
 *     <enumeration value="GHA"/>
 *     <enumeration value="GIB"/>
 *     <enumeration value="GRD"/>
 *     <enumeration value="GRC"/>
 *     <enumeration value="GRL"/>
 *     <enumeration value="GLP"/>
 *     <enumeration value="GUM"/>
 *     <enumeration value="GTM"/>
 *     <enumeration value="GUF"/>
 *     <enumeration value="GGY"/>
 *     <enumeration value="GIN"/>
 *     <enumeration value="GNB"/>
 *     <enumeration value="GNQ"/>
 *     <enumeration value="GUY"/>
 *     <enumeration value="HTI"/>
 *     <enumeration value="HND"/>
 *     <enumeration value="HKG"/>
 *     <enumeration value="HUN"/>
 *     <enumeration value="IND"/>
 *     <enumeration value="IDN"/>
 *     <enumeration value="IRQ"/>
 *     <enumeration value="IRN"/>
 *     <enumeration value="IRL"/>
 *     <enumeration value="BVT"/>
 *     <enumeration value="IMN"/>
 *     <enumeration value="CXR"/>
 *     <enumeration value="NFK"/>
 *     <enumeration value="ISL"/>
 *     <enumeration value="CYM"/>
 *     <enumeration value="CCK"/>
 *     <enumeration value="COK"/>
 *     <enumeration value="FRO"/>
 *     <enumeration value="SGS"/>
 *     <enumeration value="HMD"/>
 *     <enumeration value="FLK"/>
 *     <enumeration value="MNP"/>
 *     <enumeration value="MHL"/>
 *     <enumeration value="PCN"/>
 *     <enumeration value="SLB"/>
 *     <enumeration value="TCA"/>
 *     <enumeration value="UMI"/>
 *     <enumeration value="VGB"/>
 *     <enumeration value="VIR"/>
 *     <enumeration value="ISR"/>
 *     <enumeration value="ITA"/>
 *     <enumeration value="JAM"/>
 *     <enumeration value="JPN"/>
 *     <enumeration value="JEY"/>
 *     <enumeration value="JOR"/>
 *     <enumeration value="KAZ"/>
 *     <enumeration value="KEN"/>
 *     <enumeration value="KGZ"/>
 *     <enumeration value="KIR"/>
 *     <enumeration value="KWT"/>
 *     <enumeration value="LAO"/>
 *     <enumeration value="LSO"/>
 *     <enumeration value="LVA"/>
 *     <enumeration value="LBN"/>
 *     <enumeration value="LBR"/>
 *     <enumeration value="LBY"/>
 *     <enumeration value="LIE"/>
 *     <enumeration value="LTU"/>
 *     <enumeration value="LUX"/>
 *     <enumeration value="MAC"/>
 *     <enumeration value="MDG"/>
 *     <enumeration value="MYS"/>
 *     <enumeration value="MWI"/>
 *     <enumeration value="MDV"/>
 *     <enumeration value="MLI"/>
 *     <enumeration value="MLT"/>
 *     <enumeration value="MAR"/>
 *     <enumeration value="MTQ"/>
 *     <enumeration value="MUS"/>
 *     <enumeration value="MRT"/>
 *     <enumeration value="MYT"/>
 *     <enumeration value="MEX"/>
 *     <enumeration value="FSM"/>
 *     <enumeration value="MDA"/>
 *     <enumeration value="MCO"/>
 *     <enumeration value="MNG"/>
 *     <enumeration value="MNE"/>
 *     <enumeration value="MSR"/>
 *     <enumeration value="MOZ"/>
 *     <enumeration value="NAM"/>
 *     <enumeration value="NRU"/>
 *     <enumeration value="NPL"/>
 *     <enumeration value="NIC"/>
 *     <enumeration value="NER"/>
 *     <enumeration value="NGA"/>
 *     <enumeration value="NIU"/>
 *     <enumeration value="NOR"/>
 *     <enumeration value="NCL"/>
 *     <enumeration value="NZL"/>
 *     <enumeration value="OMN"/>
 *     <enumeration value="NLD"/>
 *     <enumeration value="PAK"/>
 *     <enumeration value="PLW"/>
 *     <enumeration value="PSE"/>
 *     <enumeration value="PAN"/>
 *     <enumeration value="PNG"/>
 *     <enumeration value="PRY"/>
 *     <enumeration value="PER"/>
 *     <enumeration value="PYF"/>
 *     <enumeration value="POL"/>
 *     <enumeration value="PRT"/>
 *     <enumeration value="PRI"/>
 *     <enumeration value="GBR"/>
 *     <enumeration value="CAF"/>
 *     <enumeration value="CZE"/>
 *     <enumeration value="MKD"/>
 *     <enumeration value="COG"/>
 *     <enumeration value="COD"/>
 *     <enumeration value="DOM"/>
 *     <enumeration value="REU"/>
 *     <enumeration value="RWA"/>
 *     <enumeration value="ROU"/>
 *     <enumeration value="RUS"/>
 *     <enumeration value="ESH"/>
 *     <enumeration value="WSM"/>
 *     <enumeration value="ASM"/>
 *     <enumeration value="BLM"/>
 *     <enumeration value="KNA"/>
 *     <enumeration value="SMR"/>
 *     <enumeration value="MAF"/>
 *     <enumeration value="SPM"/>
 *     <enumeration value="VCT"/>
 *     <enumeration value="SHN"/>
 *     <enumeration value="LCA"/>
 *     <enumeration value="STP"/>
 *     <enumeration value="SEN"/>
 *     <enumeration value="SRB"/>
 *     <enumeration value="SYC"/>
 *     <enumeration value="SLE"/>
 *     <enumeration value="SGP"/>
 *     <enumeration value="SXM"/>
 *     <enumeration value="SYR"/>
 *     <enumeration value="SOM"/>
 *     <enumeration value="LKA"/>
 *     <enumeration value="SWZ"/>
 *     <enumeration value="ZAF"/>
 *     <enumeration value="SDN"/>
 *     <enumeration value="SSD"/>
 *     <enumeration value="SWE"/>
 *     <enumeration value="CHE"/>
 *     <enumeration value="SUR"/>
 *     <enumeration value="SJM"/>
 *     <enumeration value="THA"/>
 *     <enumeration value="TWN"/>
 *     <enumeration value="TZA"/>
 *     <enumeration value="TJK"/>
 *     <enumeration value="IOT"/>
 *     <enumeration value="ATF"/>
 *     <enumeration value="TLS"/>
 *     <enumeration value="TGO"/>
 *     <enumeration value="TKL"/>
 *     <enumeration value="TON"/>
 *     <enumeration value="TTO"/>
 *     <enumeration value="TUN"/>
 *     <enumeration value="TKM"/>
 *     <enumeration value="TUR"/>
 *     <enumeration value="TUV"/>
 *     <enumeration value="UKR"/>
 *     <enumeration value="UGA"/>
 *     <enumeration value="URY"/>
 *     <enumeration value="UZB"/>
 *     <enumeration value="VUT"/>
 *     <enumeration value="VAT"/>
 *     <enumeration value="VEN"/>
 *     <enumeration value="VNM"/>
 *     <enumeration value="WLF"/>
 *     <enumeration value="YEM"/>
 *     <enumeration value="DJI"/>
 *     <enumeration value="ZMB"/>
 *     <enumeration value="ZWE"/>
 *     <enumeration value="ZZZ"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "c_Pais", namespace = "http://www.sat.gob.mx/sitio_internet/cfd/catalogos")
@XmlEnum
public enum CPais {

    AFG,
    ALA,
    ALB,
    DEU,
    AND,
    AGO,
    AIA,
    ATA,
    ATG,
    SAU,
    DZA,
    ARG,
    ARM,
    ABW,
    AUS,
    AUT,
    AZE,
    BHS,
    BGD,
    BRB,
    BHR,
    BEL,
    BLZ,
    BEN,
    BMU,
    BLR,
    MMR,
    BOL,
    BIH,
    BWA,
    BRA,
    BRN,
    BGR,
    BFA,
    BDI,
    BTN,
    CPV,
    KHM,
    CMR,
    CAN,
    QAT,
    BES,
    TCD,
    CHL,
    CHN,
    CYP,
    COL,
    COM,
    PRK,
    KOR,
    CIV,
    CRI,
    HRV,
    CUB,
    CUW,
    DNK,
    DMA,
    ECU,
    EGY,
    SLV,
    ARE,
    ERI,
    SVK,
    SVN,
    ESP,
    USA,
    EST,
    ETH,
    PHL,
    FIN,
    FJI,
    FRA,
    GAB,
    GMB,
    GEO,
    GHA,
    GIB,
    GRD,
    GRC,
    GRL,
    GLP,
    GUM,
    GTM,
    GUF,
    GGY,
    GIN,
    GNB,
    GNQ,
    GUY,
    HTI,
    HND,
    HKG,
    HUN,
    IND,
    IDN,
    IRQ,
    IRN,
    IRL,
    BVT,
    IMN,
    CXR,
    NFK,
    ISL,
    CYM,
    CCK,
    COK,
    FRO,
    SGS,
    HMD,
    FLK,
    MNP,
    MHL,
    PCN,
    SLB,
    TCA,
    UMI,
    VGB,
    VIR,
    ISR,
    ITA,
    JAM,
    JPN,
    JEY,
    JOR,
    KAZ,
    KEN,
    KGZ,
    KIR,
    KWT,
    LAO,
    LSO,
    LVA,
    LBN,
    LBR,
    LBY,
    LIE,
    LTU,
    LUX,
    MAC,
    MDG,
    MYS,
    MWI,
    MDV,
    MLI,
    MLT,
    MAR,
    MTQ,
    MUS,
    MRT,
    MYT,
    MEX,
    FSM,
    MDA,
    MCO,
    MNG,
    MNE,
    MSR,
    MOZ,
    NAM,
    NRU,
    NPL,
    NIC,
    NER,
    NGA,
    NIU,
    NOR,
    NCL,
    NZL,
    OMN,
    NLD,
    PAK,
    PLW,
    PSE,
    PAN,
    PNG,
    PRY,
    PER,
    PYF,
    POL,
    PRT,
    PRI,
    GBR,
    CAF,
    CZE,
    MKD,
    COG,
    COD,
    DOM,
    REU,
    RWA,
    ROU,
    RUS,
    ESH,
    WSM,
    ASM,
    BLM,
    KNA,
    SMR,
    MAF,
    SPM,
    VCT,
    SHN,
    LCA,
    STP,
    SEN,
    SRB,
    SYC,
    SLE,
    SGP,
    SXM,
    SYR,
    SOM,
    LKA,
    SWZ,
    ZAF,
    SDN,
    SSD,
    SWE,
    CHE,
    SUR,
    SJM,
    THA,
    TWN,
    TZA,
    TJK,
    IOT,
    ATF,
    TLS,
    TGO,
    TKL,
    TON,
    TTO,
    TUN,
    TKM,
    TUR,
    TUV,
    UKR,
    UGA,
    URY,
    UZB,
    VUT,
    VAT,
    VEN,
    VNM,
    WLF,
    YEM,
    DJI,
    ZMB,
    ZWE,
    ZZZ;

    public String value() {
        return name();
    }

    public static CPais fromValue(String v) {
        return valueOf(v);
    }

}
