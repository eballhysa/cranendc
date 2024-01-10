
package org.iata.iata._2015._00._2020_1.iata_orderreshoprs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenderCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GenderCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="X"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GenderCodeContentType")
@XmlEnum
public enum GenderCodeContentType {


    /**
     * Female
     * 
     */
    F,

    /**
     * Male
     * 
     */
    M,

    /**
     * Unspecified
     * 
     */
    X;

    public String value() {
        return name();
    }

    public static GenderCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
