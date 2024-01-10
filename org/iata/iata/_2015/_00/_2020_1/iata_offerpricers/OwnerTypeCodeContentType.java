
package org.iata.iata._2015._00._2020_1.iata_offerpricers;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwnerTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OwnerTypeCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ORA"/>
 *     &lt;enumeration value="POA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OwnerTypeCodeContentType")
@XmlEnum
public enum OwnerTypeCodeContentType {


    /**
     * Offer Responsible Airline
     * 
     */
    ORA,

    /**
     * Participating Offer Airline
     * 
     */
    POA;

    public String value() {
        return name();
    }

    public static OwnerTypeCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
