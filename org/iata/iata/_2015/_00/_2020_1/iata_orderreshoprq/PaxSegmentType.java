
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Transportation of a passenger on a Dated Operating Segment. 
 * 
 * <p>Java class for PaxSegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxSegmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Arrival" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}TransportArrivalType"/>
 *         &lt;element name="CabinType" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}CabinTypeType" minOccurs="0"/>
 *         &lt;element name="Dep" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}TransportDepType"/>
 *         &lt;element name="MarketingCarrierInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}DatedMarketingSegmentType"/>
 *         &lt;element name="MarketingCarrierRBD_Code" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}RBD_CodeType" minOccurs="0"/>
 *         &lt;element name="OperatingCarrierInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}DatedOperatingSegmentType"/>
 *         &lt;element name="OperatingCarrierRBD_Code" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}RBD_CodeType" minOccurs="0"/>
 *         &lt;element name="PaxSegmentID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}ID_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxSegmentType", propOrder = {
    "arrival",
    "cabinType",
    "dep",
    "marketingCarrierInfo",
    "marketingCarrierRBDCode",
    "operatingCarrierInfo",
    "operatingCarrierRBDCode",
    "paxSegmentID"
})
public class PaxSegmentType {

    @XmlElement(name = "Arrival", required = true)
    protected TransportArrivalType arrival;
    @XmlElement(name = "CabinType")
    protected CabinTypeType cabinType;
    @XmlElement(name = "Dep", required = true)
    protected TransportDepType dep;
    @XmlElement(name = "MarketingCarrierInfo", required = true)
    protected DatedMarketingSegmentType marketingCarrierInfo;
    @XmlElement(name = "MarketingCarrierRBD_Code")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String marketingCarrierRBDCode;
    @XmlElement(name = "OperatingCarrierInfo", required = true)
    protected DatedOperatingSegmentType operatingCarrierInfo;
    @XmlElement(name = "OperatingCarrierRBD_Code")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String operatingCarrierRBDCode;
    @XmlElement(name = "PaxSegmentID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxSegmentID;

    /**
     * Gets the value of the arrival property.
     * 
     * @return
     *     possible object is
     *     {@link TransportArrivalType }
     *     
     */
    public TransportArrivalType getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportArrivalType }
     *     
     */
    public void setArrival(TransportArrivalType value) {
        this.arrival = value;
    }

    /**
     * Gets the value of the cabinType property.
     * 
     * @return
     *     possible object is
     *     {@link CabinTypeType }
     *     
     */
    public CabinTypeType getCabinType() {
        return cabinType;
    }

    /**
     * Sets the value of the cabinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinTypeType }
     *     
     */
    public void setCabinType(CabinTypeType value) {
        this.cabinType = value;
    }

    /**
     * Gets the value of the dep property.
     * 
     * @return
     *     possible object is
     *     {@link TransportDepType }
     *     
     */
    public TransportDepType getDep() {
        return dep;
    }

    /**
     * Sets the value of the dep property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportDepType }
     *     
     */
    public void setDep(TransportDepType value) {
        this.dep = value;
    }

    /**
     * Gets the value of the marketingCarrierInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DatedMarketingSegmentType }
     *     
     */
    public DatedMarketingSegmentType getMarketingCarrierInfo() {
        return marketingCarrierInfo;
    }

    /**
     * Sets the value of the marketingCarrierInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedMarketingSegmentType }
     *     
     */
    public void setMarketingCarrierInfo(DatedMarketingSegmentType value) {
        this.marketingCarrierInfo = value;
    }

    /**
     * Gets the value of the marketingCarrierRBDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingCarrierRBDCode() {
        return marketingCarrierRBDCode;
    }

    /**
     * Sets the value of the marketingCarrierRBDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingCarrierRBDCode(String value) {
        this.marketingCarrierRBDCode = value;
    }

    /**
     * Gets the value of the operatingCarrierInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DatedOperatingSegmentType }
     *     
     */
    public DatedOperatingSegmentType getOperatingCarrierInfo() {
        return operatingCarrierInfo;
    }

    /**
     * Sets the value of the operatingCarrierInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedOperatingSegmentType }
     *     
     */
    public void setOperatingCarrierInfo(DatedOperatingSegmentType value) {
        this.operatingCarrierInfo = value;
    }

    /**
     * Gets the value of the operatingCarrierRBDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingCarrierRBDCode() {
        return operatingCarrierRBDCode;
    }

    /**
     * Sets the value of the operatingCarrierRBDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingCarrierRBDCode(String value) {
        this.operatingCarrierRBDCode = value;
    }

    /**
     * Gets the value of the paxSegmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxSegmentID() {
        return paxSegmentID;
    }

    /**
     * Sets the value of the paxSegmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxSegmentID(String value) {
        this.paxSegmentID = value;
    }

}
