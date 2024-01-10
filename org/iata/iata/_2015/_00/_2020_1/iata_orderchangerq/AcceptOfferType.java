
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Function to accept a new OfferItem and adding it to the existing Order
 * 
 * <p>Java class for AcceptOfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcceptOfferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="CreateOrderItem" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CreateOrderItemType" maxOccurs="unbounded"/>
 *         &lt;element name="SelectedOffer" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}SelectedOfferType" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptOfferType", propOrder = {
    "createOrderItem",
    "selectedOffer"
})
public class AcceptOfferType {

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
