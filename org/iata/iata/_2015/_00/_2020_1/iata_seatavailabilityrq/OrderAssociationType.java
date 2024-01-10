
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrq;

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
 * Reference to an Order for which this payment method applies.
 *  if empty, the payment method is applicable to the entire order.
 * 
 * <p>Java class for OrderAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderAssociationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderItemRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrderRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}ID_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderAssociationType", propOrder = {
    "orderItemRefID",
    "orderRefID"
})
public class OrderAssociationType {

    @XmlElement(name = "OrderItemRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> orderItemRefID;
    @XmlElement(name = "OrderRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderRefID;

    /**
     * Gets the value of the orderItemRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItemRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItemRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOrderItemRefID() {
        if (orderItemRefID == null) {
            orderItemRefID = new ArrayList<String>();
        }
        return this.orderItemRefID;
    }

    /**
     * Gets the value of the orderRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderRefID() {
        return orderRefID;
    }

    /**
     * Sets the value of the orderRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderRefID(String value) {
        this.orderRefID = value;
    }

}
