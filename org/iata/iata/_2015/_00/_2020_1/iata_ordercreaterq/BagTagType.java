
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A small piece of paper, fabric, plastic or similar material attached to an bag and giving information about it.
 * 
 * <p>Java class for BagTagType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BagTagType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BagTagID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}BagTagID_Type" minOccurs="0"/>
 *         &lt;element name="IssuingCarrier" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}CarrierType" minOccurs="0"/>
 *         &lt;element name="TagExpediteInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}IndType" minOccurs="0"/>
 *         &lt;element name="TagFallbackInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}IndType" minOccurs="0"/>
 *         &lt;element name="TagInterlineInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}IndType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BagTagType", propOrder = {
    "bagTagID",
    "issuingCarrier",
    "tagExpediteInd",
    "tagFallbackInd",
    "tagInterlineInd"
})
public class BagTagType {

    @XmlElement(name = "BagTagID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bagTagID;
    @XmlElement(name = "IssuingCarrier")
    protected CarrierType issuingCarrier;
    @XmlElement(name = "TagExpediteInd")
    protected Boolean tagExpediteInd;
    @XmlElement(name = "TagFallbackInd")
    protected Boolean tagFallbackInd;
    @XmlElement(name = "TagInterlineInd")
    protected Boolean tagInterlineInd;

    /**
     * Gets the value of the bagTagID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagTagID() {
        return bagTagID;
    }

    /**
     * Sets the value of the bagTagID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagTagID(String value) {
        this.bagTagID = value;
    }

    /**
     * Gets the value of the issuingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getIssuingCarrier() {
        return issuingCarrier;
    }

    /**
     * Sets the value of the issuingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     */
    public void setIssuingCarrier(CarrierType value) {
        this.issuingCarrier = value;
    }

    /**
     * Gets the value of the tagExpediteInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTagExpediteInd() {
        return tagExpediteInd;
    }

    /**
     * Sets the value of the tagExpediteInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTagExpediteInd(Boolean value) {
        this.tagExpediteInd = value;
    }

    /**
     * Gets the value of the tagFallbackInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTagFallbackInd() {
        return tagFallbackInd;
    }

    /**
     * Sets the value of the tagFallbackInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTagFallbackInd(Boolean value) {
        this.tagFallbackInd = value;
    }

    /**
     * Gets the value of the tagInterlineInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTagInterlineInd() {
        return tagInterlineInd;
    }

    /**
     * Sets the value of the tagInterlineInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTagInterlineInd(Boolean value) {
        this.tagInterlineInd = value;
    }

}
