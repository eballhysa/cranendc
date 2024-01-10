
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncryptedDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EncryptedDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CryptographyKey" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CryptographyKeyType"/>
 *         &lt;element name="CypherData" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CypherDataType"/>
 *         &lt;element name="EncryptedCardNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}BinaryObjectType" minOccurs="0"/>
 *         &lt;element name="EncryptedCardSecurityNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}BinaryObjectType" minOccurs="0"/>
 *         &lt;element name="KeyNameText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptedDataType", propOrder = {
    "cryptographyKey",
    "cypherData",
    "encryptedCardNumber",
    "encryptedCardSecurityNumber",
    "keyNameText"
})
public class EncryptedDataType {

    @XmlElement(name = "CryptographyKey", required = true)
    protected CryptographyKeyType cryptographyKey;
    @XmlElement(name = "CypherData", required = true)
    protected CypherDataType cypherData;
    @XmlElement(name = "EncryptedCardNumber")
    protected BinaryObjectType encryptedCardNumber;
    @XmlElement(name = "EncryptedCardSecurityNumber")
    protected BinaryObjectType encryptedCardSecurityNumber;
    @XmlElement(name = "KeyNameText")
    protected String keyNameText;

    /**
     * Gets the value of the cryptographyKey property.
     * 
     * @return
     *     possible object is
     *     {@link CryptographyKeyType }
     *     
     */
    public CryptographyKeyType getCryptographyKey() {
        return cryptographyKey;
    }

    /**
     * Sets the value of the cryptographyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptographyKeyType }
     *     
     */
    public void setCryptographyKey(CryptographyKeyType value) {
        this.cryptographyKey = value;
    }

    /**
     * Gets the value of the cypherData property.
     * 
     * @return
     *     possible object is
     *     {@link CypherDataType }
     *     
     */
    public CypherDataType getCypherData() {
        return cypherData;
    }

    /**
     * Sets the value of the cypherData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CypherDataType }
     *     
     */
    public void setCypherData(CypherDataType value) {
        this.cypherData = value;
    }

    /**
     * Gets the value of the encryptedCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryObjectType }
     *     
     */
    public BinaryObjectType getEncryptedCardNumber() {
        return encryptedCardNumber;
    }

    /**
     * Sets the value of the encryptedCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryObjectType }
     *     
     */
    public void setEncryptedCardNumber(BinaryObjectType value) {
        this.encryptedCardNumber = value;
    }

    /**
     * Gets the value of the encryptedCardSecurityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryObjectType }
     *     
     */
    public BinaryObjectType getEncryptedCardSecurityNumber() {
        return encryptedCardSecurityNumber;
    }

    /**
     * Sets the value of the encryptedCardSecurityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryObjectType }
     *     
     */
    public void setEncryptedCardSecurityNumber(BinaryObjectType value) {
        this.encryptedCardSecurityNumber = value;
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
