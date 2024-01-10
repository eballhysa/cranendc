
package org.iata.iata._2015._00._2020_1.iata_servicelistrs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Flight Associations Eligiibility of this offer item to the following segments or journeys.
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
 *         &lt;element name="DatedOperatingLegRef" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}DatedOperatingLegRefType" maxOccurs="unbounded"/>
 *         &lt;element name="PaxJourneyRef" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}PaxJourneyRefType" maxOccurs="unbounded"/>
 *         &lt;element name="PaxSegmentRef" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRS}PaxSegmentRefType" maxOccurs="unbounded"/>
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
    protected List<DatedOperatingLegRefType> datedOperatingLegRef;
    @XmlElement(name = "PaxJourneyRef")
    protected List<PaxJourneyRefType> paxJourneyRef;
    @XmlElement(name = "PaxSegmentRef")
    protected List<PaxSegmentRefType> paxSegmentRef;

    /**
     * Gets the value of the datedOperatingLegRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datedOperatingLegRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatedOperatingLegRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatedOperatingLegRefType }
     * 
     * 
     */
    public List<DatedOperatingLegRefType> getDatedOperatingLegRef() {
        if (datedOperatingLegRef == null) {
            datedOperatingLegRef = new ArrayList<DatedOperatingLegRefType>();
        }
        return this.datedOperatingLegRef;
    }

    /**
     * Gets the value of the paxJourneyRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxJourneyRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxJourneyRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxJourneyRefType }
     * 
     * 
     */
    public List<PaxJourneyRefType> getPaxJourneyRef() {
        if (paxJourneyRef == null) {
            paxJourneyRef = new ArrayList<PaxJourneyRefType>();
        }
        return this.paxJourneyRef;
    }

    /**
     * Gets the value of the paxSegmentRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxSegmentRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxSegmentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxSegmentRefType }
     * 
     * 
     */
    public List<PaxSegmentRefType> getPaxSegmentRef() {
        if (paxSegmentRef == null) {
            paxSegmentRef = new ArrayList<PaxSegmentRefType>();
        }
        return this.paxSegmentRef;
    }

}
