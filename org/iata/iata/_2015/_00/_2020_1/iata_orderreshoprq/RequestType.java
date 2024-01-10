
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

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
 * Order Reshop request.
 * 
 * <p>Java class for RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingRef" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}BookingRefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrderActionContextText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}TextType" minOccurs="0"/>
 *         &lt;element name="OrderRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}ID_Type"/>
 *         &lt;element name="ReshopParameters" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}ResponseParametersType" minOccurs="0"/>
 *         &lt;element name="UpdateOrder" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}UpdateOrderType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType", propOrder = {
    "bookingRef",
    "orderActionContextText",
    "orderRefID",
    "reshopParameters",
    "updateOrder"
})
public class RequestType {

    @XmlElement(name = "BookingRef")
    protected List<BookingRefType> bookingRef;
    @XmlElement(name = "OrderActionContextText")
    protected String orderActionContextText;
    @XmlElement(name = "OrderRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderRefID;
    @XmlElement(name = "ReshopParameters")
    protected ResponseParametersType reshopParameters;
    @XmlElement(name = "UpdateOrder", required = true)
    protected UpdateOrderType updateOrder;

    /**
     * Gets the value of the bookingRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingRefType }
     * 
     * 
     */
    public List<BookingRefType> getBookingRef() {
        if (bookingRef == null) {
            bookingRef = new ArrayList<BookingRefType>();
        }
        return this.bookingRef;
    }

    /**
     * Gets the value of the orderActionContextText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderActionContextText() {
        return orderActionContextText;
    }

    /**
     * Sets the value of the orderActionContextText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderActionContextText(String value) {
        this.orderActionContextText = value;
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

    /**
     * Gets the value of the reshopParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseParametersType }
     *     
     */
    public ResponseParametersType getReshopParameters() {
        return reshopParameters;
    }

    /**
     * Sets the value of the reshopParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseParametersType }
     *     
     */
    public void setReshopParameters(ResponseParametersType value) {
        this.reshopParameters = value;
    }

    /**
     * Gets the value of the updateOrder property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOrderType }
     *     
     */
    public UpdateOrderType getUpdateOrder() {
        return updateOrder;
    }

    /**
     * Sets the value of the updateOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOrderType }
     *     
     */
    public void setUpdateOrder(UpdateOrderType value) {
        this.updateOrder = value;
    }

}
