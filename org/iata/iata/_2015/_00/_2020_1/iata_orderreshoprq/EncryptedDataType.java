
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="CryptographyKey" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}CryptographyKeyType"/>
 *         &lt;element name="CypherData" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}CypherDataType"/>
 *         &lt;element name="EncryptedCardNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}BinaryObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EncryptedCardSecurityNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}BinaryObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="KeyName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}TextType" maxOccurs="unbounded" minOccurs="0"/>
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
    "keyName"
})
public class EncryptedDataType {

    @XmlElement(name = "CryptographyKey", required = true)
    protected CryptographyKeyType cryptographyKey;
    @XmlElement(name = "CypherData", required = true)
    protected CypherDataType cypherData;
    @XmlElement(name = "EncryptedCardNumber")
    protected List<BinaryObjectType> encryptedCardNumber;
    @XmlElement(name = "EncryptedCardSecurityNumber")
    protected List<BinaryObjectType> encryptedCardSecurityNumber;
    @XmlElement(name = "KeyName")
    protected List<String> keyName;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encryptedCardNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncryptedCardNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BinaryObjectType }
     * 
     * 
     */
    public List<BinaryObjectType> getEncryptedCardNumber() {
        if (encryptedCardNumber == null) {
            encryptedCardNumber = new ArrayList<BinaryObjectType>();
        }
        return this.encryptedCardNumber;
    }

    /**
     * Gets the value of the encryptedCardSecurityNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encryptedCardSecurityNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncryptedCardSecurityNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BinaryObjectType }
     * 
     * 
     */
    public List<BinaryObjectType> getEncryptedCardSecurityNumber() {
        if (encryptedCardSecurityNumber == null) {
            encryptedCardSecurityNumber = new ArrayList<BinaryObjectType>();
        }
        return this.encryptedCardSecurityNumber;
    }

    /**
     * Gets the value of the keyName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKeyName() {
        if (keyName == null) {
            keyName = new ArrayList<String>();
        }
        return this.keyName;
    }

}
