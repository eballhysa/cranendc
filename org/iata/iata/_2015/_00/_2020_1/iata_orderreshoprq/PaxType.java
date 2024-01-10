
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Any person except members of the crew carried or to be carried with the consent of the carrier, on board of any transport vehicle such as aircraft, train, bus, ship. Holds the attributes specific to a one booking, from shopping to fulfillment.
 * 
 * <p>Java class for PaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgeMeasure" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}MeasureType" minOccurs="0"/>
 *         &lt;element name="Birthdate" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}DateType" minOccurs="0"/>
 *         &lt;element name="CitizenshipCountryCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="ContactInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}ContactInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Employer" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}EmployerType" minOccurs="0"/>
 *         &lt;element name="FOID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}FOID_Type" minOccurs="0"/>
 *         &lt;element name="IdentityDoc" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}IdentityDocType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Individual" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}IndividualType" minOccurs="0"/>
 *         &lt;element name="LangUsage" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}LangUsageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LoyaltyProgramAccount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}LoyaltyProgramAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaxID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}ID_Type"/>
 *         &lt;element name="PaxRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="ProfileConsentInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}IndType" minOccurs="0"/>
 *         &lt;element name="ProfileID_Text" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}TextType" minOccurs="0"/>
 *         &lt;element name="PTC" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}IATA_PTC_CodeType" minOccurs="0"/>
 *         &lt;element name="RedressCase" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}RedressCaseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Remark" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}RemarkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ResidenceCountryCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}CountryCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxType", propOrder = {
    "ageMeasure",
    "birthdate",
    "citizenshipCountryCode",
    "contactInfo",
    "employer",
    "foid",
    "identityDoc",
    "individual",
    "langUsage",
    "loyaltyProgramAccount",
    "paxID",
    "paxRefID",
    "profileConsentInd",
    "profileIDText",
    "ptc",
    "redressCase",
    "remark",
    "residenceCountryCode"
})
public class PaxType {

    @XmlElement(name = "AgeMeasure")
    protected MeasureType ageMeasure;
    @XmlElement(name = "Birthdate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthdate;
    @XmlElement(name = "CitizenshipCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String citizenshipCountryCode;
    @XmlElement(name = "ContactInfo")
    protected List<ContactInfoType> contactInfo;
    @XmlElement(name = "Employer")
    protected EmployerType employer;
    @XmlElement(name = "FOID")
    protected FOIDType foid;
    @XmlElement(name = "IdentityDoc")
    protected List<IdentityDocType> identityDoc;
    @XmlElement(name = "Individual")
    protected IndividualType individual;
    @XmlElement(name = "LangUsage")
    protected List<LangUsageType> langUsage;
    @XmlElement(name = "LoyaltyProgramAccount")
    protected List<LoyaltyProgramAccountType> loyaltyProgramAccount;
    @XmlElement(name = "PaxID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxID;
    @XmlElement(name = "PaxRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxRefID;
    @XmlElement(name = "ProfileConsentInd")
    protected Boolean profileConsentInd;
    @XmlElement(name = "ProfileID_Text")
    protected String profileIDText;
    @XmlElement(name = "PTC")
    protected String ptc;
    @XmlElement(name = "RedressCase")
    protected List<RedressCaseType> redressCase;
    @XmlElement(name = "Remark")
    protected List<RemarkType> remark;
    @XmlElement(name = "ResidenceCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String residenceCountryCode;

    /**
     * Gets the value of the ageMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAgeMeasure() {
        return ageMeasure;
    }

    /**
     * Sets the value of the ageMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAgeMeasure(MeasureType value) {
        this.ageMeasure = value;
    }

    /**
     * Gets the value of the birthdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the value of the birthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthdate(XMLGregorianCalendar value) {
        this.birthdate = value;
    }

    /**
     * Gets the value of the citizenshipCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenshipCountryCode() {
        return citizenshipCountryCode;
    }

    /**
     * Sets the value of the citizenshipCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenshipCountryCode(String value) {
        this.citizenshipCountryCode = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInfoType }
     * 
     * 
     */
    public List<ContactInfoType> getContactInfo() {
        if (contactInfo == null) {
            contactInfo = new ArrayList<ContactInfoType>();
        }
        return this.contactInfo;
    }

    /**
     * Gets the value of the employer property.
     * 
     * @return
     *     possible object is
     *     {@link EmployerType }
     *     
     */
    public EmployerType getEmployer() {
        return employer;
    }

    /**
     * Sets the value of the employer property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployerType }
     *     
     */
    public void setEmployer(EmployerType value) {
        this.employer = value;
    }

    /**
     * Gets the value of the foid property.
     * 
     * @return
     *     possible object is
     *     {@link FOIDType }
     *     
     */
    public FOIDType getFOID() {
        return foid;
    }

    /**
     * Sets the value of the foid property.
     * 
     * @param value
     *     allowed object is
     *     {@link FOIDType }
     *     
     */
    public void setFOID(FOIDType value) {
        this.foid = value;
    }

    /**
     * Gets the value of the identityDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identityDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentityDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentityDocType }
     * 
     * 
     */
    public List<IdentityDocType> getIdentityDoc() {
        if (identityDoc == null) {
            identityDoc = new ArrayList<IdentityDocType>();
        }
        return this.identityDoc;
    }

    /**
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualType }
     *     
     */
    public IndividualType getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualType }
     *     
     */
    public void setIndividual(IndividualType value) {
        this.individual = value;
    }

    /**
     * Gets the value of the langUsage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the langUsage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLangUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LangUsageType }
     * 
     * 
     */
    public List<LangUsageType> getLangUsage() {
        if (langUsage == null) {
            langUsage = new ArrayList<LangUsageType>();
        }
        return this.langUsage;
    }

    /**
     * Gets the value of the loyaltyProgramAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyProgramAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyProgramAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyProgramAccountType }
     * 
     * 
     */
    public List<LoyaltyProgramAccountType> getLoyaltyProgramAccount() {
        if (loyaltyProgramAccount == null) {
            loyaltyProgramAccount = new ArrayList<LoyaltyProgramAccountType>();
        }
        return this.loyaltyProgramAccount;
    }

    /**
     * Gets the value of the paxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxID() {
        return paxID;
    }

    /**
     * Sets the value of the paxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxID(String value) {
        this.paxID = value;
    }

    /**
     * Gets the value of the paxRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxRefID() {
        return paxRefID;
    }

    /**
     * Sets the value of the paxRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxRefID(String value) {
        this.paxRefID = value;
    }

    /**
     * Gets the value of the profileConsentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProfileConsentInd() {
        return profileConsentInd;
    }

    /**
     * Sets the value of the profileConsentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProfileConsentInd(Boolean value) {
        this.profileConsentInd = value;
    }

    /**
     * Gets the value of the profileIDText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileIDText() {
        return profileIDText;
    }

    /**
     * Sets the value of the profileIDText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileIDText(String value) {
        this.profileIDText = value;
    }

    /**
     * Gets the value of the ptc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTC() {
        return ptc;
    }

    /**
     * Sets the value of the ptc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTC(String value) {
        this.ptc = value;
    }

    /**
     * Gets the value of the redressCase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the redressCase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedressCase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RedressCaseType }
     * 
     * 
     */
    public List<RedressCaseType> getRedressCase() {
        if (redressCase == null) {
            redressCase = new ArrayList<RedressCaseType>();
        }
        return this.redressCase;
    }

    /**
     * Gets the value of the remark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemarkType }
     * 
     * 
     */
    public List<RemarkType> getRemark() {
        if (remark == null) {
            remark = new ArrayList<RemarkType>();
        }
        return this.remark;
    }

    /**
     * Gets the value of the residenceCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenceCountryCode() {
        return residenceCountryCode;
    }

    /**
     * Sets the value of the residenceCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenceCountryCode(String value) {
        this.residenceCountryCode = value;
    }

}
