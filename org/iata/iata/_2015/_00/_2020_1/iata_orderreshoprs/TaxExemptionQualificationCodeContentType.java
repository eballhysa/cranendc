
package org.iata.iata._2015._00._2020_1.iata_orderreshoprs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxExemptionQualificationCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxExemptionQualificationCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PSU"/>
 *     &lt;enumeration value="SEZ"/>
 *     &lt;enumeration value="UN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxExemptionQualificationCodeContentType")
@XmlEnum
public enum TaxExemptionQualificationCodeContentType {


    /**
     * The commitments to pay was accepted./At the Payment Level to indicate that a payment has been authorized, etc. or the status in not needed
     * 
     */
    PSU,

    /**
     * The payment process was done.
     * 
     */
    SEZ,

    /**
     * The value of compensation was allocated to the corresponding Order Item.
     * 
     */
    UN;

    public String value() {
        return name();
    }

    public static TaxExemptionQualificationCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
