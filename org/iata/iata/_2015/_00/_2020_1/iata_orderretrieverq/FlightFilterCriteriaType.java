
package org.iata.iata._2015._00._2020_1.iata_orderretrieverq;

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
 * Filters based on Flight Number, Origin Destination, Segment, or Departure/Arrival.
 * 
 * <p>Java class for FlightFilterCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightFilterCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CabinTypeFilterCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}CabinTypeType" minOccurs="0"/>
 *         &lt;element name="FareBasisCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="OriginDestFilterCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}OriginDestFilterCriteriaType" minOccurs="0"/>
 *         &lt;element name="SegmentFilterCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}SegmentFilterCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightFilterCriteriaType", propOrder = {
    "cabinTypeFilterCriteria",
    "fareBasisCode",
    "originDestFilterCriteria",
    "segmentFilterCriteria"
})
public class FlightFilterCriteriaType {

    @XmlElement(name = "CabinTypeFilterCriteria")
    protected CabinTypeType cabinTypeFilterCriteria;
    @XmlElement(name = "FareBasisCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fareBasisCode;
    @XmlElement(name = "OriginDestFilterCriteria")
    protected OriginDestFilterCriteriaType originDestFilterCriteria;
    @XmlElement(name = "SegmentFilterCriteria")
    protected List<SegmentFilterCriteriaType> segmentFilterCriteria;

    /**
     * Gets the value of the cabinTypeFilterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link CabinTypeType }
     *     
     */
    public CabinTypeType getCabinTypeFilterCriteria() {
        return cabinTypeFilterCriteria;
    }

    /**
     * Sets the value of the cabinTypeFilterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinTypeType }
     *     
     */
    public void setCabinTypeFilterCriteria(CabinTypeType value) {
        this.cabinTypeFilterCriteria = value;
    }

    /**
     * Gets the value of the fareBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * Sets the value of the fareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasisCode(String value) {
        this.fareBasisCode = value;
    }

    /**
     * Gets the value of the originDestFilterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestFilterCriteriaType }
     *     
     */
    public OriginDestFilterCriteriaType getOriginDestFilterCriteria() {
        return originDestFilterCriteria;
    }

    /**
     * Sets the value of the originDestFilterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestFilterCriteriaType }
     *     
     */
    public void setOriginDestFilterCriteria(OriginDestFilterCriteriaType value) {
        this.originDestFilterCriteria = value;
    }

    /**
     * Gets the value of the segmentFilterCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentFilterCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentFilterCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentFilterCriteriaType }
     * 
     * 
     */
    public List<SegmentFilterCriteriaType> getSegmentFilterCriteria() {
        if (segmentFilterCriteria == null) {
            segmentFilterCriteria = new ArrayList<SegmentFilterCriteriaType>();
        }
        return this.segmentFilterCriteria;
    }

}
