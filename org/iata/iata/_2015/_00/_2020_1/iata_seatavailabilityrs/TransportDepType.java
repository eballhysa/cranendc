
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The action or process of leaving of a transport vehicle from any place or location.
 * 
 * <p>Java class for TransportDepType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportDepType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AircraftScheduledDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}DateTimeType" minOccurs="0"/>
 *         &lt;element name="BoardingGateID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}BoardingGateID_Type" minOccurs="0"/>
 *         &lt;element name="IATA_LocationCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}IATA_LocationCodeType" minOccurs="0"/>
 *         &lt;element name="StationName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}StationNameType" minOccurs="0"/>
 *         &lt;element name="TerminalName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}NameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportDepType", propOrder = {
    "aircraftScheduledDateTime",
    "boardingGateID",
    "iataLocationCode",
    "stationName",
    "terminalName"
})
public class TransportDepType {

    @XmlElement(name = "AircraftScheduledDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aircraftScheduledDateTime;
    @XmlElement(name = "BoardingGateID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String boardingGateID;
    @XmlElement(name = "IATA_LocationCode")
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

    /**
     * Gets the value of the aircraftScheduledDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAircraftScheduledDateTime() {
        return aircraftScheduledDateTime;
    }

    /**
     * Sets the value of the aircraftScheduledDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAircraftScheduledDateTime(XMLGregorianCalendar value) {
        this.aircraftScheduledDateTime = value;
    }

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

}
