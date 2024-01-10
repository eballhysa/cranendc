
package org.iata.iata._2015._00._2020_1.iata_orderreshoprs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChangeTypeCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Flight"/>
 *     &lt;enumeration value="Name"/>
 *     &lt;enumeration value="Service"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChangeTypeCodeContentType")
@XmlEnum
public enum ChangeTypeCodeContentType {


    /**
     * This identifies Flight detail changes.
     *  
     *  changes to the core flight details. departure and arrival points and airline. 
     * 
     */
    @XmlEnumValue("Flight")
    FLIGHT("Flight"),

    /**
     * Name based changes. 
     *  
     *  Changes to the passenger(s) names.
     * 
     */
    @XmlEnumValue("Name")
    NAME("Name"),

    /**
     * This identifies Service non flight changes. 
     *  seat preferences/food/baggage etc.
     * 
     */
    @XmlEnumValue("Service")
    SERVICE("Service");
    private final String value;

    ChangeTypeCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChangeTypeCodeContentType fromValue(String v) {
        for (ChangeTypeCodeContentType c: ChangeTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
