
package org.iata.iata._2015._00._2020_1.iata_airshoppingrq;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Customer's requested connection information.
 * 
 * <p>Java class for ConnectionCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConnectionPrefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}ID_Type"/>
 *         &lt;element name="ConnectionPricingInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         &lt;element name="InterlineInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         &lt;element name="MaximumConnectionQty" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}QtyType" minOccurs="0"/>
 *         &lt;element name="MaximumConnectionTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}TimeType" minOccurs="0"/>
 *         &lt;element name="MinimumConnectionTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}TimeType" minOccurs="0"/>
 *         &lt;element name="StationCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}StationCriteriaType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionCriteriaType", propOrder = {
    "connectionPrefID",
    "connectionPricingInd",
    "interlineInd",
    "maximumConnectionQty",
    "maximumConnectionTime",
    "minimumConnectionTime",
    "stationCriteria"
})
public class ConnectionCriteriaType {

    @XmlElement(name = "ConnectionPrefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String connectionPrefID;
    @XmlElement(name = "ConnectionPricingInd")
    protected Boolean connectionPricingInd;
    @XmlElement(name = "InterlineInd")
    protected Boolean interlineInd;
    @XmlElement(name = "MaximumConnectionQty")
    protected BigDecimal maximumConnectionQty;
    @XmlElement(name = "MaximumConnectionTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maximumConnectionTime;
    @XmlElement(name = "MinimumConnectionTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar minimumConnectionTime;
    @XmlElement(name = "StationCriteria", required = true)
    protected List<StationCriteriaType> stationCriteria;

    /**
     * Gets the value of the connectionPrefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionPrefID() {
        return connectionPrefID;
    }

    /**
     * Sets the value of the connectionPrefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionPrefID(String value) {
        this.connectionPrefID = value;
    }

    /**
     * Gets the value of the connectionPricingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConnectionPricingInd() {
        return connectionPricingInd;
    }

    /**
     * Sets the value of the connectionPricingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConnectionPricingInd(Boolean value) {
        this.connectionPricingInd = value;
    }

    /**
     * Gets the value of the interlineInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterlineInd() {
        return interlineInd;
    }

    /**
     * Sets the value of the interlineInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterlineInd(Boolean value) {
        this.interlineInd = value;
    }

    /**
     * Gets the value of the maximumConnectionQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumConnectionQty() {
        return maximumConnectionQty;
    }

    /**
     * Sets the value of the maximumConnectionQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumConnectionQty(BigDecimal value) {
        this.maximumConnectionQty = value;
    }

    /**
     * Gets the value of the maximumConnectionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaximumConnectionTime() {
        return maximumConnectionTime;
    }

    /**
     * Sets the value of the maximumConnectionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaximumConnectionTime(XMLGregorianCalendar value) {
        this.maximumConnectionTime = value;
    }

    /**
     * Gets the value of the minimumConnectionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMinimumConnectionTime() {
        return minimumConnectionTime;
    }

    /**
     * Sets the value of the minimumConnectionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMinimumConnectionTime(XMLGregorianCalendar value) {
        this.minimumConnectionTime = value;
    }

    /**
     * Gets the value of the stationCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stationCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStationCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StationCriteriaType }
     * 
     * 
     */
    public List<StationCriteriaType> getStationCriteria() {
        if (stationCriteria == null) {
            stationCriteria = new ArrayList<StationCriteriaType>();
        }
        return this.stationCriteria;
    }

}
