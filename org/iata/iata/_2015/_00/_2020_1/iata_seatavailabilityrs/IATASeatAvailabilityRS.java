
package org.iata.iata._2015._00._2020_1.iata_seatavailabilityrs;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;choice>
 *           &lt;element name="Error" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}ErrorType" maxOccurs="unbounded"/>
 *           &lt;element name="Response" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}ResponseType"/>
 *         &lt;/choice>
 *         &lt;element name="AugmentationPoint" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}AugmentationPoint" minOccurs="0"/>
 *         &lt;element name="MessageDoc" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}MessageDocType" minOccurs="0"/>
 *         &lt;element name="PayloadAttributes" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_SeatAvailabilityRS}IATA_PayloadStandardAttributesType" minOccurs="0"/>
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
    "error",
    "response",
    "augmentationPoint",
    "messageDoc",
    "payloadAttributes"
})
@XmlRootElement(name = "IATA_SeatAvailabilityRS")
public class IATASeatAvailabilityRS {

    @XmlElement(name = "Error")
    protected List<ErrorType> error;
    @XmlElement(name = "Response")
    protected ResponseType response;
    @XmlElement(name = "AugmentationPoint")
    protected AugmentationPoint augmentationPoint;
    @XmlElement(name = "MessageDoc")
    protected MessageDocType messageDoc;
    @XmlElement(name = "PayloadAttributes")
    protected IATAPayloadStandardAttributesType payloadAttributes;

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorType }
     * 
     * 
     */
    public List<ErrorType> getError() {
        if (error == null) {
            error = new ArrayList<ErrorType>();
        }
        return this.error;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType }
     *     
     */
    public ResponseType getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType }
     *     
     */
    public void setResponse(ResponseType value) {
        this.response = value;
    }

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

}
