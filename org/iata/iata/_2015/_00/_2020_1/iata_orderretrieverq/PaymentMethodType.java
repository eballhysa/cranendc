
package org.iata.iata._2015._00._2020_1.iata_orderretrieverq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A form of procedure for the payment of goods or services, plus any transactional information specific to the payment method other than the amount.
 * 
 * <p>Java class for PaymentMethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentMethodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountableDoc" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}AccountableDocType" minOccurs="0"/>
 *         &lt;element name="BankAccount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}BankAccountType"/>
 *         &lt;element name="Cash" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}CashType"/>
 *         &lt;element name="Check" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}CheckType"/>
 *         &lt;element name="DirectBill" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}DirectBillType"/>
 *         &lt;element name="LoyaltyRedemption" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}LoyaltyRedemptionType"/>
 *         &lt;element name="OtherPaymentMethod" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}OtherPaymentMethodType" minOccurs="0"/>
 *         &lt;element name="PaymentCard" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}PaymentCardType"/>
 *         &lt;element name="Voucher" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}VoucherType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMethodType", propOrder = {
    "accountableDoc",
    "bankAccount",
    "cash",
    "check",
    "directBill",
    "loyaltyRedemption",
    "otherPaymentMethod",
    "paymentCard",
    "voucher"
})
public class PaymentMethodType {

    @XmlElement(name = "AccountableDoc")
    protected AccountableDocType accountableDoc;
    @XmlElement(name = "BankAccount", required = true)
    protected BankAccountType bankAccount;
    @XmlElement(name = "Cash", required = true)
    protected CashType cash;
    @XmlElement(name = "Check", required = true)
    protected CheckType check;
    @XmlElement(name = "DirectBill", required = true)
    protected DirectBillType directBill;
    @XmlElement(name = "LoyaltyRedemption", required = true)
    protected LoyaltyRedemptionType loyaltyRedemption;
    @XmlElement(name = "OtherPaymentMethod")
    protected OtherPaymentMethodType otherPaymentMethod;
    @XmlElement(name = "PaymentCard", required = true)
    protected PaymentCardType paymentCard;
    @XmlElement(name = "Voucher", required = true)
    protected VoucherType voucher;

    /**
     * Gets the value of the accountableDoc property.
     * 
     * @return
     *     possible object is
     *     {@link AccountableDocType }
     *     
     */
    public AccountableDocType getAccountableDoc() {
        return accountableDoc;
    }

    /**
     * Sets the value of the accountableDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountableDocType }
     *     
     */
    public void setAccountableDoc(AccountableDocType value) {
        this.accountableDoc = value;
    }

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccountType }
     *     
     */
    public BankAccountType getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccountType }
     *     
     */
    public void setBankAccount(BankAccountType value) {
        this.bankAccount = value;
    }

    /**
     * Gets the value of the cash property.
     * 
     * @return
     *     possible object is
     *     {@link CashType }
     *     
     */
    public CashType getCash() {
        return cash;
    }

    /**
     * Sets the value of the cash property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashType }
     *     
     */
    public void setCash(CashType value) {
        this.cash = value;
    }

    /**
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link CheckType }
     *     
     */
    public CheckType getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckType }
     *     
     */
    public void setCheck(CheckType value) {
        this.check = value;
    }

    /**
     * Gets the value of the directBill property.
     * 
     * @return
     *     possible object is
     *     {@link DirectBillType }
     *     
     */
    public DirectBillType getDirectBill() {
        return directBill;
    }

    /**
     * Sets the value of the directBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectBillType }
     *     
     */
    public void setDirectBill(DirectBillType value) {
        this.directBill = value;
    }

    /**
     * Gets the value of the loyaltyRedemption property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyRedemptionType }
     *     
     */
    public LoyaltyRedemptionType getLoyaltyRedemption() {
        return loyaltyRedemption;
    }

    /**
     * Sets the value of the loyaltyRedemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyRedemptionType }
     *     
     */
    public void setLoyaltyRedemption(LoyaltyRedemptionType value) {
        this.loyaltyRedemption = value;
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
     * Gets the value of the paymentCard property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardType }
     *     
     */
    public PaymentCardType getPaymentCard() {
        return paymentCard;
    }

    /**
     * Sets the value of the paymentCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardType }
     *     
     */
    public void setPaymentCard(PaymentCardType value) {
        this.paymentCard = value;
    }

    /**
     * Gets the value of the voucher property.
     * 
     * @return
     *     possible object is
     *     {@link VoucherType }
     *     
     */
    public VoucherType getVoucher() {
        return voucher;
    }

    /**
     * Sets the value of the voucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoucherType }
     *     
     */
    public void setVoucher(VoucherType value) {
        this.voucher = value;
    }

}
