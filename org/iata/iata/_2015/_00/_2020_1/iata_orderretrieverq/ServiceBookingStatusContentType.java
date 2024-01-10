
package org.iata.iata._2015._00._2020_1.iata_orderretrieverq;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceBookingStatusContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceBookingStatusContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CONFIRMED"/>
 *     &lt;enumeration value="REQUESTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceBookingStatusContentType")
@XmlEnum
public enum ServiceBookingStatusContentType {


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

    public static ServiceBookingStatusContentType fromValue(String v) {
        return valueOf(v);
    }

}
