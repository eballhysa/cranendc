
package org.iata.iata._2015._00._2020_1.iata_offerpricerq;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LengthUnitCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LengthUnitCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CMT"/>
 *     &lt;enumeration value="FOT"/>
 *     &lt;enumeration value="INH"/>
 *     &lt;enumeration value="MTR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LengthUnitCodeContentType")
@XmlEnum
public enum LengthUnitCodeContentType {


    /**
     * Centimeter
     * 
     */
    CMT,

    /**
     * Foot
     * 
     */
    FOT,

    /**
     * Inch
     * 
     */
    INH,

    /**
     * Meter
     * 
     */
    MTR;

    public String value() {
        return name();
    }

    public static LengthUnitCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
