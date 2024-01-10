
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrq;

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
 *         &lt;element name="CabinTypeCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}CabinTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OfferItemTypeCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}OfferItemTypeCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentMethodCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}PaymentMethodCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SeatCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}SeatType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ServiceCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}ServiceCriteriaType" minOccurs="0"/>
 *         &lt;element name="SpecialNeedsCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}SpecialServiceType" minOccurs="0"/>
 *         &lt;element name="TripPurposeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}TripPurposeCodeType" minOccurs="0"/>
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
    "cabinTypeCriteria",
    "offerItemTypeCriteria",
    "paymentMethodCriteria",
    "seatCriteria",
    "serviceCriteria",
    "specialNeedsCriteria",
    "tripPurposeCode"
})
public class ShoppingCriteriaType {

    @XmlElement(name = "CabinTypeCriteria")
    protected List<CabinTypeType> cabinTypeCriteria;
    @XmlElement(name = "OfferItemTypeCriteria")
    protected List<OfferItemTypeCriteriaType> offerItemTypeCriteria;
    @XmlElement(name = "PaymentMethodCriteria")
    protected List<PaymentMethodCriteriaType> paymentMethodCriteria;
    @XmlElement(name = "SeatCriteria")
    protected List<SeatType> seatCriteria;
    @XmlElement(name = "ServiceCriteria")
    protected ServiceCriteriaType serviceCriteria;
    @XmlElement(name = "SpecialNeedsCriteria")
    protected SpecialServiceType specialNeedsCriteria;
    @XmlElement(name = "TripPurposeCode")
    @XmlSchemaType(name = "string")
    protected TripPurposeCodeContentType tripPurposeCode;

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
