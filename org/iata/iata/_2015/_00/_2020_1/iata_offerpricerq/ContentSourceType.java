
package org.iata.iata._2015._00._2020_1.iata_offerpricerq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Indicates the owner of specific content found in a message, located by XPATH.
 * 
 * <p>Java class for ContentSourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentSourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContentOwner" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}ContentOwnerType"/>
 *         &lt;element name="NodePathText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRQ}TextType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentSourceType", propOrder = {
    "contentOwner",
    "nodePathText"
})
public class ContentSourceType {

    @XmlElement(name = "ContentOwner", required = true)
    protected ContentOwnerType contentOwner;
    @XmlElement(name = "NodePathText", required = true)
    protected String nodePathText;

    /**
     * Gets the value of the contentOwner property.
     * 
     * @return
     *     possible object is
     *     {@link ContentOwnerType }
     *     
     */
    public ContentOwnerType getContentOwner() {
        return contentOwner;
    }

    /**
     * Sets the value of the contentOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentOwnerType }
     *     
     */
    public void setContentOwner(ContentOwnerType value) {
        this.contentOwner = value;
    }

    /**
     * Gets the value of the nodePathText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodePathText() {
        return nodePathText;
    }

    /**
     * Sets the value of the nodePathText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodePathText(String value) {
        this.nodePathText = value;
    }

}
