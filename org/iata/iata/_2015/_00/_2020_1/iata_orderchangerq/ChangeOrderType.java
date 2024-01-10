
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains a choice of functions to update an Order including Update Order Item Accept Change Cancel Order Update Passenger and Accept Repriced Order.
 * 
 * <p>Java class for ChangeOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeOrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="AcceptChange" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}AcceptChangeType"/>
 *         &lt;element name="AcceptRepricedOrder" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}AcceptRepricedOrderType"/>
 *         &lt;element name="CancelOrder" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CancelOrderType"/>
 *         &lt;element name="UpdateOrderItem" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}UpdateOrderItemType"/>
 *         &lt;element name="UpdatePax" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}UpdatePaxType" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeOrderType", propOrder = {
    "acceptChange",
    "acceptRepricedOrder",
    "cancelOrder",
    "updateOrderItem",
    "updatePax"
})
public class ChangeOrderType {

    @XmlElement(name = "AcceptChange")
    protected AcceptChangeType acceptChange;
    @XmlElement(name = "AcceptRepricedOrder")
    protected AcceptRepricedOrderType acceptRepricedOrder;
    @XmlElement(name = "CancelOrder")
    protected CancelOrderType cancelOrder;
    @XmlElement(name = "UpdateOrderItem")
    protected UpdateOrderItemType updateOrderItem;
    @XmlElement(name = "UpdatePax")
    protected List<UpdatePaxType> updatePax;

    /**
     * Gets the value of the acceptChange property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptChangeType }
     *     
     */
    public AcceptChangeType getAcceptChange() {
        return acceptChange;
    }

    /**
     * Sets the value of the acceptChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptChangeType }
     *     
     */
    public void setAcceptChange(AcceptChangeType value) {
        this.acceptChange = value;
    }

    /**
     * Gets the value of the acceptRepricedOrder property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptRepricedOrderType }
     *     
     */
    public AcceptRepricedOrderType getAcceptRepricedOrder() {
        return acceptRepricedOrder;
    }

    /**
     * Sets the value of the acceptRepricedOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptRepricedOrderType }
     *     
     */
    public void setAcceptRepricedOrder(AcceptRepricedOrderType value) {
        this.acceptRepricedOrder = value;
    }

    /**
     * Gets the value of the cancelOrder property.
     * 
     * @return
     *     possible object is
     *     {@link CancelOrderType }
     *     
     */
    public CancelOrderType getCancelOrder() {
        return cancelOrder;
    }

    /**
     * Sets the value of the cancelOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelOrderType }
     *     
     */
    public void setCancelOrder(CancelOrderType value) {
        this.cancelOrder = value;
    }

    /**
     * Gets the value of the updateOrderItem property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOrderItemType }
     *     
     */
    public UpdateOrderItemType getUpdateOrderItem() {
        return updateOrderItem;
    }

    /**
     * Sets the value of the updateOrderItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOrderItemType }
     *     
     */
    public void setUpdateOrderItem(UpdateOrderItemType value) {
        this.updateOrderItem = value;
    }

    /**
     * Gets the value of the updatePax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updatePax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdatePax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatePaxType }
     * 
     * 
     */
    public List<UpdatePaxType> getUpdatePax() {
        if (updatePax == null) {
            updatePax = new ArrayList<UpdatePaxType>();
        }
        return this.updatePax;
    }

}
