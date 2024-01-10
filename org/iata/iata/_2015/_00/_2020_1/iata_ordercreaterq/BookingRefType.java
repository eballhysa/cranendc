
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Information related to a booking or reservation.
 * 
 * <p>Java class for BookingRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookingRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingEntity" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}BookingEntityType" minOccurs="0"/>
 *         &lt;element name="BookingRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ID_Type"/>
 *         &lt;element name="BookingRefTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}BookingRefTypeCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingRefType", propOrder = {
    "bookingEntity",
    "bookingRefID",
    "bookingRefTypeCode"
})
public class BookingRefType {

    @XmlElement(name = "BookingEntity")
    protected BookingEntityType bookingEntity;
    @XmlElement(name = "BookingRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bookingRefID;
    @XmlElement(name = "BookingRefTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bookingRefTypeCode;

    /**
     * Gets the value of the bookingEntity property.
     * 
     * @return
     *     possible object is
     *     {@link BookingEntityType }
     *     
     */
    public BookingEntityType getBookingEntity() {
        return bookingEntity;
    }

    /**
     * Sets the value of the bookingEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingEntityType }
     *     
     */
    public void setBookingEntity(BookingEntityType value) {
        this.bookingEntity = value;
    }

    /**
     * Gets the value of the bookingRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingRefID() {
        return bookingRefID;
    }

    /**
     * Sets the value of the bookingRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingRefID(String value) {
        this.bookingRefID = value;
    }

    /**
     * Gets the value of the bookingRefTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingRefTypeCode() {
        return bookingRefTypeCode;
    }

    /**
     * Sets the value of the bookingRefTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingRefTypeCode(String value) {
        this.bookingRefTypeCode = value;
    }

}
