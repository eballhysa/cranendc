
package org.iata.iata._2015._00._2020_1.iata_offerpricerq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Priced Offer Offer selected by the Passenger for requesting an Order to be created Multiple Offers can be requested at the same time each of which could originate from different shopping responses each with their own ResponseIDs. Each Offer selected could reference via the OfferID either standard Offers from an AirShoppingRS message potentially with Flight related services or A La Carte Offers containing optional ancillary services. These standard Offers and a la carte Offers would need to be consistent with the applicability rules defined by their relations passengers or segments eligible for the enclosed OfferItems and would be combined to produce a single Order returned by the OrderViewRS message.
 * 
 * <p>Java class for PricedOfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricedOfferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="CreateOrderItem" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}CreateOrderItemType" maxOccurs="unbounded"/>
 *         &lt;element name="SelectedOffer" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}SelectedOfferType" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricedOfferType", propOrder = {
    "createOrderItem",
    "selectedOffer"
})
public class PricedOfferType {

    @XmlElement(name = "CreateOrderItem")
    protected List<CreateOrderItemType> createOrderItem;
    @XmlElement(name = "SelectedOffer")
    protected List<SelectedOfferType> selectedOffer;

    /**
     * Gets the value of the createOrderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createOrderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreateOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreateOrderItemType }
     * 
     * 
     */
    public List<CreateOrderItemType> getCreateOrderItem() {
        if (createOrderItem == null) {
            createOrderItem = new ArrayList<CreateOrderItemType>();
        }
        return this.createOrderItem;
    }

    /**
     * Gets the value of the selectedOffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedOffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectedOfferType }
     * 
     * 
     */
    public List<SelectedOfferType> getSelectedOffer() {
        if (selectedOffer == null) {
            selectedOffer = new ArrayList<SelectedOfferType>();
        }
        return this.selectedOffer;
    }

}
