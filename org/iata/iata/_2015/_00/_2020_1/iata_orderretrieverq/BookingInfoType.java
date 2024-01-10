
package org.iata.iata._2015._00._2020_1.iata_orderretrieverq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Information related to booking or reservation.
 * 
 * <p>Java class for BookingInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookingInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingEntity" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}BookingEntityType" minOccurs="0"/>
 *         &lt;element name="BookingID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}ID_Type"/>
 *         &lt;element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}BookingRefTypeCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingInfoType", propOrder = {
    "bookingEntity",
    "bookingID",
    "typeCode"
})
public class BookingInfoType {

    @XmlElement(name = "BookingEntity")
    protected BookingEntityType bookingEntity;
    @XmlElement(name = "BookingID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bookingID;
    @XmlElement(name = "TypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeCode;

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
     * Gets the value of the bookingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingID() {
        return bookingID;
    }

    /**
     * Sets the value of the bookingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingID(String value) {
        this.bookingID = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

}
