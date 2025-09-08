//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package com.angelsoft.sat.common.catalogos;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Clase Java para c_Moneda.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * <pre>{@code
 * <simpleType name="c_Moneda">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <whiteSpace value="collapse"/>
 *     <enumeration value="AED"/>
 *     <enumeration value="AFN"/>
 *     <enumeration value="ALL"/>
 *     <enumeration value="AMD"/>
 *     <enumeration value="ANG"/>
 *     <enumeration value="AOA"/>
 *     <enumeration value="ARS"/>
 *     <enumeration value="AUD"/>
 *     <enumeration value="AWG"/>
 *     <enumeration value="AZN"/>
 *     <enumeration value="BAM"/>
 *     <enumeration value="BBD"/>
 *     <enumeration value="BDT"/>
 *     <enumeration value="BGN"/>
 *     <enumeration value="BHD"/>
 *     <enumeration value="BIF"/>
 *     <enumeration value="BMD"/>
 *     <enumeration value="BND"/>
 *     <enumeration value="BOB"/>
 *     <enumeration value="BOV"/>
 *     <enumeration value="BRL"/>
 *     <enumeration value="BSD"/>
 *     <enumeration value="BTN"/>
 *     <enumeration value="BWP"/>
 *     <enumeration value="BYR"/>
 *     <enumeration value="BZD"/>
 *     <enumeration value="CAD"/>
 *     <enumeration value="CDF"/>
 *     <enumeration value="CHE"/>
 *     <enumeration value="CHF"/>
 *     <enumeration value="CHW"/>
 *     <enumeration value="CLF"/>
 *     <enumeration value="CLP"/>
 *     <enumeration value="CNH"/>
 *     <enumeration value="CNY"/>
 *     <enumeration value="COP"/>
 *     <enumeration value="COU"/>
 *     <enumeration value="CRC"/>
 *     <enumeration value="CUC"/>
 *     <enumeration value="CUP"/>
 *     <enumeration value="CVE"/>
 *     <enumeration value="CZK"/>
 *     <enumeration value="DJF"/>
 *     <enumeration value="DKK"/>
 *     <enumeration value="DOP"/>
 *     <enumeration value="DZD"/>
 *     <enumeration value="EGP"/>
 *     <enumeration value="ERN"/>
 *     <enumeration value="ESD"/>
 *     <enumeration value="ETB"/>
 *     <enumeration value="EUR"/>
 *     <enumeration value="FJD"/>
 *     <enumeration value="FKP"/>
 *     <enumeration value="GBP"/>
 *     <enumeration value="GEL"/>
 *     <enumeration value="GHS"/>
 *     <enumeration value="GIP"/>
 *     <enumeration value="GMD"/>
 *     <enumeration value="GNF"/>
 *     <enumeration value="GTQ"/>
 *     <enumeration value="GYD"/>
 *     <enumeration value="HKD"/>
 *     <enumeration value="HNL"/>
 *     <enumeration value="HRK"/>
 *     <enumeration value="HTG"/>
 *     <enumeration value="HUF"/>
 *     <enumeration value="IDR"/>
 *     <enumeration value="ILS"/>
 *     <enumeration value="INR"/>
 *     <enumeration value="IQD"/>
 *     <enumeration value="IRR"/>
 *     <enumeration value="ISK"/>
 *     <enumeration value="JMD"/>
 *     <enumeration value="JOD"/>
 *     <enumeration value="JPY"/>
 *     <enumeration value="KES"/>
 *     <enumeration value="KGS"/>
 *     <enumeration value="KHR"/>
 *     <enumeration value="KMF"/>
 *     <enumeration value="KPW"/>
 *     <enumeration value="KRW"/>
 *     <enumeration value="KWD"/>
 *     <enumeration value="KYD"/>
 *     <enumeration value="KZT"/>
 *     <enumeration value="LAK"/>
 *     <enumeration value="LBP"/>
 *     <enumeration value="LKR"/>
 *     <enumeration value="LRD"/>
 *     <enumeration value="LSL"/>
 *     <enumeration value="LYD"/>
 *     <enumeration value="MAD"/>
 *     <enumeration value="MDL"/>
 *     <enumeration value="MGA"/>
 *     <enumeration value="MKD"/>
 *     <enumeration value="MMK"/>
 *     <enumeration value="MNT"/>
 *     <enumeration value="MOP"/>
 *     <enumeration value="MRO"/>
 *     <enumeration value="MUR"/>
 *     <enumeration value="MVR"/>
 *     <enumeration value="MWK"/>
 *     <enumeration value="MXN"/>
 *     <enumeration value="MXV"/>
 *     <enumeration value="MYR"/>
 *     <enumeration value="MZN"/>
 *     <enumeration value="NAD"/>
 *     <enumeration value="NGN"/>
 *     <enumeration value="NIC"/>
 *     <enumeration value="NIO"/>
 *     <enumeration value="NOK"/>
 *     <enumeration value="NPR"/>
 *     <enumeration value="NZD"/>
 *     <enumeration value="OMR"/>
 *     <enumeration value="PAB"/>
 *     <enumeration value="PEN"/>
 *     <enumeration value="PGK"/>
 *     <enumeration value="PHP"/>
 *     <enumeration value="PKR"/>
 *     <enumeration value="PLN"/>
 *     <enumeration value="PYG"/>
 *     <enumeration value="QAR"/>
 *     <enumeration value="RON"/>
 *     <enumeration value="RSD"/>
 *     <enumeration value="RUB"/>
 *     <enumeration value="RWF"/>
 *     <enumeration value="SAR"/>
 *     <enumeration value="SBD"/>
 *     <enumeration value="SCR"/>
 *     <enumeration value="SDG"/>
 *     <enumeration value="SEK"/>
 *     <enumeration value="SGD"/>
 *     <enumeration value="SHP"/>
 *     <enumeration value="SLL"/>
 *     <enumeration value="SOS"/>
 *     <enumeration value="SRD"/>
 *     <enumeration value="SSP"/>
 *     <enumeration value="STD"/>
 *     <enumeration value="SVC"/>
 *     <enumeration value="SYP"/>
 *     <enumeration value="SZL"/>
 *     <enumeration value="THB"/>
 *     <enumeration value="TJS"/>
 *     <enumeration value="TMT"/>
 *     <enumeration value="TND"/>
 *     <enumeration value="TOP"/>
 *     <enumeration value="TRY"/>
 *     <enumeration value="TTD"/>
 *     <enumeration value="TWD"/>
 *     <enumeration value="TZS"/>
 *     <enumeration value="UAH"/>
 *     <enumeration value="UGX"/>
 *     <enumeration value="USD"/>
 *     <enumeration value="USN"/>
 *     <enumeration value="UYI"/>
 *     <enumeration value="UYP"/>
 *     <enumeration value="UYU"/>
 *     <enumeration value="UZS"/>
 *     <enumeration value="VEF"/>
 *     <enumeration value="VES"/>
 *     <enumeration value="VND"/>
 *     <enumeration value="VUV"/>
 *     <enumeration value="WST"/>
 *     <enumeration value="XAF"/>
 *     <enumeration value="XAG"/>
 *     <enumeration value="XAU"/>
 *     <enumeration value="XBA"/>
 *     <enumeration value="XBB"/>
 *     <enumeration value="XBC"/>
 *     <enumeration value="XBD"/>
 *     <enumeration value="XCD"/>
 *     <enumeration value="XDR"/>
 *     <enumeration value="XOF"/>
 *     <enumeration value="XPD"/>
 *     <enumeration value="XPF"/>
 *     <enumeration value="XPT"/>
 *     <enumeration value="XSU"/>
 *     <enumeration value="XTS"/>
 *     <enumeration value="XUA"/>
 *     <enumeration value="XXX"/>
 *     <enumeration value="YER"/>
 *     <enumeration value="ZAR"/>
 *     <enumeration value="ZMW"/>
 *     <enumeration value="ZWL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "c_Moneda", namespace = "http://www.sat.gob.mx/sitio_internet/cfd/catalogos")
@XmlEnum
public enum CMoneda {

    AED,
    AFN,
    ALL,
    AMD,
    ANG,
    AOA,
    ARS,
    AUD,
    AWG,
    AZN,
    BAM,
    BBD,
    BDT,
    BGN,
    BHD,
    BIF,
    BMD,
    BND,
    BOB,
    BOV,
    BRL,
    BSD,
    BTN,
    BWP,
    BYR,
    BZD,
    CAD,
    CDF,
    CHE,
    CHF,
    CHW,
    CLF,
    CLP,
    CNH,
    CNY,
    COP,
    COU,
    CRC,
    CUC,
    CUP,
    CVE,
    CZK,
    DJF,
    DKK,
    DOP,
    DZD,
    EGP,
    ERN,
    ESD,
    ETB,
    EUR,
    FJD,
    FKP,
    GBP,
    GEL,
    GHS,
    GIP,
    GMD,
    GNF,
    GTQ,
    GYD,
    HKD,
    HNL,
    HRK,
    HTG,
    HUF,
    IDR,
    ILS,
    INR,
    IQD,
    IRR,
    ISK,
    JMD,
    JOD,
    JPY,
    KES,
    KGS,
    KHR,
    KMF,
    KPW,
    KRW,
    KWD,
    KYD,
    KZT,
    LAK,
    LBP,
    LKR,
    LRD,
    LSL,
    LYD,
    MAD,
    MDL,
    MGA,
    MKD,
    MMK,
    MNT,
    MOP,
    MRO,
    MUR,
    MVR,
    MWK,
    MXN,
    MXV,
    MYR,
    MZN,
    NAD,
    NGN,
    NIC,
    NIO,
    NOK,
    NPR,
    NZD,
    OMR,
    PAB,
    PEN,
    PGK,
    PHP,
    PKR,
    PLN,
    PYG,
    QAR,
    RON,
    RSD,
    RUB,
    RWF,
    SAR,
    SBD,
    SCR,
    SDG,
    SEK,
    SGD,
    SHP,
    SLL,
    SOS,
    SRD,
    SSP,
    STD,
    SVC,
    SYP,
    SZL,
    THB,
    TJS,
    TMT,
    TND,
    TOP,
    TRY,
    TTD,
    TWD,
    TZS,
    UAH,
    UGX,
    USD,
    USN,
    UYI,
    UYP,
    UYU,
    UZS,
    VEF,
    VES,
    VND,
    VUV,
    WST,
    XAF,
    XAG,
    XAU,
    XBA,
    XBB,
    XBC,
    XBD,
    XCD,
    XDR,
    XOF,
    XPD,
    XPF,
    XPT,
    XSU,
    XTS,
    XUA,
    XXX,
    YER,
    ZAR,
    ZMW,
    ZWL;

    public String value() {
        return name();
    }

    public static CMoneda fromValue(String v) {
        return valueOf(v);
    }

}
