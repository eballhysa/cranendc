
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An official entry in a Passport or other Travel Document made by an official of a government to indicate that the bearer has been granted authority to enter or re-enter the country or region concerned.
 * 
 * <p>Java class for VisaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnterBeforeDate" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}DateType" minOccurs="0"/>
 *         &lt;element name="EntryQty" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}QtyType" minOccurs="0"/>
 *         &lt;element name="HostCountryCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="StayDuration" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}DurationType" minOccurs="0"/>
 *         &lt;element name="VisaID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="VisaTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisaType", propOrder = {
    "enterBeforeDate",
    "entryQty",
    "hostCountryCode",
    "stayDuration",
    "visaID",
    "visaTypeCode"
})
public class VisaType {

    @XmlElement(name = "EnterBeforeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar enterBeforeDate;
    @XmlElement(name = "EntryQty")
    protected BigDecimal entryQty;
    @XmlElement(name = "HostCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String hostCountryCode;
    @XmlElement(name = "StayDuration")
    protected Duration stayDuration;
    @XmlElement(name = "VisaID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String visaID;
    @XmlElement(name = "VisaTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String visaTypeCode;

    /**
     * Gets the value of the enterBeforeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnterBeforeDate() {
        return enterBeforeDate;
    }

    /**
     * Sets the value of the enterBeforeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnterBeforeDate(XMLGregorianCalendar value) {
        this.enterBeforeDate = value;
    }

    /**
     * Gets the value of the entryQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEntryQty() {
        return entryQty;
    }

    /**
     * Sets the value of the entryQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEntryQty(BigDecimal value) {
        this.entryQty = value;
    }

    /**
     * Gets the value of the hostCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostCountryCode() {
        return hostCountryCode;
    }

    /**
     * Sets the value of the hostCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostCountryCode(String value) {
        this.hostCountryCode = value;
    }

    /**
     * Gets the value of the stayDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getStayDuration() {
        return stayDuration;
    }

    /**
     * Sets the value of the stayDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setStayDuration(Duration value) {
        this.stayDuration = value;
    }

    /**
     * Gets the value of the visaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaID() {
        return visaID;
    }

    /**
     * Sets the value of the visaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaID(String value) {
        this.visaID = value;
    }

    /**
     * Gets the value of the visaTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaTypeCode() {
        return visaTypeCode;
    }

    /**
     * Sets the value of the visaTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaTypeCode(String value) {
        this.visaTypeCode = value;
    }

}
