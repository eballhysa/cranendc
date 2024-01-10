
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsequenceOfInactionCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConsequenceOfInactionCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Auto-acceptance"/>
 *     &lt;enumeration value="Auto-cancellation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConsequenceOfInactionCodeContentType")
@XmlEnum
public enum ConsequenceOfInactionCodeContentType {


    /**
     * Auto-acceptance by airline
     * 
     */
    @XmlEnumValue("Auto-acceptance")
    AUTO_ACCEPTANCE("Auto-acceptance"),

    /**
     * Auto-cancellation by airline
     * 
     */
    @XmlEnumValue("Auto-cancellation")
    AUTO_CANCELLATION("Auto-cancellation");
    private final String value;

    ConsequenceOfInactionCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConsequenceOfInactionCodeContentType fromValue(String v) {
        for (ConsequenceOfInactionCodeContentType c: ConsequenceOfInactionCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
