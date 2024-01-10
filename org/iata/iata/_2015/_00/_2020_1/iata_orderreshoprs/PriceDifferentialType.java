
package org.iata.iata._2015._00._2020_1.iata_orderreshoprs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * For each OfferItem, this function allows the airline to inform the seller about amount differential type if this OfferItem is chosen. 
 * 
 * <p>Java class for PriceDifferentialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceDifferentialType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DifferentialTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}DifferentialTypeCodeType"/>
 *         &lt;element name="DiffPrice" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}PriceAndFareDetailsType"/>
 *         &lt;element name="GrandTotalAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}AmountType"/>
 *         &lt;element name="NewPrice" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}PriceAndFareDetailsType"/>
 *         &lt;element name="OldPrice" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}PriceAndFareDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceDifferentialType", propOrder = {
    "differentialTypeCode",
    "diffPrice",
    "grandTotalAmount",
    "newPrice",
    "oldPrice"
})
public class PriceDifferentialType {

    @XmlElement(name = "DifferentialTypeCode", required = true)
    @XmlSchemaType(name = "token")
    protected DifferentialTypeCodeContentType differentialTypeCode;
    @XmlElement(name = "DiffPrice", required = true)
    protected PriceAndFareDetailsType diffPrice;
    @XmlElement(name = "GrandTotalAmount", required = true)
    protected AmountType grandTotalAmount;
    @XmlElement(name = "NewPrice", required = true)
    protected PriceAndFareDetailsType newPrice;
    @XmlElement(name = "OldPrice")
    protected PriceAndFareDetailsType oldPrice;

    /**
     * Gets the value of the differentialTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DifferentialTypeCodeContentType }
     *     
     */
    public DifferentialTypeCodeContentType getDifferentialTypeCode() {
        return differentialTypeCode;
    }

    /**
     * Sets the value of the differentialTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DifferentialTypeCodeContentType }
     *     
     */
    public void setDifferentialTypeCode(DifferentialTypeCodeContentType value) {
        this.differentialTypeCode = value;
    }

    /**
     * Gets the value of the diffPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceAndFareDetailsType }
     *     
     */
    public PriceAndFareDetailsType getDiffPrice() {
        return diffPrice;
    }

    /**
     * Sets the value of the diffPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceAndFareDetailsType }
     *     
     */
    public void setDiffPrice(PriceAndFareDetailsType value) {
        this.diffPrice = value;
    }

    /**
     * Gets the value of the grandTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGrandTotalAmount() {
        return grandTotalAmount;
    }

    /**
     * Sets the value of the grandTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGrandTotalAmount(AmountType value) {
        this.grandTotalAmount = value;
    }

    /**
     * Gets the value of the newPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceAndFareDetailsType }
     *     
     */
    public PriceAndFareDetailsType getNewPrice() {
        return newPrice;
    }

    /**
     * Sets the value of the newPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceAndFareDetailsType }
     *     
     */
    public void setNewPrice(PriceAndFareDetailsType value) {
        this.newPrice = value;
    }

    /**
     * Gets the value of the oldPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceAndFareDetailsType }
     *     
     */
    public PriceAndFareDetailsType getOldPrice() {
        return oldPrice;
    }

    /**
     * Sets the value of the oldPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceAndFareDetailsType }
     *     
     */
    public void setOldPrice(PriceAndFareDetailsType value) {
        this.oldPrice = value;
    }

}
