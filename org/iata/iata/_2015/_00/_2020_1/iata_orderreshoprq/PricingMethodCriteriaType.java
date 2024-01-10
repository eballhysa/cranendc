
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains information to identify how reservation was re-priced to obtain best published fare (Eg. best fare in same cabin, best fare in all cabins, other parameters to select best fare).
 * 
 * <p>Java class for PricingMethodCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingMethodCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BestPricingOptionText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingMethodCriteriaType", propOrder = {
    "bestPricingOptionText"
})
public class PricingMethodCriteriaType {

    @XmlElement(name = "BestPricingOptionText")
    protected String bestPricingOptionText;

    /**
     * Gets the value of the bestPricingOptionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBestPricingOptionText() {
        return bestPricingOptionText;
    }

    /**
     * Sets the value of the bestPricingOptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBestPricingOptionText(String value) {
        this.bestPricingOptionText = value;
    }

}
