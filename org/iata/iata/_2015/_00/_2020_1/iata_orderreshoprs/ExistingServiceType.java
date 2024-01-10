
package org.iata.iata._2015._00._2020_1.iata_orderreshoprs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ExistingServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExistingServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingStatusCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}ServiceBookingStatusCodeType" minOccurs="0"/>
 *         &lt;element name="DeliveryStatusCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}ServiceDeliveryStatusCodeType" minOccurs="0"/>
 *         &lt;element name="ServiceRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}ID_Type"/>
 *         &lt;element name="StatusCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}CodeType" minOccurs="0"/>
 *         &lt;element name="UnchangedInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}IndType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExistingServiceType", propOrder = {
    "bookingStatusCode",
    "deliveryStatusCode",
    "serviceRefID",
    "statusCode",
    "unchangedInd"
})
public class ExistingServiceType {

    @XmlElement(name = "BookingStatusCode")
    @XmlSchemaType(name = "token")
    protected ServiceBookingStatusCodeContentType bookingStatusCode;
    @XmlElement(name = "DeliveryStatusCode")
    @XmlSchemaType(name = "token")
    protected ServiceDeliveryStatusCodeContentType deliveryStatusCode;
    @XmlElement(name = "ServiceRefID", required = true)
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
