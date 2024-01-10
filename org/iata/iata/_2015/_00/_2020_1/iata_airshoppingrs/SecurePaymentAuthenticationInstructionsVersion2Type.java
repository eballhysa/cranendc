
package org.iata.iata._2015._00._2020_1.iata_airshoppingrs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Data returned from the Directory Server/ACS containing the PAReq and the ACS URL that enable the cardholder to authenticate. Applicable for 3D-Secure.
 * 
 * <p>Java class for SecurePaymentAuthenticationInstructionsVersion2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurePaymentAuthenticationInstructionsVersion2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcquirerBankIdentificationNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}NumberType" minOccurs="0"/>
 *         &lt;element name="ChallengeMandateInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}IndType"/>
 *         &lt;element name="RequestorURI" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}URI_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurePaymentAuthenticationInstructionsVersion2Type", propOrder = {
    "acquirerBankIdentificationNumber",
    "challengeMandateInd",
    "requestorURI"
})
public class SecurePaymentAuthenticationInstructionsVersion2Type {

    @XmlElement(name = "AcquirerBankIdentificationNumber")
    protected BigDecimal acquirerBankIdentificationNumber;
    @XmlElement(name = "ChallengeMandateInd")
    protected boolean challengeMandateInd;
    @XmlElement(name = "RequestorURI")
    @XmlSchemaType(name = "anyURI")
    protected String requestorURI;

    /**
     * Gets the value of the acquirerBankIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcquirerBankIdentificationNumber() {
        return acquirerBankIdentificationNumber;
    }

    /**
     * Sets the value of the acquirerBankIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcquirerBankIdentificationNumber(BigDecimal value) {
        this.acquirerBankIdentificationNumber = value;
    }

    /**
     * Gets the value of the challengeMandateInd property.
     * 
     */
    public boolean isChallengeMandateInd() {
        return challengeMandateInd;
    }

    /**
     * Sets the value of the challengeMandateInd property.
     * 
     */
    public void setChallengeMandateInd(boolean value) {
        this.challengeMandateInd = value;
    }

    /**
     * Gets the value of the requestorURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestorURI() {
        return requestorURI;
    }

    /**
     * Sets the value of the requestorURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestorURI(String value) {
        this.requestorURI = value;
    }

}
