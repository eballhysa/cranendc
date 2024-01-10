
package org.iata.iata._2015._00._2020_1.iata_orderreshoprs;

import java.math.BigDecimal;
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
 * Additional information supplied by the Airline for the current Itinerary to advise the Seller that additional options could be available (if the Seller changes the request) to add Stop Overs within the itinerary. 
 * 
 * <p>Java class for StopOverRestrictionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopOverRestrictionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvailInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}IndType" minOccurs="0"/>
 *         &lt;element name="ChargeableInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}IndType" minOccurs="0"/>
 *         &lt;element name="MaximumStopOversPermittedQty" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}QtyType" minOccurs="0"/>
 *         &lt;element name="PaxRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="StopOverLocation" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}StopOverLocationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopOverRestrictionsType", propOrder = {
    "availInd",
    "chargeableInd",
    "maximumStopOversPermittedQty",
    "paxRefID",
    "stopOverLocation"
})
public class StopOverRestrictionsType {

    @XmlElement(name = "AvailInd")
    protected Boolean availInd;
    @XmlElement(name = "ChargeableInd")
    protected Boolean chargeableInd;
    @XmlElement(name = "MaximumStopOversPermittedQty")
    protected BigDecimal maximumStopOversPermittedQty;
    @XmlElement(name = "PaxRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxRefID;
    @XmlElement(name = "StopOverLocation")
    protected List<StopOverLocationType> stopOverLocation;

    /**
     * Gets the value of the availInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailInd() {
        return availInd;
    }

    /**
     * Sets the value of the availInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailInd(Boolean value) {
        this.availInd = value;
    }

    /**
     * Gets the value of the chargeableInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChargeableInd() {
        return chargeableInd;
    }

    /**
     * Sets the value of the chargeableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChargeableInd(Boolean value) {
        this.chargeableInd = value;
    }

    /**
     * Gets the value of the maximumStopOversPermittedQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumStopOversPermittedQty() {
        return maximumStopOversPermittedQty;
    }

    /**
     * Sets the value of the maximumStopOversPermittedQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumStopOversPermittedQty(BigDecimal value) {
        this.maximumStopOversPermittedQty = value;
    }

    /**
     * Gets the value of the paxRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxRefID() {
        return paxRefID;
    }

    /**
     * Sets the value of the paxRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxRefID(String value) {
        this.paxRefID = value;
    }

    /**
     * Gets the value of the stopOverLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopOverLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopOverLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopOverLocationType }
     * 
     * 
     */
    public List<StopOverLocationType> getStopOverLocation() {
        if (stopOverLocation == null) {
            stopOverLocation = new ArrayList<StopOverLocationType>();
        }
        return this.stopOverLocation;
    }

}
