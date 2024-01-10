
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Offer selected by the Passenger for requesting an Order to be created. Multiple Offers can be requested at the same time, each of which could originate from different shopping responses (each with their own ResponseIDs).
 *  
 *  Each Offer selected could reference (via the OfferID) either standard Offers from an AirShoppingRS message (potentially with Flight-related services) or A-La-Carte Offers (containing optional ancillary services). These standard Offers and 'a-la-carte' Offers would need to be consistent with the applicability rules defined by their relations (passengers or segments eligible for the enclosed OfferItems) and would be combined to produce a single Order, returned by the OrderViewRS message.
 * 
 * <p>Java class for SelectedOfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectedOfferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfferRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ID_Type"/>
 *         &lt;element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}AirlineDesigCodeType"/>
 *         &lt;element name="SelectedOfferItem" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}SelectedOfferItemType" maxOccurs="unbounded"/>
 *         &lt;element name="ShoppingResponseRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="TotalOfferPriceAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectedOfferType", propOrder = {
    "offerRefID",
    "ownerCode",
    "selectedOfferItem",
    "shoppingResponseRefID",
    "totalOfferPriceAmount"
})
public class SelectedOfferType {

    @XmlElement(name = "OfferRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerRefID;
    @XmlElement(name = "OwnerCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerCode;
    @XmlElement(name = "SelectedOfferItem", required = true)
    protected List<SelectedOfferItemType> selectedOfferItem;
    @XmlElement(name = "ShoppingResponseRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shoppingResponseRefID;
    @XmlElement(name = "TotalOfferPriceAmount")
    protected AmountType totalOfferPriceAmount;

    /**
     * Gets the value of the offerRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferRefID() {
        return offerRefID;
    }

    /**
     * Sets the value of the offerRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferRefID(String value) {
        this.offerRefID = value;
    }

    /**
     * Gets the value of the ownerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerCode() {
        return ownerCode;
    }

    /**
     * Sets the value of the ownerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerCode(String value) {
        this.ownerCode = value;
    }

    /**
     * Gets the value of the selectedOfferItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedOfferItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedOfferItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectedOfferItemType }
     * 
     * 
     */
    public List<SelectedOfferItemType> getSelectedOfferItem() {
        if (selectedOfferItem == null) {
            selectedOfferItem = new ArrayList<SelectedOfferItemType>();
        }
        return this.selectedOfferItem;
    }

    /**
     * Gets the value of the shoppingResponseRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShoppingResponseRefID() {
        return shoppingResponseRefID;
    }

    /**
     * Sets the value of the shoppingResponseRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShoppingResponseRefID(String value) {
        this.shoppingResponseRefID = value;
    }

    /**
     * Gets the value of the totalOfferPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalOfferPriceAmount() {
        return totalOfferPriceAmount;
    }

    /**
     * Sets the value of the totalOfferPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalOfferPriceAmount(AmountType value) {
        this.totalOfferPriceAmount = value;
    }

}
