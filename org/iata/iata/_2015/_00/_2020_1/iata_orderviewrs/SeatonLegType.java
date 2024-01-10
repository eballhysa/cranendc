
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A sitting place for a passenger or crew in a cabin compartment on a Dated Operating Leg.
 *  
 * 
 * <p>Java class for SeatonLegType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatonLegType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatedOperatingLegRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}ID_Type"/>
 *         &lt;element name="OccupationStatusCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}SeatStatusCodeType" minOccurs="0"/>
 *         &lt;element name="Seat" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}SeatType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatonLegType", propOrder = {
    "datedOperatingLegRefID",
    "occupationStatusCode",
    "seat"
})
public class SeatonLegType {

    @XmlElement(name = "DatedOperatingLegRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String datedOperatingLegRefID;
    @XmlElement(name = "OccupationStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String occupationStatusCode;
    @XmlElement(name = "Seat", required = true)
    protected SeatType seat;

    /**
     * Gets the value of the datedOperatingLegRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatedOperatingLegRefID() {
        return datedOperatingLegRefID;
    }

    /**
     * Sets the value of the datedOperatingLegRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatedOperatingLegRefID(String value) {
        this.datedOperatingLegRefID = value;
    }

    /**
     * Gets the value of the occupationStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupationStatusCode() {
        return occupationStatusCode;
    }

    /**
     * Sets the value of the occupationStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupationStatusCode(String value) {
        this.occupationStatusCode = value;
    }

    /**
     * Gets the value of the seat property.
     * 
     * @return
     *     possible object is
     *     {@link SeatType }
     *     
     */
    public SeatType getSeat() {
        return seat;
    }

    /**
     * Sets the value of the seat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatType }
     *     
     */
    public void setSeat(SeatType value) {
        this.seat = value;
    }

}
