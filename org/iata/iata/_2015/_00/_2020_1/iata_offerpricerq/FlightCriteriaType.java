
package org.iata.iata._2015._00._2020_1.iata_offerpricerq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Flight filter criteria including aircraft features, Cabin Type, RBD, and Tail Number.
 * 
 * <p>Java class for FlightCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Aircraft" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}AircraftType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CabinType" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}CabinTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FlightCharacteristicsCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}FlightCharacteristicsCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IATA_AircraftType" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}IATA_AircraftTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RBD" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}RBD_Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightCriteriaType", propOrder = {
    "aircraft",
    "cabinType",
    "flightCharacteristicsCriteria",
    "iataAircraftType",
    "rbd"
})
public class FlightCriteriaType {

    @XmlElement(name = "Aircraft")
    protected List<AircraftType> aircraft;
    @XmlElement(name = "CabinType")
    protected List<CabinTypeType> cabinType;
    @XmlElement(name = "FlightCharacteristicsCriteria")
    protected List<FlightCharacteristicsCriteriaType> flightCharacteristicsCriteria;
    @XmlElement(name = "IATA_AircraftType")
    protected List<IATAAircraftTypeType> iataAircraftType;
    @XmlElement(name = "RBD")
    protected List<RBDType> rbd;

    /**
     * Gets the value of the aircraft property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aircraft property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAircraft().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AircraftType }
     * 
     * 
     */
    public List<AircraftType> getAircraft() {
        if (aircraft == null) {
            aircraft = new ArrayList<AircraftType>();
        }
        return this.aircraft;
    }

    /**
     * Gets the value of the cabinType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinTypeType }
     * 
     * 
     */
    public List<CabinTypeType> getCabinType() {
        if (cabinType == null) {
            cabinType = new ArrayList<CabinTypeType>();
        }
        return this.cabinType;
    }

    /**
     * Gets the value of the flightCharacteristicsCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightCharacteristicsCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightCharacteristicsCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightCharacteristicsCriteriaType }
     * 
     * 
     */
    public List<FlightCharacteristicsCriteriaType> getFlightCharacteristicsCriteria() {
        if (flightCharacteristicsCriteria == null) {
            flightCharacteristicsCriteria = new ArrayList<FlightCharacteristicsCriteriaType>();
        }
        return this.flightCharacteristicsCriteria;
    }

    /**
     * Gets the value of the iataAircraftType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iataAircraftType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIATAAircraftType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IATAAircraftTypeType }
     * 
     * 
     */
    public List<IATAAircraftTypeType> getIATAAircraftType() {
        if (iataAircraftType == null) {
            iataAircraftType = new ArrayList<IATAAircraftTypeType>();
        }
        return this.iataAircraftType;
    }

    /**
     * Gets the value of the rbd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rbd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRBD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RBDType }
     * 
     * 
     */
    public List<RBDType> getRBD() {
        if (rbd == null) {
            rbd = new ArrayList<RBDType>();
        }
        return this.rbd;
    }

}
