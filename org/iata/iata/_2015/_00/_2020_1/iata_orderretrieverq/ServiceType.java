
package org.iata.iata._2015._00._2020_1.iata_orderretrieverq;

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
 *         &lt;element name="BookingInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}BookingInfoType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="BookingStatusCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}ServiceBookingStatusCodeType" minOccurs="0"/>
 *         &lt;element name="DeliveryStatusCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}ServiceDeliveryStatusCodeType" minOccurs="0"/>
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}TextType" minOccurs="0"/>
 *         &lt;element name="InventoryGuaranteeDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ServiceID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}ID_Type"/>
 *         &lt;element name="UnchangedInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}IndType" minOccurs="0"/>
 *         &lt;element name="ValidatingCarrier" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}CarrierType" minOccurs="0"/>
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
    "bookingInfo",
    "bookingStatusCode",
    "deliveryStatusCode",
    "descText",
    "inventoryGuaranteeDateTime",
    "serviceID",
    "unchangedInd",
    "validatingCarrier"
})
public class ServiceType {

    @XmlElement(name = "BookingInfo")
    protected List<BookingInfoType> bookingInfo;
    @XmlElement(name = "BookingStatusCode")
    @XmlSchemaType(name = "token")
    protected ServiceBookingStatusContentType bookingStatusCode;
    @XmlElement(name = "DeliveryStatusCode")
    @XmlSchemaType(name = "token")
    protected ServiceDeliveryStatusContentType deliveryStatusCode;
    @XmlElement(name = "DescText")
    protected String descText;
    @XmlElement(name = "InventoryGuaranteeDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inventoryGuaranteeDateTime;
    @XmlElement(name = "ServiceID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceID;
    @XmlElement(name = "UnchangedInd")
    protected Boolean unchangedInd;
    @XmlElement(name = "ValidatingCarrier")
    protected CarrierType validatingCarrier;

    /**
     * Gets the value of the bookingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingInfoType }
     * 
     * 
     */
    public List<BookingInfoType> getBookingInfo() {
        if (bookingInfo == null) {
            bookingInfo = new ArrayList<BookingInfoType>();
        }
        return this.bookingInfo;
    }

    /**
     * Gets the value of the bookingStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceBookingStatusContentType }
     *     
     */
    public ServiceBookingStatusContentType getBookingStatusCode() {
        return bookingStatusCode;
    }

    /**
     * Sets the value of the bookingStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBookingStatusContentType }
     *     
     */
    public void setBookingStatusCode(ServiceBookingStatusContentType value) {
        this.bookingStatusCode = value;
    }

    /**
     * Gets the value of the deliveryStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDeliveryStatusContentType }
     *     
     */
    public ServiceDeliveryStatusContentType getDeliveryStatusCode() {
        return deliveryStatusCode;
    }

    /**
     * Sets the value of the deliveryStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDeliveryStatusContentType }
     *     
     */
    public void setDeliveryStatusCode(ServiceDeliveryStatusContentType value) {
        this.deliveryStatusCode = value;
    }

    /**
     * Gets the value of the descText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescText() {
        return descText;
    }

    /**
     * Sets the value of the descText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescText(String value) {
        this.descText = value;
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

    /**
     * Gets the value of the validatingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getValidatingCarrier() {
        return validatingCarrier;
    }

    /**
     * Sets the value of the validatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     */
    public void setValidatingCarrier(CarrierType value) {
        this.validatingCarrier = value;
    }

}
