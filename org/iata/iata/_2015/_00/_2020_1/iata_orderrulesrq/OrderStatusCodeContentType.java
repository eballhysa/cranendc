
package org.iata.iata._2015._00._2020_1.iata_orderrulesrq;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatusCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderStatusCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CLOSED"/>
 *     &lt;enumeration value="FROZEN"/>
 *     &lt;enumeration value="OPENED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderStatusCodeContentType")
@XmlEnum
public enum OrderStatusCodeContentType {


    /**
     * Once all Order Items are FULLY PAID and Services are either DELIVERED or REFUNDED or EXPIRED
     * 
     */
    CLOSED,

    /**
     * emergency lock
     * 
     */
    FROZEN,

    /**
     * Order was built based on offer information.
     * 
     */
    OPENED;

    public String value() {
        return name();
    }

    public static OrderStatusCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
