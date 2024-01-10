
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Reservation change information which describes new flight information as it relates to a changed reservation.
 * 
 * <p>Java class for ResChangeInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResChangeInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaxSegment" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}PaxSegmentRefType" minOccurs="0"/>
 *         &lt;element name="ResStatusCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResChangeInfoType", propOrder = {
    "paxSegment",
    "resStatusCode"
})
public class ResChangeInfoType {

    @XmlElement(name = "PaxSegment")
    protected PaxSegmentRefType paxSegment;
    @XmlElement(name = "ResStatusCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String resStatusCode;

    /**
     * Gets the value of the paxSegment property.
     * 
     * @return
     *     possible object is
     *     {@link PaxSegmentRefType }
     *     
     */
    public PaxSegmentRefType getPaxSegment() {
        return paxSegment;
    }

    /**
     * Sets the value of the paxSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxSegmentRefType }
     *     
     */
    public void setPaxSegment(PaxSegmentRefType value) {
        this.paxSegment = value;
    }

    /**
     * Gets the value of the resStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResStatusCode() {
        return resStatusCode;
    }

    /**
     * Sets the value of the resStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResStatusCode(String value) {
        this.resStatusCode = value;
    }

}
