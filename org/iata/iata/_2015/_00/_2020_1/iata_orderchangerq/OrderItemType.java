
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An individually priced item within an Order, made up of one or more Services. May or may not be a selected Offer Item (e.g. non-chargeable Services available on request such as a wheelchair).
 * 
 * <p>Java class for OrderItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BilateralTimeLimit" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}BilateralTimeLimitType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Commission" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CommissionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CreationDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}DateTimeType" minOccurs="0"/>
 *         &lt;element name="DepositTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}DateTimeType" minOccurs="0"/>
 *         &lt;element name="Desc" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}DescType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Disclosure" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}DisclosureType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FareDetail" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}FareDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GrandTotalAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}AmountType" minOccurs="0"/>
 *         &lt;element name="NamingTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}DateTimeType" minOccurs="0"/>
 *         &lt;element name="OrderInstruction" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}OrderInstructionType"/>
 *         &lt;element name="OrderItemID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ID_Type"/>
 *         &lt;element name="OrderItemTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}AirlineDesigCodeType" minOccurs="0"/>
 *         &lt;element name="OwnerTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}OwnerTypeCodeType" minOccurs="0"/>
 *         &lt;element name="PaymentTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}DateTimeType" minOccurs="0"/>
 *         &lt;element name="PenaltyRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}PriceType"/>
 *         &lt;element name="PriceGuaranteeTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ReusableInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}IndType" minOccurs="0"/>
 *         &lt;element name="SellerFollowUpAction" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}SellerFollowUpActionType" minOccurs="0"/>
 *         &lt;element name="Service" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ServiceType" maxOccurs="unbounded"/>
 *         &lt;element name="StatusCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}OrderItemStatusCodeType" minOccurs="0"/>
 *         &lt;element name="WebAddressURI" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}URI_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemType", propOrder = {
    "bilateralTimeLimit",
    "commission",
    "creationDateTime",
    "depositTimeLimitDateTime",
    "desc",
    "disclosure",
    "fareDetail",
    "grandTotalAmount",
    "namingTimeLimitDateTime",
    "orderInstruction",
    "orderItemID",
    "orderItemTypeCode",
    "ownerCode",
    "ownerTypeCode",
    "paymentTimeLimitDateTime",
    "penaltyRefID",
    "price",
    "priceGuaranteeTimeLimitDateTime",
    "reusableInd",
    "sellerFollowUpAction",
    "service",
    "statusCode",
    "webAddressURI"
})
public class OrderItemType {

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
    @XmlElement(name = "Desc")
    protected List<DescType> desc;
    @XmlElement(name = "Disclosure")
    protected List<DisclosureType> disclosure;
    @XmlElement(name = "FareDetail")
    protected List<FareDetailType> fareDetail;
    @XmlElement(name = "GrandTotalAmount")
    protected AmountType grandTotalAmount;
    @XmlElement(name = "NamingTimeLimitDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar namingTimeLimitDateTime;
    @XmlElement(name = "OrderInstruction", required = true)
    protected OrderInstructionType orderInstruction;
    @XmlElement(name = "OrderItemID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderItemID;
    @XmlElement(name = "OrderItemTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderItemTypeCode;
    @XmlElement(name = "OwnerCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerCode;
    @XmlElement(name = "OwnerTypeCode")
    @XmlSchemaType(name = "token")
    protected OwnerTypeCodeContentType ownerTypeCode;
    @XmlElement(name = "PaymentTimeLimitDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentTimeLimitDateTime;
    @XmlElement(name = "PenaltyRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> penaltyRefID;
    @XmlElement(name = "Price", required = true)
    protected PriceType price;
    @XmlElement(name = "PriceGuaranteeTimeLimitDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar priceGuaranteeTimeLimitDateTime;
    @XmlElement(name = "ReusableInd")
    protected Boolean reusableInd;
    @XmlElement(name = "SellerFollowUpAction")
    protected SellerFollowUpActionType sellerFollowUpAction;
    @XmlElement(name = "Service", required = true)
    protected List<ServiceType> service;
    @XmlElement(name = "StatusCode")
    @XmlSchemaType(name = "token")
    protected OrderItemStatusCodeContentType statusCode;
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
     * Gets the value of the desc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescType }
     * 
     * 
     */
    public List<DescType> getDesc() {
        if (desc == null) {
            desc = new ArrayList<DescType>();
        }
        return this.desc;
    }

    /**
     * Gets the value of the disclosure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disclosure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisclosure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisclosureType }
     * 
     * 
     */
    public List<DisclosureType> getDisclosure() {
        if (disclosure == null) {
            disclosure = new ArrayList<DisclosureType>();
        }
        return this.disclosure;
    }

    /**
     * Gets the value of the fareDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareDetailType }
     * 
     * 
     */
    public List<FareDetailType> getFareDetail() {
        if (fareDetail == null) {
            fareDetail = new ArrayList<FareDetailType>();
        }
        return this.fareDetail;
    }

    /**
     * Gets the value of the grandTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGrandTotalAmount() {
        return grandTotalAmount;
    }

    /**
     * Sets the value of the grandTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGrandTotalAmount(AmountType value) {
        this.grandTotalAmount = value;
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
     * Gets the value of the orderInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link OrderInstructionType }
     *     
     */
    public OrderInstructionType getOrderInstruction() {
        return orderInstruction;
    }

    /**
     * Sets the value of the orderInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInstructionType }
     *     
     */
    public void setOrderInstruction(OrderInstructionType value) {
        this.orderInstruction = value;
    }

    /**
     * Gets the value of the orderItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderItemID() {
        return orderItemID;
    }

    /**
     * Sets the value of the orderItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderItemID(String value) {
        this.orderItemID = value;
    }

    /**
     * Gets the value of the orderItemTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderItemTypeCode() {
        return orderItemTypeCode;
    }

    /**
     * Sets the value of the orderItemTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderItemTypeCode(String value) {
        this.orderItemTypeCode = value;
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
     * Gets the value of the paymentTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentTimeLimitDateTime() {
        return paymentTimeLimitDateTime;
    }

    /**
     * Sets the value of the paymentTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentTimeLimitDateTime(XMLGregorianCalendar value) {
        this.paymentTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the penaltyRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penaltyRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenaltyRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPenaltyRefID() {
        if (penaltyRefID == null) {
            penaltyRefID = new ArrayList<String>();
        }
        return this.penaltyRefID;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setPrice(PriceType value) {
        this.price = value;
    }

    /**
     * Gets the value of the priceGuaranteeTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPriceGuaranteeTimeLimitDateTime() {
        return priceGuaranteeTimeLimitDateTime;
    }

    /**
     * Sets the value of the priceGuaranteeTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPriceGuaranteeTimeLimitDateTime(XMLGregorianCalendar value) {
        this.priceGuaranteeTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the reusableInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReusableInd() {
        return reusableInd;
    }

    /**
     * Sets the value of the reusableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReusableInd(Boolean value) {
        this.reusableInd = value;
    }

    /**
     * Gets the value of the sellerFollowUpAction property.
     * 
     * @return
     *     possible object is
     *     {@link SellerFollowUpActionType }
     *     
     */
    public SellerFollowUpActionType getSellerFollowUpAction() {
        return sellerFollowUpAction;
    }

    /**
     * Sets the value of the sellerFollowUpAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerFollowUpActionType }
     *     
     */
    public void setSellerFollowUpAction(SellerFollowUpActionType value) {
        this.sellerFollowUpAction = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceType }
     * 
     * 
     */
    public List<ServiceType> getService() {
        if (service == null) {
            service = new ArrayList<ServiceType>();
        }
        return this.service;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemStatusCodeContentType }
     *     
     */
    public OrderItemStatusCodeContentType getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemStatusCodeContentType }
     *     
     */
    public void setStatusCode(OrderItemStatusCodeContentType value) {
        this.statusCode = value;
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
