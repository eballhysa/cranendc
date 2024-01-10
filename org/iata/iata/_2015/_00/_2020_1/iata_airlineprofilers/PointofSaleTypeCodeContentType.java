
package org.iata.iata._2015._00._2020_1.iata_airlineprofilers;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointofSaleTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PointofSaleTypeCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="V"/>
 *     &lt;enumeration value="X"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PointofSaleTypeCodeContentType")
@XmlEnum
public enum PointofSaleTypeCodeContentType {


    /**
     * Airline Specific Codes
     * 
     */
    A,

    /**
     * Home IATA Agency No.
     * 
     */
    H,

    /**
     * IATA Travel Agency No.
     * 
     */
    I,

    /**
     * LNIATA Number (CRT Address)
     * 
     */
    L,

    /**
     * Pseudo Code/Travel Agency Code
     * 
     */
    T,

    /**
     * Home Travel Agency Code
     * 
     */
    U,

    /**
     * CRS/CXR Department Code
     * 
     */
    V,

    /**
     * Department/Identifier
     * 
     */
    X;

    public String value() {
        return name();
    }

    public static PointofSaleTypeCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
