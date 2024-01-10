
package org.iata.iata._2015._00._2020_1.iata_orderrulesrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * An account or representation of the certain or major aspects, characteristics, or features of a person, object, or event.
 * 
 * <p>Java class for DescType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CategorizationText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}TextType" minOccurs="0"/>
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}TextType" minOccurs="0"/>
 *         &lt;element name="MarkupStyleText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}TextType" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}URI_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescType", propOrder = {
    "categorizationText",
    "descText",
    "markupStyleText",
    "url"
})
public class DescType {

    @XmlElement(name = "CategorizationText")
    protected String categorizationText;
    @XmlElement(name = "DescText")
    protected String descText;
    @XmlElement(name = "MarkupStyleText")
    protected String markupStyleText;
    @XmlElement(name = "URL")
    @XmlSchemaType(name = "anyURI")
    protected String url;

    /**
     * Gets the value of the categorizationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategorizationText() {
        return categorizationText;
    }

    /**
     * Sets the value of the categorizationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategorizationText(String value) {
        this.categorizationText = value;
    }

    /**
     * Gets the value of the descText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescText() {
        return descText;
    }

    /**
     * Sets the value of the descText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescText(String value) {
        this.descText = value;
    }

    /**
     * Gets the value of the markupStyleText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkupStyleText() {
        return markupStyleText;
    }

    /**
     * Sets the value of the markupStyleText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkupStyleText(String value) {
        this.markupStyleText = value;
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
