
package org.iata.iata._2015._00._2020_1.iata_orderrulesrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Policy data node detail, including an XPATH and associated Tag Name.
 * 
 * <p>Java class for PolicyNodeInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyNodeInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PathText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}TextType" minOccurs="0"/>
 *         &lt;element name="TagName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}NameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyNodeInfoType", propOrder = {
    "pathText",
    "tagName"
})
public class PolicyNodeInfoType {

    @XmlElement(name = "PathText")
    protected String pathText;
    @XmlElement(name = "TagName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tagName;

    /**
     * Gets the value of the pathText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathText() {
        return pathText;
    }

    /**
     * Sets the value of the pathText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathText(String value) {
        this.pathText = value;
    }

    /**
     * Gets the value of the tagName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * Sets the value of the tagName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagName(String value) {
        this.tagName = value;
    }

}
