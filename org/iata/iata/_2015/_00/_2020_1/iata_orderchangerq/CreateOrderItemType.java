
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Used for selling by value (long sells) rather than selling by reference.
 * 
 * <p>Java class for CreateOrderItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateOrderItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfferItemID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ID_Type"/>
 *         &lt;element name="OfferItemTimeLimits" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}OfferItemTimeLimitsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OfferItemType" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}OfferItemTypeType" minOccurs="0"/>
 *         &lt;element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}AirlineDesigCodeType"/>
 *         &lt;element name="OwnerTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}OwnerTypeCodeType" minOccurs="0"/>
 *         &lt;element name="WebAddressURI" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}URI_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateOrderItemType", propOrder = {
    "offerItemID",
    "offerItemTimeLimits",
    "offerItemType",
    "ownerCode",
    "ownerTypeCode",
    "webAddressURI"
})
public class CreateOrderItemType {

    @XmlElement(name = "OfferItemID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerItemID;
    @XmlElement(name = "OfferItemTimeLimits")
    protected List<OfferItemTimeLimitsType> offerItemTimeLimits;
    @XmlElement(name = "OfferItemType")
    protected OfferItemTypeType offerItemType;
    @XmlElement(name = "OwnerCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerCode;
    @XmlElement(name = "OwnerTypeCode")
    @XmlSchemaType(name = "token")
    protected OwnerTypeCodeContentType ownerTypeCode;
    @XmlElement(name = "WebAddressURI")
    @XmlSchemaType(name = "anyURI")
    protected String webAddressURI;

    /**
     * Gets the value of the offerItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferItemID() {
        return offerItemID;
    }

    /**
     * Sets the value of the offerItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferItemID(String value) {
        this.offerItemID = value;
    }

    /**
     * Gets the value of the offerItemTimeLimits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerItemTimeLimits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferItemTimeLimits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferItemTimeLimitsType }
     * 
     * 
     */
    public List<OfferItemTimeLimitsType> getOfferItemTimeLimits() {
        if (offerItemTimeLimits == null) {
            offerItemTimeLimits = new ArrayList<OfferItemTimeLimitsType>();
        }
        return this.offerItemTimeLimits;
    }

    /**
     * Gets the value of the offerItemType property.
     * 
     * @return
     *     possible object is
     *     {@link OfferItemTypeType }
     *     
     */
    public OfferItemTypeType getOfferItemType() {
        return offerItemType;
    }

    /**
     * Sets the value of the offerItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferItemTypeType }
     *     
     */
    public void setOfferItemType(OfferItemTypeType value) {
        this.offerItemType = value;
    }

    /**
     * Gets the value of the ownerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerCode() {
        return ownerCode;
    }

    /**
     * Sets the value of the ownerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerCode(String value) {
        this.ownerCode = value;
    }

    /**
     * Gets the value of the ownerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link OwnerTypeCodeContentType }
     *     
     */
    public OwnerTypeCodeContentType getOwnerTypeCode() {
        return ownerTypeCode;
    }

    /**
     * Sets the value of the ownerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerTypeCodeContentType }
     *     
     */
    public void setOwnerTypeCode(OwnerTypeCodeContentType value) {
        this.ownerTypeCode = value;
    }

    /**
     * Gets the value of the webAddressURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAddressURI() {
        return webAddressURI;
    }

    /**
     * Sets the value of the webAddressURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebAddressURI(String value) {
        this.webAddressURI = value;
    }

}
