
package org.iata.iata._2015._00._2020_1.iata_offerpricers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="CollectionAddress" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}PostalAddressType" minOccurs="0"/>
 *         &lt;element name="SettlementData" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}SettlementDataType" minOccurs="0"/>
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
    "settlementData"
})
public class CashType {

    @XmlElement(name = "CollectionAddress")
    protected PostalAddressType collectionAddress;
    @XmlElement(name = "SettlementData")
    protected SettlementDataType settlementData;

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
