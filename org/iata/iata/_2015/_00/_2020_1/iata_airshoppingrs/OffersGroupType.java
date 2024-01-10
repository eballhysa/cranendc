
package org.iata.iata._2015._00._2020_1.iata_airshoppingrs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Offers grouped by Carrier.
 * 
 * <p>Java class for OffersGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffersGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllOffersSummary" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}OffersSummaryType" minOccurs="0"/>
 *         &lt;element name="CarrierOffers" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}CarrierOffersType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffersGroupType", propOrder = {
    "allOffersSummary",
    "carrierOffers"
})
public class OffersGroupType {

    @XmlElement(name = "AllOffersSummary")
    protected OffersSummaryType allOffersSummary;
    @XmlElement(name = "CarrierOffers", required = true)
    protected List<CarrierOffersType> carrierOffers;

    /**
     * Gets the value of the allOffersSummary property.
     * 
     * @return
     *     possible object is
     *     {@link OffersSummaryType }
     *     
     */
    public OffersSummaryType getAllOffersSummary() {
        return allOffersSummary;
    }

    /**
     * Sets the value of the allOffersSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffersSummaryType }
     *     
     */
    public void setAllOffersSummary(OffersSummaryType value) {
        this.allOffersSummary = value;
    }

    /**
     * Gets the value of the carrierOffers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierOffers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierOffers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierOffersType }
     * 
     * 
     */
    public List<CarrierOffersType> getCarrierOffers() {
        if (carrierOffers == null) {
            carrierOffers = new ArrayList<CarrierOffersType>();
        }
        return this.carrierOffers;
    }

}
