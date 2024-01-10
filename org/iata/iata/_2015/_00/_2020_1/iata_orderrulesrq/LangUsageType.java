
package org.iata.iata._2015._00._2020_1.iata_orderrulesrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Language Code representation.
 * 
 * <p>Java class for LangUsageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LangUsageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LangCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}LangCodeType"/>
 *         &lt;element name="LangUsageTypeText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LangUsageType", propOrder = {
    "langCode",
    "langUsageTypeText"
})
public class LangUsageType {

    @XmlElement(name = "LangCode", required = true)
    protected String langCode;
    @XmlElement(name = "LangUsageTypeText")
    protected String langUsageTypeText;

    /**
     * Gets the value of the langCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangCode() {
        return langCode;
    }

    /**
     * Sets the value of the langCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangCode(String value) {
        this.langCode = value;
    }

    /**
     * Gets the value of the langUsageTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangUsageTypeText() {
        return langUsageTypeText;
    }

    /**
     * Sets the value of the langUsageTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangUsageTypeText(String value) {
        this.langUsageTypeText = value;
    }

}
