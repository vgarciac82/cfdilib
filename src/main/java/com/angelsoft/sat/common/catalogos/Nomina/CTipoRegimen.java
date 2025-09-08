//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package com.angelsoft.sat.common.catalogos.Nomina;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Clase Java para c_TipoRegimen.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * <pre>{@code
 * <simpleType name="c_TipoRegimen">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <whiteSpace value="collapse"/>
 *     <enumeration value="02"/>
 *     <enumeration value="03"/>
 *     <enumeration value="04"/>
 *     <enumeration value="05"/>
 *     <enumeration value="06"/>
 *     <enumeration value="07"/>
 *     <enumeration value="08"/>
 *     <enumeration value="09"/>
 *     <enumeration value="10"/>
 *     <enumeration value="11"/>
 *     <enumeration value="12"/>
 *     <enumeration value="13"/>
 *     <enumeration value="99"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "c_TipoRegimen", namespace = "http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina")
@XmlEnum
public enum CTipoRegimen {

    @XmlEnumValue("02")
    VALUE_1("02"),
    @XmlEnumValue("03")
    VALUE_2("03"),
    @XmlEnumValue("04")
    VALUE_3("04"),
    @XmlEnumValue("05")
    VALUE_4("05"),
    @XmlEnumValue("06")
    VALUE_5("06"),
    @XmlEnumValue("07")
    VALUE_6("07"),
    @XmlEnumValue("08")
    VALUE_7("08"),
    @XmlEnumValue("09")
    VALUE_8("09"),
    @XmlEnumValue("10")
    VALUE_9("10"),
    @XmlEnumValue("11")
    VALUE_10("11"),
    @XmlEnumValue("12")
    VALUE_11("12"),
    @XmlEnumValue("13")
    VALUE_12("13"),
    @XmlEnumValue("99")
    VALUE_13("99");
    private final String value;

    CTipoRegimen(String v) {
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
    public static CTipoRegimen fromValue(String v) {
        for (CTipoRegimen c: CTipoRegimen.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
