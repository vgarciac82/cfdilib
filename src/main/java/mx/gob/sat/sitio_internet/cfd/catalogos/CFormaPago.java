//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package mx.gob.sat.sitio_internet.cfd.catalogos;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Clase Java para c_FormaPago.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * <pre>{@code
 * <simpleType name="c_FormaPago">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <whiteSpace value="collapse"/>
 *     <enumeration value="01"/>
 *     <enumeration value="02"/>
 *     <enumeration value="03"/>
 *     <enumeration value="04"/>
 *     <enumeration value="05"/>
 *     <enumeration value="06"/>
 *     <enumeration value="08"/>
 *     <enumeration value="12"/>
 *     <enumeration value="13"/>
 *     <enumeration value="14"/>
 *     <enumeration value="15"/>
 *     <enumeration value="17"/>
 *     <enumeration value="23"/>
 *     <enumeration value="24"/>
 *     <enumeration value="25"/>
 *     <enumeration value="26"/>
 *     <enumeration value="27"/>
 *     <enumeration value="28"/>
 *     <enumeration value="29"/>
 *     <enumeration value="30"/>
 *     <enumeration value="31"/>
 *     <enumeration value="99"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "c_FormaPago", namespace = "http://www.sat.gob.mx/sitio_internet/cfd/catalogos")
@XmlEnum
public enum CFormaPago {

    @XmlEnumValue("01")
    VALUE_1("01"),
    @XmlEnumValue("02")
    VALUE_2("02"),
    @XmlEnumValue("03")
    VALUE_3("03"),
    @XmlEnumValue("04")
    VALUE_4("04"),
    @XmlEnumValue("05")
    VALUE_5("05"),
    @XmlEnumValue("06")
    VALUE_6("06"),
    @XmlEnumValue("08")
    VALUE_7("08"),
    @XmlEnumValue("12")
    VALUE_8("12"),
    @XmlEnumValue("13")
    VALUE_9("13"),
    @XmlEnumValue("14")
    VALUE_10("14"),
    @XmlEnumValue("15")
    VALUE_11("15"),
    @XmlEnumValue("17")
    VALUE_12("17"),
    @XmlEnumValue("23")
    VALUE_13("23"),
    @XmlEnumValue("24")
    VALUE_14("24"),
    @XmlEnumValue("25")
    VALUE_15("25"),
    @XmlEnumValue("26")
    VALUE_16("26"),
    @XmlEnumValue("27")
    VALUE_17("27"),
    @XmlEnumValue("28")
    VALUE_18("28"),
    @XmlEnumValue("29")
    VALUE_19("29"),
    @XmlEnumValue("30")
    VALUE_20("30"),
    @XmlEnumValue("31")
    VALUE_21("31"),
    @XmlEnumValue("99")
    VALUE_22("99");
    private final String value;

    CFormaPago(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static CFormaPago fromValue(String v) {
        for (CFormaPago c: CFormaPago.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
