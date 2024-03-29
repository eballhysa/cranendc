
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information related to the calculation of the Fare amount by applying various rules to determine a final fare for an airline ticket.
 * 
 * <p>Java class for FareCalculationInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareCalculationInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddlInfoText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TextType"/>
 *         &lt;element name="PricingCodeText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TextType"/>
 *         &lt;element name="ReportingCodeText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TextType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareCalculationInfoType", propOrder = {
    "addlInfoText",
    "pricingCodeText",
    "reportingCodeText"
})
public class FareCalculationInfoType {

    @XmlElement(name = "AddlInfoText", required = true)
    protected String addlInfoText;
    @XmlElement(name = "PricingCodeText", required = true)
    protected String pricingCodeText;
    @XmlElement(name = "ReportingCodeText", required = true)
    protected String reportingCodeText;

    /**
     * Gets the value of the addlInfoText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddlInfoText() {
        return addlInfoText;
    }

    /**
     * Sets the value of the addlInfoText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddlInfoText(String value) {
        this.addlInfoText = value;
    }

    /**
     * Gets the value of the pricingCodeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingCodeText() {
        return pricingCodeText;
    }

    /**
     * Sets the value of the pricingCodeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingCodeText(String value) {
        this.pricingCodeText = value;
    }

    /**
     * Gets the value of the reportingCodeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingCodeText() {
        return reportingCodeText;
    }

    /**
     * Sets the value of the reportingCodeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingCodeText(String value) {
        this.reportingCodeText = value;
    }

}
