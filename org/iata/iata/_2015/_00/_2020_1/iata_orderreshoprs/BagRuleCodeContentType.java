
package org.iata.iata._2015._00._2020_1.iata_orderreshoprs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BagRuleCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BagRuleCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Y"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BagRuleCodeContentType")
@XmlEnum
public enum BagRuleCodeContentType {


    /**
     * Disclosure with NO US DOT Reservation
     * 
     */
    D("D"),

    /**
     * No Disclosure or US DOT Reservation
     * 
     */
    N("N"),

    /**
     * Other
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Disclosure and US DOT Reservation
     * 
     */
    Y("Y");
    private final String value;

    BagRuleCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BagRuleCodeContentType fromValue(String v) {
        for (BagRuleCodeContentType c: BagRuleCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
