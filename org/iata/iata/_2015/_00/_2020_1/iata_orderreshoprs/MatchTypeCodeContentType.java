
package org.iata.iata._2015._00._2020_1.iata_orderreshoprs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MatchTypeCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Full"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Partial"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MatchTypeCodeContentType")
@XmlEnum
public enum MatchTypeCodeContentType {


    /**
     * Full
     * 
     */
    @XmlEnumValue("Full")
    FULL("Full"),

    /**
     * None
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * Other
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Partial
     * 
     */
    @XmlEnumValue("Partial")
    PARTIAL("Partial");
    private final String value;

    MatchTypeCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MatchTypeCodeContentType fromValue(String v) {
        for (MatchTypeCodeContentType c: MatchTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
