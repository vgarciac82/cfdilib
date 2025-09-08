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
 * <p>Clase Java para c_RegimenFiscal.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * <pre>{@code
 * <simpleType name="c_RegimenFiscal">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <whiteSpace value="collapse"/>
 *     <enumeration value="601"/>
 *     <enumeration value="603"/>
 *     <enumeration value="605"/>
 *     <enumeration value="606"/>
 *     <enumeration value="607"/>
 *     <enumeration value="608"/>
 *     <enumeration value="609"/>
 *     <enumeration value="610"/>
 *     <enumeration value="611"/>
 *     <enumeration value="612"/>
 *     <enumeration value="614"/>
 *     <enumeration value="615"/>
 *     <enumeration value="616"/>
 *     <enumeration value="620"/>
 *     <enumeration value="621"/>
 *     <enumeration value="622"/>
 *     <enumeration value="623"/>
 *     <enumeration value="624"/>
 *     <enumeration value="625"/>
 *     <enumeration value="626"/>
 *     <enumeration value="628"/>
 *     <enumeration value="629"/>
 *     <enumeration value="630"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "c_RegimenFiscal", namespace = "http://www.sat.gob.mx/sitio_internet/cfd/catalogos")
@XmlEnum
public enum CRegimenFiscal {

    @XmlEnumValue("601")
    VALUE_1("601"),
    @XmlEnumValue("603")
    VALUE_2("603"),
    @XmlEnumValue("605")
    VALUE_3("605"),
    @XmlEnumValue("606")
    VALUE_4("606"),
    @XmlEnumValue("607")
    VALUE_5("607"),
    @XmlEnumValue("608")
    VALUE_6("608"),
    @XmlEnumValue("609")
    VALUE_7("609"),
    @XmlEnumValue("610")
    VALUE_8("610"),
    @XmlEnumValue("611")
    VALUE_9("611"),
    @XmlEnumValue("612")
    VALUE_10("612"),
    @XmlEnumValue("614")
    VALUE_11("614"),
    @XmlEnumValue("615")
    VALUE_12("615"),
    @XmlEnumValue("616")
    VALUE_13("616"),
    @XmlEnumValue("620")
    VALUE_14("620"),
    @XmlEnumValue("621")
    VALUE_15("621"),
    @XmlEnumValue("622")
    VALUE_16("622"),
    @XmlEnumValue("623")
    VALUE_17("623"),
    @XmlEnumValue("624")
    VALUE_18("624"),
    @XmlEnumValue("625")
    VALUE_19("625"),
    @XmlEnumValue("626")
    VALUE_20("626"),
    @XmlEnumValue("628")
    VALUE_21("628"),
    @XmlEnumValue("629")
    VALUE_22("629"),
    @XmlEnumValue("630")
    VALUE_23("630");
    private final String value;

    CRegimenFiscal(String v) {
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
    public static CRegimenFiscal fromValue(String v) {
        for (CRegimenFiscal c: CRegimenFiscal.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
