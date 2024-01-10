
package org.iata.iata._2015._00._2020_1.iata_airshoppingrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * contains all information for the result of 3D-Secure authentication process.
 * 
 * <p>Java class for SecurePaymentVersion2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurePaymentVersion2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthenticationMerchantName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}NameType" minOccurs="0"/>
 *         &lt;element name="AuthenticationValue" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *         &lt;element name="DirectoryServerTrxID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="ElectronicCommerceInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *         &lt;element name="ProgramProtocolText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *         &lt;element name="TrxStatusReasonText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *         &lt;element name="TrxStatusText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}TextType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurePaymentVersion2Type", propOrder = {
    "authenticationMerchantName",
    "authenticationValue",
    "directoryServerTrxID",
    "electronicCommerceInd",
    "programProtocolText",
    "trxStatusReasonText",
    "trxStatusText"
})
public class SecurePaymentVersion2Type {

    @XmlElement(name = "AuthenticationMerchantName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String authenticationMerchantName;
    @XmlElement(name = "AuthenticationValue")
    protected String authenticationValue;
    @XmlElement(name = "DirectoryServerTrxID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String directoryServerTrxID;
    @XmlElement(name = "ElectronicCommerceInd")
    protected String electronicCommerceInd;
    @XmlElement(name = "ProgramProtocolText")
    protected String programProtocolText;
    @XmlElement(name = "TrxStatusReasonText")
    protected String trxStatusReasonText;
    @XmlElement(name = "TrxStatusText", required = true)
    protected String trxStatusText;

    /**
     * Gets the value of the authenticationMerchantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationMerchantName() {
        return authenticationMerchantName;
    }

    /**
     * Sets the value of the authenticationMerchantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationMerchantName(String value) {
        this.authenticationMerchantName = value;
    }

    /**
     * Gets the value of the authenticationValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationValue() {
        return authenticationValue;
    }

    /**
     * Sets the value of the authenticationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationValue(String value) {
        this.authenticationValue = value;
    }

    /**
     * Gets the value of the directoryServerTrxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectoryServerTrxID() {
        return directoryServerTrxID;
    }

    /**
     * Sets the value of the directoryServerTrxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectoryServerTrxID(String value) {
        this.directoryServerTrxID = value;
    }

    /**
     * Gets the value of the electronicCommerceInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectronicCommerceInd() {
        return electronicCommerceInd;
    }

    /**
     * Sets the value of the electronicCommerceInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectronicCommerceInd(String value) {
        this.electronicCommerceInd = value;
    }

    /**
     * Gets the value of the programProtocolText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramProtocolText() {
        return programProtocolText;
    }

    /**
     * Sets the value of the programProtocolText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramProtocolText(String value) {
        this.programProtocolText = value;
    }

    /**
     * Gets the value of the trxStatusReasonText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrxStatusReasonText() {
        return trxStatusReasonText;
    }

    /**
     * Sets the value of the trxStatusReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrxStatusReasonText(String value) {
        this.trxStatusReasonText = value;
    }

    /**
     * Gets the value of the trxStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrxStatusText() {
        return trxStatusText;
    }

    /**
     * Sets the value of the trxStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrxStatusText(String value) {
        this.trxStatusText = value;
    }

}
