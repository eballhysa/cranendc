
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;element name="BilateralTimeLimit" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}BilateralTimeLimitType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Commission" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CommissionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CreationDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}DateTimeType" minOccurs="0"/>
 *         &lt;element name="DepositTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}DateTimeType" minOccurs="0"/>
 *         &lt;element name="LastModifiedDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}DateTimeType" minOccurs="0"/>
 *         &lt;element name="NamingTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}DateTimeType" minOccurs="0"/>
 *         &lt;element name="OrderID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}ID_Type"/>
 *         &lt;element name="OrderItem" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}OrderItemType" maxOccurs="unbounded"/>
 *         &lt;element name="OrderKeys" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}Order1Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrderVersionNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}OrderVersionNumberType" minOccurs="0"/>
 *         &lt;element name="OriginalOrder" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}OriginalOrderType" minOccurs="0"/>
 *         &lt;element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}AirlineDesigCodeType"/>
 *         &lt;element name="OwnerTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}OwnerTypeCodeType" minOccurs="0"/>
 *         &lt;element name="PaxGroup" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}PaxGroupType" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}OrderStatusCodeType" minOccurs="0"/>
 *         &lt;element name="TotalPrice" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}PriceType" minOccurs="0"/>
 *         &lt;element name="WebAddressURI" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}URI_Type" minOccurs="0"/>
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
    "bilateralTimeLimit",
    "commission",
    "creationDateTime",
    "depositTimeLimitDateTime",
    "lastModifiedDateTime",
    "namingTimeLimitDateTime",
    "orderID",
    "orderItem",
    "orderKeys",
    "orderVersionNumber",
    "originalOrder",
    "ownerCode",
    "ownerTypeCode",
    "paxGroup",
    "statusCode",
    "totalPrice",
    "webAddressURI"
})
public class OrderType {

    @XmlElement(name = "BilateralTimeLimit")
    protected List<BilateralTimeLimitType> bilateralTimeLimit;
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
    @XmlElement(name = "OrderID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderID;
    @XmlElement(name = "OrderItem", required = true)
    protected List<OrderItemType> orderItem;
    @XmlElement(name = "OrderKeys")
    protected List<Order1Type> orderKeys;
    @XmlElement(name = "OrderVersionNumber")
    protected BigInteger orderVersionNumber;
    @XmlElement(name = "OriginalOrder")
    protected OriginalOrderType originalOrder;
    @XmlElement(name = "OwnerCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerCode;
    @XmlElement(name = "OwnerTypeCode")
    @XmlSchemaType(name = "token")
    protected OwnerTypeCodeContentType ownerTypeCode;
    @XmlElement(name = "PaxGroup")
    protected PaxGroupType paxGroup;
    @XmlElement(name = "StatusCode")
    @XmlSchemaType(name = "token")
    protected OrderStatusCodeContentType statusCode;
    @XmlElement(name = "TotalPrice")
    protected PriceType totalPrice;
    @XmlElement(name = "WebAddressURI")
    @XmlSchemaType(name = "anyURI")
    protected String webAddressURI;

    /**
     * Gets the value of the bilateralTimeLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bilateralTimeLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBilateralTimeLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BilateralTimeLimitType }
     * 
     * 
     */
    public List<BilateralTimeLimitType> getBilateralTimeLimit() {
        if (bilateralTimeLimit == null) {
            bilateralTimeLimit = new ArrayList<BilateralTimeLimitType>();
        }
        return this.bilateralTimeLimit;
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
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
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
     * Gets the value of the orderKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Order1Type }
     * 
     * 
     */
    public List<Order1Type> getOrderKeys() {
        if (orderKeys == null) {
            orderKeys = new ArrayList<Order1Type>();
        }
        return this.orderKeys;
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
     * Gets the value of the originalOrder property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalOrderType }
     *     
     */
    public OriginalOrderType getOriginalOrder() {
        return originalOrder;
    }

    /**
     * Sets the value of the originalOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalOrderType }
     *     
     */
    public void setOriginalOrder(OriginalOrderType value) {
        this.originalOrder = value;
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
     * Gets the value of the ownerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link OwnerTypeCodeContentType }
     *     
     */
    public OwnerTypeCodeContentType getOwnerTypeCode() {
        return ownerTypeCode;
    }

    /**
     * Sets the value of the ownerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerTypeCodeContentType }
     *     
     */
    public void setOwnerTypeCode(OwnerTypeCodeContentType value) {
        this.ownerTypeCode = value;
    }

    /**
     * Gets the value of the paxGroup property.
     * 
     * @return
     *     possible object is
     *     {@link PaxGroupType }
     *     
     */
    public PaxGroupType getPaxGroup() {
        return paxGroup;
    }

    /**
     * Sets the value of the paxGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxGroupType }
     *     
     */
    public void setPaxGroup(PaxGroupType value) {
        this.paxGroup = value;
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

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setTotalPrice(PriceType value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the webAddressURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAddressURI() {
        return webAddressURI;
    }

    /**
     * Sets the value of the webAddressURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebAddressURI(String value) {
        this.webAddressURI = value;
    }

}
