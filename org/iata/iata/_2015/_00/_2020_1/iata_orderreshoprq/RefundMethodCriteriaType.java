
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RefundMethodCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundMethodCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BankTransfer" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}BankTransferType" minOccurs="0"/>
 *         &lt;element name="OrderAssociation" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}OrderAssociationType" minOccurs="0"/>
 *         &lt;element name="OriginalPaymentMethodInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}IndType" minOccurs="0"/>
 *         &lt;element name="PaymentCard" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}PaymentCard1Type"/>
 *         &lt;element name="PrefLevel" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}PrefLevelType" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}PaymentMethodCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundMethodCriteriaType", propOrder = {
    "bankTransfer",
    "orderAssociation",
    "originalPaymentMethodInd",
    "paymentCard",
    "prefLevel",
    "typeCode"
})
public class RefundMethodCriteriaType {

    @XmlElement(name = "BankTransfer")
    protected BankTransferType bankTransfer;
    @XmlElement(name = "OrderAssociation")
    protected OrderAssociationType orderAssociation;
    @XmlElement(name = "OriginalPaymentMethodInd")
    protected Boolean originalPaymentMethodInd;
    @XmlElement(name = "PaymentCard", required = true)
    protected PaymentCard1Type paymentCard;
    @XmlElement(name = "PrefLevel")
    protected PrefLevelType prefLevel;
    @XmlElement(name = "TypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeCode;

    /**
     * Gets the value of the bankTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link BankTransferType }
     *     
     */
    public BankTransferType getBankTransfer() {
        return bankTransfer;
    }

    /**
     * Sets the value of the bankTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransferType }
     *     
     */
    public void setBankTransfer(BankTransferType value) {
        this.bankTransfer = value;
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
     * Gets the value of the originalPaymentMethodInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOriginalPaymentMethodInd() {
        return originalPaymentMethodInd;
    }

    /**
     * Sets the value of the originalPaymentMethodInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOriginalPaymentMethodInd(Boolean value) {
        this.originalPaymentMethodInd = value;
    }

    /**
     * Gets the value of the paymentCard property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard1Type }
     *     
     */
    public PaymentCard1Type getPaymentCard() {
        return paymentCard;
    }

    /**
     * Sets the value of the paymentCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard1Type }
     *     
     */
    public void setPaymentCard(PaymentCard1Type value) {
        this.paymentCard = value;
    }

    /**
     * Gets the value of the prefLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PrefLevelType }
     *     
     */
    public PrefLevelType getPrefLevel() {
        return prefLevel;
    }

    /**
     * Sets the value of the prefLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefLevelType }
     *     
     */
    public void setPrefLevel(PrefLevelType value) {
        this.prefLevel = value;
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
