
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Latest flight information as it relates to a coupon (e.g. Current, CheckedIn, Flown).
 * 
 * <p>Java class for CurrentCouponFlightInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrentCouponFlightInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CheckedInAirlineInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}PaxSegmentRefType"/>
 *         &lt;element name="CurrentAirlineInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}PaxSegmentRefType"/>
 *         &lt;element name="FlownAirlineInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}PaxSegmentRefType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentCouponFlightInfoType", propOrder = {
    "checkedInAirlineInfo",
    "currentAirlineInfo",
    "flownAirlineInfo"
})
public class CurrentCouponFlightInfoType {

    @XmlElement(name = "CheckedInAirlineInfo", required = true)
    protected PaxSegmentRefType checkedInAirlineInfo;
    @XmlElement(name = "CurrentAirlineInfo", required = true)
    protected PaxSegmentRefType currentAirlineInfo;
    @XmlElement(name = "FlownAirlineInfo", required = true)
    protected PaxSegmentRefType flownAirlineInfo;

    /**
     * Gets the value of the checkedInAirlineInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PaxSegmentRefType }
     *     
     */
    public PaxSegmentRefType getCheckedInAirlineInfo() {
        return checkedInAirlineInfo;
    }

    /**
     * Sets the value of the checkedInAirlineInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxSegmentRefType }
     *     
     */
    public void setCheckedInAirlineInfo(PaxSegmentRefType value) {
        this.checkedInAirlineInfo = value;
    }

    /**
     * Gets the value of the currentAirlineInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PaxSegmentRefType }
     *     
     */
    public PaxSegmentRefType getCurrentAirlineInfo() {
        return currentAirlineInfo;
    }

    /**
     * Sets the value of the currentAirlineInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxSegmentRefType }
     *     
     */
    public void setCurrentAirlineInfo(PaxSegmentRefType value) {
        this.currentAirlineInfo = value;
    }

    /**
     * Gets the value of the flownAirlineInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PaxSegmentRefType }
     *     
     */
    public PaxSegmentRefType getFlownAirlineInfo() {
        return flownAirlineInfo;
    }

    /**
     * Sets the value of the flownAirlineInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxSegmentRefType }
     *     
     */
    public void setFlownAirlineInfo(PaxSegmentRefType value) {
        this.flownAirlineInfo = value;
    }

}
