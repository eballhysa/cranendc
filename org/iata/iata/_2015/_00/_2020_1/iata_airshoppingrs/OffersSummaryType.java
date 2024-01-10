
package org.iata.iata._2015._00._2020_1.iata_airshoppingrs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Offer summary that includes highest, lowest, and number of matched offers included in the response.
 * 
 * <p>Java class for OffersSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffersSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HighestOfferPrice" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}PriceSummaryType" minOccurs="0"/>
 *         &lt;element name="LowestOfferPrice" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}PriceSummaryType" minOccurs="0"/>
 *         &lt;element name="MatchedOfferQty" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}QtyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffersSummaryType", propOrder = {
    "highestOfferPrice",
    "lowestOfferPrice",
    "matchedOfferQty"
})
public class OffersSummaryType {

    @XmlElement(name = "HighestOfferPrice")
    protected PriceSummaryType highestOfferPrice;
    @XmlElement(name = "LowestOfferPrice")
    protected PriceSummaryType lowestOfferPrice;
    @XmlElement(name = "MatchedOfferQty")
    protected BigDecimal matchedOfferQty;

    /**
     * Gets the value of the highestOfferPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSummaryType }
     *     
     */
    public PriceSummaryType getHighestOfferPrice() {
        return highestOfferPrice;
    }

    /**
     * Sets the value of the highestOfferPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSummaryType }
     *     
     */
    public void setHighestOfferPrice(PriceSummaryType value) {
        this.highestOfferPrice = value;
    }

    /**
     * Gets the value of the lowestOfferPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSummaryType }
     *     
     */
    public PriceSummaryType getLowestOfferPrice() {
        return lowestOfferPrice;
    }

    /**
     * Sets the value of the lowestOfferPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSummaryType }
     *     
     */
    public void setLowestOfferPrice(PriceSummaryType value) {
        this.lowestOfferPrice = value;
    }

    /**
     * Gets the value of the matchedOfferQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMatchedOfferQty() {
        return matchedOfferQty;
    }

    /**
     * Sets the value of the matchedOfferQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMatchedOfferQty(BigDecimal value) {
        this.matchedOfferQty = value;
    }

}
