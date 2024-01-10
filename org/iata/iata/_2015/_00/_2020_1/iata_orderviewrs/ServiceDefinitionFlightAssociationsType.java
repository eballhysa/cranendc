
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Service Definition Flight Associations
 * 
 * <p>Java class for ServiceDefinitionFlightAssociationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDefinitionFlightAssociationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="DatedOperatingLegRef" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}DatedOperatingLegRefType" maxOccurs="unbounded"/>
 *         &lt;element name="PaxJourneyRef" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}PaxJourneyRefType" maxOccurs="unbounded"/>
 *         &lt;element name="PaxSegmentRef" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}FlightAssociationsPaxSegmentRefType" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDefinitionFlightAssociationsType", propOrder = {
    "datedOperatingLegRef",
    "paxJourneyRef",
    "paxSegmentRef"
})
public class ServiceDefinitionFlightAssociationsType {

    @XmlElement(name = "DatedOperatingLegRef")
    protected List<DatedOperatingLegRefType> datedOperatingLegRef;
    @XmlElement(name = "PaxJourneyRef")
    protected List<PaxJourneyRefType> paxJourneyRef;
    @XmlElement(name = "PaxSegmentRef")
    protected List<FlightAssociationsPaxSegmentRefType> paxSegmentRef;

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
     * {@link FlightAssociationsPaxSegmentRefType }
     * 
     * 
     */
    public List<FlightAssociationsPaxSegmentRefType> getPaxSegmentRef() {
        if (paxSegmentRef == null) {
            paxSegmentRef = new ArrayList<FlightAssociationsPaxSegmentRefType>();
        }
        return this.paxSegmentRef;
    }

}
