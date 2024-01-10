
package org.iata.iata._2015._00._2020_1.iata_airshoppingrq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * A collection of segments which satisfies transportation of a passenger for a given origin and destination. 
 *  
 * 
 * <p>Java class for PaxJourneyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxJourneyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DistanceMeasure" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}MeasureType" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}DurationType" minOccurs="0"/>
 *         &lt;element name="PaxJourneyID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="PaxSegment" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}PaxSegmentType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxJourneyType", propOrder = {
    "distanceMeasure",
    "duration",
    "paxJourneyID",
    "paxSegment"
})
public class PaxJourneyType {

    @XmlElement(name = "DistanceMeasure")
    protected MeasureType distanceMeasure;
    @XmlElement(name = "Duration")
    protected Duration duration;
    @XmlElement(name = "PaxJourneyID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxJourneyID;
    @XmlElement(name = "PaxSegment", required = true)
    protected List<PaxSegmentType> paxSegment;

    /**
     * Gets the value of the distanceMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getDistanceMeasure() {
        return distanceMeasure;
    }

    /**
     * Sets the value of the distanceMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setDistanceMeasure(MeasureType value) {
        this.distanceMeasure = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the paxJourneyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxJourneyID() {
        return paxJourneyID;
    }

    /**
     * Sets the value of the paxJourneyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxJourneyID(String value) {
        this.paxJourneyID = value;
    }

    /**
     * Gets the value of the paxSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxSegmentType }
     * 
     * 
     */
    public List<PaxSegmentType> getPaxSegment() {
        if (paxSegment == null) {
            paxSegment = new ArrayList<PaxSegmentType>();
        }
        return this.paxSegment;
    }

}
