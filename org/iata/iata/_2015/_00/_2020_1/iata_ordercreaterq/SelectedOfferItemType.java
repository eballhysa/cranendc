
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

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
 * OfferItem selected by the Passenger for inclusion in the requested Order. Repeat occurrence of OfferItem (once per passenger) if different passengers want to select different service options, different quantities of a-la-carte items or different seat locations.
 *  
 *  As a minimum, all mandatory OfferItems from a desired Offer should be explicitly defined within these selections and should repeat the same Passenger and Flight Segment associations defined in the originating OfferItems. Optional OfferItems may then be appended as further items selected by the Passenger.
 *  
 *  OfferItems from the originating Offers may take on two different forms, which in turn drives how the ALaCarteSelection element is to be used - If the OfferItem referenced comes originally from an a-la-carte Offer, then the use of the ALaCarteSelection element should be used to defined the Quantity of said OfferItem. On the other hand, if the OfferItem comes from a standard type of Offer in the previous shopping response, the ALaCarteSelection element should not be used, as the quantity is explicitly driven by what is defined in that OfferItem's associations (to passengers and/or flight segments).
 * 
 * <p>Java class for SelectedOfferItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectedOfferItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfferItemRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ID_Type"/>
 *         &lt;element name="PaxRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ID_Type" maxOccurs="unbounded"/>
 *         &lt;element name="SelectedALaCarteOfferItem" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}SelectedALaCarteOfferItemType" minOccurs="0"/>
 *         &lt;element name="SelectedBundleServices" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}SelectedBundleServicesType" minOccurs="0"/>
 *         &lt;element name="SelectedSeat" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}SelectedSeatType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectedOfferItemType", propOrder = {
    "offerItemRefID",
    "paxRefID",
    "selectedALaCarteOfferItem",
    "selectedBundleServices",
    "selectedSeat"
})
public class SelectedOfferItemType {

    @XmlElement(name = "OfferItemRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerItemRefID;
    @XmlElement(name = "PaxRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> paxRefID;
    @XmlElement(name = "SelectedALaCarteOfferItem")
    protected SelectedALaCarteOfferItemType selectedALaCarteOfferItem;
    @XmlElement(name = "SelectedBundleServices")
    protected SelectedBundleServicesType selectedBundleServices;
    @XmlElement(name = "SelectedSeat")
    protected SelectedSeatType selectedSeat;

    /**
     * Gets the value of the offerItemRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferItemRefID() {
        return offerItemRefID;
    }

    /**
     * Sets the value of the offerItemRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferItemRefID(String value) {
        this.offerItemRefID = value;
    }

    /**
     * Gets the value of the paxRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPaxRefID() {
        if (paxRefID == null) {
            paxRefID = new ArrayList<String>();
        }
        return this.paxRefID;
    }

    /**
     * Gets the value of the selectedALaCarteOfferItem property.
     * 
     * @return
     *     possible object is
     *     {@link SelectedALaCarteOfferItemType }
     *     
     */
    public SelectedALaCarteOfferItemType getSelectedALaCarteOfferItem() {
        return selectedALaCarteOfferItem;
    }

    /**
     * Sets the value of the selectedALaCarteOfferItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedALaCarteOfferItemType }
     *     
     */
    public void setSelectedALaCarteOfferItem(SelectedALaCarteOfferItemType value) {
        this.selectedALaCarteOfferItem = value;
    }

    /**
     * Gets the value of the selectedBundleServices property.
     * 
     * @return
     *     possible object is
     *     {@link SelectedBundleServicesType }
     *     
     */
    public SelectedBundleServicesType getSelectedBundleServices() {
        return selectedBundleServices;
    }

    /**
     * Sets the value of the selectedBundleServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedBundleServicesType }
     *     
     */
    public void setSelectedBundleServices(SelectedBundleServicesType value) {
        this.selectedBundleServices = value;
    }

    /**
     * Gets the value of the selectedSeat property.
     * 
     * @return
     *     possible object is
     *     {@link SelectedSeatType }
     *     
     */
    public SelectedSeatType getSelectedSeat() {
        return selectedSeat;
    }

    /**
     * Sets the value of the selectedSeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedSeatType }
     *     
     */
    public void setSelectedSeat(SelectedSeatType value) {
        this.selectedSeat = value;
    }

}
