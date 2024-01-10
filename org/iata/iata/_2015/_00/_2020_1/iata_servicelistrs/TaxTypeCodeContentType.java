
package org.iata.iata._2015._00._2020_1.iata_servicelistrs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxTypeCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Applied"/>
 *     &lt;enumeration value="Exempt"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxTypeCodeContentType")
@XmlEnum
public enum TaxTypeCodeContentType {

    @XmlEnumValue("Applied")
    APPLIED("Applied"),
    @XmlEnumValue("Exempt")
    EXEMPT("Exempt");
    private final String value;

    TaxTypeCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxTypeCodeContentType fromValue(String v) {
        for (TaxTypeCodeContentType c: TaxTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
