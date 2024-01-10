
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="DeviceCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="DeviceName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}NameType" minOccurs="0"/>
 *         &lt;element name="DeviceOwnerTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}OwnershipTypeCodeType" minOccurs="0"/>
 *         &lt;element name="IPAddressText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}TextType" minOccurs="0"/>
 *         &lt;element name="MAC_Address" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}TextType" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}PhoneType" minOccurs="0"/>
 *         &lt;element name="PresenceTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}PresenceTypeCodeType" minOccurs="0"/>
 *         &lt;element name="TouchPointTrxCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}CodeType" minOccurs="0"/>
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
    "deviceName",
    "deviceOwnerTypeCode",
    "ipAddressText",
    "macAddress",
    "phone",
    "presenceTypeCode",
    "touchPointTrxCode"
})
public class DeviceType {

    @XmlElement(name = "DeviceCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deviceCode;
    @XmlElement(name = "DeviceName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deviceName;
    @XmlElement(name = "DeviceOwnerTypeCode")
    @XmlSchemaType(name = "token")
    protected OwnershipTypeCodeContentType deviceOwnerTypeCode;
    @XmlElement(name = "IPAddressText")
    protected String ipAddressText;
    @XmlElement(name = "MAC_Address")
    protected String macAddress;
    @XmlElement(name = "Phone")
    protected PhoneType phone;
    @XmlElement(name = "PresenceTypeCode")
    @XmlSchemaType(name = "token")
    protected PresenceTypeCodeContentType presenceTypeCode;
    @XmlElement(name = "TouchPointTrxCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String touchPointTrxCode;

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
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
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
     * Gets the value of the ipAddressText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddressText() {
        return ipAddressText;
    }

    /**
     * Sets the value of the ipAddressText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddressText(String value) {
        this.ipAddressText = value;
    }

    /**
     * Gets the value of the macAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMACAddress() {
        return macAddress;
    }

    /**
     * Sets the value of the macAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMACAddress(String value) {
        this.macAddress = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneType }
     *     
     */
    public PhoneType getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneType }
     *     
     */
    public void setPhone(PhoneType value) {
        this.phone = value;
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

    /**
     * Gets the value of the touchPointTrxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTouchPointTrxCode() {
        return touchPointTrxCode;
    }

    /**
     * Sets the value of the touchPointTrxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTouchPointTrxCode(String value) {
        this.touchPointTrxCode = value;
    }

}
