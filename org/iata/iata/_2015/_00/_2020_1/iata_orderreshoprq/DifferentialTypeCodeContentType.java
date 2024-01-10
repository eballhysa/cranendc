
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DifferentialTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DifferentialTypeCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AddCol"/>
 *     &lt;enumeration value="AddColAndRefund"/>
 *     &lt;enumeration value="AddColAndResidual"/>
 *     &lt;enumeration value="EvenExchange"/>
 *     &lt;enumeration value="Refund"/>
 *     &lt;enumeration value="Residual"/>
 *     &lt;enumeration value="Reusable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DifferentialTypeCodeContentType")
@XmlEnum
public enum DifferentialTypeCodeContentType {


    /**
     * the change will result into a new payment from the customer (applies to change scenarios)
     * 
     */
    @XmlEnumValue("AddCol")
    ADD_COL("AddCol"),

    /**
     * the change will result into both a new payment from customer and a customer refund (applies to cancellation and change scenarios) 
     * 
     */
    @XmlEnumValue("AddColAndRefund")
    ADD_COL_AND_REFUND("AddColAndRefund"),

    /**
     * the change will result into both a new payment from customer and a determined amount kept by airline for future use (applies to cancellation and change scenarios)
     * 
     */
    @XmlEnumValue("AddColAndResidual")
    ADD_COL_AND_RESIDUAL("AddColAndResidual"),

    /**
     * the change does not have any financial impact to the customer (applies to change scenarios) 
     * 
     */
    @XmlEnumValue("EvenExchange")
    EVEN_EXCHANGE("EvenExchange"),

    /**
     * the change will result into a customer refund (applies to cancellations and change scenarios) 
     * 
     */
    @XmlEnumValue("Refund")
    REFUND("Refund"),

    /**
     * the change will result into a determined amount kept by airline for future use (applies to cancellations and change scenarios)
     * 
     */
    @XmlEnumValue("Residual")
    RESIDUAL("Residual"),

    /**
     * the financial result of the change will be determined when customer will come back to select new journey options (applies to change scenarios when customer does not yet know how to reuse his money)
     * 
     */
    @XmlEnumValue("Reusable")
    REUSABLE("Reusable");
    private final String value;

    DifferentialTypeCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DifferentialTypeCodeContentType fromValue(String v) {
        for (DifferentialTypeCodeContentType c: DifferentialTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
