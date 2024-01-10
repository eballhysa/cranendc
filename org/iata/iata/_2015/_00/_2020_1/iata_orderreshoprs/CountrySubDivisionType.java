
package org.iata.iata._2015._00._2020_1.iata_orderreshoprs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An area of land which is a sub-division within a country, such as a state, a county, a canton, a province, etc.
 * 
 * <p>Java class for CountrySubDivisionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountrySubDivisionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}CountryType" minOccurs="0"/>
 *         &lt;element name="CountrySubDivisionCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}CountrySubDivisionCodeType" minOccurs="0"/>
 *         &lt;element name="CountrySubDivisionName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}ProperNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountrySubDivisionType", propOrder = {
    "country",
    "countrySubDivisionCode",
    "countrySubDivisionName"
})
public class CountrySubDivisionType {

    @XmlElement(name = "Country")
    protected CountryType country;
    @XmlElement(name = "CountrySubDivisionCode")
    protected String countrySubDivisionCode;
    @XmlElement(name = "CountrySubDivisionName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countrySubDivisionName;

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
     * Gets the value of the countrySubDivisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrySubDivisionCode() {
        return countrySubDivisionCode;
    }

    /**
     * Sets the value of the countrySubDivisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrySubDivisionCode(String value) {
        this.countrySubDivisionCode = value;
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

}
