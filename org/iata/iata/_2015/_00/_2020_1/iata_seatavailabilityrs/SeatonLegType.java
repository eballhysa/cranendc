
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrs;

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
 * A sitting place for a passenger or crew in a cabin compartment on a Dated Operating Leg.
 *  
 * 
 * <p>Java class for SeatonLegType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatonLegType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ALaCarteOfferItem" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}ALaCarteOfferItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DatedOperatingLeg" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}DatedOperatingLegType"/>
 *         &lt;element name="OccupationStatusCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}SeatStatusCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatonLegType", propOrder = {
    "aLaCarteOfferItem",
    "datedOperatingLeg",
    "occupationStatusCode"
})
public class SeatonLegType {

    @XmlElement(name = "ALaCarteOfferItem")
    protected List<ALaCarteOfferItemType> aLaCarteOfferItem;
    @XmlElement(name = "DatedOperatingLeg", required = true)
    protected DatedOperatingLegType datedOperatingLeg;
    @XmlElement(name = "OccupationStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String occupationStatusCode;

    /**
     * Gets the value of the aLaCarteOfferItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aLaCarteOfferItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getALaCarteOfferItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ALaCarteOfferItemType }
     * 
     * 
     */
    public List<ALaCarteOfferItemType> getALaCarteOfferItem() {
        if (aLaCarteOfferItem == null) {
            aLaCarteOfferItem = new ArrayList<ALaCarteOfferItemType>();
        }
        return this.aLaCarteOfferItem;
    }

    /**
     * Gets the value of the datedOperatingLeg property.
     * 
     * @return
     *     possible object is
     *     {@link DatedOperatingLegType }
     *     
     */
    public DatedOperatingLegType getDatedOperatingLeg() {
        return datedOperatingLeg;
    }

    /**
     * Sets the value of the datedOperatingLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedOperatingLegType }
     *     
     */
    public void setDatedOperatingLeg(DatedOperatingLegType value) {
        this.datedOperatingLeg = value;
    }

    /**
     * Gets the value of the occupationStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupationStatusCode() {
        return occupationStatusCode;
    }

    /**
     * Sets the value of the occupationStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupationStatusCode(String value) {
        this.occupationStatusCode = value;
    }

}
