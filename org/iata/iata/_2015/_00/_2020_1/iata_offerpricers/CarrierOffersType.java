
package org.iata.iata._2015._00._2020_1.iata_offerpricers;

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
 *         &lt;element name="ALaCarteOffer" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}Offer1Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Offer" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}OfferType" maxOccurs="unbounded" minOccurs="0"/>
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
    "offer"
})
public class CarrierOffersType {

    @XmlElement(name = "ALaCarteOffer")
    protected List<Offer1Type> aLaCarteOffer;
    @XmlElement(name = "Offer")
    protected List<OfferType> offer;

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

}
