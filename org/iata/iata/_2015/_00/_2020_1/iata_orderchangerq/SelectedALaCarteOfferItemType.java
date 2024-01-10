
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

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
 *         &lt;element name="FlightAssociations" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}FlightAssociationsType" minOccurs="0"/>
 *         &lt;element name="Qty" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}QtyType"/>
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
    "flightAssociations",
    "qty"
})
public class SelectedALaCarteOfferItemType {

    @XmlElement(name = "FlightAssociations")
    protected FlightAssociationsType flightAssociations;
    @XmlElement(name = "Qty", required = true)
    protected BigDecimal qty;

    /**
     * Gets the value of the flightAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link FlightAssociationsType }
     *     
     */
    public FlightAssociationsType getFlightAssociations() {
        return flightAssociations;
    }

    /**
     * Sets the value of the flightAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightAssociationsType }
     *     
     */
    public void setFlightAssociations(FlightAssociationsType value) {
        this.flightAssociations = value;
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
