
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceBookingStatusCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceBookingStatusCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CONFIRMED"/>
 *     &lt;enumeration value="REQUESTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceBookingStatusCodeContentType")
@XmlEnum
public enum ServiceBookingStatusCodeContentType {


    /**
     * Inventory owner confirms he is able to provide the Service.
     * 
     */
    CONFIRMED,

    /**
     * OM requests the Service from the Inventory owner.
     * 
     */
    REQUESTED;

    public String value() {
        return name();
    }

    public static ServiceBookingStatusCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
