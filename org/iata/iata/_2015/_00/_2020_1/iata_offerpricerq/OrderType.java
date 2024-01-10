
package org.iata.iata._2015._00._2020_1.iata_offerpricerq;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A uniquely identified record of the agreement of one party with another to receive products and services under specified terms and conditions. Order supports the sale of a flexible range of airline products and services that are not necessarily Journey based (e.g. subscription services). 
 *  
 * 
 * <p>Java class for OrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingRef" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}BookingRefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Commission" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}CommissionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CreationDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}DateTimeType" minOccurs="0"/>
 *         &lt;element name="DepositTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}DateTimeType" minOccurs="0"/>
 *         &lt;element name="LastModifiedDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}DateTimeType" minOccurs="0"/>
 *         &lt;element name="NamingTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}DateTimeType" minOccurs="0"/>
 *         &lt;element name="OrderItem" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}OrderItemType" maxOccurs="unbounded"/>
 *         &lt;element name="OrderVersionNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}OrderVersionNumberType" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}OrderStatusCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderType", propOrder = {
    "bookingRef",
    "commission",
    "creationDateTime",
    "depositTimeLimitDateTime",
    "lastModifiedDateTime",
    "namingTimeLimitDateTime",
    "orderItem",
    "orderVersionNumber",
    "statusCode"
})
public class OrderType {

    @XmlElement(name = "BookingRef")
    protected List<BookingRefType> bookingRef;
    @XmlElement(name = "Commission")
    protected List<CommissionType> commission;
    @XmlElement(name = "CreationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
    @XmlElement(name = "DepositTimeLimitDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar depositTimeLimitDateTime;
    @XmlElement(name = "LastModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDateTime;
    @XmlElement(name = "NamingTimeLimitDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar namingTimeLimitDateTime;
    @XmlElement(name = "OrderItem", required = true)
    protected List<OrderItemType> orderItem;
    @XmlElement(name = "OrderVersionNumber")
    protected BigInteger orderVersionNumber;
    @XmlElement(name = "StatusCode")
    @XmlSchemaType(name = "token")
    protected OrderStatusCodeContentType statusCode;

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
     * Gets the value of the commission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommissionType }
     * 
     * 
     */
    public List<CommissionType> getCommission() {
        if (commission == null) {
            commission = new ArrayList<CommissionType>();
        }
        return this.commission;
    }

    /**
     * Gets the value of the creationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateTime(XMLGregorianCalendar value) {
        this.creationDateTime = value;
    }

    /**
     * Gets the value of the depositTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepositTimeLimitDateTime() {
        return depositTimeLimitDateTime;
    }

    /**
     * Sets the value of the depositTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepositTimeLimitDateTime(XMLGregorianCalendar value) {
        this.depositTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the lastModifiedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    /**
     * Sets the value of the lastModifiedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDateTime(XMLGregorianCalendar value) {
        this.lastModifiedDateTime = value;
    }

    /**
     * Gets the value of the namingTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNamingTimeLimitDateTime() {
        return namingTimeLimitDateTime;
    }

    /**
     * Sets the value of the namingTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNamingTimeLimitDateTime(XMLGregorianCalendar value) {
        this.namingTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the orderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderItemType }
     * 
     * 
     */
    public List<OrderItemType> getOrderItem() {
        if (orderItem == null) {
            orderItem = new ArrayList<OrderItemType>();
        }
        return this.orderItem;
    }

    /**
     * Gets the value of the orderVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrderVersionNumber() {
        return orderVersionNumber;
    }

    /**
     * Sets the value of the orderVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrderVersionNumber(BigInteger value) {
        this.orderVersionNumber = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusCodeContentType }
     *     
     */
    public OrderStatusCodeContentType getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusCodeContentType }
     *     
     */
    public void setStatusCode(OrderStatusCodeContentType value) {
        this.statusCode = value;
    }

}
