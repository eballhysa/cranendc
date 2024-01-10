
package org.iata.iata._2015._00._2020_1.iata_offerpricerq;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Use to select the quantity of Offer Items from the A La Carte Offer Items.
 * 
 * <p>Java class for SelectedALaCarteOfferItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectedALaCarteOfferItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ALaCarteOfferItemFlightAssociations" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}ALaCarteOfferItemFlightAssociationsType"/>
 *         &lt;element name="Qty" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}QtyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectedALaCarteOfferItemType", propOrder = {
    "aLaCarteOfferItemFlightAssociations",
    "qty"
})
public class SelectedALaCarteOfferItemType {

    @XmlElement(name = "ALaCarteOfferItemFlightAssociations", required = true)
    protected ALaCarteOfferItemFlightAssociationsType aLaCarteOfferItemFlightAssociations;
    @XmlElement(name = "Qty", required = true)
    protected BigDecimal qty;

    /**
     * Gets the value of the aLaCarteOfferItemFlightAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link ALaCarteOfferItemFlightAssociationsType }
     *     
     */
    public ALaCarteOfferItemFlightAssociationsType getALaCarteOfferItemFlightAssociations() {
        return aLaCarteOfferItemFlightAssociations;
    }

    /**
     * Sets the value of the aLaCarteOfferItemFlightAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ALaCarteOfferItemFlightAssociationsType }
     *     
     */
    public void setALaCarteOfferItemFlightAssociations(ALaCarteOfferItemFlightAssociationsType value) {
        this.aLaCarteOfferItemFlightAssociations = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
    }

}
