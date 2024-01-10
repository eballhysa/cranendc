
package org.iata.iata._2015._00._2020_1.iata_orderreshoprs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reshop Price
 * 
 * <p>Java class for ReshopPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReshopPriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="AddPrice" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}PriceAndFareDetailsType"/>
 *         &lt;element name="PriceDifferential" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}PriceDifferentialType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReshopPriceType", propOrder = {
    "addPrice",
    "priceDifferential"
})
public class ReshopPriceType {

    @XmlElement(name = "AddPrice")
    protected PriceAndFareDetailsType addPrice;
    @XmlElement(name = "PriceDifferential")
    protected PriceDifferentialType priceDifferential;

    /**
     * Gets the value of the addPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceAndFareDetailsType }
     *     
     */
    public PriceAndFareDetailsType getAddPrice() {
        return addPrice;
    }

    /**
     * Sets the value of the addPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceAndFareDetailsType }
     *     
     */
    public void setAddPrice(PriceAndFareDetailsType value) {
        this.addPrice = value;
    }

    /**
     * Gets the value of the priceDifferential property.
     * 
     * @return
     *     possible object is
     *     {@link PriceDifferentialType }
     *     
     */
    public PriceDifferentialType getPriceDifferential() {
        return priceDifferential;
    }

    /**
     * Sets the value of the priceDifferential property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceDifferentialType }
     *     
     */
    public void setPriceDifferential(PriceDifferentialType value) {
        this.priceDifferential = value;
    }

}
