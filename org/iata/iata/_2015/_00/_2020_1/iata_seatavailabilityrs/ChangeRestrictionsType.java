
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * These are a set of qualifying conditions/rules/restriction that are related to a constrained priced grouping of services for a Change/modification action.
 * 
 * <p>Java class for ChangeRestrictionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeRestrictionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllowedModificationInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}IndType" minOccurs="0"/>
 *         &lt;element name="ChangeTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}ChangeTypeCodeType" minOccurs="0"/>
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}TextType" minOccurs="0"/>
 *         &lt;element name="EffectiveDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ExpirationDateTime" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}DateTimeType" minOccurs="0"/>
 *         &lt;element name="Fee" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}Fee1Type" minOccurs="0"/>
 *         &lt;element name="JourneyStageCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}JourneyStageTypeCodeType" minOccurs="0"/>
 *         &lt;element name="PaxRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="Refund" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}RefundType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeRestrictionsType", propOrder = {
    "allowedModificationInd",
    "changeTypeCode",
    "descText",
    "effectiveDateTime",
    "expirationDateTime",
    "fee",
    "journeyStageCode",
    "paxRefID",
    "refund"
})
public class ChangeRestrictionsType {

    @XmlElement(name = "AllowedModificationInd")
    protected Boolean allowedModificationInd;
    @XmlElement(name = "ChangeTypeCode")
    @XmlSchemaType(name = "token")
    protected ChangeTypeCodeContentType changeTypeCode;
    @XmlElement(name = "DescText")
    protected String descText;
    @XmlElement(name = "EffectiveDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDateTime;
    @XmlElement(name = "ExpirationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDateTime;
    @XmlElement(name = "Fee")
    protected Fee1Type fee;
    @XmlElement(name = "JourneyStageCode")
    @XmlSchemaType(name = "token")
    protected JourneyStageTypeCodeContentType journeyStageCode;
    @XmlElement(name = "PaxRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxRefID;
    @XmlElement(name = "Refund")
    protected RefundType refund;

    /**
     * Gets the value of the allowedModificationInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowedModificationInd() {
        return allowedModificationInd;
    }

    /**
     * Sets the value of the allowedModificationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowedModificationInd(Boolean value) {
        this.allowedModificationInd = value;
    }

    /**
     * Gets the value of the changeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeTypeCodeContentType }
     *     
     */
    public ChangeTypeCodeContentType getChangeTypeCode() {
        return changeTypeCode;
    }

    /**
     * Sets the value of the changeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeTypeCodeContentType }
     *     
     */
    public void setChangeTypeCode(ChangeTypeCodeContentType value) {
        this.changeTypeCode = value;
    }

    /**
     * Gets the value of the descText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescText() {
        return descText;
    }

    /**
     * Sets the value of the descText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescText(String value) {
        this.descText = value;
    }

    /**
     * Gets the value of the effectiveDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDateTime() {
        return effectiveDateTime;
    }

    /**
     * Sets the value of the effectiveDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDateTime(XMLGregorianCalendar value) {
        this.effectiveDateTime = value;
    }

    /**
     * Gets the value of the expirationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDateTime() {
        return expirationDateTime;
    }

    /**
     * Sets the value of the expirationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDateTime(XMLGregorianCalendar value) {
        this.expirationDateTime = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link Fee1Type }
     *     
     */
    public Fee1Type getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fee1Type }
     *     
     */
    public void setFee(Fee1Type value) {
        this.fee = value;
    }

    /**
     * Gets the value of the journeyStageCode property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyStageTypeCodeContentType }
     *     
     */
    public JourneyStageTypeCodeContentType getJourneyStageCode() {
        return journeyStageCode;
    }

    /**
     * Sets the value of the journeyStageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyStageTypeCodeContentType }
     *     
     */
    public void setJourneyStageCode(JourneyStageTypeCodeContentType value) {
        this.journeyStageCode = value;
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
     * Gets the value of the refund property.
     * 
     * @return
     *     possible object is
     *     {@link RefundType }
     *     
     */
    public RefundType getRefund() {
        return refund;
    }

    /**
     * Sets the value of the refund property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundType }
     *     
     */
    public void setRefund(RefundType value) {
        this.refund = value;
    }

}
