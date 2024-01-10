
package org.iata.iata._2015._00._2020_1.iata_offerpricers;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JourneyStageTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JourneyStageTypeCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="After Departure"/>
 *     &lt;enumeration value="No Show"/>
 *     &lt;enumeration value="Prior To Departure"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JourneyStageTypeCodeContentType")
@XmlEnum
public enum JourneyStageTypeCodeContentType {


    /**
     * After Departure
     *  
     *  any time after a journey segment which was included in the offer/order item has taken place irrespective of whether the segment was flown or not. 
     *  
     * 
     */
    @XmlEnumValue("After Departure")
    AFTER_DEPARTURE("After Departure"),

    /**
     * No Show
     *  when passenger(s) have not turned up for any of the flights in the itinerary.
     * 
     */
    @XmlEnumValue("No Show")
    NO_SHOW("No Show"),

    /**
     * Prior to Departure
     *  
     *  any time before the first flight segment but after payment received.
     * 
     */
    @XmlEnumValue("Prior To Departure")
    PRIOR_TO_DEPARTURE("Prior To Departure");
    private final String value;

    JourneyStageTypeCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JourneyStageTypeCodeContentType fromValue(String v) {
        for (JourneyStageTypeCodeContentType c: JourneyStageTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
