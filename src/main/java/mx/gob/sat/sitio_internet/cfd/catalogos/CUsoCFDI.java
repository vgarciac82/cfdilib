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
 * <p>Clase Java para c_UsoCFDI.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * <pre>{@code
 * <simpleType name="c_UsoCFDI">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <whiteSpace value="collapse"/>
 *     <enumeration value="G01"/>
 *     <enumeration value="G02"/>
 *     <enumeration value="G03"/>
 *     <enumeration value="I01"/>
 *     <enumeration value="I02"/>
 *     <enumeration value="I03"/>
 *     <enumeration value="I04"/>
 *     <enumeration value="I05"/>
 *     <enumeration value="I06"/>
 *     <enumeration value="I07"/>
 *     <enumeration value="I08"/>
 *     <enumeration value="D01"/>
 *     <enumeration value="D02"/>
 *     <enumeration value="D03"/>
 *     <enumeration value="D04"/>
 *     <enumeration value="D05"/>
 *     <enumeration value="D06"/>
 *     <enumeration value="D07"/>
 *     <enumeration value="D08"/>
 *     <enumeration value="D09"/>
 *     <enumeration value="D10"/>
 *     <enumeration value="P01"/>
 *     <enumeration value="S01"/>
 *     <enumeration value="CP01"/>
 *     <enumeration value="CN01"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "c_UsoCFDI", namespace = "http://www.sat.gob.mx/sitio_internet/cfd/catalogos")
@XmlEnum
public enum CUsoCFDI {

    @XmlEnumValue("G01")
    G_01("G01"),
    @XmlEnumValue("G02")
    G_02("G02"),
    @XmlEnumValue("G03")
    G_03("G03"),
    @XmlEnumValue("I01")
    I_01("I01"),
    @XmlEnumValue("I02")
    I_02("I02"),
    @XmlEnumValue("I03")
    I_03("I03"),
    @XmlEnumValue("I04")
    I_04("I04"),
    @XmlEnumValue("I05")
    I_05("I05"),
    @XmlEnumValue("I06")
    I_06("I06"),
    @XmlEnumValue("I07")
    I_07("I07"),
    @XmlEnumValue("I08")
    I_08("I08"),
    @XmlEnumValue("D01")
    D_01("D01"),
    @XmlEnumValue("D02")
    D_02("D02"),
    @XmlEnumValue("D03")
    D_03("D03"),
    @XmlEnumValue("D04")
    D_04("D04"),
    @XmlEnumValue("D05")
    D_05("D05"),
    @XmlEnumValue("D06")
    D_06("D06"),
    @XmlEnumValue("D07")
    D_07("D07"),
    @XmlEnumValue("D08")
    D_08("D08"),
    @XmlEnumValue("D09")
    D_09("D09"),
    @XmlEnumValue("D10")
    D_10("D10"),
    @XmlEnumValue("P01")
    P_01("P01"),
    @XmlEnumValue("S01")
    S_01("S01"),
    @XmlEnumValue("CP01")
    CP_01("CP01"),
    @XmlEnumValue("CN01")
    CN_01("CN01");
    private final String value;

    CUsoCFDI(String v) {
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
    public static CUsoCFDI fromValue(String v) {
        for (CUsoCFDI c: CUsoCFDI.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
