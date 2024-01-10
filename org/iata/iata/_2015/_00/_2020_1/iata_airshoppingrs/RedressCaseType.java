
package org.iata.iata._2015._00._2020_1.iata_airshoppingrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A person's case of being registered with a country's redress program, which can eliminate watch list misidentification and assist in identity verification.
 * 
 * <p>Java class for RedressCaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RedressCaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}CountryType"/>
 *         &lt;element name="CountryCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}CountryCodeType"/>
 *         &lt;element name="ProgramName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}NameType" minOccurs="0"/>
 *         &lt;element name="RedressCaseID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}RedressID_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedressCaseType", propOrder = {
    "country",
    "countryCode",
    "programName",
    "redressCaseID"
})
public class RedressCaseType {

    @XmlElement(name = "Country", required = true)
    protected CountryType country;
    @XmlElement(name = "CountryCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;
    @XmlElement(name = "ProgramName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String programName;
    @XmlElement(name = "RedressCaseID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String redressCaseID;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountry(CountryType value) {
        this.country = value;
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
     * Gets the value of the programName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * Sets the value of the programName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramName(String value) {
        this.programName = value;
    }

    /**
     * Gets the value of the redressCaseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedressCaseID() {
        return redressCaseID;
    }

    /**
     * Sets the value of the redressCaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedressCaseID(String value) {
        this.redressCaseID = value;
    }

}
