
package org.iata.iata._2015._00._2020_1.iata_airshoppingrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AugmentationPoint" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}AugmentationPoint" minOccurs="0"/>
 *         &lt;element name="MessageDoc" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}MessageDocType" minOccurs="0"/>
 *         &lt;element name="Party" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}PartyType"/>
 *         &lt;element name="PayloadAttributes" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}IATA_PayloadStandardAttributesType" minOccurs="0"/>
 *         &lt;element name="POS" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}POS_Type" minOccurs="0"/>
 *         &lt;element name="Request" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}RequestType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "augmentationPoint",
    "messageDoc",
    "party",
    "payloadAttributes",
    "pos",
    "request"
})
@XmlRootElement(name = "IATA_AirShoppingRQ")
public class IATAAirShoppingRQ {

    @XmlElement(name = "AugmentationPoint")
    protected AugmentationPoint augmentationPoint;
    @XmlElement(name = "MessageDoc")
    protected MessageDocType messageDoc;
    @XmlElement(name = "Party", required = true)
    protected PartyType party;
    @XmlElement(name = "PayloadAttributes")
    protected IATAPayloadStandardAttributesType payloadAttributes;
    @XmlElement(name = "POS")
    protected POSType pos;
    @XmlElement(name = "Request", required = true)
    protected RequestType request;

    /**
     * Gets the value of the augmentationPoint property.
     * 
     * @return
     *     possible object is
     *     {@link AugmentationPoint }
     *     
     */
    public AugmentationPoint getAugmentationPoint() {
        return augmentationPoint;
    }

    /**
     * Sets the value of the augmentationPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link AugmentationPoint }
     *     
     */
    public void setAugmentationPoint(AugmentationPoint value) {
        this.augmentationPoint = value;
    }

    /**
     * Gets the value of the messageDoc property.
     * 
     * @return
     *     possible object is
     *     {@link MessageDocType }
     *     
     */
    public MessageDocType getMessageDoc() {
        return messageDoc;
    }

    /**
     * Sets the value of the messageDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageDocType }
     *     
     */
    public void setMessageDoc(MessageDocType value) {
        this.messageDoc = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setParty(PartyType value) {
        this.party = value;
    }

    /**
     * Gets the value of the payloadAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link IATAPayloadStandardAttributesType }
     *     
     */
    public IATAPayloadStandardAttributesType getPayloadAttributes() {
        return payloadAttributes;
    }

    /**
     * Sets the value of the payloadAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link IATAPayloadStandardAttributesType }
     *     
     */
    public void setPayloadAttributes(IATAPayloadStandardAttributesType value) {
        this.payloadAttributes = value;
    }

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link POSType }
     *     
     */
    public POSType getPOS() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSType }
     *     
     */
    public void setPOS(POSType value) {
        this.pos = value;
    }

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequest(RequestType value) {
        this.request = value;
    }

}
