
package org.iata.iata._2015._00._2020_1.iata_airshoppingrq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Further qualifies the flight request by influencing which results are returned in the shopping response, including preferred or required criteria.
 * 
 * <p>Java class for ShoppingCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShoppingCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllianceCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}AllianceCriteriaType" minOccurs="0"/>
 *         &lt;element name="BaggagePricingCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}BaggagePricingCriteriaType" minOccurs="0"/>
 *         &lt;element name="CabinTypeCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}CabinTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CarrierCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}CarrierCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConnectionCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}ConnectionCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExistingOrderCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}ExistingOrderCriteriaType" minOccurs="0"/>
 *         &lt;element name="FareCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}FareCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FlightCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}FlightCriteriaType" minOccurs="0"/>
 *         &lt;element name="OfferItemTypeCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}OfferItemTypeCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentMethodCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}PaymentMethodCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PricingMethodCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}PricingMethodCriteriaType" minOccurs="0"/>
 *         &lt;element name="ProgramCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}ProgramCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PromotionCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}PromotionType" minOccurs="0"/>
 *         &lt;element name="SeatCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}SeatType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SegmentDurationCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}SegmentDurationCriteriaType" minOccurs="0"/>
 *         &lt;element name="ServiceCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}ServiceCriteriaType" minOccurs="0"/>
 *         &lt;element name="SpecialNeedsCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}SpecialServiceType" minOccurs="0"/>
 *         &lt;element name="TripPurposeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}TripPurposeCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingCriteriaType", propOrder = {
    "allianceCriteria",
    "baggagePricingCriteria",
    "cabinTypeCriteria",
    "carrierCriteria",
    "connectionCriteria",
    "existingOrderCriteria",
    "fareCriteria",
    "flightCriteria",
    "offerItemTypeCriteria",
    "paymentMethodCriteria",
    "pricingMethodCriteria",
    "programCriteria",
    "promotionCriteria",
    "seatCriteria",
    "segmentDurationCriteria",
    "serviceCriteria",
    "specialNeedsCriteria",
    "tripPurposeCode"
})
public class ShoppingCriteriaType {

    @XmlElement(name = "AllianceCriteria")
    protected AllianceCriteriaType allianceCriteria;
    @XmlElement(name = "BaggagePricingCriteria")
    protected BaggagePricingCriteriaType baggagePricingCriteria;
    @XmlElement(name = "CabinTypeCriteria")
    protected List<CabinTypeType> cabinTypeCriteria;
    @XmlElement(name = "CarrierCriteria")
    protected List<CarrierCriteriaType> carrierCriteria;
    @XmlElement(name = "ConnectionCriteria")
    protected List<ConnectionCriteriaType> connectionCriteria;
    @XmlElement(name = "ExistingOrderCriteria")
    protected ExistingOrderCriteriaType existingOrderCriteria;
    @XmlElement(name = "FareCriteria")
    protected List<FareCriteriaType> fareCriteria;
    @XmlElement(name = "FlightCriteria")
    protected FlightCriteriaType flightCriteria;
    @XmlElement(name = "OfferItemTypeCriteria")
    protected List<OfferItemTypeCriteriaType> offerItemTypeCriteria;
    @XmlElement(name = "PaymentMethodCriteria")
    protected List<PaymentMethodCriteriaType> paymentMethodCriteria;
    @XmlElement(name = "PricingMethodCriteria")
    protected PricingMethodCriteriaType pricingMethodCriteria;
    @XmlElement(name = "ProgramCriteria")
    protected List<ProgramCriteriaType> programCriteria;
    @XmlElement(name = "PromotionCriteria")
    protected PromotionType promotionCriteria;
    @XmlElement(name = "SeatCriteria")
    protected List<SeatType> seatCriteria;
    @XmlElement(name = "SegmentDurationCriteria")
    protected SegmentDurationCriteriaType segmentDurationCriteria;
    @XmlElement(name = "ServiceCriteria")
    protected ServiceCriteriaType serviceCriteria;
    @XmlElement(name = "SpecialNeedsCriteria")
    protected SpecialServiceType specialNeedsCriteria;
    @XmlElement(name = "TripPurposeCode")
    @XmlSchemaType(name = "string")
    protected TripPurposeCodeContentType tripPurposeCode;

    /**
     * Gets the value of the allianceCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AllianceCriteriaType }
     *     
     */
    public AllianceCriteriaType getAllianceCriteria() {
        return allianceCriteria;
    }

    /**
     * Sets the value of the allianceCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllianceCriteriaType }
     *     
     */
    public void setAllianceCriteria(AllianceCriteriaType value) {
        this.allianceCriteria = value;
    }

    /**
     * Gets the value of the baggagePricingCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link BaggagePricingCriteriaType }
     *     
     */
    public BaggagePricingCriteriaType getBaggagePricingCriteria() {
        return baggagePricingCriteria;
    }

    /**
     * Sets the value of the baggagePricingCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggagePricingCriteriaType }
     *     
     */
    public void setBaggagePricingCriteria(BaggagePricingCriteriaType value) {
        this.baggagePricingCriteria = value;
    }

    /**
     * Gets the value of the cabinTypeCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinTypeCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinTypeCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinTypeType }
     * 
     * 
     */
    public List<CabinTypeType> getCabinTypeCriteria() {
        if (cabinTypeCriteria == null) {
            cabinTypeCriteria = new ArrayList<CabinTypeType>();
        }
        return this.cabinTypeCriteria;
    }

    /**
     * Gets the value of the carrierCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierCriteriaType }
     * 
     * 
     */
    public List<CarrierCriteriaType> getCarrierCriteria() {
        if (carrierCriteria == null) {
            carrierCriteria = new ArrayList<CarrierCriteriaType>();
        }
        return this.carrierCriteria;
    }

    /**
     * Gets the value of the connectionCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionCriteriaType }
     * 
     * 
     */
    public List<ConnectionCriteriaType> getConnectionCriteria() {
        if (connectionCriteria == null) {
            connectionCriteria = new ArrayList<ConnectionCriteriaType>();
        }
        return this.connectionCriteria;
    }

    /**
     * Gets the value of the existingOrderCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ExistingOrderCriteriaType }
     *     
     */
    public ExistingOrderCriteriaType getExistingOrderCriteria() {
        return existingOrderCriteria;
    }

    /**
     * Sets the value of the existingOrderCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExistingOrderCriteriaType }
     *     
     */
    public void setExistingOrderCriteria(ExistingOrderCriteriaType value) {
        this.existingOrderCriteria = value;
    }

    /**
     * Gets the value of the fareCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareCriteriaType }
     * 
     * 
     */
    public List<FareCriteriaType> getFareCriteria() {
        if (fareCriteria == null) {
            fareCriteria = new ArrayList<FareCriteriaType>();
        }
        return this.fareCriteria;
    }

    /**
     * Gets the value of the flightCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link FlightCriteriaType }
     *     
     */
    public FlightCriteriaType getFlightCriteria() {
        return flightCriteria;
    }

    /**
     * Sets the value of the flightCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightCriteriaType }
     *     
     */
    public void setFlightCriteria(FlightCriteriaType value) {
        this.flightCriteria = value;
    }

    /**
     * Gets the value of the offerItemTypeCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerItemTypeCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferItemTypeCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferItemTypeCriteriaType }
     * 
     * 
     */
    public List<OfferItemTypeCriteriaType> getOfferItemTypeCriteria() {
        if (offerItemTypeCriteria == null) {
            offerItemTypeCriteria = new ArrayList<OfferItemTypeCriteriaType>();
        }
        return this.offerItemTypeCriteria;
    }

    /**
     * Gets the value of the paymentMethodCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethodCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethodCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMethodCriteriaType }
     * 
     * 
     */
    public List<PaymentMethodCriteriaType> getPaymentMethodCriteria() {
        if (paymentMethodCriteria == null) {
            paymentMethodCriteria = new ArrayList<PaymentMethodCriteriaType>();
        }
        return this.paymentMethodCriteria;
    }

    /**
     * Gets the value of the pricingMethodCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link PricingMethodCriteriaType }
     *     
     */
    public PricingMethodCriteriaType getPricingMethodCriteria() {
        return pricingMethodCriteria;
    }

    /**
     * Sets the value of the pricingMethodCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingMethodCriteriaType }
     *     
     */
    public void setPricingMethodCriteria(PricingMethodCriteriaType value) {
        this.pricingMethodCriteria = value;
    }

    /**
     * Gets the value of the programCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the programCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgramCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProgramCriteriaType }
     * 
     * 
     */
    public List<ProgramCriteriaType> getProgramCriteria() {
        if (programCriteria == null) {
            programCriteria = new ArrayList<ProgramCriteriaType>();
        }
        return this.programCriteria;
    }

    /**
     * Gets the value of the promotionCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionType }
     *     
     */
    public PromotionType getPromotionCriteria() {
        return promotionCriteria;
    }

    /**
     * Sets the value of the promotionCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionType }
     *     
     */
    public void setPromotionCriteria(PromotionType value) {
        this.promotionCriteria = value;
    }

    /**
     * Gets the value of the seatCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatType }
     * 
     * 
     */
    public List<SeatType> getSeatCriteria() {
        if (seatCriteria == null) {
            seatCriteria = new ArrayList<SeatType>();
        }
        return this.seatCriteria;
    }

    /**
     * Gets the value of the segmentDurationCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentDurationCriteriaType }
     *     
     */
    public SegmentDurationCriteriaType getSegmentDurationCriteria() {
        return segmentDurationCriteria;
    }

    /**
     * Sets the value of the segmentDurationCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentDurationCriteriaType }
     *     
     */
    public void setSegmentDurationCriteria(SegmentDurationCriteriaType value) {
        this.segmentDurationCriteria = value;
    }

    /**
     * Gets the value of the serviceCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCriteriaType }
     *     
     */
    public ServiceCriteriaType getServiceCriteria() {
        return serviceCriteria;
    }

    /**
     * Sets the value of the serviceCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCriteriaType }
     *     
     */
    public void setServiceCriteria(ServiceCriteriaType value) {
        this.serviceCriteria = value;
    }

    /**
     * Gets the value of the specialNeedsCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialServiceType }
     *     
     */
    public SpecialServiceType getSpecialNeedsCriteria() {
        return specialNeedsCriteria;
    }

    /**
     * Sets the value of the specialNeedsCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialServiceType }
     *     
     */
    public void setSpecialNeedsCriteria(SpecialServiceType value) {
        this.specialNeedsCriteria = value;
    }

    /**
     * Gets the value of the tripPurposeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TripPurposeCodeContentType }
     *     
     */
    public TripPurposeCodeContentType getTripPurposeCode() {
        return tripPurposeCode;
    }

    /**
     * Sets the value of the tripPurposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripPurposeCodeContentType }
     *     
     */
    public void setTripPurposeCode(TripPurposeCodeContentType value) {
        this.tripPurposeCode = value;
    }

}
