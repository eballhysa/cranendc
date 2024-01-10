
package org.iata.iata._2015._00._2020_1.iata_offerpricers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A rewards program offered by a company to customers who frequently make purchases, which may give a customer advanced access to new products, special sales coupons or free merchandise.
 * 
 * <p>Java class for LoyaltyProgramType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoyaltyProgramType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Alliance" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}AllianceType" minOccurs="0"/>
 *         &lt;element name="Carrier" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}CarrierType" minOccurs="0"/>
 *         &lt;element name="ProgramCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}CodeType" minOccurs="0"/>
 *         &lt;element name="ProgramName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}NameType" minOccurs="0"/>
 *         &lt;element name="ProviderName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}ProperNameType" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OfferPriceRS}URI_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyProgramType", propOrder = {
    "alliance",
    "carrier",
    "programCode",
    "programName",
    "providerName",
    "url"
})
public class LoyaltyProgramType {

    @XmlElement(name = "Alliance")
    protected AllianceType alliance;
    @XmlElement(name = "Carrier")
    protected CarrierType carrier;
    @XmlElement(name = "ProgramCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String programCode;
    @XmlElement(name = "ProgramName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String programName;
    @XmlElement(name = "ProviderName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String providerName;
    @XmlElement(name = "URL")
    @XmlSchemaType(name = "anyURI")
    protected String url;

    /**
     * Gets the value of the alliance property.
     * 
     * @return
     *     possible object is
     *     {@link AllianceType }
     *     
     */
    public AllianceType getAlliance() {
        return alliance;
    }

    /**
     * Sets the value of the alliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllianceType }
     *     
     */
    public void setAlliance(AllianceType value) {
        this.alliance = value;
    }

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
     * Gets the value of the programCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramCode() {
        return programCode;
    }

    /**
     * Sets the value of the programCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramCode(String value) {
        this.programCode = value;
    }

    /**
     * Gets the value of the programName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * Sets the value of the programName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramName(String value) {
        this.programName = value;
    }

    /**
     * Gets the value of the providerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the value of the providerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderName(String value) {
        this.providerName = value;
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
