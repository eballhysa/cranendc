
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Validating carrier-assigned fare rule modification or override information.
 * 
 * <p>Java class for FareWaiverType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareWaiverType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareRuleWaiverCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CodeType"/>
 *         &lt;element name="FareWaiverTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareWaiverType", propOrder = {
    "fareRuleWaiverCode",
    "fareWaiverTypeCode"
})
public class FareWaiverType {

    @XmlElement(name = "FareRuleWaiverCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fareRuleWaiverCode;
    @XmlElement(name = "FareWaiverTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fareWaiverTypeCode;

    /**
     * Gets the value of the fareRuleWaiverCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareRuleWaiverCode() {
        return fareRuleWaiverCode;
    }

    /**
     * Sets the value of the fareRuleWaiverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareRuleWaiverCode(String value) {
        this.fareRuleWaiverCode = value;
    }

    /**
     * Gets the value of the fareWaiverTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareWaiverTypeCode() {
        return fareWaiverTypeCode;
    }

    /**
     * Sets the value of the fareWaiverTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareWaiverTypeCode(String value) {
        this.fareWaiverTypeCode = value;
    }

}
