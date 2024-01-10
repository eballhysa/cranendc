
package org.iata.iata._2015._00._2020_1.iata_airlineprofilerq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Criteria to filter airline profile response information.
 * 
 * <p>Java class for AirlineProfileFilterCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineProfileFilterCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirlineProfile" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRQ}AirlineProfileType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AllProfilesInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRQ}IndType" minOccurs="0"/>
 *         &lt;element name="MediaURL_Ind" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRQ}IndType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineProfileFilterCriteriaType", propOrder = {
    "airlineProfile",
    "allProfilesInd",
    "mediaURLInd"
})
public class AirlineProfileFilterCriteriaType {

    @XmlElement(name = "AirlineProfile")
    protected List<AirlineProfileType> airlineProfile;
    @XmlElement(name = "AllProfilesInd")
    protected Boolean allProfilesInd;
    @XmlElement(name = "MediaURL_Ind")
    protected Boolean mediaURLInd;

    /**
     * Gets the value of the airlineProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airlineProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirlineProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlineProfileType }
     * 
     * 
     */
    public List<AirlineProfileType> getAirlineProfile() {
        if (airlineProfile == null) {
            airlineProfile = new ArrayList<AirlineProfileType>();
        }
        return this.airlineProfile;
    }

    /**
     * Gets the value of the allProfilesInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllProfilesInd() {
        return allProfilesInd;
    }

    /**
     * Sets the value of the allProfilesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllProfilesInd(Boolean value) {
        this.allProfilesInd = value;
    }

    /**
     * Gets the value of the mediaURLInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMediaURLInd() {
        return mediaURLInd;
    }

    /**
     * Sets the value of the mediaURLInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMediaURLInd(Boolean value) {
        this.mediaURLInd = value;
    }

}
