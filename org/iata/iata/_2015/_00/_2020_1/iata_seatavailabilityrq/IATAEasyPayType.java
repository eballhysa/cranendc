
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * IATA EasyPay is a payment instrument with a specific remittance mechanism.
 *  This FOP is not limited to BSP.
 * 
 * <p>Java class for IATA_EasyPayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IATA_EasyPayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}PaymentCardNumberType" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}PayCardDateTextType" minOccurs="0"/>
 *         &lt;element name="IATA_EasyPayEncryptedData" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}IATA_EasyPayEncryptedDataType" minOccurs="0"/>
 *         &lt;element name="SettlementData" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRQ}SettlementDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IATA_EasyPayType", propOrder = {
    "accountNumber",
    "expirationDate",
    "iataEasyPayEncryptedData",
    "settlementData"
})
public class IATAEasyPayType {

    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "ExpirationDate")
    protected String expirationDate;
    @XmlElement(name = "IATA_EasyPayEncryptedData")
    protected IATAEasyPayEncryptedDataType iataEasyPayEncryptedData;
    @XmlElement(name = "SettlementData")
    protected SettlementDataType settlementData;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the iataEasyPayEncryptedData property.
     * 
     * @return
     *     possible object is
     *     {@link IATAEasyPayEncryptedDataType }
     *     
     */
    public IATAEasyPayEncryptedDataType getIATAEasyPayEncryptedData() {
        return iataEasyPayEncryptedData;
    }

    /**
     * Sets the value of the iataEasyPayEncryptedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IATAEasyPayEncryptedDataType }
     *     
     */
    public void setIATAEasyPayEncryptedData(IATAEasyPayEncryptedDataType value) {
        this.iataEasyPayEncryptedData = value;
    }

    /**
     * Gets the value of the settlementData property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDataType }
     *     
     */
    public SettlementDataType getSettlementData() {
        return settlementData;
    }

    /**
     * Sets the value of the settlementData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDataType }
     *     
     */
    public void setSettlementData(SettlementDataType value) {
        this.settlementData = value;
    }

}
