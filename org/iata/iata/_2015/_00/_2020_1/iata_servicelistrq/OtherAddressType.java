
package org.iata.iata._2015._00._2020_1.iata_servicelistrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Other Contact Method information. E.g. web site URL, social media handle.
 * 
 * <p>Java class for OtherAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactTypeText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}TextType" minOccurs="0"/>
 *         &lt;element name="OtherAddressText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}TextType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherAddressType", propOrder = {
    "contactTypeText",
    "otherAddressText"
})
public class OtherAddressType {

    @XmlElement(name = "ContactTypeText")
    protected String contactTypeText;
    @XmlElement(name = "OtherAddressText", required = true)
    protected String otherAddressText;

    /**
     * Gets the value of the contactTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTypeText() {
        return contactTypeText;
    }

    /**
     * Sets the value of the contactTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTypeText(String value) {
        this.contactTypeText = value;
    }

    /**
     * Gets the value of the otherAddressText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherAddressText() {
        return otherAddressText;
    }

    /**
     * Sets the value of the otherAddressText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherAddressText(String value) {
        this.otherAddressText = value;
    }

}
