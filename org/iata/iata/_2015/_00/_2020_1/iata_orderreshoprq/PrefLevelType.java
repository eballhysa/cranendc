
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Information supporting a preference including preference level code (e.g. Preferred, Exclude, etc.).
 * 
 * <p>Java class for PrefLevelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrefLevelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrefContextText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}TextType" minOccurs="0"/>
 *         &lt;element name="PrefLevelCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}PrefLevelCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrefLevelType", propOrder = {
    "prefContextText",
    "prefLevelCode"
})
public class PrefLevelType {

    @XmlElement(name = "PrefContextText")
    protected String prefContextText;
    @XmlElement(name = "PrefLevelCode")
    @XmlSchemaType(name = "string")
    protected PrefLevelCodeContentType prefLevelCode;

    /**
     * Gets the value of the prefContextText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefContextText() {
        return prefContextText;
    }

    /**
     * Sets the value of the prefContextText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefContextText(String value) {
        this.prefContextText = value;
    }

    /**
     * Gets the value of the prefLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrefLevelCodeContentType }
     *     
     */
    public PrefLevelCodeContentType getPrefLevelCode() {
        return prefLevelCode;
    }

    /**
     * Sets the value of the prefLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefLevelCodeContentType }
     *     
     */
    public void setPrefLevelCode(PrefLevelCodeContentType value) {
        this.prefLevelCode = value;
    }

}
