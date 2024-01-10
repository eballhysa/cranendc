
package org.iata.iata._2015._00._2020_1.iata_servicelistrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The place at which a retail transaction is carried out.
 * 
 * <p>Java class for POS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgentDutyText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}TextType" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}CityType" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}CountryType" minOccurs="0"/>
 *         &lt;element name="RequestTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}DateTimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POS_Type", propOrder = {
    "agentDutyText",
    "city",
    "country",
    "requestTime"
})
public class POSType {

    @XmlElement(name = "AgentDutyText")
    protected String agentDutyText;
    @XmlElement(name = "City")
    protected CityType city;
    @XmlElement(name = "Country")
    protected CountryType country;
    @XmlElement(name = "RequestTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestTime;

    /**
     * Gets the value of the agentDutyText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentDutyText() {
        return agentDutyText;
    }

    /**
     * Sets the value of the agentDutyText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentDutyText(String value) {
        this.agentDutyText = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link CityType }
     *     
     */
    public CityType getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityType }
     *     
     */
    public void setCity(CityType value) {
        this.city = value;
    }

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
     * Gets the value of the requestTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestTime() {
        return requestTime;
    }

    /**
     * Sets the value of the requestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestTime(XMLGregorianCalendar value) {
        this.requestTime = value;
    }

}
