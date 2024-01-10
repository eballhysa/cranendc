
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Add"/>
 *     &lt;enumeration value="Delete"/>
 *     &lt;enumeration value="Update"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionCodeContentType")
@XmlEnum
public enum ActionCodeContentType {

    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Update")
    UPDATE("Update");
    private final String value;

    ActionCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionCodeContentType fromValue(String v) {
        for (ActionCodeContentType c: ActionCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
