
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

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
 *         &lt;element name="EncryptedAccountBinary" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}BinaryObjectType" minOccurs="0"/>
 *         &lt;element name="KeyNameText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}TextType" minOccurs="0"/>
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
    "encryptedAccountBinary",
    "keyNameText"
})
public class IATAEasyPayEncryptedDataType {

    @XmlElement(name = "EncryptedAccountBinary")
    protected BinaryObjectType encryptedAccountBinary;
    @XmlElement(name = "KeyNameText")
    protected String keyNameText;

    /**
     * Gets the value of the encryptedAccountBinary property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryObjectType }
     *     
     */
    public BinaryObjectType getEncryptedAccountBinary() {
        return encryptedAccountBinary;
    }

    /**
     * Sets the value of the encryptedAccountBinary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryObjectType }
     *     
     */
    public void setEncryptedAccountBinary(BinaryObjectType value) {
        this.encryptedAccountBinary = value;
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
