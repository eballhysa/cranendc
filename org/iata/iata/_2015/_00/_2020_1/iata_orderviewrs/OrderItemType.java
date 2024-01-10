
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

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
 *         &lt;element name="BilateralTimeLimit" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}BilateralTimeLimitType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CancelRestrictions" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CancelRestrictionsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ChangeRestrictions" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}ChangeRestrictionsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Commission" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CommissionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CreationDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}DateTimeType" minOccurs="0"/>
 *         &lt;element name="DepositTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}DateTimeType" minOccurs="0"/>
 *         &lt;element name="Desc" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}Description1Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DiffPrice" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}PriceAndFareDetailsType" minOccurs="0"/>
 *         &lt;element name="DisclosureRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FareDetail" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}FareDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GrandTotalAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}AmountType" minOccurs="0"/>
 *         &lt;element name="NamingTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}DateTimeType" minOccurs="0"/>
 *         &lt;element name="OrderInstruction" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}OrderInstructionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrderItemID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}ID_Type"/>
 *         &lt;element name="OrderItemTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CodeType" minOccurs="0"/>
 *         &lt;element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}AirlineDesigCodeType" minOccurs="0"/>
 *         &lt;element name="OwnerTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}OwnerTypeCodeType" minOccurs="0"/>
 *         &lt;element name="PaymentTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}DateTimeType" minOccurs="0"/>
 *         &lt;element name="PenaltyRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}PriceType"/>
 *         &lt;element name="PriceGuaranteeTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ReusableInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}IndType" minOccurs="0"/>
 *         &lt;element name="SellerFollowUpAction" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}SellerFollowUpActionType" minOccurs="0"/>
 *         &lt;element name="Service" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}ServiceType" maxOccurs="unbounded"/>
 *         &lt;element name="ServiceTaxonomy" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}ServiceTaxonomyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}OrderItemStatusCodeType" minOccurs="0"/>
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
@XmlType(name = "OrderItemType", propOrder = {
    "bilateralTimeLimit",
    "cancelRestrictions",
    "changeRestrictions",
    "commission",
    "creationDateTime",
    "depositTimeLimitDateTime",
    "desc",
    "diffPrice",
    "disclosureRefID",
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
    "serviceTaxonomy",
    "statusCode",
    "webAddressURI"
})
public class OrderItemType {

    @XmlElement(name = "BilateralTimeLimit")
    protected List<BilateralTimeLimitType> bilateralTimeLimit;
    @XmlElement(name = "CancelRestrictions")
    protected List<CancelRestrictionsType> cancelRestrictions;
    @XmlElement(name = "ChangeRestrictions")
    protected List<ChangeRestrictionsType> changeRestrictions;
    @XmlElement(name = "Commission")
    protected List<CommissionType> commission;
    @XmlElement(name = "CreationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
    @XmlElement(name = "DepositTimeLimitDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar depositTimeLimitDateTime;
    @XmlElement(name = "Desc")
    protected List<Description1Type> desc;
    @XmlElement(name = "DiffPrice")
    protected PriceAndFareDetailsType diffPrice;
    @XmlElement(name = "DisclosureRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> disclosureRefID;
    @XmlElement(name = "FareDetail")
    protected List<FareDetailType> fareDetail;
    @XmlElement(name = "GrandTotalAmount")
    protected AmountType grandTotalAmount;
    @XmlElement(name = "NamingTimeLimitDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar namingTimeLimitDateTime;
    @XmlElement(name = "OrderInstruction")
    protected List<OrderInstructionType> orderInstruction;
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
    @XmlElement(name = "ServiceTaxonomy")
    protected List<ServiceTaxonomyType> serviceTaxonomy;
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
     * Gets the value of the cancelRestrictions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelRestrictions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelRestrictions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancelRestrictionsType }
     * 
     * 
     */
    public List<CancelRestrictionsType> getCancelRestrictions() {
        if (cancelRestrictions == null) {
            cancelRestrictions = new ArrayList<CancelRestrictionsType>();
        }
        return this.cancelRestrictions;
    }

    /**
     * Gets the value of the changeRestrictions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeRestrictions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeRestrictions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeRestrictionsType }
     * 
     * 
     */
    public List<ChangeRestrictionsType> getChangeRestrictions() {
        if (changeRestrictions == null) {
            changeRestrictions = new ArrayList<ChangeRestrictionsType>();
        }
        return this.changeRestrictions;
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
     * {@link Description1Type }
     * 
     * 
     */
    public List<Description1Type> getDesc() {
        if (desc == null) {
            desc = new ArrayList<Description1Type>();
        }
        return this.desc;
    }

    /**
     * Gets the value of the diffPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceAndFareDetailsType }
     *     
     */
    public PriceAndFareDetailsType getDiffPrice() {
        return diffPrice;
    }

    /**
     * Sets the value of the diffPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceAndFareDetailsType }
     *     
     */
    public void setDiffPrice(PriceAndFareDetailsType value) {
        this.diffPrice = value;
    }

    /**
     * Gets the value of the disclosureRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disclosureRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisclosureRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDisclosureRefID() {
        if (disclosureRefID == null) {
            disclosureRefID = new ArrayList<String>();
        }
        return this.disclosureRefID;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderInstruction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderInstruction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderInstructionType }
     * 
     * 
     */
    public List<OrderInstructionType> getOrderInstruction() {
        if (orderInstruction == null) {
            orderInstruction = new ArrayList<OrderInstructionType>();
        }
        return this.orderInstruction;
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
     * Gets the value of the serviceTaxonomy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceTaxonomy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceTaxonomy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceTaxonomyType }
     * 
     * 
     */
    public List<ServiceTaxonomyType> getServiceTaxonomy() {
        if (serviceTaxonomy == null) {
            serviceTaxonomy = new ArrayList<ServiceTaxonomyType>();
        }
        return this.serviceTaxonomy;
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
