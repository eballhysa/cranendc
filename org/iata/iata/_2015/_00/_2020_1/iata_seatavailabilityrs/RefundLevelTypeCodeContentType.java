
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefundLevelTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RefundLevelTypeCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Full"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Partial"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RefundLevelTypeCodeContentType")
@XmlEnum
public enum RefundLevelTypeCodeContentType {


    /**
     * Fully Refundable
     * 
     */
    @XmlEnumValue("Full")
    FULL("Full"),

    /**
     * Non Refundable
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Partial")
    PARTIAL("Partial");
    private final String value;

    RefundLevelTypeCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefundLevelTypeCodeContentType fromValue(String v) {
        for (RefundLevelTypeCodeContentType c: RefundLevelTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
