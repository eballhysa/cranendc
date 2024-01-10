
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Device upon which the secure transaction will occur.
 * 
 * <p>Java class for DeviceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeviceCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}TouchPointDeviceCodeType" minOccurs="0"/>
 *         &lt;element name="DeviceOwnerTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}OwnershipTypeCodeType" minOccurs="0"/>
 *         &lt;element name="PresenceTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}PresenceTypeCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceType", propOrder = {
    "deviceCode",
    "deviceOwnerTypeCode",
    "presenceTypeCode"
})
public class DeviceType {

    @XmlElement(name = "DeviceCode")
    protected String deviceCode;
    @XmlElement(name = "DeviceOwnerTypeCode")
    @XmlSchemaType(name = "token")
    protected OwnershipTypeCodeContentType deviceOwnerTypeCode;
    @XmlElement(name = "PresenceTypeCode")
    @XmlSchemaType(name = "token")
    protected PresenceTypeCodeContentType presenceTypeCode;

    /**
     * Gets the value of the deviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceCode() {
        return deviceCode;
    }

    /**
     * Sets the value of the deviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceCode(String value) {
        this.deviceCode = value;
    }

    /**
     * Gets the value of the deviceOwnerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link OwnershipTypeCodeContentType }
     *     
     */
    public OwnershipTypeCodeContentType getDeviceOwnerTypeCode() {
        return deviceOwnerTypeCode;
    }

    /**
     * Sets the value of the deviceOwnerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnershipTypeCodeContentType }
     *     
     */
    public void setDeviceOwnerTypeCode(OwnershipTypeCodeContentType value) {
        this.deviceOwnerTypeCode = value;
    }

    /**
     * Gets the value of the presenceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PresenceTypeCodeContentType }
     *     
     */
    public PresenceTypeCodeContentType getPresenceTypeCode() {
        return presenceTypeCode;
    }

    /**
     * Sets the value of the presenceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresenceTypeCodeContentType }
     *     
     */
    public void setPresenceTypeCode(PresenceTypeCodeContentType value) {
        this.presenceTypeCode = value;
    }

}
