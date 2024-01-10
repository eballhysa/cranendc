
package org.iata.iata._2015._00._2020_1.iata_airshoppingrs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Grouping of Offers returned by a single ORA.
 * 
 * <p>Java class for CarrierOffersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarrierOffersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ALaCarteOffer" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}Offer1Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CarrierOffersSummary" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}OffersSummaryType" minOccurs="0"/>
 *         &lt;element name="Offer" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}OfferType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PriceCalendar" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}PriceCalendarType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierOffersType", propOrder = {
    "aLaCarteOffer",
    "carrierOffersSummary",
    "offer",
    "priceCalendar"
})
public class CarrierOffersType {

    @XmlElement(name = "ALaCarteOffer")
    protected List<Offer1Type> aLaCarteOffer;
    @XmlElement(name = "CarrierOffersSummary")
    protected OffersSummaryType carrierOffersSummary;
    @XmlElement(name = "Offer")
    protected List<OfferType> offer;
    @XmlElement(name = "PriceCalendar")
    protected List<PriceCalendarType> priceCalendar;

    /**
     * Gets the value of the aLaCarteOffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aLaCarteOffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getALaCarteOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Offer1Type }
     * 
     * 
     */
    public List<Offer1Type> getALaCarteOffer() {
        if (aLaCarteOffer == null) {
            aLaCarteOffer = new ArrayList<Offer1Type>();
        }
        return this.aLaCarteOffer;
    }

    /**
     * Gets the value of the carrierOffersSummary property.
     * 
     * @return
     *     possible object is
     *     {@link OffersSummaryType }
     *     
     */
    public OffersSummaryType getCarrierOffersSummary() {
        return carrierOffersSummary;
    }

    /**
     * Sets the value of the carrierOffersSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffersSummaryType }
     *     
     */
    public void setCarrierOffersSummary(OffersSummaryType value) {
        this.carrierOffersSummary = value;
    }

    /**
     * Gets the value of the offer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferType }
     * 
     * 
     */
    public List<OfferType> getOffer() {
        if (offer == null) {
            offer = new ArrayList<OfferType>();
        }
        return this.offer;
    }

    /**
     * Gets the value of the priceCalendar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceCalendar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceCalendar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceCalendarType }
     * 
     * 
     */
    public List<PriceCalendarType> getPriceCalendar() {
        if (priceCalendar == null) {
            priceCalendar = new ArrayList<PriceCalendarType>();
        }
        return this.priceCalendar;
    }

}
