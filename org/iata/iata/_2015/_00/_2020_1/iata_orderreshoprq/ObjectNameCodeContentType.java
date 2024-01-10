
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectNameCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ObjectNameCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="OFFER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObjectNameCodeContentType")
@XmlEnum
public enum ObjectNameCodeContentType {


    /**
     * Centimeter
     * 
     */
    OFFER;

    public String value() {
        return name();
    }

    public static ObjectNameCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
