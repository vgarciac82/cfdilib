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
 * <p>Clase Java para c_RiesgoPuesto.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * <pre>{@code
 * <simpleType name="c_RiesgoPuesto">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <whiteSpace value="collapse"/>
 *     <enumeration value="1"/>
 *     <enumeration value="2"/>
 *     <enumeration value="3"/>
 *     <enumeration value="4"/>
 *     <enumeration value="5"/>
 *     <enumeration value="99"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "c_RiesgoPuesto", namespace = "http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina")
@XmlEnum
public enum CRiesgoPuesto {

    @XmlEnumValue("1")
    VALUE_1("1"),
    @XmlEnumValue("2")
    VALUE_2("2"),
    @XmlEnumValue("3")
    VALUE_3("3"),
    @XmlEnumValue("4")
    VALUE_4("4"),
    @XmlEnumValue("5")
    VALUE_5("5"),
    @XmlEnumValue("99")
    VALUE_6("99");
    private final String value;

    CRiesgoPuesto(String v) {
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
    public static CRiesgoPuesto fromValue(String v) {
        for (CRiesgoPuesto c: CRiesgoPuesto.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
