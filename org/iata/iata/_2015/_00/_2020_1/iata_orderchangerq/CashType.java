
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Any payment that is collected by the agent and settled between the Airline and the agent. Refer to IATA Resolution 728 Attachment A for full details.
 * 
 * <p>Java class for CashType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CollectionAddress" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}PostalAddressType" minOccurs="0"/>
 *         &lt;element name="ReceiptID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="SettlementData" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}SettlementDataType" minOccurs="0"/>
 *         &lt;element name="TerminalID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="TravelAgent" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}TravelAgentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashType", propOrder = {
    "collectionAddress",
    "receiptID",
    "settlementData",
    "terminalID",
    "travelAgent"
})
public class CashType {

    @XmlElement(name = "CollectionAddress")
    protected PostalAddressType collectionAddress;
    @XmlElement(name = "ReceiptID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String receiptID;
    @XmlElement(name = "SettlementData")
    protected SettlementDataType settlementData;
    @XmlElement(name = "TerminalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String terminalID;
    @XmlElement(name = "TravelAgent")
    protected TravelAgentType travelAgent;

    /**
     * Gets the value of the collectionAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddressType }
     *     
     */
    public PostalAddressType getCollectionAddress() {
        return collectionAddress;
    }

    /**
     * Sets the value of the collectionAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddressType }
     *     
     */
    public void setCollectionAddress(PostalAddressType value) {
        this.collectionAddress = value;
    }

    /**
     * Gets the value of the receiptID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptID() {
        return receiptID;
    }

    /**
     * Sets the value of the receiptID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptID(String value) {
        this.receiptID = value;
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

    /**
     * Gets the value of the terminalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalID() {
        return terminalID;
    }

    /**
     * Sets the value of the terminalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalID(String value) {
        this.terminalID = value;
    }

    /**
     * Gets the value of the travelAgent property.
     * 
     * @return
     *     possible object is
     *     {@link TravelAgentType }
     *     
     */
    public TravelAgentType getTravelAgent() {
        return travelAgent;
    }

    /**
     * Sets the value of the travelAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelAgentType }
     *     
     */
    public void setTravelAgent(TravelAgentType value) {
        this.travelAgent = value;
    }

}
