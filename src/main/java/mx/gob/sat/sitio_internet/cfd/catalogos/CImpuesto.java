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
 * <p>Clase Java para c_Impuesto.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * <pre>{@code
 * <simpleType name="c_Impuesto">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <whiteSpace value="collapse"/>
 *     <enumeration value="001"/>
 *     <enumeration value="002"/>
 *     <enumeration value="003"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "c_Impuesto", namespace = "http://www.sat.gob.mx/sitio_internet/cfd/catalogos")
@XmlEnum
public enum CImpuesto {

    @XmlEnumValue("001")
    VALUE_1("001"),
    @XmlEnumValue("002")
    VALUE_2("002"),
    @XmlEnumValue("003")
    VALUE_3("003");
    private final String value;

    CImpuesto(String v) {
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
    public static CImpuesto fromValue(String v) {
        for (CImpuesto c: CImpuesto.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
