
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Bank Account payment method definition.
 *  Customer bank accounts for payments, either for paper checks or electronic funds transfer.
 * 
 * <p>Java class for BankTransferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankTransferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountTypeText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}TextType" minOccurs="0"/>
 *         &lt;element name="BankAccountID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="BankID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="CheckNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}NumberType" minOccurs="0"/>
 *         &lt;element name="OwnerName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ProperNameType" minOccurs="0"/>
 *         &lt;element name="SubCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}CodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankTransferType", propOrder = {
    "accountTypeText",
    "bankAccountID",
    "bankID",
    "checkNumber",
    "ownerName",
    "subCode"
})
public class BankTransferType {

    @XmlElement(name = "AccountTypeText")
    protected String accountTypeText;
    @XmlElement(name = "BankAccountID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankAccountID;
    @XmlElement(name = "BankID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankID;
    @XmlElement(name = "CheckNumber")
    protected BigDecimal checkNumber;
    @XmlElement(name = "OwnerName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerName;
    @XmlElement(name = "SubCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String subCode;

    /**
     * Gets the value of the accountTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTypeText() {
        return accountTypeText;
    }

    /**
     * Sets the value of the accountTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTypeText(String value) {
        this.accountTypeText = value;
    }

    /**
     * Gets the value of the bankAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountID() {
        return bankAccountID;
    }

    /**
     * Sets the value of the bankAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountID(String value) {
        this.bankAccountID = value;
    }

    /**
     * Gets the value of the bankID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankID() {
        return bankID;
    }

    /**
     * Sets the value of the bankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankID(String value) {
        this.bankID = value;
    }

    /**
     * Gets the value of the checkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCheckNumber(BigDecimal value) {
        this.checkNumber = value;
    }

    /**
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Gets the value of the subCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCode() {
        return subCode;
    }

    /**
     * Sets the value of the subCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCode(String value) {
        this.subCode = value;
    }

}
