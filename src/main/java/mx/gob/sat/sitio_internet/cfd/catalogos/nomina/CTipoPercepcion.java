//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package mx.gob.sat.sitio_internet.cfd.catalogos.nomina;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Clase Java para c_TipoPercepcion.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * <pre>{@code
 * <simpleType name="c_TipoPercepcion">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <whiteSpace value="collapse"/>
 *     <enumeration value="001"/>
 *     <enumeration value="002"/>
 *     <enumeration value="003"/>
 *     <enumeration value="004"/>
 *     <enumeration value="005"/>
 *     <enumeration value="006"/>
 *     <enumeration value="009"/>
 *     <enumeration value="010"/>
 *     <enumeration value="011"/>
 *     <enumeration value="012"/>
 *     <enumeration value="013"/>
 *     <enumeration value="014"/>
 *     <enumeration value="015"/>
 *     <enumeration value="019"/>
 *     <enumeration value="020"/>
 *     <enumeration value="021"/>
 *     <enumeration value="022"/>
 *     <enumeration value="023"/>
 *     <enumeration value="024"/>
 *     <enumeration value="025"/>
 *     <enumeration value="026"/>
 *     <enumeration value="027"/>
 *     <enumeration value="028"/>
 *     <enumeration value="029"/>
 *     <enumeration value="030"/>
 *     <enumeration value="031"/>
 *     <enumeration value="032"/>
 *     <enumeration value="033"/>
 *     <enumeration value="034"/>
 *     <enumeration value="035"/>
 *     <enumeration value="036"/>
 *     <enumeration value="037"/>
 *     <enumeration value="038"/>
 *     <enumeration value="039"/>
 *     <enumeration value="044"/>
 *     <enumeration value="045"/>
 *     <enumeration value="046"/>
 *     <enumeration value="047"/>
 *     <enumeration value="048"/>
 *     <enumeration value="049"/>
 *     <enumeration value="050"/>
 *     <enumeration value="051"/>
 *     <enumeration value="052"/>
 *     <enumeration value="053"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "c_TipoPercepcion", namespace = "http://www.sat.gob.mx/sitio_internet/cfd/catalogos/Nomina")
@XmlEnum
public enum CTipoPercepcion {

    @XmlEnumValue("001")
    VALUE_1("001"),
    @XmlEnumValue("002")
    VALUE_2("002"),
    @XmlEnumValue("003")
    VALUE_3("003"),
    @XmlEnumValue("004")
    VALUE_4("004"),
    @XmlEnumValue("005")
    VALUE_5("005"),
    @XmlEnumValue("006")
    VALUE_6("006"),
    @XmlEnumValue("009")
    VALUE_7("009"),
    @XmlEnumValue("010")
    VALUE_8("010"),
    @XmlEnumValue("011")
    VALUE_9("011"),
    @XmlEnumValue("012")
    VALUE_10("012"),
    @XmlEnumValue("013")
    VALUE_11("013"),
    @XmlEnumValue("014")
    VALUE_12("014"),
    @XmlEnumValue("015")
    VALUE_13("015"),
    @XmlEnumValue("019")
    VALUE_14("019"),
    @XmlEnumValue("020")
    VALUE_15("020"),
    @XmlEnumValue("021")
    VALUE_16("021"),
    @XmlEnumValue("022")
    VALUE_17("022"),
    @XmlEnumValue("023")
    VALUE_18("023"),
    @XmlEnumValue("024")
    VALUE_19("024"),
    @XmlEnumValue("025")
    VALUE_20("025"),
    @XmlEnumValue("026")
    VALUE_21("026"),
    @XmlEnumValue("027")
    VALUE_22("027"),
    @XmlEnumValue("028")
    VALUE_23("028"),
    @XmlEnumValue("029")
    VALUE_24("029"),
    @XmlEnumValue("030")
    VALUE_25("030"),
    @XmlEnumValue("031")
    VALUE_26("031"),
    @XmlEnumValue("032")
    VALUE_27("032"),
    @XmlEnumValue("033")
    VALUE_28("033"),
    @XmlEnumValue("034")
    VALUE_29("034"),
    @XmlEnumValue("035")
    VALUE_30("035"),
    @XmlEnumValue("036")
    VALUE_31("036"),
    @XmlEnumValue("037")
    VALUE_32("037"),
    @XmlEnumValue("038")
    VALUE_33("038"),
    @XmlEnumValue("039")
    VALUE_34("039"),
    @XmlEnumValue("044")
    VALUE_35("044"),
    @XmlEnumValue("045")
    VALUE_36("045"),
    @XmlEnumValue("046")
    VALUE_37("046"),
    @XmlEnumValue("047")
    VALUE_38("047"),
    @XmlEnumValue("048")
    VALUE_39("048"),
    @XmlEnumValue("049")
    VALUE_40("049"),
    @XmlEnumValue("050")
    VALUE_41("050"),
    @XmlEnumValue("051")
    VALUE_42("051"),
    @XmlEnumValue("052")
    VALUE_43("052"),
    @XmlEnumValue("053")
    VALUE_44("053");
    private final String value;

    CTipoPercepcion(String v) {
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
    public static CTipoPercepcion fromValue(String v) {
        for (CTipoPercepcion c: CTipoPercepcion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
