
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

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
 * Information related to publicizing a product, organization, or venture so as to increase sales or public awareness.
 * 
 * <p>Java class for PromotionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OwnerName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ProperNameType" minOccurs="0"/>
 *         &lt;element name="PaxRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PromotionID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ID_Type"/>
 *         &lt;element name="PromotionIssuer" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}PromotionIssuerType" minOccurs="0"/>
 *         &lt;element name="Remark" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}RemarkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}URI_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionType", propOrder = {
    "ownerName",
    "paxRefID",
    "promotionID",
    "promotionIssuer",
    "remark",
    "url"
})
public class PromotionType {

    @XmlElement(name = "OwnerName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerName;
    @XmlElement(name = "PaxRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> paxRefID;
    @XmlElement(name = "PromotionID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String promotionID;
    @XmlElement(name = "PromotionIssuer")
    protected PromotionIssuerType promotionIssuer;
    @XmlElement(name = "Remark")
    protected List<RemarkType> remark;
    @XmlElement(name = "URL")
    @XmlSchemaType(name = "anyURI")
    protected String url;

    /**
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Gets the value of the paxRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPaxRefID() {
        if (paxRefID == null) {
            paxRefID = new ArrayList<String>();
        }
        return this.paxRefID;
    }

    /**
     * Gets the value of the promotionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionID() {
        return promotionID;
    }

    /**
     * Sets the value of the promotionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionID(String value) {
        this.promotionID = value;
    }

    /**
     * Gets the value of the promotionIssuer property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionIssuerType }
     *     
     */
    public PromotionIssuerType getPromotionIssuer() {
        return promotionIssuer;
    }

    /**
     * Sets the value of the promotionIssuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionIssuerType }
     *     
     */
    public void setPromotionIssuer(PromotionIssuerType value) {
        this.promotionIssuer = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemarkType }
     * 
     * 
     */
    public List<RemarkType> getRemark() {
        if (remark == null) {
            remark = new ArrayList<RemarkType>();
        }
        return this.remark;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

}
