
package org.iata.iata._2015._00._2020_1.iata_offerpricers;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddlNameTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddlNameTypeCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Father Surname"/>
 *     &lt;enumeration value="Mother Surname"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AddlNameTypeCodeContentType")
@XmlEnum
public enum AddlNameTypeCodeContentType {


    /**
     * This is the individuals fathers name surname which is part of the individuals full surname. 
     * 
     */
    @XmlEnumValue("Father Surname")
    FATHER_SURNAME("Father Surname"),

    /**
     * This is the individuals mothers name surname which is part of the individuals full surname. 
     * 
     */
    @XmlEnumValue("Mother Surname")
    MOTHER_SURNAME("Mother Surname");
    private final String value;

    AddlNameTypeCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddlNameTypeCodeContentType fromValue(String v) {
        for (AddlNameTypeCodeContentType c: AddlNameTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
