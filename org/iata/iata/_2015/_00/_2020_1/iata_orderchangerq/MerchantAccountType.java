
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A person or company that sells goods or services.
 *  
 * 
 * <p>Java class for MerchantAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MerchantAccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Carrier" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CarrierType" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CountryType" minOccurs="0"/>
 *         &lt;element name="MerchantCategoryCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="MerchantID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="MerchantName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}NameType" minOccurs="0"/>
 *         &lt;element name="MerchantRiskText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MerchantAccountType", propOrder = {
    "carrier",
    "country",
    "merchantCategoryCode",
    "merchantID",
    "merchantName",
    "merchantRiskText"
})
public class MerchantAccountType {

    @XmlElement(name = "Carrier")
    protected CarrierType carrier;
    @XmlElement(name = "Country")
    protected CountryType country;
    @XmlElement(name = "MerchantCategoryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String merchantCategoryCode;
    @XmlElement(name = "MerchantID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String merchantID;
    @XmlElement(name = "MerchantName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String merchantName;
    @XmlElement(name = "MerchantRiskText")
    protected String merchantRiskText;

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     */
    public void setCarrier(CarrierType value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountry(CountryType value) {
        this.country = value;
    }

    /**
     * Gets the value of the merchantCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    /**
     * Sets the value of the merchantCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCategoryCode(String value) {
        this.merchantCategoryCode = value;
    }

    /**
     * Gets the value of the merchantID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantID() {
        return merchantID;
    }

    /**
     * Sets the value of the merchantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantID(String value) {
        this.merchantID = value;
    }

    /**
     * Gets the value of the merchantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * Sets the value of the merchantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantName(String value) {
        this.merchantName = value;
    }

    /**
     * Gets the value of the merchantRiskText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantRiskText() {
        return merchantRiskText;
    }

    /**
     * Sets the value of the merchantRiskText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantRiskText(String value) {
        this.merchantRiskText = value;
    }

}
