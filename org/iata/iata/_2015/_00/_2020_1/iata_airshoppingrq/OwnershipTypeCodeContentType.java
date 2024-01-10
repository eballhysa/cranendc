
package org.iata.iata._2015._00._2020_1.iata_airshoppingrq;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwnershipTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OwnershipTypeCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="SL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OwnershipTypeCodeContentType")
@XmlEnum
public enum OwnershipTypeCodeContentType {


    /**
     * Customer
     * 
     */
    CS,

    /**
     * Seller
     * 
     */
    SL;

    public String value() {
        return name();
    }

    public static OwnershipTypeCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
