
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Returns a list of cabins and the seats within in. This information can be used by the Seller to render a graphical Seat Map.
 * 
 * <p>Java class for SeatMapType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatMapType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CabinCompartment" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}CabinCompartmentType" maxOccurs="unbounded"/>
 *         &lt;element name="DatedOperatingLegRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="PaxSegmentRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}ID_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatMapType", propOrder = {
    "cabinCompartment",
    "datedOperatingLegRefID",
    "paxSegmentRefID"
})
public class SeatMapType {

    @XmlElement(name = "CabinCompartment", required = true)
    protected List<CabinCompartmentType> cabinCompartment;
    @XmlElement(name = "DatedOperatingLegRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String datedOperatingLegRefID;
    @XmlElement(name = "PaxSegmentRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxSegmentRefID;

    /**
     * Gets the value of the cabinCompartment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinCompartment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinCompartment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinCompartmentType }
     * 
     * 
     */
    public List<CabinCompartmentType> getCabinCompartment() {
        if (cabinCompartment == null) {
            cabinCompartment = new ArrayList<CabinCompartmentType>();
        }
        return this.cabinCompartment;
    }

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
     * Gets the value of the paxSegmentRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxSegmentRefID() {
        return paxSegmentRefID;
    }

    /**
     * Sets the value of the paxSegmentRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxSegmentRefID(String value) {
        this.paxSegmentRefID = value;
    }

}
