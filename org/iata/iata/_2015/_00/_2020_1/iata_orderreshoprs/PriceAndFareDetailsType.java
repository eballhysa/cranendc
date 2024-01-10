
package org.iata.iata._2015._00._2020_1.iata_orderreshoprs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceAndFareDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceAndFareDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareDetail" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}FareDetailType" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}PriceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceAndFareDetailsType", propOrder = {
    "fareDetail",
    "price"
})
public class PriceAndFareDetailsType {

    @XmlElement(name = "FareDetail")
    protected FareDetailType fareDetail;
    @XmlElement(name = "Price", required = true)
    protected PriceType price;

    /**
     * Gets the value of the fareDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FareDetailType }
     *     
     */
    public FareDetailType getFareDetail() {
        return fareDetail;
    }

    /**
     * Sets the value of the fareDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDetailType }
     *     
     */
    public void setFareDetail(FareDetailType value) {
        this.fareDetail = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setPrice(PriceType value) {
        this.price = value;
    }

}
