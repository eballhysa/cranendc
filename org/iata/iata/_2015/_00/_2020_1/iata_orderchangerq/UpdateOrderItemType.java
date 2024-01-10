
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Collection of functions used by the seller to request the airline to commit changes to an existing Order. These may be adding, removing or replacing Order Items (with potential refund conditions, in case of cancellations). The actions possible are determined by the airline and communicated to the seller at the time of an OrderReshopRS (which precedes OrderChangeRQ). It is up to the seller to then accept the proposed actions from the OrderReshopRS by echoing these functions in this OrderServicing structure
 * 
 * <p>Java class for UpdateOrderItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateOrderItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcceptOffer" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}AcceptOfferType" minOccurs="0"/>
 *         &lt;element name="DeleteOrderItem" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}DeleteOrderItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateOrderItemType", propOrder = {
    "acceptOffer",
    "deleteOrderItem"
})
public class UpdateOrderItemType {

    @XmlElement(name = "AcceptOffer")
    protected AcceptOfferType acceptOffer;
    @XmlElement(name = "DeleteOrderItem")
    protected DeleteOrderItemType deleteOrderItem;

    /**
     * Gets the value of the acceptOffer property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptOfferType }
     *     
     */
    public AcceptOfferType getAcceptOffer() {
        return acceptOffer;
    }

    /**
     * Sets the value of the acceptOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptOfferType }
     *     
     */
    public void setAcceptOffer(AcceptOfferType value) {
        this.acceptOffer = value;
    }

    /**
     * Gets the value of the deleteOrderItem property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteOrderItemType }
     *     
     */
    public DeleteOrderItemType getDeleteOrderItem() {
        return deleteOrderItem;
    }

    /**
     * Sets the value of the deleteOrderItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteOrderItemType }
     *     
     */
    public void setDeleteOrderItem(DeleteOrderItemType value) {
        this.deleteOrderItem = value;
    }

}
