
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
 * The instance of a specific flight or Service Definition as it has been offered (and eventually ordered and consumed) in the context of a specific Offer and/or Order. 
 *  
 * 
 * <p>Java class for ServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountingCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CodeType"/>
 *         &lt;element name="AccountingSubCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CodeType"/>
 *         &lt;element name="ActionCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ActionCodeType" minOccurs="0"/>
 *         &lt;element name="Bag" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}BagType"/>
 *         &lt;element name="BookingRef" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}BookingRefType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="BookingStatusCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ServiceBookingStatusCodeType" minOccurs="0"/>
 *         &lt;element name="DeliveryCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="DeliveryMilestoneCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="DeliveryProvider" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}DeliveryProviderType"/>
 *         &lt;element name="DeliveryStatusCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ServiceDeliveryStatusCodeType" minOccurs="0"/>
 *         &lt;element name="ExpirationDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}DateTimeType" minOccurs="0"/>
 *         &lt;element name="InterlineSettlementInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}InterlineSettlementInfoType" minOccurs="0"/>
 *         &lt;element name="InventoryGuaranteeDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}DateTimeType" minOccurs="0"/>
 *         &lt;element name="PaxRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ID_Type"/>
 *         &lt;element name="ServiceAssociations" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ServiceAssociationsType" minOccurs="0"/>
 *         &lt;element name="ServiceID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ID_Type"/>
 *         &lt;element name="ServiceRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="UnchangedInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}IndType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceType", propOrder = {
    "accountingCode",
    "accountingSubCode",
    "actionCode",
    "bag",
    "bookingRef",
    "bookingStatusCode",
    "deliveryCode",
    "deliveryMilestoneCode",
    "deliveryProvider",
    "deliveryStatusCode",
    "expirationDateTime",
    "interlineSettlementInfo",
    "inventoryGuaranteeDateTime",
    "paxRefID",
    "serviceAssociations",
    "serviceID",
    "serviceRefID",
    "statusCode",
    "unchangedInd"
})
public class ServiceType {

    @XmlElement(name = "AccountingCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String accountingCode;
    @XmlElement(name = "AccountingSubCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String accountingSubCode;
    @XmlElement(name = "ActionCode")
    @XmlSchemaType(name = "token")
    protected ActionCodeContentType actionCode;
    @XmlElement(name = "Bag", required = true)
    protected BagType bag;
    @XmlElement(name = "BookingRef")
    protected List<BookingRefType> bookingRef;
    @XmlElement(name = "BookingStatusCode")
    @XmlSchemaType(name = "token")
    protected ServiceBookingStatusCodeContentType bookingStatusCode;
    @XmlElement(name = "DeliveryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deliveryCode;
    @XmlElement(name = "DeliveryMilestoneCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deliveryMilestoneCode;
    @XmlElement(name = "DeliveryProvider", required = true)
    protected DeliveryProviderType deliveryProvider;
    @XmlElement(name = "DeliveryStatusCode")
    @XmlSchemaType(name = "token")
    protected ServiceDeliveryStatusCodeContentType deliveryStatusCode;
    @XmlElement(name = "ExpirationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDateTime;
    @XmlElement(name = "InterlineSettlementInfo")
    protected InterlineSettlementInfoType interlineSettlementInfo;
    @XmlElement(name = "InventoryGuaranteeDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inventoryGuaranteeDateTime;
    @XmlElement(name = "PaxRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxRefID;
    @XmlElement(name = "ServiceAssociations")
    protected ServiceAssociationsType serviceAssociations;
    @XmlElement(name = "ServiceID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceID;
    @XmlElement(name = "ServiceRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceRefID;
    @XmlElement(name = "StatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String statusCode;
    @XmlElement(name = "UnchangedInd")
    protected Boolean unchangedInd;

    /**
     * Gets the value of the accountingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingCode() {
        return accountingCode;
    }

    /**
     * Sets the value of the accountingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingCode(String value) {
        this.accountingCode = value;
    }

    /**
     * Gets the value of the accountingSubCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingSubCode() {
        return accountingSubCode;
    }

    /**
     * Sets the value of the accountingSubCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingSubCode(String value) {
        this.accountingSubCode = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionCodeContentType }
     *     
     */
    public ActionCodeContentType getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCodeContentType }
     *     
     */
    public void setActionCode(ActionCodeContentType value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the bag property.
     * 
     * @return
     *     possible object is
     *     {@link BagType }
     *     
     */
    public BagType getBag() {
        return bag;
    }

    /**
     * Sets the value of the bag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagType }
     *     
     */
    public void setBag(BagType value) {
        this.bag = value;
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
     * Gets the value of the bookingStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceBookingStatusCodeContentType }
     *     
     */
    public ServiceBookingStatusCodeContentType getBookingStatusCode() {
        return bookingStatusCode;
    }

    /**
     * Sets the value of the bookingStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBookingStatusCodeContentType }
     *     
     */
    public void setBookingStatusCode(ServiceBookingStatusCodeContentType value) {
        this.bookingStatusCode = value;
    }

    /**
     * Gets the value of the deliveryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryCode() {
        return deliveryCode;
    }

    /**
     * Sets the value of the deliveryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryCode(String value) {
        this.deliveryCode = value;
    }

    /**
     * Gets the value of the deliveryMilestoneCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryMilestoneCode() {
        return deliveryMilestoneCode;
    }

    /**
     * Sets the value of the deliveryMilestoneCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryMilestoneCode(String value) {
        this.deliveryMilestoneCode = value;
    }

    /**
     * Gets the value of the deliveryProvider property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryProviderType }
     *     
     */
    public DeliveryProviderType getDeliveryProvider() {
        return deliveryProvider;
    }

    /**
     * Sets the value of the deliveryProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryProviderType }
     *     
     */
    public void setDeliveryProvider(DeliveryProviderType value) {
        this.deliveryProvider = value;
    }

    /**
     * Gets the value of the deliveryStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDeliveryStatusCodeContentType }
     *     
     */
    public ServiceDeliveryStatusCodeContentType getDeliveryStatusCode() {
        return deliveryStatusCode;
    }

    /**
     * Sets the value of the deliveryStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDeliveryStatusCodeContentType }
     *     
     */
    public void setDeliveryStatusCode(ServiceDeliveryStatusCodeContentType value) {
        this.deliveryStatusCode = value;
    }

    /**
     * Gets the value of the expirationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDateTime() {
        return expirationDateTime;
    }

    /**
     * Sets the value of the expirationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDateTime(XMLGregorianCalendar value) {
        this.expirationDateTime = value;
    }

    /**
     * Gets the value of the interlineSettlementInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InterlineSettlementInfoType }
     *     
     */
    public InterlineSettlementInfoType getInterlineSettlementInfo() {
        return interlineSettlementInfo;
    }

    /**
     * Sets the value of the interlineSettlementInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterlineSettlementInfoType }
     *     
     */
    public void setInterlineSettlementInfo(InterlineSettlementInfoType value) {
        this.interlineSettlementInfo = value;
    }

    /**
     * Gets the value of the inventoryGuaranteeDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInventoryGuaranteeDateTime() {
        return inventoryGuaranteeDateTime;
    }

    /**
     * Sets the value of the inventoryGuaranteeDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInventoryGuaranteeDateTime(XMLGregorianCalendar value) {
        this.inventoryGuaranteeDateTime = value;
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
     * Gets the value of the serviceAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAssociationsType }
     *     
     */
    public ServiceAssociationsType getServiceAssociations() {
        return serviceAssociations;
    }

    /**
     * Sets the value of the serviceAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAssociationsType }
     *     
     */
    public void setServiceAssociations(ServiceAssociationsType value) {
        this.serviceAssociations = value;
    }

    /**
     * Gets the value of the serviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceID(String value) {
        this.serviceID = value;
    }

    /**
     * Gets the value of the serviceRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceRefID() {
        return serviceRefID;
    }

    /**
     * Sets the value of the serviceRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceRefID(String value) {
        this.serviceRefID = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the unchangedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnchangedInd() {
        return unchangedInd;
    }

    /**
     * Sets the value of the unchangedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnchangedInd(Boolean value) {
        this.unchangedInd = value;
    }

}
