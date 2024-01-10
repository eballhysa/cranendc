
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComponentPositionCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ComponentPositionCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="After"/>
 *     &lt;enumeration value="Before"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ComponentPositionCodeContentType")
@XmlEnum
public enum ComponentPositionCodeContentType {


    /**
     * After
     * 
     */
    @XmlEnumValue("After")
    AFTER("After"),

    /**
     * Before
     * 
     */
    @XmlEnumValue("Before")
    BEFORE("Before");
    private final String value;

    ComponentPositionCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComponentPositionCodeContentType fromValue(String v) {
        for (ComponentPositionCodeContentType c: ComponentPositionCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
