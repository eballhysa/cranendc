
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * The nonstop operation of a transport vehicle between the departure station and the arrival station. Can be used for aircrafts as well as other transport vehicles such as train or bus etc. 
 * 
 * <p>Java class for DatedOperatingLegType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatedOperatingLegType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Arrival" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}TransportArrivalType"/>
 *         &lt;element name="ChangeofGaugeInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}IndType" minOccurs="0"/>
 *         &lt;element name="DatedOperatingLegID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="Dep" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}TransportDepType"/>
 *         &lt;element name="IATA_AircraftType" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}IATA_AircraftTypeType" minOccurs="0"/>
 *         &lt;element name="OnGroundDuration" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}DurationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatedOperatingLegType", propOrder = {
    "arrival",
    "changeofGaugeInd",
    "datedOperatingLegID",
    "dep",
    "iataAircraftType",
    "onGroundDuration"
})
public class DatedOperatingLegType {

    @XmlElement(name = "Arrival", required = true)
    protected TransportArrivalType arrival;
    @XmlElement(name = "ChangeofGaugeInd")
    protected Boolean changeofGaugeInd;
    @XmlElement(name = "DatedOperatingLegID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String datedOperatingLegID;
    @XmlElement(name = "Dep", required = true)
    protected TransportDepType dep;
    @XmlElement(name = "IATA_AircraftType")
    protected IATAAircraftTypeType iataAircraftType;
    @XmlElement(name = "OnGroundDuration")
    protected Duration onGroundDuration;

    /**
     * Gets the value of the arrival property.
     * 
     * @return
     *     possible object is
     *     {@link TransportArrivalType }
     *     
     */
    public TransportArrivalType getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportArrivalType }
     *     
     */
    public void setArrival(TransportArrivalType value) {
        this.arrival = value;
    }

    /**
     * Gets the value of the changeofGaugeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeofGaugeInd() {
        return changeofGaugeInd;
    }

    /**
     * Sets the value of the changeofGaugeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeofGaugeInd(Boolean value) {
        this.changeofGaugeInd = value;
    }

    /**
     * Gets the value of the datedOperatingLegID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatedOperatingLegID() {
        return datedOperatingLegID;
    }

    /**
     * Sets the value of the datedOperatingLegID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatedOperatingLegID(String value) {
        this.datedOperatingLegID = value;
    }

    /**
     * Gets the value of the dep property.
     * 
     * @return
     *     possible object is
     *     {@link TransportDepType }
     *     
     */
    public TransportDepType getDep() {
        return dep;
    }

    /**
     * Sets the value of the dep property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportDepType }
     *     
     */
    public void setDep(TransportDepType value) {
        this.dep = value;
    }

    /**
     * Gets the value of the iataAircraftType property.
     * 
     * @return
     *     possible object is
     *     {@link IATAAircraftTypeType }
     *     
     */
    public IATAAircraftTypeType getIATAAircraftType() {
        return iataAircraftType;
    }

    /**
     * Sets the value of the iataAircraftType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IATAAircraftTypeType }
     *     
     */
    public void setIATAAircraftType(IATAAircraftTypeType value) {
        this.iataAircraftType = value;
    }

    /**
     * Gets the value of the onGroundDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getOnGroundDuration() {
        return onGroundDuration;
    }

    /**
     * Sets the value of the onGroundDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setOnGroundDuration(Duration value) {
        this.onGroundDuration = value;
    }

}
