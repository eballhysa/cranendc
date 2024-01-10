
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeckCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeckCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Lower"/>
 *     &lt;enumeration value="Main"/>
 *     &lt;enumeration value="Upper"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeckCodeContentType")
@XmlEnum
public enum DeckCodeContentType {


    /**
     * Lower Deck
     * 
     */
    @XmlEnumValue("Lower")
    LOWER("Lower"),

    /**
     * Main Deck
     * 
     */
    @XmlEnumValue("Main")
    MAIN("Main"),

    /**
     * Upper Deck
     * 
     */
    @XmlEnumValue("Upper")
    UPPER("Upper");
    private final String value;

    DeckCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeckCodeContentType fromValue(String v) {
        for (DeckCodeContentType c: DeckCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
