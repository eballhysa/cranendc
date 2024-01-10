
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="ApprovalCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CodeType" minOccurs="0"/>
 *         &lt;element name="SettlementData" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}SettlementDataType" minOccurs="0"/>
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
    "approvalCode",
    "settlementData"
})
public class IATAEasyPayType {

    @XmlElement(name = "ApprovalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String approvalCode;
    @XmlElement(name = "SettlementData")
    protected SettlementDataType settlementData;

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
