
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A Customer's requested Origin departure time and location.
 * 
 * <p>Java class for OriginDepCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginDepCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BoardingGateID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}BoardingGateID_Type" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}DateType"/>
 *         &lt;element name="IATA_LocationCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}IATA_LocationCodeType"/>
 *         &lt;element name="StationName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}NameType" minOccurs="0"/>
 *         &lt;element name="TerminalName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}NameType" minOccurs="0"/>
 *         &lt;element name="Time" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}TimeType" minOccurs="0"/>
 *         &lt;element name="TimeAfterMeasure" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}MeasureType" minOccurs="0"/>
 *         &lt;element name="TimeBeforeMeasure" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}MeasureType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDepCriteriaType", propOrder = {
    "boardingGateID",
    "date",
    "iataLocationCode",
    "stationName",
    "terminalName",
    "time",
    "timeAfterMeasure",
    "timeBeforeMeasure"
})
public class OriginDepCriteriaType {

    @XmlElement(name = "BoardingGateID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String boardingGateID;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "IATA_LocationCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String iataLocationCode;
    @XmlElement(name = "StationName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String stationName;
    @XmlElement(name = "TerminalName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String terminalName;
    @XmlElement(name = "Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    @XmlElement(name = "TimeAfterMeasure")
    protected MeasureType timeAfterMeasure;
    @XmlElement(name = "TimeBeforeMeasure")
    protected MeasureType timeBeforeMeasure;

    /**
     * Gets the value of the boardingGateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardingGateID() {
        return boardingGateID;
    }

    /**
     * Sets the value of the boardingGateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardingGateID(String value) {
        this.boardingGateID = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the iataLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATALocationCode() {
        return iataLocationCode;
    }

    /**
     * Sets the value of the iataLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIATALocationCode(String value) {
        this.iataLocationCode = value;
    }

    /**
     * Gets the value of the stationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * Sets the value of the stationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationName(String value) {
        this.stationName = value;
    }

    /**
     * Gets the value of the terminalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalName() {
        return terminalName;
    }

    /**
     * Sets the value of the terminalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalName(String value) {
        this.terminalName = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Gets the value of the timeAfterMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getTimeAfterMeasure() {
        return timeAfterMeasure;
    }

    /**
     * Sets the value of the timeAfterMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setTimeAfterMeasure(MeasureType value) {
        this.timeAfterMeasure = value;
    }

    /**
     * Gets the value of the timeBeforeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getTimeBeforeMeasure() {
        return timeBeforeMeasure;
    }

    /**
     * Sets the value of the timeBeforeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setTimeBeforeMeasure(MeasureType value) {
        this.timeBeforeMeasure = value;
    }

}
