
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Carrier Fee Payment Method
 * 
 * <p>Java class for CarrierFeePaymentMethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarrierFeePaymentMethodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="AccountableDoc" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}AccountableDocType" maxOccurs="unbounded"/>
 *         &lt;element name="BankTransfer" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}BankTransferType" maxOccurs="unbounded"/>
 *         &lt;element name="Cash" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CashType" maxOccurs="unbounded"/>
 *         &lt;element name="Check" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CheckType" maxOccurs="unbounded"/>
 *         &lt;element name="DirectBill" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}DirectBillType" maxOccurs="unbounded"/>
 *         &lt;element name="IATA_EasyPay" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}IATA_EasyPayType" maxOccurs="unbounded"/>
 *         &lt;element name="LoyaltyRedemption" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}LoyaltyRedemptionType" maxOccurs="unbounded"/>
 *         &lt;element name="OtherPaymentMethod" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}OtherPaymentMethodType" maxOccurs="unbounded"/>
 *         &lt;element name="PaymentCard" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}PaymentCardType" maxOccurs="unbounded"/>
 *         &lt;element name="Voucher" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}VoucherType" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierFeePaymentMethodType", propOrder = {
    "accountableDoc",
    "bankTransfer",
    "cash",
    "check",
    "directBill",
    "iataEasyPay",
    "loyaltyRedemption",
    "otherPaymentMethod",
    "paymentCard",
    "voucher"
})
public class CarrierFeePaymentMethodType {

    @XmlElement(name = "AccountableDoc")
    protected List<AccountableDocType> accountableDoc;
    @XmlElement(name = "BankTransfer")
    protected List<BankTransferType> bankTransfer;
    @XmlElement(name = "Cash")
    protected List<CashType> cash;
    @XmlElement(name = "Check")
    protected List<CheckType> check;
    @XmlElement(name = "DirectBill")
    protected List<DirectBillType> directBill;
    @XmlElement(name = "IATA_EasyPay")
    protected List<IATAEasyPayType> iataEasyPay;
    @XmlElement(name = "LoyaltyRedemption")
    protected List<LoyaltyRedemptionType> loyaltyRedemption;
    @XmlElement(name = "OtherPaymentMethod")
    protected List<OtherPaymentMethodType> otherPaymentMethod;
    @XmlElement(name = "PaymentCard")
    protected List<PaymentCardType> paymentCard;
    @XmlElement(name = "Voucher")
    protected List<VoucherType> voucher;

    /**
     * Gets the value of the accountableDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountableDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountableDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountableDocType }
     * 
     * 
     */
    public List<AccountableDocType> getAccountableDoc() {
        if (accountableDoc == null) {
            accountableDoc = new ArrayList<AccountableDocType>();
        }
        return this.accountableDoc;
    }

    /**
     * Gets the value of the bankTransfer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankTransfer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankTransfer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankTransferType }
     * 
     * 
     */
    public List<BankTransferType> getBankTransfer() {
        if (bankTransfer == null) {
            bankTransfer = new ArrayList<BankTransferType>();
        }
        return this.bankTransfer;
    }

    /**
     * Gets the value of the cash property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cash property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCash().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashType }
     * 
     * 
     */
    public List<CashType> getCash() {
        if (cash == null) {
            cash = new ArrayList<CashType>();
        }
        return this.cash;
    }

    /**
     * Gets the value of the check property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the check property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheck().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckType }
     * 
     * 
     */
    public List<CheckType> getCheck() {
        if (check == null) {
            check = new ArrayList<CheckType>();
        }
        return this.check;
    }

    /**
     * Gets the value of the directBill property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directBill property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectBill().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectBillType }
     * 
     * 
     */
    public List<DirectBillType> getDirectBill() {
        if (directBill == null) {
            directBill = new ArrayList<DirectBillType>();
        }
        return this.directBill;
    }

    /**
     * Gets the value of the iataEasyPay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iataEasyPay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIATAEasyPay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IATAEasyPayType }
     * 
     * 
     */
    public List<IATAEasyPayType> getIATAEasyPay() {
        if (iataEasyPay == null) {
            iataEasyPay = new ArrayList<IATAEasyPayType>();
        }
        return this.iataEasyPay;
    }

    /**
     * Gets the value of the loyaltyRedemption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyRedemption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyRedemption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyRedemptionType }
     * 
     * 
     */
    public List<LoyaltyRedemptionType> getLoyaltyRedemption() {
        if (loyaltyRedemption == null) {
            loyaltyRedemption = new ArrayList<LoyaltyRedemptionType>();
        }
        return this.loyaltyRedemption;
    }

    /**
     * Gets the value of the otherPaymentMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherPaymentMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherPaymentMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherPaymentMethodType }
     * 
     * 
     */
    public List<OtherPaymentMethodType> getOtherPaymentMethod() {
        if (otherPaymentMethod == null) {
            otherPaymentMethod = new ArrayList<OtherPaymentMethodType>();
        }
        return this.otherPaymentMethod;
    }

    /**
     * Gets the value of the paymentCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentCardType }
     * 
     * 
     */
    public List<PaymentCardType> getPaymentCard() {
        if (paymentCard == null) {
            paymentCard = new ArrayList<PaymentCardType>();
        }
        return this.paymentCard;
    }

    /**
     * Gets the value of the voucher property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voucher property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoucher().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoucherType }
     * 
     * 
     */
    public List<VoucherType> getVoucher() {
        if (voucher == null) {
            voucher = new ArrayList<VoucherType>();
        }
        return this.voucher;
    }

}
