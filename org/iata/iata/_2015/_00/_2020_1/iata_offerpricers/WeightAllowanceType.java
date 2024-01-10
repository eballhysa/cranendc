
package org.iata.iata._2015._00._2020_1.iata_offerpricers;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Baggage weight allowance with application information.
 * 
 * <p>Java class for WeightAllowanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeightAllowanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicableBagText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}TextType" minOccurs="0"/>
 *         &lt;element name="ApplicablePartyText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}TextType" minOccurs="0"/>
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}TextType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="MaximumWeightMeasure" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}MeasureType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeightAllowanceType", propOrder = {
    "applicableBagText",
    "applicablePartyText",
    "descText",
    "maximumWeightMeasure"
})
public class WeightAllowanceType {

    @XmlElement(name = "ApplicableBagText")
    protected String applicableBagText;
    @XmlElement(name = "ApplicablePartyText")
    protected String applicablePartyText;
    @XmlElement(name = "DescText")
    protected List<String> descText;
    @XmlElement(name = "MaximumWeightMeasure", required = true)
    protected MeasureType maximumWeightMeasure;

    /**
     * Gets the value of the applicableBagText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableBagText() {
        return applicableBagText;
    }

    /**
     * Sets the value of the applicableBagText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableBagText(String value) {
        this.applicableBagText = value;
    }

    /**
     * Gets the value of the applicablePartyText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicablePartyText() {
        return applicablePartyText;
    }

    /**
     * Sets the value of the applicablePartyText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicablePartyText(String value) {
        this.applicablePartyText = value;
    }

    /**
     * Gets the value of the descText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescText() {
        if (descText == null) {
            descText = new ArrayList<String>();
        }
        return this.descText;
    }

    /**
     * Gets the value of the maximumWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMaximumWeightMeasure() {
        return maximumWeightMeasure;
    }

    /**
     * Sets the value of the maximumWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMaximumWeightMeasure(MeasureType value) {
        this.maximumWeightMeasure = value;
    }

}
