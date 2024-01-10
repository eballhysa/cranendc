
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportingTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportingTypeCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Airline"/>
 *     &lt;enumeration value="ARC"/>
 *     &lt;enumeration value="BSP"/>
 *     &lt;enumeration value="Not applicable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportingTypeCodeContentType")
@XmlEnum
public enum ReportingTypeCodeContentType {

    @XmlEnumValue("Airline")
    AIRLINE("Airline"),
    ARC("ARC"),
    BSP("BSP"),
    @XmlEnumValue("Not applicable")
    NOT_APPLICABLE("Not applicable");
    private final String value;

    ReportingTypeCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportingTypeCodeContentType fromValue(String v) {
        for (ReportingTypeCodeContentType c: ReportingTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
