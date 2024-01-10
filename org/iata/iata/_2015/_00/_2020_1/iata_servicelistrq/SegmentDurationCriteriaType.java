
package org.iata.iata._2015._00._2020_1.iata_servicelistrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Total segment travel time preferences.
 * 
 * <p>Java class for SegmentDurationCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentDurationCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaximumTimeMeasure" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}MeasureType" minOccurs="0"/>
 *         &lt;element name="PrefCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}PrefLevelCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentDurationCriteriaType", propOrder = {
    "maximumTimeMeasure",
    "prefCode"
})
public class SegmentDurationCriteriaType {

    @XmlElement(name = "MaximumTimeMeasure")
    protected MeasureType maximumTimeMeasure;
    @XmlElement(name = "PrefCode")
    @XmlSchemaType(name = "string")
    protected PrefLevelCodeContentType prefCode;

    /**
     * Gets the value of the maximumTimeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMaximumTimeMeasure() {
        return maximumTimeMeasure;
    }

    /**
     * Sets the value of the maximumTimeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMaximumTimeMeasure(MeasureType value) {
        this.maximumTimeMeasure = value;
    }

    /**
     * Gets the value of the prefCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrefLevelCodeContentType }
     *     
     */
    public PrefLevelCodeContentType getPrefCode() {
        return prefCode;
    }

    /**
     * Sets the value of the prefCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefLevelCodeContentType }
     *     
     */
    public void setPrefCode(PrefLevelCodeContentType value) {
        this.prefCode = value;
    }

}
