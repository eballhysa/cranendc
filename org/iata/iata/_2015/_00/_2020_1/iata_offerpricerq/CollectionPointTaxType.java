
package org.iata.iata._2015._00._2020_1.iata_offerpricerq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Tax data breakdown by collection point for XF(Passenger Facility Fee) and ZP(federal tax segment) taxes.
 * 
 * <p>Java class for CollectionPointTaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollectionPointTaxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirportAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}AmountType"/>
 *         &lt;element name="AirportCur" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="Station" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}StationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectionPointTaxType", propOrder = {
    "airportAmount",
    "airportCur",
    "station"
})
public class CollectionPointTaxType {

    @XmlElement(name = "AirportAmount", required = true)
    protected AmountType airportAmount;
    @XmlElement(name = "AirportCur")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String airportCur;
    @XmlElement(name = "Station", required = true)
    protected StationType station;

    /**
     * Gets the value of the airportAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAirportAmount() {
        return airportAmount;
    }

    /**
     * Sets the value of the airportAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAirportAmount(AmountType value) {
        this.airportAmount = value;
    }

    /**
     * Gets the value of the airportCur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportCur() {
        return airportCur;
    }

    /**
     * Sets the value of the airportCur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportCur(String value) {
        this.airportCur = value;
    }

    /**
     * Gets the value of the station property.
     * 
     * @return
     *     possible object is
     *     {@link StationType }
     *     
     */
    public StationType getStation() {
        return station;
    }

    /**
     * Sets the value of the station property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationType }
     *     
     */
    public void setStation(StationType value) {
        this.station = value;
    }

}
