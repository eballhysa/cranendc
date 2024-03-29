
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

import java.math.BigDecimal;
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
 * Information corresponding to a group of 1 to 4 Tickets for a single Origin Destination and a single Passenger.
 * 
 * <p>Java class for TicketDocInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketDocInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaggageAllowanceRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}ID_Type" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="BookingAgency" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TravelAgencyType" minOccurs="0"/>
 *         &lt;element name="BookingRef" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}BookingRefType" maxOccurs="unbounded"/>
 *         &lt;element name="BookletQty" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}QtyType" minOccurs="0"/>
 *         &lt;element name="CarrierFee" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CarrierFeeType" minOccurs="0"/>
 *         &lt;element name="Commission" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CommissionType" minOccurs="0"/>
 *         &lt;element name="EndorsementText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TextType" minOccurs="0"/>
 *         &lt;element name="FareDetail" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}FareDetailType" minOccurs="0"/>
 *         &lt;element name="OrderRef" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}OrderRefType" minOccurs="0"/>
 *         &lt;element name="OriginalIssueInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TicketIssuanceInfoType" minOccurs="0"/>
 *         &lt;element name="OriginDest" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}OriginDestType" minOccurs="0"/>
 *         &lt;element name="PaxRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}ID_Type"/>
 *         &lt;element name="PaymentInfoRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}ID_Type" maxOccurs="unbounded"/>
 *         &lt;element name="PenaltyRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PricingCountryCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="PricingDate" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}DateType" minOccurs="0"/>
 *         &lt;element name="PricingLocationCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}IATA_LocationCodeType" minOccurs="0"/>
 *         &lt;element name="PricingTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TimeType" minOccurs="0"/>
 *         &lt;element name="ReferencedOrder" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}OrderType" minOccurs="0"/>
 *         &lt;element name="ServicingAgency" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TravelAgencyType" minOccurs="0"/>
 *         &lt;element name="Ticket" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TicketType" maxOccurs="4"/>
 *         &lt;element name="TicketRefIdentification" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TicketRefIdentificationType" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketDocInfoType", propOrder = {
    "baggageAllowanceRefID",
    "bookingAgency",
    "bookingRef",
    "bookletQty",
    "carrierFee",
    "commission",
    "endorsementText",
    "fareDetail",
    "orderRef",
    "originalIssueInfo",
    "originDest",
    "paxRefID",
    "paymentInfoRefID",
    "penaltyRefID",
    "pricingCountryCode",
    "pricingDate",
    "pricingLocationCode",
    "pricingTime",
    "referencedOrder",
    "servicingAgency",
    "ticket",
    "ticketRefIdentification"
})
public class TicketDocInfoType {

    @XmlElement(name = "BaggageAllowanceRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> baggageAllowanceRefID;
    @XmlElement(name = "BookingAgency")
    protected TravelAgencyType bookingAgency;
    @XmlElement(name = "BookingRef", required = true)
    protected List<BookingRefType> bookingRef;
    @XmlElement(name = "BookletQty")
    protected BigDecimal bookletQty;
    @XmlElement(name = "CarrierFee")
    protected CarrierFeeType carrierFee;
    @XmlElement(name = "Commission")
    protected CommissionType commission;
    @XmlElement(name = "EndorsementText")
    protected String endorsementText;
    @XmlElement(name = "FareDetail")
    protected FareDetailType fareDetail;
    @XmlElement(name = "OrderRef")
    protected OrderRefType orderRef;
    @XmlElement(name = "OriginalIssueInfo")
    protected TicketIssuanceInfoType originalIssueInfo;
    @XmlElement(name = "OriginDest")
    protected OriginDestType originDest;
    @XmlElement(name = "PaxRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxRefID;
    @XmlElement(name = "PaymentInfoRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> paymentInfoRefID;
    @XmlElement(name = "PenaltyRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> penaltyRefID;
    @XmlElement(name = "PricingCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String pricingCountryCode;
    @XmlElement(name = "PricingDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pricingDate;
    @XmlElement(name = "PricingLocationCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String pricingLocationCode;
    @XmlElement(name = "PricingTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pricingTime;
    @XmlElement(name = "ReferencedOrder")
    protected OrderType referencedOrder;
    @XmlElement(name = "ServicingAgency")
    protected TravelAgencyType servicingAgency;
    @XmlElement(name = "Ticket", required = true)
    protected List<TicketType> ticket;
    @XmlElement(name = "TicketRefIdentification")
    protected List<TicketRefIdentificationType> ticketRefIdentification;

    /**
     * Gets the value of the baggageAllowanceRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageAllowanceRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaggageAllowanceRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBaggageAllowanceRefID() {
        if (baggageAllowanceRefID == null) {
            baggageAllowanceRefID = new ArrayList<String>();
        }
        return this.baggageAllowanceRefID;
    }

    /**
     * Gets the value of the bookingAgency property.
     * 
     * @return
     *     possible object is
     *     {@link TravelAgencyType }
     *     
     */
    public TravelAgencyType getBookingAgency() {
        return bookingAgency;
    }

    /**
     * Sets the value of the bookingAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelAgencyType }
     *     
     */
    public void setBookingAgency(TravelAgencyType value) {
        this.bookingAgency = value;
    }

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
     * Gets the value of the bookletQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBookletQty() {
        return bookletQty;
    }

    /**
     * Sets the value of the bookletQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBookletQty(BigDecimal value) {
        this.bookletQty = value;
    }

    /**
     * Gets the value of the carrierFee property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierFeeType }
     *     
     */
    public CarrierFeeType getCarrierFee() {
        return carrierFee;
    }

    /**
     * Sets the value of the carrierFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierFeeType }
     *     
     */
    public void setCarrierFee(CarrierFeeType value) {
        this.carrierFee = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType }
     *     
     */
    public CommissionType getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType }
     *     
     */
    public void setCommission(CommissionType value) {
        this.commission = value;
    }

    /**
     * Gets the value of the endorsementText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndorsementText() {
        return endorsementText;
    }

    /**
     * Sets the value of the endorsementText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndorsementText(String value) {
        this.endorsementText = value;
    }

    /**
     * Gets the value of the fareDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FareDetailType }
     *     
     */
    public FareDetailType getFareDetail() {
        return fareDetail;
    }

    /**
     * Sets the value of the fareDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDetailType }
     *     
     */
    public void setFareDetail(FareDetailType value) {
        this.fareDetail = value;
    }

    /**
     * Gets the value of the orderRef property.
     * 
     * @return
     *     possible object is
     *     {@link OrderRefType }
     *     
     */
    public OrderRefType getOrderRef() {
        return orderRef;
    }

    /**
     * Sets the value of the orderRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderRefType }
     *     
     */
    public void setOrderRef(OrderRefType value) {
        this.orderRef = value;
    }

    /**
     * Gets the value of the originalIssueInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TicketIssuanceInfoType }
     *     
     */
    public TicketIssuanceInfoType getOriginalIssueInfo() {
        return originalIssueInfo;
    }

    /**
     * Sets the value of the originalIssueInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketIssuanceInfoType }
     *     
     */
    public void setOriginalIssueInfo(TicketIssuanceInfoType value) {
        this.originalIssueInfo = value;
    }

    /**
     * Gets the value of the originDest property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestType }
     *     
     */
    public OriginDestType getOriginDest() {
        return originDest;
    }

    /**
     * Sets the value of the originDest property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestType }
     *     
     */
    public void setOriginDest(OriginDestType value) {
        this.originDest = value;
    }

    /**
     * Gets the value of the paxRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxRefID() {
        return paxRefID;
    }

    /**
     * Sets the value of the paxRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxRefID(String value) {
        this.paxRefID = value;
    }

    /**
     * Gets the value of the paymentInfoRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentInfoRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentInfoRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPaymentInfoRefID() {
        if (paymentInfoRefID == null) {
            paymentInfoRefID = new ArrayList<String>();
        }
        return this.paymentInfoRefID;
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
     * Gets the value of the pricingCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingCountryCode() {
        return pricingCountryCode;
    }

    /**
     * Sets the value of the pricingCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingCountryCode(String value) {
        this.pricingCountryCode = value;
    }

    /**
     * Gets the value of the pricingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPricingDate() {
        return pricingDate;
    }

    /**
     * Sets the value of the pricingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPricingDate(XMLGregorianCalendar value) {
        this.pricingDate = value;
    }

    /**
     * Gets the value of the pricingLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingLocationCode() {
        return pricingLocationCode;
    }

    /**
     * Sets the value of the pricingLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingLocationCode(String value) {
        this.pricingLocationCode = value;
    }

    /**
     * Gets the value of the pricingTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPricingTime() {
        return pricingTime;
    }

    /**
     * Sets the value of the pricingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPricingTime(XMLGregorianCalendar value) {
        this.pricingTime = value;
    }

    /**
     * Gets the value of the referencedOrder property.
     * 
     * @return
     *     possible object is
     *     {@link OrderType }
     *     
     */
    public OrderType getReferencedOrder() {
        return referencedOrder;
    }

    /**
     * Sets the value of the referencedOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType }
     *     
     */
    public void setReferencedOrder(OrderType value) {
        this.referencedOrder = value;
    }

    /**
     * Gets the value of the servicingAgency property.
     * 
     * @return
     *     possible object is
     *     {@link TravelAgencyType }
     *     
     */
    public TravelAgencyType getServicingAgency() {
        return servicingAgency;
    }

    /**
     * Sets the value of the servicingAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelAgencyType }
     *     
     */
    public void setServicingAgency(TravelAgencyType value) {
        this.servicingAgency = value;
    }

    /**
     * Gets the value of the ticket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketType }
     * 
     * 
     */
    public List<TicketType> getTicket() {
        if (ticket == null) {
            ticket = new ArrayList<TicketType>();
        }
        return this.ticket;
    }

    /**
     * Gets the value of the ticketRefIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketRefIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketRefIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketRefIdentificationType }
     * 
     * 
     */
    public List<TicketRefIdentificationType> getTicketRefIdentification() {
        if (ticketRefIdentification == null) {
            ticketRefIdentification = new ArrayList<TicketRefIdentificationType>();
        }
        return this.ticketRefIdentification;
    }

}
