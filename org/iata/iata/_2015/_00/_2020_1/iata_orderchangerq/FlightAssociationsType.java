
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

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
 * <p>Java class for FlightAssociationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightAssociationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatedOperatingLegRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ID_Type" maxOccurs="unbounded"/>
 *         &lt;element name="PaxJourneyRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ID_Type" maxOccurs="unbounded"/>
 *         &lt;element name="PaxSegmentRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ID_Type" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightAssociationsType", propOrder = {
    "datedOperatingLegRefID",
    "paxJourneyRefID",
    "paxSegmentRefID"
})
public class FlightAssociationsType {

    @XmlElement(name = "DatedOperatingLegRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> datedOperatingLegRefID;
    @XmlElement(name = "PaxJourneyRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> paxJourneyRefID;
    @XmlElement(name = "PaxSegmentRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> paxSegmentRefID;

    /**
     * Gets the value of the datedOperatingLegRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datedOperatingLegRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatedOperatingLegRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDatedOperatingLegRefID() {
        if (datedOperatingLegRefID == null) {
            datedOperatingLegRefID = new ArrayList<String>();
        }
        return this.datedOperatingLegRefID;
    }

    /**
     * Gets the value of the paxJourneyRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxJourneyRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxJourneyRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPaxJourneyRefID() {
        if (paxJourneyRefID == null) {
            paxJourneyRefID = new ArrayList<String>();
        }
        return this.paxJourneyRefID;
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
