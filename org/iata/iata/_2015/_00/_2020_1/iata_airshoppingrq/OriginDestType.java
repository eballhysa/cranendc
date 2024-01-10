
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
 * <p>Java class for OriginDestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginDestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DestStationCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}IATA_LocationCodeType"/>
 *         &lt;element name="OriginDestID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="OriginStationCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}IATA_LocationCodeType"/>
 *         &lt;element name="PaxJourney" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}PaxJourneyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDestType", propOrder = {
    "destStationCode",
    "originDestID",
    "originStationCode",
    "paxJourney"
})
public class OriginDestType {

    @XmlElement(name = "DestStationCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String destStationCode;
    @XmlElement(name = "OriginDestID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String originDestID;
    @XmlElement(name = "OriginStationCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String originStationCode;
    @XmlElement(name = "PaxJourney")
    protected List<PaxJourneyType> paxJourney;

    /**
     * Gets the value of the destStationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestStationCode() {
        return destStationCode;
    }

    /**
     * Sets the value of the destStationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestStationCode(String value) {
        this.destStationCode = value;
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
     * Gets the value of the originStationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginStationCode() {
        return originStationCode;
    }

    /**
     * Sets the value of the originStationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginStationCode(String value) {
        this.originStationCode = value;
    }

    /**
     * Gets the value of the paxJourney property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxJourney property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxJourney().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxJourneyType }
     * 
     * 
     */
    public List<PaxJourneyType> getPaxJourney() {
        if (paxJourney == null) {
            paxJourney = new ArrayList<PaxJourneyType>();
        }
        return this.paxJourney;
    }

}
