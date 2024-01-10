
package org.iata.iata._2015._00._2020_1.iata_offerpricerq;

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
 * Information related to the settlement of a transaction through monetary or other compensations. For example, a payment may be applied to an entire Order or individual Order Items.
 * 
 * <p>Java class for PaymentProcessingSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentProcessingSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}AmountType"/>
 *         &lt;element name="ContactInfoRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="Desc" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}DescType" minOccurs="0"/>
 *         &lt;element name="OrderAssociation" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}OrderAssociationType" minOccurs="0"/>
 *         &lt;element name="OrderItemRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Payer" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}PayerType" minOccurs="0"/>
 *         &lt;element name="PaymentInfoID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="PaymentRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}ID_Type"/>
 *         &lt;element name="PriceVarianceAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}AmountType" minOccurs="0"/>
 *         &lt;element name="PriceVarianceRule" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}PriceVarianceRuleType" minOccurs="0"/>
 *         &lt;element name="Promotion" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}PromotionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SurchargeAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}AmountType" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}PaymentMethodCodeType"/>
 *         &lt;element name="VerificationInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}IndType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentProcessingSummaryType", propOrder = {
    "amount",
    "contactInfoRefID",
    "desc",
    "orderAssociation",
    "orderItemRefID",
    "payer",
    "paymentInfoID",
    "paymentRefID",
    "priceVarianceAmount",
    "priceVarianceRule",
    "promotion",
    "surchargeAmount",
    "typeCode",
    "verificationInd"
})
public class PaymentProcessingSummaryType {

    @XmlElement(name = "Amount", required = true)
    protected AmountType amount;
    @XmlElement(name = "ContactInfoRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String contactInfoRefID;
    @XmlElement(name = "Desc")
    protected DescType desc;
    @XmlElement(name = "OrderAssociation")
    protected OrderAssociationType orderAssociation;
    @XmlElement(name = "OrderItemRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> orderItemRefID;
    @XmlElement(name = "Payer")
    protected PayerType payer;
    @XmlElement(name = "PaymentInfoID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentInfoID;
    @XmlElement(name = "PaymentRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentRefID;
    @XmlElement(name = "PriceVarianceAmount")
    protected AmountType priceVarianceAmount;
    @XmlElement(name = "PriceVarianceRule")
    protected PriceVarianceRuleType priceVarianceRule;
    @XmlElement(name = "Promotion")
    protected List<PromotionType> promotion;
    @XmlElement(name = "SurchargeAmount")
    protected AmountType surchargeAmount;
    @XmlElement(name = "TypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeCode;
    @XmlElement(name = "VerificationInd")
    protected Boolean verificationInd;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the contactInfoRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactInfoRefID() {
        return contactInfoRefID;
    }

    /**
     * Sets the value of the contactInfoRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactInfoRefID(String value) {
        this.contactInfoRefID = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link DescType }
     *     
     */
    public DescType getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescType }
     *     
     */
    public void setDesc(DescType value) {
        this.desc = value;
    }

    /**
     * Gets the value of the orderAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link OrderAssociationType }
     *     
     */
    public OrderAssociationType getOrderAssociation() {
        return orderAssociation;
    }

    /**
     * Sets the value of the orderAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderAssociationType }
     *     
     */
    public void setOrderAssociation(OrderAssociationType value) {
        this.orderAssociation = value;
    }

    /**
     * Gets the value of the orderItemRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItemRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItemRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOrderItemRefID() {
        if (orderItemRefID == null) {
            orderItemRefID = new ArrayList<String>();
        }
        return this.orderItemRefID;
    }

    /**
     * Gets the value of the payer property.
     * 
     * @return
     *     possible object is
     *     {@link PayerType }
     *     
     */
    public PayerType getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerType }
     *     
     */
    public void setPayer(PayerType value) {
        this.payer = value;
    }

    /**
     * Gets the value of the paymentInfoID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInfoID() {
        return paymentInfoID;
    }

    /**
     * Sets the value of the paymentInfoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInfoID(String value) {
        this.paymentInfoID = value;
    }

    /**
     * Gets the value of the paymentRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentRefID() {
        return paymentRefID;
    }

    /**
     * Sets the value of the paymentRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentRefID(String value) {
        this.paymentRefID = value;
    }

    /**
     * Gets the value of the priceVarianceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPriceVarianceAmount() {
        return priceVarianceAmount;
    }

    /**
     * Sets the value of the priceVarianceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPriceVarianceAmount(AmountType value) {
        this.priceVarianceAmount = value;
    }

    /**
     * Gets the value of the priceVarianceRule property.
     * 
     * @return
     *     possible object is
     *     {@link PriceVarianceRuleType }
     *     
     */
    public PriceVarianceRuleType getPriceVarianceRule() {
        return priceVarianceRule;
    }

    /**
     * Sets the value of the priceVarianceRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceVarianceRuleType }
     *     
     */
    public void setPriceVarianceRule(PriceVarianceRuleType value) {
        this.priceVarianceRule = value;
    }

    /**
     * Gets the value of the promotion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionType }
     * 
     * 
     */
    public List<PromotionType> getPromotion() {
        if (promotion == null) {
            promotion = new ArrayList<PromotionType>();
        }
        return this.promotion;
    }

    /**
     * Gets the value of the surchargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSurchargeAmount() {
        return surchargeAmount;
    }

    /**
     * Sets the value of the surchargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSurchargeAmount(AmountType value) {
        this.surchargeAmount = value;
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

    /**
     * Gets the value of the verificationInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerificationInd() {
        return verificationInd;
    }

    /**
     * Sets the value of the verificationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerificationInd(Boolean value) {
        this.verificationInd = value;
    }

}
