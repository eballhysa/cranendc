
package org.iata.iata._2015._00._2020_1.iata_offerpricerq;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellerFollowupActionCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellerFollowupActionCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Accept"/>
 *     &lt;enumeration value="Cancel"/>
 *     &lt;enumeration value="Contact Airline"/>
 *     &lt;enumeration value="Reshop"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SellerFollowupActionCodeContentType")
@XmlEnum
public enum SellerFollowupActionCodeContentType {


    /**
     * Accept
     * 
     */
    @XmlEnumValue("Accept")
    ACCEPT("Accept"),

    /**
     * Cancel, with ability to add optional FareWaiver
     * 
     */
    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),

    /**
     * Contact Airline with the ability to include an option URL for the contact details.
     * 
     */
    @XmlEnumValue("Contact Airline")
    CONTACT_AIRLINE("Contact Airline"),

    /**
     * Reshop, with ability to add optional FareWaiver
     * 
     */
    @XmlEnumValue("Reshop")
    RESHOP("Reshop");
    private final String value;

    SellerFollowupActionCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellerFollowupActionCodeContentType fromValue(String v) {
        for (SellerFollowupActionCodeContentType c: SellerFollowupActionCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
