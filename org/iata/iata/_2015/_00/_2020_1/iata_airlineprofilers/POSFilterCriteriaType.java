
package org.iata.iata._2015._00._2020_1.iata_airlineprofilers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Criteria used to filter results based on point of sale information.
 * 
 * <p>Java class for POS_FilterCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POS_FilterCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Aggregator" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}AggregatorType" minOccurs="0"/>
 *         &lt;element name="POS_CodeText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}TextType" minOccurs="0"/>
 *         &lt;element name="POS_TypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}PointOfSaleTypeCodeType" minOccurs="0"/>
 *         &lt;element name="TravelAgencyInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}IndType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POS_FilterCriteriaType", propOrder = {
    "aggregator",
    "posCodeText",
    "posTypeCode",
    "travelAgencyInd"
})
public class POSFilterCriteriaType {

    @XmlElement(name = "Aggregator")
    protected AggregatorType aggregator;
    @XmlElement(name = "POS_CodeText")
    protected String posCodeText;
    @XmlElement(name = "POS_TypeCode")
    @XmlSchemaType(name = "token")
    protected PointofSaleTypeCodeContentType posTypeCode;
    @XmlElement(name = "TravelAgencyInd")
    protected Boolean travelAgencyInd;

    /**
     * Gets the value of the aggregator property.
     * 
     * @return
     *     possible object is
     *     {@link AggregatorType }
     *     
     */
    public AggregatorType getAggregator() {
        return aggregator;
    }

    /**
     * Sets the value of the aggregator property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregatorType }
     *     
     */
    public void setAggregator(AggregatorType value) {
        this.aggregator = value;
    }

    /**
     * Gets the value of the posCodeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSCodeText() {
        return posCodeText;
    }

    /**
     * Sets the value of the posCodeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSCodeText(String value) {
        this.posCodeText = value;
    }

    /**
     * Gets the value of the posTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PointofSaleTypeCodeContentType }
     *     
     */
    public PointofSaleTypeCodeContentType getPOSTypeCode() {
        return posTypeCode;
    }

    /**
     * Sets the value of the posTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointofSaleTypeCodeContentType }
     *     
     */
    public void setPOSTypeCode(PointofSaleTypeCodeContentType value) {
        this.posTypeCode = value;
    }

    /**
     * Gets the value of the travelAgencyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTravelAgencyInd() {
        return travelAgencyInd;
    }

    /**
     * Sets the value of the travelAgencyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTravelAgencyInd(Boolean value) {
        this.travelAgencyInd = value;
    }

}
