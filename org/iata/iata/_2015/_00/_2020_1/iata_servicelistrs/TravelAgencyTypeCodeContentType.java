
package org.iata.iata._2015._00._2020_1.iata_servicelistrs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelAgencyTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TravelAgencyTypeCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="OnlineTravelAgency"/>
 *     &lt;enumeration value="TravelAgency"/>
 *     &lt;enumeration value="TravelManagementCompany"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TravelAgencyTypeCodeContentType")
@XmlEnum
public enum TravelAgencyTypeCodeContentType {

    @XmlEnumValue("OnlineTravelAgency")
    ONLINE_TRAVEL_AGENCY("OnlineTravelAgency"),
    @XmlEnumValue("TravelAgency")
    TRAVEL_AGENCY("TravelAgency"),
    @XmlEnumValue("TravelManagementCompany")
    TRAVEL_MANAGEMENT_COMPANY("TravelManagementCompany");
    private final String value;

    TravelAgencyTypeCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TravelAgencyTypeCodeContentType fromValue(String v) {
        for (TravelAgencyTypeCodeContentType c: TravelAgencyTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
