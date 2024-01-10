
package org.iata.iata._2015._00._2020_1.iata_airshoppingrq;

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
 * The Origin and Destination airport/city pair which confines a passenger journey or an aircraft flight. 
 * 
 * <p>Java class for OriginDestCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginDestCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CalendarDateCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}CalendarDateCriteriaType" minOccurs="0"/>
 *         &lt;element name="ConnectionPrefRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="DestArrivalCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}DestArrivalCriteriaType"/>
 *         &lt;element name="JourneyDurationCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}JourneyDurationCriteriaType" minOccurs="0"/>
 *         &lt;element name="OriginDepCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}OriginDepCriteriaType"/>
 *         &lt;element name="OriginDestID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="PreferredCabinType" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}CabinTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDestCriteriaType", propOrder = {
    "calendarDateCriteria",
    "connectionPrefRefID",
    "destArrivalCriteria",
    "journeyDurationCriteria",
    "originDepCriteria",
    "originDestID",
    "preferredCabinType"
})
public class OriginDestCriteriaType {

    @XmlElement(name = "CalendarDateCriteria")
    protected CalendarDateCriteriaType calendarDateCriteria;
    @XmlElement(name = "ConnectionPrefRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String connectionPrefRefID;
    @XmlElement(name = "DestArrivalCriteria", required = true)
    protected DestArrivalCriteriaType destArrivalCriteria;
    @XmlElement(name = "JourneyDurationCriteria")
    protected JourneyDurationCriteriaType journeyDurationCriteria;
    @XmlElement(name = "OriginDepCriteria", required = true)
    protected OriginDepCriteriaType originDepCriteria;
    @XmlElement(name = "OriginDestID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String originDestID;
    @XmlElement(name = "PreferredCabinType")
    protected List<CabinTypeType> preferredCabinType;

    /**
     * Gets the value of the calendarDateCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDateCriteriaType }
     *     
     */
    public CalendarDateCriteriaType getCalendarDateCriteria() {
        return calendarDateCriteria;
    }

    /**
     * Sets the value of the calendarDateCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDateCriteriaType }
     *     
     */
    public void setCalendarDateCriteria(CalendarDateCriteriaType value) {
        this.calendarDateCriteria = value;
    }

    /**
     * Gets the value of the connectionPrefRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionPrefRefID() {
        return connectionPrefRefID;
    }

    /**
     * Sets the value of the connectionPrefRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionPrefRefID(String value) {
        this.connectionPrefRefID = value;
    }

    /**
     * Gets the value of the destArrivalCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link DestArrivalCriteriaType }
     *     
     */
    public DestArrivalCriteriaType getDestArrivalCriteria() {
        return destArrivalCriteria;
    }

    /**
     * Sets the value of the destArrivalCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestArrivalCriteriaType }
     *     
     */
    public void setDestArrivalCriteria(DestArrivalCriteriaType value) {
        this.destArrivalCriteria = value;
    }

    /**
     * Gets the value of the journeyDurationCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyDurationCriteriaType }
     *     
     */
    public JourneyDurationCriteriaType getJourneyDurationCriteria() {
        return journeyDurationCriteria;
    }

    /**
     * Sets the value of the journeyDurationCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyDurationCriteriaType }
     *     
     */
    public void setJourneyDurationCriteria(JourneyDurationCriteriaType value) {
        this.journeyDurationCriteria = value;
    }

    /**
     * Gets the value of the originDepCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDepCriteriaType }
     *     
     */
    public OriginDepCriteriaType getOriginDepCriteria() {
        return originDepCriteria;
    }

    /**
     * Sets the value of the originDepCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDepCriteriaType }
     *     
     */
    public void setOriginDepCriteria(OriginDepCriteriaType value) {
        this.originDepCriteria = value;
    }

    /**
     * Gets the value of the originDestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginDestID() {
        return originDestID;
    }

    /**
     * Sets the value of the originDestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginDestID(String value) {
        this.originDestID = value;
    }

    /**
     * Gets the value of the preferredCabinType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferredCabinType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferredCabinType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinTypeType }
     * 
     * 
     */
    public List<CabinTypeType> getPreferredCabinType() {
        if (preferredCabinType == null) {
            preferredCabinType = new ArrayList<CabinTypeType>();
        }
        return this.preferredCabinType;
    }

}
