
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Function to Add, Remove or Update the Passenger Details. Providing the New and Previous values together implies an Update.
 * 
 * <p>Java class for UpdatePaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdatePaxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Current" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}PaxRefType" minOccurs="0"/>
 *         &lt;element name="New" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}PaxRefType" minOccurs="0"/>
 *         &lt;element name="PaxSharingPref" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}PaxSharingPrefType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatePaxType", propOrder = {
    "current",
    "_new",
    "paxSharingPref"
})
public class UpdatePaxType {

    @XmlElement(name = "Current")
    protected PaxRefType current;
    @XmlElement(name = "New")
    protected PaxRefType _new;
    @XmlElement(name = "PaxSharingPref")
    protected PaxSharingPrefType paxSharingPref;

    /**
     * Gets the value of the current property.
     * 
     * @return
     *     possible object is
     *     {@link PaxRefType }
     *     
     */
    public PaxRefType getCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxRefType }
     *     
     */
    public void setCurrent(PaxRefType value) {
        this.current = value;
    }

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link PaxRefType }
     *     
     */
    public PaxRefType getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxRefType }
     *     
     */
    public void setNew(PaxRefType value) {
        this._new = value;
    }

    /**
     * Gets the value of the paxSharingPref property.
     * 
     * @return
     *     possible object is
     *     {@link PaxSharingPrefType }
     *     
     */
    public PaxSharingPrefType getPaxSharingPref() {
        return paxSharingPref;
    }

    /**
     * Sets the value of the paxSharingPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxSharingPrefType }
     *     
     */
    public void setPaxSharingPref(PaxSharingPrefType value) {
        this.paxSharingPref = value;
    }

}
