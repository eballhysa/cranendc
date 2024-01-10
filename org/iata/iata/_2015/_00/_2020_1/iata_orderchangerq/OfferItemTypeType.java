
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Offer Item Type used for long sell transactions.
 * 
 * <p>Java class for OfferItemTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferItemTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="BaggageItem" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}BaggageItemType"/>
 *         &lt;element name="FlightItem" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}FlightItemType"/>
 *         &lt;element name="OtherItem" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}OtherItemType"/>
 *         &lt;element name="SeatItem" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}SeatItemType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferItemTypeType", propOrder = {
    "baggageItem",
    "flightItem",
    "otherItem",
    "seatItem"
})
public class OfferItemTypeType {

    @XmlElement(name = "BaggageItem")
    protected BaggageItemType baggageItem;
    @XmlElement(name = "FlightItem")
    protected FlightItemType flightItem;
    @XmlElement(name = "OtherItem")
    protected OtherItemType otherItem;
    @XmlElement(name = "SeatItem")
    protected SeatItemType seatItem;

    /**
     * Gets the value of the baggageItem property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageItemType }
     *     
     */
    public BaggageItemType getBaggageItem() {
        return baggageItem;
    }

    /**
     * Sets the value of the baggageItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageItemType }
     *     
     */
    public void setBaggageItem(BaggageItemType value) {
        this.baggageItem = value;
    }

    /**
     * Gets the value of the flightItem property.
     * 
     * @return
     *     possible object is
     *     {@link FlightItemType }
     *     
     */
    public FlightItemType getFlightItem() {
        return flightItem;
    }

    /**
     * Sets the value of the flightItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightItemType }
     *     
     */
    public void setFlightItem(FlightItemType value) {
        this.flightItem = value;
    }

    /**
     * Gets the value of the otherItem property.
     * 
     * @return
     *     possible object is
     *     {@link OtherItemType }
     *     
     */
    public OtherItemType getOtherItem() {
        return otherItem;
    }

    /**
     * Sets the value of the otherItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherItemType }
     *     
     */
    public void setOtherItem(OtherItemType value) {
        this.otherItem = value;
    }

    /**
     * Gets the value of the seatItem property.
     * 
     * @return
     *     possible object is
     *     {@link SeatItemType }
     *     
     */
    public SeatItemType getSeatItem() {
        return seatItem;
    }

    /**
     * Sets the value of the seatItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatItemType }
     *     
     */
    public void setSeatItem(SeatItemType value) {
        this.seatItem = value;
    }

}
