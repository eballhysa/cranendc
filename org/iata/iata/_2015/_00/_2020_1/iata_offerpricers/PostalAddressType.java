
package org.iata.iata._2015._00._2020_1.iata_offerpricers;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Natural or physical address used for postal service. May be a building address, airport address, etc.
 * 
 * <p>Java class for PostalAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostalAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BuildingRoomText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}TextType" minOccurs="0"/>
 *         &lt;element name="CityName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}NameType" minOccurs="0"/>
 *         &lt;element name="ContactTypeText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}TextType" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="CountryName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}ProperNameType" minOccurs="0"/>
 *         &lt;element name="CountrySubDivisionName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}ProperNameType" minOccurs="0"/>
 *         &lt;element name="PO_BoxCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}CodeType" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}CodeType" minOccurs="0"/>
 *         &lt;element name="StreetText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}TextType" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddressType", propOrder = {
    "buildingRoomText",
    "cityName",
    "contactTypeText",
    "countryCode",
    "countryName",
    "countrySubDivisionName",
    "poBoxCode",
    "postalCode",
    "streetText"
})
public class PostalAddressType {

    @XmlElement(name = "BuildingRoomText")
    protected String buildingRoomText;
    @XmlElement(name = "CityName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cityName;
    @XmlElement(name = "ContactTypeText")
    protected String contactTypeText;
    @XmlElement(name = "CountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;
    @XmlElement(name = "CountryName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryName;
    @XmlElement(name = "CountrySubDivisionName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countrySubDivisionName;
    @XmlElement(name = "PO_BoxCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String poBoxCode;
    @XmlElement(name = "PostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String postalCode;
    @XmlElement(name = "StreetText")
    protected List<String> streetText;

    /**
     * Gets the value of the buildingRoomText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingRoomText() {
        return buildingRoomText;
    }

    /**
     * Sets the value of the buildingRoomText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingRoomText(String value) {
        this.buildingRoomText = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

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
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the countrySubDivisionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrySubDivisionName() {
        return countrySubDivisionName;
    }

    /**
     * Sets the value of the countrySubDivisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrySubDivisionName(String value) {
        this.countrySubDivisionName = value;
    }

    /**
     * Gets the value of the poBoxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBoxCode() {
        return poBoxCode;
    }

    /**
     * Sets the value of the poBoxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBoxCode(String value) {
        this.poBoxCode = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the streetText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the streetText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreetText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStreetText() {
        if (streetText == null) {
            streetText = new ArrayList<String>();
        }
        return this.streetText;
    }

}
