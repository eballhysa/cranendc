
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
import javax.xml.datatype.Duration;


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
 *         &lt;element name="ARNK_Ind" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}IndType" minOccurs="0"/>
 *         &lt;element name="Arrival" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}TransportArrivalType"/>
 *         &lt;element name="CabinType" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CabinTypeType" minOccurs="0"/>
 *         &lt;element name="DatedOperatingLeg" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}DatedOperatingLegType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Dep" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}TransportDepType"/>
 *         &lt;element name="Duration" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}DurationType" minOccurs="0"/>
 *         &lt;element name="InterlineSettlementInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}InterlineSettlementInfoType" minOccurs="0"/>
 *         &lt;element name="MarketingCarrierInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}DatedMarketingSegmentType"/>
 *         &lt;element name="MarketingCarrierRBD_Code" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}RBD_CodeType" minOccurs="0"/>
 *         &lt;element name="OperatingCarrierInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}DatedOperatingSegmentType" minOccurs="0"/>
 *         &lt;element name="OperatingCarrierRBD_Code" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}RBD_CodeType" minOccurs="0"/>
 *         &lt;element name="PaxSegmentID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ID_Type"/>
 *         &lt;element name="SecureFlightInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}IndType" minOccurs="0"/>
 *         &lt;element name="SegmentTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}SegmentTypeCodeType" minOccurs="0"/>
 *         &lt;element name="TicketlessInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}IndType" minOccurs="0"/>
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
    "arnkInd",
    "arrival",
    "cabinType",
    "datedOperatingLeg",
    "dep",
    "duration",
    "interlineSettlementInfo",
    "marketingCarrierInfo",
    "marketingCarrierRBDCode",
    "operatingCarrierInfo",
    "operatingCarrierRBDCode",
    "paxSegmentID",
    "secureFlightInd",
    "segmentTypeCode",
    "ticketlessInd"
})
public class PaxSegmentType {

    @XmlElement(name = "ARNK_Ind")
    protected Boolean arnkInd;
    @XmlElement(name = "Arrival", required = true)
    protected TransportArrivalType arrival;
    @XmlElement(name = "CabinType")
    protected CabinTypeType cabinType;
    @XmlElement(name = "DatedOperatingLeg")
    protected List<DatedOperatingLegType> datedOperatingLeg;
    @XmlElement(name = "Dep", required = true)
    protected TransportDepType dep;
    @XmlElement(name = "Duration")
    protected Duration duration;
    @XmlElement(name = "InterlineSettlementInfo")
    protected InterlineSettlementInfoType interlineSettlementInfo;
    @XmlElement(name = "MarketingCarrierInfo", required = true)
    protected DatedMarketingSegmentType marketingCarrierInfo;
    @XmlElement(name = "MarketingCarrierRBD_Code")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String marketingCarrierRBDCode;
    @XmlElement(name = "OperatingCarrierInfo")
    protected DatedOperatingSegmentType operatingCarrierInfo;
    @XmlElement(name = "OperatingCarrierRBD_Code")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String operatingCarrierRBDCode;
    @XmlElement(name = "PaxSegmentID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxSegmentID;
    @XmlElement(name = "SecureFlightInd")
    protected Boolean secureFlightInd;
    @XmlElement(name = "SegmentTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String segmentTypeCode;
    @XmlElement(name = "TicketlessInd")
    protected Boolean ticketlessInd;

    /**
     * Gets the value of the arnkInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isARNKInd() {
        return arnkInd;
    }

    /**
     * Sets the value of the arnkInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setARNKInd(Boolean value) {
        this.arnkInd = value;
    }

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
     * Gets the value of the datedOperatingLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datedOperatingLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatedOperatingLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatedOperatingLegType }
     * 
     * 
     */
    public List<DatedOperatingLegType> getDatedOperatingLeg() {
        if (datedOperatingLeg == null) {
            datedOperatingLeg = new ArrayList<DatedOperatingLegType>();
        }
        return this.datedOperatingLeg;
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
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the interlineSettlementInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InterlineSettlementInfoType }
     *     
     */
    public InterlineSettlementInfoType getInterlineSettlementInfo() {
        return interlineSettlementInfo;
    }

    /**
     * Sets the value of the interlineSettlementInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterlineSettlementInfoType }
     *     
     */
    public void setInterlineSettlementInfo(InterlineSettlementInfoType value) {
        this.interlineSettlementInfo = value;
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

    /**
     * Gets the value of the secureFlightInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecureFlightInd() {
        return secureFlightInd;
    }

    /**
     * Sets the value of the secureFlightInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecureFlightInd(Boolean value) {
        this.secureFlightInd = value;
    }

    /**
     * Gets the value of the segmentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentTypeCode() {
        return segmentTypeCode;
    }

    /**
     * Sets the value of the segmentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentTypeCode(String value) {
        this.segmentTypeCode = value;
    }

    /**
     * Gets the value of the ticketlessInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTicketlessInd() {
        return ticketlessInd;
    }

    /**
     * Sets the value of the ticketlessInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTicketlessInd(Boolean value) {
        this.ticketlessInd = value;
    }

}
