
package org.iata.iata._2015._00._2020_1.iata_airshoppingrq;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightCharacteristicCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlightCharacteristicCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AirportChange"/>
 *     &lt;enumeration value="Direct"/>
 *     &lt;enumeration value="NonStop"/>
 *     &lt;enumeration value="OvernightStop"/>
 *     &lt;enumeration value="RedEye"/>
 *     &lt;enumeration value="WaitList"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlightCharacteristicCodeContentType")
@XmlEnum
public enum FlightCharacteristicCodeContentType {

    @XmlEnumValue("AirportChange")
    AIRPORT_CHANGE("AirportChange"),
    @XmlEnumValue("Direct")
    DIRECT("Direct"),
    @XmlEnumValue("NonStop")
    NON_STOP("NonStop"),
    @XmlEnumValue("OvernightStop")
    OVERNIGHT_STOP("OvernightStop"),
    @XmlEnumValue("RedEye")
    RED_EYE("RedEye"),
    @XmlEnumValue("WaitList")
    WAIT_LIST("WaitList");
    private final String value;

    FlightCharacteristicCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlightCharacteristicCodeContentType fromValue(String v) {
        for (FlightCharacteristicCodeContentType c: FlightCharacteristicCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
