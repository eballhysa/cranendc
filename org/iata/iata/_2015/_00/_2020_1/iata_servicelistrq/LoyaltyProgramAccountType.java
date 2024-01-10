
package org.iata.iata._2015._00._2020_1.iata_servicelistrq;

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
 *         &lt;element name="AccountNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="Alliance" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}AllianceType" minOccurs="0"/>
 *         &lt;element name="Carrier" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}CarrierType" minOccurs="0"/>
 *         &lt;element name="LoyaltyProgram" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}LoyaltyProgramType"/>
 *         &lt;element name="SignInID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}TextType" minOccurs="0"/>
 *         &lt;element name="TierCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="TierName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}TextType" minOccurs="0"/>
 *         &lt;element name="TierPriority" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_ServiceListRQ}TextType" minOccurs="0"/>
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
    "signInID",
    "tierCode",
    "tierName",
    "tierPriority"
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
    @XmlElement(name = "SignInID")
    protected String signInID;
    @XmlElement(name = "TierCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tierCode;
    @XmlElement(name = "TierName")
    protected String tierName;
    @XmlElement(name = "TierPriority")
    protected String tierPriority;

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
     * Gets the value of the tierPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierPriority() {
        return tierPriority;
    }

    /**
     * Sets the value of the tierPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierPriority(String value) {
        this.tierPriority = value;
    }

}
