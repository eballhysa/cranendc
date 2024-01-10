
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * IATA EasyPay-1 is a payment instrument with a specific remittance mechanism.
 *  This FOP is not limited to BSP. 
 * 
 * <p>Java class for IATA_EasyPay1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IATA_EasyPay1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApprovalCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="IATA_EasyPayEncryptedData" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}IATA_EasyPayEncryptedDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IATA_EasyPay1Type", propOrder = {
    "approvalCode",
    "iataEasyPayEncryptedData"
})
public class IATAEasyPay1Type {

    @XmlElement(name = "ApprovalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String approvalCode;
    @XmlElement(name = "IATA_EasyPayEncryptedData")
    protected IATAEasyPayEncryptedDataType iataEasyPayEncryptedData;

    /**
     * Gets the value of the approvalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalCode() {
        return approvalCode;
    }

    /**
     * Sets the value of the approvalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalCode(String value) {
        this.approvalCode = value;
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

}
