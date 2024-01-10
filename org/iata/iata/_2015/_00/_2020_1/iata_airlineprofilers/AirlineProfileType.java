
package org.iata.iata._2015._00._2020_1.iata_airlineprofilers;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Distribution profile of an airline which describes which types of shopping requests may be processed by a particular carrier.
 * 
 * <p>Java class for AirlineProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirlineProfileDataItem" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}AirlineProfileDataItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AirlineProfileURL" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}URI_Type" minOccurs="0"/>
 *         &lt;element name="AssociatedMediaURL" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}URI_Type" minOccurs="0"/>
 *         &lt;element name="AssociationMembershipText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}TextType" minOccurs="0"/>
 *         &lt;element name="ProfileOwner" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}CarrierType"/>
 *         &lt;element name="SupportedMessageInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}KeyValuePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineProfileType", propOrder = {
    "airlineProfileDataItem",
    "airlineProfileURL",
    "associatedMediaURL",
    "associationMembershipText",
    "profileOwner",
    "supportedMessageInfo"
})
public class AirlineProfileType {

    @XmlElement(name = "AirlineProfileDataItem")
    protected List<AirlineProfileDataItemType> airlineProfileDataItem;
    @XmlElement(name = "AirlineProfileURL")
    @XmlSchemaType(name = "anyURI")
    protected String airlineProfileURL;
    @XmlElement(name = "AssociatedMediaURL")
    @XmlSchemaType(name = "anyURI")
    protected String associatedMediaURL;
    @XmlElement(name = "AssociationMembershipText")
    protected String associationMembershipText;
    @XmlElement(name = "ProfileOwner", required = true)
    protected CarrierType profileOwner;
    @XmlElement(name = "SupportedMessageInfo")
    protected List<KeyValuePropertyType> supportedMessageInfo;

    /**
     * Gets the value of the airlineProfileDataItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airlineProfileDataItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirlineProfileDataItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlineProfileDataItemType }
     * 
     * 
     */
    public List<AirlineProfileDataItemType> getAirlineProfileDataItem() {
        if (airlineProfileDataItem == null) {
            airlineProfileDataItem = new ArrayList<AirlineProfileDataItemType>();
        }
        return this.airlineProfileDataItem;
    }

    /**
     * Gets the value of the airlineProfileURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineProfileURL() {
        return airlineProfileURL;
    }

    /**
     * Sets the value of the airlineProfileURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineProfileURL(String value) {
        this.airlineProfileURL = value;
    }

    /**
     * Gets the value of the associatedMediaURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedMediaURL() {
        return associatedMediaURL;
    }

    /**
     * Sets the value of the associatedMediaURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedMediaURL(String value) {
        this.associatedMediaURL = value;
    }

    /**
     * Gets the value of the associationMembershipText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociationMembershipText() {
        return associationMembershipText;
    }

    /**
     * Sets the value of the associationMembershipText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociationMembershipText(String value) {
        this.associationMembershipText = value;
    }

    /**
     * Gets the value of the profileOwner property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getProfileOwner() {
        return profileOwner;
    }

    /**
     * Sets the value of the profileOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     */
    public void setProfileOwner(CarrierType value) {
        this.profileOwner = value;
    }

    /**
     * Gets the value of the supportedMessageInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedMessageInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedMessageInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePropertyType }
     * 
     * 
     */
    public List<KeyValuePropertyType> getSupportedMessageInfo() {
        if (supportedMessageInfo == null) {
            supportedMessageInfo = new ArrayList<KeyValuePropertyType>();
        }
        return this.supportedMessageInfo;
    }

}
