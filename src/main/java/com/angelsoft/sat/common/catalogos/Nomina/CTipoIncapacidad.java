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
 * <p>Clase Java para c_TipoIncapacidad.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * <pre>{@code
 * <simpleType name="c_TipoIncapacidad">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <whiteSpace value="collapse"/>
 *     <enumeration value="01"/>
 *     <enumeration value="02"/>
 *     <enumeration value="03"/>
 *     <enumeration value="04"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "c_TipoIncapacidad", namespace = "http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina")
@XmlEnum
public enum CTipoIncapacidad {

    @XmlEnumValue("01")
    VALUE_1("01"),
    @XmlEnumValue("02")
    VALUE_2("02"),
    @XmlEnumValue("03")
    VALUE_3("03"),
    @XmlEnumValue("04")
    VALUE_4("04");
    private final String value;

    CTipoIncapacidad(String v) {
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
    public static CTipoIncapacidad fromValue(String v) {
        for (CTipoIncapacidad c: CTipoIncapacidad.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
