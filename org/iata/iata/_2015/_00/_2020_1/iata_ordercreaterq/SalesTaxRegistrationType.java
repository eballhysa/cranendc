
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

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
 * The Identification and contact information of a party purchasing goods or services as registered with a Purchase Tax.
 * 
 * <p>Java class for SalesTaxRegistrationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesTaxRegistrationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CityName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}NameType" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="CountryDialingCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}CountryDialingCodeType" minOccurs="0"/>
 *         &lt;element name="CountrySubDivisionName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ProperNameType" minOccurs="0"/>
 *         &lt;element name="EmailAddressText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}TextType" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}TextType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="SalesTaxRegistrationID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="StreetText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}TextType" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesTaxRegistrationType", propOrder = {
    "cityName",
    "countryCode",
    "countryDialingCode",
    "countrySubDivisionName",
    "emailAddressText",
    "phoneNumber",
    "postalCode",
    "salesTaxRegistrationID",
    "streetText"
})
public class SalesTaxRegistrationType {

    @XmlElement(name = "CityName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cityName;
    @XmlElement(name = "CountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;
    @XmlElement(name = "CountryDialingCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryDialingCode;
    @XmlElement(name = "CountrySubDivisionName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countrySubDivisionName;
    @XmlElement(name = "EmailAddressText")
    protected String emailAddressText;
    @XmlElement(name = "PhoneNumber")
    protected List<String> phoneNumber;
    @XmlElement(name = "PostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String postalCode;
    @XmlElement(name = "SalesTaxRegistrationID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String salesTaxRegistrationID;
    @XmlElement(name = "StreetText")
    protected List<String> streetText;

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
     * Gets the value of the countryDialingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryDialingCode() {
        return countryDialingCode;
    }

    /**
     * Sets the value of the countryDialingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryDialingCode(String value) {
        this.countryDialingCode = value;
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
     * Gets the value of the emailAddressText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddressText() {
        return emailAddressText;
    }

    /**
     * Sets the value of the emailAddressText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddressText(String value) {
        this.emailAddressText = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPhoneNumber() {
        if (phoneNumber == null) {
            phoneNumber = new ArrayList<String>();
        }
        return this.phoneNumber;
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
     * Gets the value of the salesTaxRegistrationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesTaxRegistrationID() {
        return salesTaxRegistrationID;
    }

    /**
     * Sets the value of the salesTaxRegistrationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesTaxRegistrationID(String value) {
        this.salesTaxRegistrationID = value;
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
