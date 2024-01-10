
package org.iata.iata._2015._00._2020_1.iata_offerpricers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Eligibility Flight Associations
 * 
 * <p>Java class for EligibilityFlightAssociationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EligibilityFlightAssociationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="DatedOperatingLegRef" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}DatedOperatingLegRefType"/>
 *         &lt;element name="PaxJourneyRef" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}PaxJourneyRefType"/>
 *         &lt;element name="PaxSegmentRef" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}PaxSegmentRefType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EligibilityFlightAssociationsType", propOrder = {
    "datedOperatingLegRef",
    "paxJourneyRef",
    "paxSegmentRef"
})
public class EligibilityFlightAssociationsType {

    @XmlElement(name = "DatedOperatingLegRef")
    protected DatedOperatingLegRefType datedOperatingLegRef;
    @XmlElement(name = "PaxJourneyRef")
    protected PaxJourneyRefType paxJourneyRef;
    @XmlElement(name = "PaxSegmentRef")
    protected PaxSegmentRefType paxSegmentRef;

    /**
     * Gets the value of the datedOperatingLegRef property.
     * 
     * @return
     *     possible object is
     *     {@link DatedOperatingLegRefType }
     *     
     */
    public DatedOperatingLegRefType getDatedOperatingLegRef() {
        return datedOperatingLegRef;
    }

    /**
     * Sets the value of the datedOperatingLegRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedOperatingLegRefType }
     *     
     */
    public void setDatedOperatingLegRef(DatedOperatingLegRefType value) {
        this.datedOperatingLegRef = value;
    }

    /**
     * Gets the value of the paxJourneyRef property.
     * 
     * @return
     *     possible object is
     *     {@link PaxJourneyRefType }
     *     
     */
    public PaxJourneyRefType getPaxJourneyRef() {
        return paxJourneyRef;
    }

    /**
     * Sets the value of the paxJourneyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxJourneyRefType }
     *     
     */
    public void setPaxJourneyRef(PaxJourneyRefType value) {
        this.paxJourneyRef = value;
    }

    /**
     * Gets the value of the paxSegmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link PaxSegmentRefType }
     *     
     */
    public PaxSegmentRefType getPaxSegmentRef() {
        return paxSegmentRef;
    }

    /**
     * Sets the value of the paxSegmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxSegmentRefType }
     *     
     */
    public void setPaxSegmentRef(PaxSegmentRefType value) {
        this.paxSegmentRef = value;
    }

}
