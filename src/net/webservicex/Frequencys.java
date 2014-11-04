
package net.webservicex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Frequencys.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Frequencys">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cyclePersecond"/>
 *     &lt;enumeration value="degreePerhour"/>
 *     &lt;enumeration value="degreePerminute"/>
 *     &lt;enumeration value="degreePersecond"/>
 *     &lt;enumeration value="millihertz"/>
 *     &lt;enumeration value="hertz"/>
 *     &lt;enumeration value="kilohertz"/>
 *     &lt;enumeration value="megahertz"/>
 *     &lt;enumeration value="gigahertz"/>
 *     &lt;enumeration value="terrahertz"/>
 *     &lt;enumeration value="radianPerhour"/>
 *     &lt;enumeration value="radianPerminute"/>
 *     &lt;enumeration value="radianPersecond"/>
 *     &lt;enumeration value="revolutionPerhour"/>
 *     &lt;enumeration value="revolutionPerminute"/>
 *     &lt;enumeration value="revolutionPersecond"/>
 *     &lt;enumeration value="fresnel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Frequencys")
@XmlEnum
public enum Frequencys {

    @XmlEnumValue("cyclePersecond")
    CYCLE_PERSECOND("cyclePersecond"),
    @XmlEnumValue("degreePerhour")
    DEGREE_PERHOUR("degreePerhour"),
    @XmlEnumValue("degreePerminute")
    DEGREE_PERMINUTE("degreePerminute"),
    @XmlEnumValue("degreePersecond")
    DEGREE_PERSECOND("degreePersecond"),
    @XmlEnumValue("millihertz")
    MILLIHERTZ("millihertz"),
    @XmlEnumValue("hertz")
    HERTZ("hertz"),
    @XmlEnumValue("kilohertz")
    KILOHERTZ("kilohertz"),
    @XmlEnumValue("megahertz")
    MEGAHERTZ("megahertz"),
    @XmlEnumValue("gigahertz")
    GIGAHERTZ("gigahertz"),
    @XmlEnumValue("terrahertz")
    TERRAHERTZ("terrahertz"),
    @XmlEnumValue("radianPerhour")
    RADIAN_PERHOUR("radianPerhour"),
    @XmlEnumValue("radianPerminute")
    RADIAN_PERMINUTE("radianPerminute"),
    @XmlEnumValue("radianPersecond")
    RADIAN_PERSECOND("radianPersecond"),
    @XmlEnumValue("revolutionPerhour")
    REVOLUTION_PERHOUR("revolutionPerhour"),
    @XmlEnumValue("revolutionPerminute")
    REVOLUTION_PERMINUTE("revolutionPerminute"),
    @XmlEnumValue("revolutionPersecond")
    REVOLUTION_PERSECOND("revolutionPersecond"),
    @XmlEnumValue("fresnel")
    FRESNEL("fresnel");
    private final String value;

    Frequencys(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Frequencys fromValue(String v) {
        for (Frequencys c: Frequencys.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
