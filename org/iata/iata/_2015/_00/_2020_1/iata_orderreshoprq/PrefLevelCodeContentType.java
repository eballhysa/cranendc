
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrefLevelCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrefLevelCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Exclude"/>
 *     &lt;enumeration value="Preferred"/>
 *     &lt;enumeration value="Required"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrefLevelCodeContentType")
@XmlEnum
public enum PrefLevelCodeContentType {

    @XmlEnumValue("Exclude")
    EXCLUDE("Exclude"),
    @XmlEnumValue("Preferred")
    PREFERRED("Preferred"),

    /**
     * female description
     * 
     */
    @XmlEnumValue("Required")
    REQUIRED("Required");
    private final String value;

    PrefLevelCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrefLevelCodeContentType fromValue(String v) {
        for (PrefLevelCodeContentType c: PrefLevelCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
