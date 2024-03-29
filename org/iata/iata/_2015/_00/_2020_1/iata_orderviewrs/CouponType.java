
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The portion of the Passenger Ticket and Baggage Check or Excess Baggage Ticket that indicates particular places between which the coupon is good for carriage. 
 * 
 * <p>Java class for CouponType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaggageAllowanceRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}ID_Type" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="ConnectedCouponNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}NumberType" minOccurs="0"/>
 *         &lt;element name="ConsumedAtIssuanceInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}IndType" minOccurs="0"/>
 *         &lt;element name="CouponMediaTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CodeType" minOccurs="0"/>
 *         &lt;element name="CouponNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}NumberType"/>
 *         &lt;element name="CouponRefNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}NumberType" minOccurs="0"/>
 *         &lt;element name="CouponSeqNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}NumberType" minOccurs="0"/>
 *         &lt;element name="CouponStatusCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CodeType"/>
 *         &lt;element name="CouponValidityPeriod" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CouponValidityPeriodType" minOccurs="0"/>
 *         &lt;element name="CurrentCouponFlightInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CurrentCouponFlightInfoType" minOccurs="0"/>
 *         &lt;element name="ExcessBaggage" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}ExcessBaggageType" minOccurs="0"/>
 *         &lt;element name="FareBasisCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CodeType" minOccurs="0"/>
 *         &lt;element name="FiledFee" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}FiledFeeType" minOccurs="0"/>
 *         &lt;element name="InvolIndCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CodeType" minOccurs="0"/>
 *         &lt;element name="NonCommissionableInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}IndType" minOccurs="0"/>
 *         &lt;element name="NonInterlineableInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}IndType" minOccurs="0"/>
 *         &lt;element name="NonRefundableInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}IndType" minOccurs="0"/>
 *         &lt;element name="NonReissuableNonExchInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}IndType" minOccurs="0"/>
 *         &lt;element name="ProductCharacteristic" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}KeyValuePropertyType" minOccurs="0"/>
 *         &lt;element name="Promotion" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}PromotionType" minOccurs="0"/>
 *         &lt;element name="RemarkText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TextType" minOccurs="0"/>
 *         &lt;element name="ResChangeInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}ResChangeInfoType" minOccurs="0"/>
 *         &lt;element name="RFIC" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}RFIC_CodeType" minOccurs="0"/>
 *         &lt;element name="RFISC" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}RFISC_CodeType" minOccurs="0"/>
 *         &lt;element name="RFISC_Desc" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TextType" minOccurs="0"/>
 *         &lt;element name="ServiceDeliveryDate" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}DateType" minOccurs="0"/>
 *         &lt;element name="ServiceDeliveryProviderLocationCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}IATA_LocationCodeType" minOccurs="0"/>
 *         &lt;element name="ServiceDeliveryProviderName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}NameType" minOccurs="0"/>
 *         &lt;element name="ServiceQty" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}QtyType" minOccurs="0"/>
 *         &lt;element name="ServiceRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SettlementAuthorizationID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="SoldAirlineInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}PaxSegmentRefType" minOccurs="0"/>
 *         &lt;element name="ValueAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponType", propOrder = {
    "baggageAllowanceRefID",
    "connectedCouponNumber",
    "consumedAtIssuanceInd",
    "couponMediaTypeCode",
    "couponNumber",
    "couponRefNumber",
    "couponSeqNumber",
    "couponStatusCode",
    "couponValidityPeriod",
    "currentCouponFlightInfo",
    "excessBaggage",
    "fareBasisCode",
    "filedFee",
    "involIndCode",
    "nonCommissionableInd",
    "nonInterlineableInd",
    "nonRefundableInd",
    "nonReissuableNonExchInd",
    "productCharacteristic",
    "promotion",
    "remarkText",
    "resChangeInfo",
    "rfic",
    "rfisc",
    "rfiscDesc",
    "serviceDeliveryDate",
    "serviceDeliveryProviderLocationCode",
    "serviceDeliveryProviderName",
    "serviceQty",
    "serviceRefID",
    "settlementAuthorizationID",
    "soldAirlineInfo",
    "valueAmount"
})
public class CouponType {

    @XmlElement(name = "BaggageAllowanceRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> baggageAllowanceRefID;
    @XmlElement(name = "ConnectedCouponNumber")
    protected BigDecimal connectedCouponNumber;
    @XmlElement(name = "ConsumedAtIssuanceInd")
    protected Boolean consumedAtIssuanceInd;
    @XmlElement(name = "CouponMediaTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String couponMediaTypeCode;
    @XmlElement(name = "CouponNumber", required = true)
    protected BigDecimal couponNumber;
    @XmlElement(name = "CouponRefNumber")
    protected BigDecimal couponRefNumber;
    @XmlElement(name = "CouponSeqNumber")
    protected BigDecimal couponSeqNumber;
    @XmlElement(name = "CouponStatusCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String couponStatusCode;
    @XmlElement(name = "CouponValidityPeriod")
    protected CouponValidityPeriodType couponValidityPeriod;
    @XmlElement(name = "CurrentCouponFlightInfo")
    protected CurrentCouponFlightInfoType currentCouponFlightInfo;
    @XmlElement(name = "ExcessBaggage")
    protected ExcessBaggageType excessBaggage;
    @XmlElement(name = "FareBasisCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fareBasisCode;
    @XmlElement(name = "FiledFee")
    protected FiledFeeType filedFee;
    @XmlElement(name = "InvolIndCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String involIndCode;
    @XmlElement(name = "NonCommissionableInd")
    protected Boolean nonCommissionableInd;
    @XmlElement(name = "NonInterlineableInd")
    protected Boolean nonInterlineableInd;
    @XmlElement(name = "NonRefundableInd")
    protected Boolean nonRefundableInd;
    @XmlElement(name = "NonReissuableNonExchInd")
    protected Boolean nonReissuableNonExchInd;
    @XmlElement(name = "ProductCharacteristic")
    protected KeyValuePropertyType productCharacteristic;
    @XmlElement(name = "Promotion")
    protected PromotionType promotion;
    @XmlElement(name = "RemarkText")
    protected String remarkText;
    @XmlElement(name = "ResChangeInfo")
    protected ResChangeInfoType resChangeInfo;
    @XmlElement(name = "RFIC")
    protected String rfic;
    @XmlElement(name = "RFISC")
    protected String rfisc;
    @XmlElement(name = "RFISC_Desc")
    protected String rfiscDesc;
    @XmlElement(name = "ServiceDeliveryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar serviceDeliveryDate;
    @XmlElement(name = "ServiceDeliveryProviderLocationCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceDeliveryProviderLocationCode;
    @XmlElement(name = "ServiceDeliveryProviderName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceDeliveryProviderName;
    @XmlElement(name = "ServiceQty")
    protected BigDecimal serviceQty;
    @XmlElement(name = "ServiceRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> serviceRefID;
    @XmlElement(name = "SettlementAuthorizationID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String settlementAuthorizationID;
    @XmlElement(name = "SoldAirlineInfo")
    protected PaxSegmentRefType soldAirlineInfo;
    @XmlElement(name = "ValueAmount")
    protected AmountType valueAmount;

    /**
     * Gets the value of the baggageAllowanceRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageAllowanceRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaggageAllowanceRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBaggageAllowanceRefID() {
        if (baggageAllowanceRefID == null) {
            baggageAllowanceRefID = new ArrayList<String>();
        }
        return this.baggageAllowanceRefID;
    }

    /**
     * Gets the value of the connectedCouponNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConnectedCouponNumber() {
        return connectedCouponNumber;
    }

    /**
     * Sets the value of the connectedCouponNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConnectedCouponNumber(BigDecimal value) {
        this.connectedCouponNumber = value;
    }

    /**
     * Gets the value of the consumedAtIssuanceInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsumedAtIssuanceInd() {
        return consumedAtIssuanceInd;
    }

    /**
     * Sets the value of the consumedAtIssuanceInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsumedAtIssuanceInd(Boolean value) {
        this.consumedAtIssuanceInd = value;
    }

    /**
     * Gets the value of the couponMediaTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponMediaTypeCode() {
        return couponMediaTypeCode;
    }

    /**
     * Sets the value of the couponMediaTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponMediaTypeCode(String value) {
        this.couponMediaTypeCode = value;
    }

    /**
     * Gets the value of the couponNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCouponNumber() {
        return couponNumber;
    }

    /**
     * Sets the value of the couponNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCouponNumber(BigDecimal value) {
        this.couponNumber = value;
    }

    /**
     * Gets the value of the couponRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCouponRefNumber() {
        return couponRefNumber;
    }

    /**
     * Sets the value of the couponRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCouponRefNumber(BigDecimal value) {
        this.couponRefNumber = value;
    }

    /**
     * Gets the value of the couponSeqNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCouponSeqNumber() {
        return couponSeqNumber;
    }

    /**
     * Sets the value of the couponSeqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCouponSeqNumber(BigDecimal value) {
        this.couponSeqNumber = value;
    }

    /**
     * Gets the value of the couponStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponStatusCode() {
        return couponStatusCode;
    }

    /**
     * Sets the value of the couponStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponStatusCode(String value) {
        this.couponStatusCode = value;
    }

    /**
     * Gets the value of the couponValidityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link CouponValidityPeriodType }
     *     
     */
    public CouponValidityPeriodType getCouponValidityPeriod() {
        return couponValidityPeriod;
    }

    /**
     * Sets the value of the couponValidityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponValidityPeriodType }
     *     
     */
    public void setCouponValidityPeriod(CouponValidityPeriodType value) {
        this.couponValidityPeriod = value;
    }

    /**
     * Gets the value of the currentCouponFlightInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentCouponFlightInfoType }
     *     
     */
    public CurrentCouponFlightInfoType getCurrentCouponFlightInfo() {
        return currentCouponFlightInfo;
    }

    /**
     * Sets the value of the currentCouponFlightInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentCouponFlightInfoType }
     *     
     */
    public void setCurrentCouponFlightInfo(CurrentCouponFlightInfoType value) {
        this.currentCouponFlightInfo = value;
    }

    /**
     * Gets the value of the excessBaggage property.
     * 
     * @return
     *     possible object is
     *     {@link ExcessBaggageType }
     *     
     */
    public ExcessBaggageType getExcessBaggage() {
        return excessBaggage;
    }

    /**
     * Sets the value of the excessBaggage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcessBaggageType }
     *     
     */
    public void setExcessBaggage(ExcessBaggageType value) {
        this.excessBaggage = value;
    }

    /**
     * Gets the value of the fareBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * Sets the value of the fareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasisCode(String value) {
        this.fareBasisCode = value;
    }

    /**
     * Gets the value of the filedFee property.
     * 
     * @return
     *     possible object is
     *     {@link FiledFeeType }
     *     
     */
    public FiledFeeType getFiledFee() {
        return filedFee;
    }

    /**
     * Sets the value of the filedFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiledFeeType }
     *     
     */
    public void setFiledFee(FiledFeeType value) {
        this.filedFee = value;
    }

    /**
     * Gets the value of the involIndCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvolIndCode() {
        return involIndCode;
    }

    /**
     * Sets the value of the involIndCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvolIndCode(String value) {
        this.involIndCode = value;
    }

    /**
     * Gets the value of the nonCommissionableInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonCommissionableInd() {
        return nonCommissionableInd;
    }

    /**
     * Sets the value of the nonCommissionableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonCommissionableInd(Boolean value) {
        this.nonCommissionableInd = value;
    }

    /**
     * Gets the value of the nonInterlineableInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonInterlineableInd() {
        return nonInterlineableInd;
    }

    /**
     * Sets the value of the nonInterlineableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonInterlineableInd(Boolean value) {
        this.nonInterlineableInd = value;
    }

    /**
     * Gets the value of the nonRefundableInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonRefundableInd() {
        return nonRefundableInd;
    }

    /**
     * Sets the value of the nonRefundableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonRefundableInd(Boolean value) {
        this.nonRefundableInd = value;
    }

    /**
     * Gets the value of the nonReissuableNonExchInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonReissuableNonExchInd() {
        return nonReissuableNonExchInd;
    }

    /**
     * Sets the value of the nonReissuableNonExchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonReissuableNonExchInd(Boolean value) {
        this.nonReissuableNonExchInd = value;
    }

    /**
     * Gets the value of the productCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public KeyValuePropertyType getProductCharacteristic() {
        return productCharacteristic;
    }

    /**
     * Sets the value of the productCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePropertyType }
     *     
     */
    public void setProductCharacteristic(KeyValuePropertyType value) {
        this.productCharacteristic = value;
    }

    /**
     * Gets the value of the promotion property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionType }
     *     
     */
    public PromotionType getPromotion() {
        return promotion;
    }

    /**
     * Sets the value of the promotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionType }
     *     
     */
    public void setPromotion(PromotionType value) {
        this.promotion = value;
    }

    /**
     * Gets the value of the remarkText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarkText() {
        return remarkText;
    }

    /**
     * Sets the value of the remarkText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarkText(String value) {
        this.remarkText = value;
    }

    /**
     * Gets the value of the resChangeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ResChangeInfoType }
     *     
     */
    public ResChangeInfoType getResChangeInfo() {
        return resChangeInfo;
    }

    /**
     * Sets the value of the resChangeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResChangeInfoType }
     *     
     */
    public void setResChangeInfo(ResChangeInfoType value) {
        this.resChangeInfo = value;
    }

    /**
     * Gets the value of the rfic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFIC() {
        return rfic;
    }

    /**
     * Sets the value of the rfic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFIC(String value) {
        this.rfic = value;
    }

    /**
     * Gets the value of the rfisc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFISC() {
        return rfisc;
    }

    /**
     * Sets the value of the rfisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFISC(String value) {
        this.rfisc = value;
    }

    /**
     * Gets the value of the rfiscDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFISCDesc() {
        return rfiscDesc;
    }

    /**
     * Sets the value of the rfiscDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFISCDesc(String value) {
        this.rfiscDesc = value;
    }

    /**
     * Gets the value of the serviceDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceDeliveryDate() {
        return serviceDeliveryDate;
    }

    /**
     * Sets the value of the serviceDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceDeliveryDate(XMLGregorianCalendar value) {
        this.serviceDeliveryDate = value;
    }

    /**
     * Gets the value of the serviceDeliveryProviderLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDeliveryProviderLocationCode() {
        return serviceDeliveryProviderLocationCode;
    }

    /**
     * Sets the value of the serviceDeliveryProviderLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDeliveryProviderLocationCode(String value) {
        this.serviceDeliveryProviderLocationCode = value;
    }

    /**
     * Gets the value of the serviceDeliveryProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDeliveryProviderName() {
        return serviceDeliveryProviderName;
    }

    /**
     * Sets the value of the serviceDeliveryProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDeliveryProviderName(String value) {
        this.serviceDeliveryProviderName = value;
    }

    /**
     * Gets the value of the serviceQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceQty() {
        return serviceQty;
    }

    /**
     * Sets the value of the serviceQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiceQty(BigDecimal value) {
        this.serviceQty = value;
    }

    /**
     * Gets the value of the serviceRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getServiceRefID() {
        if (serviceRefID == null) {
            serviceRefID = new ArrayList<String>();
        }
        return this.serviceRefID;
    }

    /**
     * Gets the value of the settlementAuthorizationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementAuthorizationID() {
        return settlementAuthorizationID;
    }

    /**
     * Sets the value of the settlementAuthorizationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementAuthorizationID(String value) {
        this.settlementAuthorizationID = value;
    }

    /**
     * Gets the value of the soldAirlineInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PaxSegmentRefType }
     *     
     */
    public PaxSegmentRefType getSoldAirlineInfo() {
        return soldAirlineInfo;
    }

    /**
     * Sets the value of the soldAirlineInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxSegmentRefType }
     *     
     */
    public void setSoldAirlineInfo(PaxSegmentRefType value) {
        this.soldAirlineInfo = value;
    }

    /**
     * Gets the value of the valueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getValueAmount() {
        return valueAmount;
    }

    /**
     * Sets the value of the valueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setValueAmount(AmountType value) {
        this.valueAmount = value;
    }

}
