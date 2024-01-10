
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * container for the encrypted Easy Pay data
 * 
 * <p>Java class for IATA_EasyPayEncryptedDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IATA_EasyPayEncryptedDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EncryptedAccountNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}NumberType" minOccurs="0"/>
 *         &lt;element name="KeyNameText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IATA_EasyPayEncryptedDataType", propOrder = {
    "encryptedAccountNumber",
    "keyNameText"
})
public class IATAEasyPayEncryptedDataType {

    @XmlElement(name = "EncryptedAccountNumber")
    protected BigDecimal encryptedAccountNumber;
    @XmlElement(name = "KeyNameText")
    protected String keyNameText;

    /**
     * Gets the value of the encryptedAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEncryptedAccountNumber() {
        return encryptedAccountNumber;
    }

    /**
     * Sets the value of the encryptedAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEncryptedAccountNumber(BigDecimal value) {
        this.encryptedAccountNumber = value;
    }

    /**
     * Gets the value of the keyNameText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyNameText() {
        return keyNameText;
    }

    /**
     * Sets the value of the keyNameText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyNameText(String value) {
        this.keyNameText = value;
    }

}
