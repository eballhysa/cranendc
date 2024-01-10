
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Total journey distance criteria.
 * 
 * <p>Java class for JourneyDistanceCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyDistanceCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DistanceMeasure" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}MeasureType" minOccurs="0"/>
 *         &lt;element name="PrefCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}PrefLevelCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyDistanceCriteriaType", propOrder = {
    "distanceMeasure",
    "prefCode"
})
public class JourneyDistanceCriteriaType {

    @XmlElement(name = "DistanceMeasure")
    protected MeasureType distanceMeasure;
    @XmlElement(name = "PrefCode")
    @XmlSchemaType(name = "string")
    protected PrefLevelCodeContentType prefCode;

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
