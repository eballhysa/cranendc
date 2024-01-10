
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Information identifying the location and other attributes of the entity performing transactions. Point of sale may be considered by some systems when making inventory and availability decisions.
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
 *         &lt;element name="AgentDutyText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}TextType" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CityType" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CountryType" minOccurs="0"/>
 *         &lt;element name="OnlineTrxInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}IndType"/>
 *         &lt;element name="RequestTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}DateTimeType" minOccurs="0"/>
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
    "onlineTrxInd",
    "requestTime"
})
public class POSType {

    @XmlElement(name = "AgentDutyText")
    protected String agentDutyText;
    @XmlElement(name = "City")
    protected CityType city;
    @XmlElement(name = "Country")
    protected CountryType country;
    @XmlElement(name = "OnlineTrxInd")
    protected boolean onlineTrxInd;
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
     * Gets the value of the onlineTrxInd property.
     * 
     */
    public boolean isOnlineTrxInd() {
        return onlineTrxInd;
    }

    /**
     * Sets the value of the onlineTrxInd property.
     * 
     */
    public void setOnlineTrxInd(boolean value) {
        this.onlineTrxInd = value;
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
