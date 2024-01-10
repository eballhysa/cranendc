
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
 * <p>Java class for PaymentSupportedMethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentSupportedMethodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfferAssociation" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}OfferAssociationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OtherPaymentMethod" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}OtherPaymentMethodType" minOccurs="0"/>
 *         &lt;element name="PaymentCard2" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}PaymentCard2Type" minOccurs="0"/>
 *         &lt;element name="PaymentRedirection" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}PaymentRedirectionType" minOccurs="0"/>
 *         &lt;element name="SurchargeInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}SurchargeInfoType" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}PaymentMethodCodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentSupportedMethodType", propOrder = {
    "offerAssociation",
    "otherPaymentMethod",
    "paymentCard2",
    "paymentRedirection",
    "surchargeInfo",
    "typeCode"
})
public class PaymentSupportedMethodType {

    @XmlElement(name = "OfferAssociation")
    protected List<OfferAssociationType> offerAssociation;
    @XmlElement(name = "OtherPaymentMethod")
    protected OtherPaymentMethodType otherPaymentMethod;
    @XmlElement(name = "PaymentCard2")
    protected PaymentCard2Type paymentCard2;
    @XmlElement(name = "PaymentRedirection")
    protected PaymentRedirectionType paymentRedirection;
    @XmlElement(name = "SurchargeInfo")
    protected SurchargeInfoType surchargeInfo;
    @XmlElement(name = "TypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeCode;

    /**
     * Gets the value of the offerAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferAssociationType }
     * 
     * 
     */
    public List<OfferAssociationType> getOfferAssociation() {
        if (offerAssociation == null) {
            offerAssociation = new ArrayList<OfferAssociationType>();
        }
        return this.offerAssociation;
    }

    /**
     * Gets the value of the otherPaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link OtherPaymentMethodType }
     *     
     */
    public OtherPaymentMethodType getOtherPaymentMethod() {
        return otherPaymentMethod;
    }

    /**
     * Sets the value of the otherPaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherPaymentMethodType }
     *     
     */
    public void setOtherPaymentMethod(OtherPaymentMethodType value) {
        this.otherPaymentMethod = value;
    }

    /**
     * Gets the value of the paymentCard2 property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard2Type }
     *     
     */
    public PaymentCard2Type getPaymentCard2() {
        return paymentCard2;
    }

    /**
     * Sets the value of the paymentCard2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard2Type }
     *     
     */
    public void setPaymentCard2(PaymentCard2Type value) {
        this.paymentCard2 = value;
    }

    /**
     * Gets the value of the paymentRedirection property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRedirectionType }
     *     
     */
    public PaymentRedirectionType getPaymentRedirection() {
        return paymentRedirection;
    }

    /**
     * Sets the value of the paymentRedirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRedirectionType }
     *     
     */
    public void setPaymentRedirection(PaymentRedirectionType value) {
        this.paymentRedirection = value;
    }

    /**
     * Gets the value of the surchargeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SurchargeInfoType }
     *     
     */
    public SurchargeInfoType getSurchargeInfo() {
        return surchargeInfo;
    }

    /**
     * Sets the value of the surchargeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurchargeInfoType }
     *     
     */
    public void setSurchargeInfo(SurchargeInfoType value) {
        this.surchargeInfo = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

}
