
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An account set up for a customer within a rewards program which holds funds on behalf of that customer.
 * 
 * <p>Java class for LoyaltyProgramAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoyaltyProgramAccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CodeType" minOccurs="0"/>
 *         &lt;element name="Alliance" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}AllianceType" minOccurs="0"/>
 *         &lt;element name="Carrier" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CarrierType" minOccurs="0"/>
 *         &lt;element name="LoyaltyProgram" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}LoyaltyProgramType"/>
 *         &lt;element name="ProgramCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CodeType" minOccurs="0"/>
 *         &lt;element name="ProgramName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}NameType" minOccurs="0"/>
 *         &lt;element name="ProviderName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}ProperNameType" minOccurs="0"/>
 *         &lt;element name="SignInID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TextType" minOccurs="0"/>
 *         &lt;element name="TierCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CodeType" minOccurs="0"/>
 *         &lt;element name="TierName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TextType" minOccurs="0"/>
 *         &lt;element name="TierPriorityText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TextType" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}URI_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyProgramAccountType", propOrder = {
    "accountNumber",
    "alliance",
    "carrier",
    "loyaltyProgram",
    "programCode",
    "programName",
    "providerName",
    "signInID",
    "tierCode",
    "tierName",
    "tierPriorityText",
    "url"
})
public class LoyaltyProgramAccountType {

    @XmlElement(name = "AccountNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String accountNumber;
    @XmlElement(name = "Alliance")
    protected AllianceType alliance;
    @XmlElement(name = "Carrier")
    protected CarrierType carrier;
    @XmlElement(name = "LoyaltyProgram", required = true)
    protected LoyaltyProgramType loyaltyProgram;
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
    @XmlElement(name = "SignInID")
    protected String signInID;
    @XmlElement(name = "TierCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tierCode;
    @XmlElement(name = "TierName")
    protected String tierName;
    @XmlElement(name = "TierPriorityText")
    protected String tierPriorityText;
    @XmlElement(name = "URL")
    @XmlSchemaType(name = "anyURI")
    protected String url;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

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
     * Gets the value of the loyaltyProgram property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyProgramType }
     *     
     */
    public LoyaltyProgramType getLoyaltyProgram() {
        return loyaltyProgram;
    }

    /**
     * Sets the value of the loyaltyProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyProgramType }
     *     
     */
    public void setLoyaltyProgram(LoyaltyProgramType value) {
        this.loyaltyProgram = value;
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
     * Gets the value of the signInID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignInID() {
        return signInID;
    }

    /**
     * Sets the value of the signInID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignInID(String value) {
        this.signInID = value;
    }

    /**
     * Gets the value of the tierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierCode() {
        return tierCode;
    }

    /**
     * Sets the value of the tierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierCode(String value) {
        this.tierCode = value;
    }

    /**
     * Gets the value of the tierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierName() {
        return tierName;
    }

    /**
     * Sets the value of the tierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierName(String value) {
        this.tierName = value;
    }

    /**
     * Gets the value of the tierPriorityText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierPriorityText() {
        return tierPriorityText;
    }

    /**
     * Sets the value of the tierPriorityText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierPriorityText(String value) {
        this.tierPriorityText = value;
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
