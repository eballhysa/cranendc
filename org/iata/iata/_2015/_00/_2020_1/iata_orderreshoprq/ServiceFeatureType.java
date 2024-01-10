
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Bilaterally agreed mechanism to deliver service specific information to the Seller as defined by the Airline.
 *  This defines a further level of definition for a service taxonomy code. 
 *  e.g
 *  meal (TC 03F0) -> breakfast(03F1) - eggs(03F2),toast(03F3) 
 * 
 * <p>Java class for ServiceFeatureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceFeatureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodesetCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="CodesetNameCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="ValueText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceFeatureType", propOrder = {
    "codesetCode",
    "codesetNameCode",
    "valueText"
})
public class ServiceFeatureType {

    @XmlElement(name = "CodesetCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codesetCode;
    @XmlElement(name = "CodesetNameCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codesetNameCode;
    @XmlElement(name = "ValueText")
    protected String valueText;

    /**
     * Gets the value of the codesetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodesetCode() {
        return codesetCode;
    }

    /**
     * Sets the value of the codesetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodesetCode(String value) {
        this.codesetCode = value;
    }

    /**
     * Gets the value of the codesetNameCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodesetNameCode() {
        return codesetNameCode;
    }

    /**
     * Sets the value of the codesetNameCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodesetNameCode(String value) {
        this.codesetNameCode = value;
    }

    /**
     * Gets the value of the valueText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueText() {
        return valueText;
    }

    /**
     * Sets the value of the valueText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueText(String value) {
        this.valueText = value;
    }

}
