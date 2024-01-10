
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

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
 *         &lt;element name="EncryptedCardNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}BinaryObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EncryptedCardSecurityNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}BinaryObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="KeyNameText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}TextType" maxOccurs="unbounded" minOccurs="0"/>
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
    "encryptedCardNumber",
    "encryptedCardSecurityNumber",
    "keyNameText"
})
public class EncryptedDataType {

    @XmlElement(name = "EncryptedCardNumber")
    protected List<BinaryObjectType> encryptedCardNumber;
    @XmlElement(name = "EncryptedCardSecurityNumber")
    protected List<BinaryObjectType> encryptedCardSecurityNumber;
    @XmlElement(name = "KeyNameText")
    protected List<String> keyNameText;

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
     * Gets the value of the keyNameText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyNameText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyNameText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKeyNameText() {
        if (keyNameText == null) {
            keyNameText = new ArrayList<String>();
        }
        return this.keyNameText;
    }

}
