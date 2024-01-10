
package org.iata.iata._2015._00._2020_1.iata_servicelistrs;

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
 *         &lt;element name="DistanceMeasure" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}MeasureType" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}DurationType" minOccurs="0"/>
 *         &lt;element name="InterlineSettlementInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}InterlineSettlementInfoType" minOccurs="0"/>
 *         &lt;element name="PaxJourneyID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="PaxSegmentRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}ID_Type" maxOccurs="unbounded"/>
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
    "interlineSettlementInfo",
    "paxJourneyID",
    "paxSegmentRefID"
})
public class PaxJourneyType {

    @XmlElement(name = "DistanceMeasure")
    protected MeasureType distanceMeasure;
    @XmlElement(name = "Duration")
    protected Duration duration;
    @XmlElement(name = "InterlineSettlementInfo")
    protected InterlineSettlementInfoType interlineSettlementInfo;
    @XmlElement(name = "PaxJourneyID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxJourneyID;
    @XmlElement(name = "PaxSegmentRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> paxSegmentRefID;

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
     * Gets the value of the interlineSettlementInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InterlineSettlementInfoType }
     *     
     */
    public InterlineSettlementInfoType getInterlineSettlementInfo() {
        return interlineSettlementInfo;
    }

    /**
     * Sets the value of the interlineSettlementInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterlineSettlementInfoType }
     *     
     */
    public void setInterlineSettlementInfo(InterlineSettlementInfoType value) {
        this.interlineSettlementInfo = value;
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
     * Gets the value of the paxSegmentRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxSegmentRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxSegmentRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPaxSegmentRefID() {
        if (paxSegmentRefID == null) {
            paxSegmentRefID = new ArrayList<String>();
        }
        return this.paxSegmentRefID;
    }

}
