
package org.iata.iata._2015._00._2020_1.iata_airshoppingrq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Filtering criteria based on discount programs.
 * 
 * <p>Java class for ProgramCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgramCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyIndexText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         &lt;element name="MemberStatusText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}NameType" minOccurs="0"/>
 *         &lt;element name="PrePaidCertificate" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}PrePaidCertificateType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProgamContract" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}ProgamContractType" minOccurs="0"/>
 *         &lt;element name="ProgramAccount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}ProgramAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProgramOwner" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}ProgramOwnerType"/>
 *         &lt;element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}CodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgramCriteriaType", propOrder = {
    "companyIndexText",
    "memberStatusText",
    "name",
    "prePaidCertificate",
    "progamContract",
    "programAccount",
    "programOwner",
    "typeCode"
})
public class ProgramCriteriaType {

    @XmlElement(name = "CompanyIndexText")
    protected String companyIndexText;
    @XmlElement(name = "MemberStatusText")
    protected String memberStatusText;
    @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlElement(name = "PrePaidCertificate")
    protected List<PrePaidCertificateType> prePaidCertificate;
    @XmlElement(name = "ProgamContract")
    protected ProgamContractType progamContract;
    @XmlElement(name = "ProgramAccount")
    protected List<ProgramAccountType> programAccount;
    @XmlElement(name = "ProgramOwner", required = true)
    protected ProgramOwnerType programOwner;
    @XmlElement(name = "TypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeCode;

    /**
     * Gets the value of the companyIndexText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyIndexText() {
        return companyIndexText;
    }

    /**
     * Sets the value of the companyIndexText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyIndexText(String value) {
        this.companyIndexText = value;
    }

    /**
     * Gets the value of the memberStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberStatusText() {
        return memberStatusText;
    }

    /**
     * Sets the value of the memberStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberStatusText(String value) {
        this.memberStatusText = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the prePaidCertificate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prePaidCertificate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrePaidCertificate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrePaidCertificateType }
     * 
     * 
     */
    public List<PrePaidCertificateType> getPrePaidCertificate() {
        if (prePaidCertificate == null) {
            prePaidCertificate = new ArrayList<PrePaidCertificateType>();
        }
        return this.prePaidCertificate;
    }

    /**
     * Gets the value of the progamContract property.
     * 
     * @return
     *     possible object is
     *     {@link ProgamContractType }
     *     
     */
    public ProgamContractType getProgamContract() {
        return progamContract;
    }

    /**
     * Sets the value of the progamContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgamContractType }
     *     
     */
    public void setProgamContract(ProgamContractType value) {
        this.progamContract = value;
    }

    /**
     * Gets the value of the programAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the programAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgramAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProgramAccountType }
     * 
     * 
     */
    public List<ProgramAccountType> getProgramAccount() {
        if (programAccount == null) {
            programAccount = new ArrayList<ProgramAccountType>();
        }
        return this.programAccount;
    }

    /**
     * Gets the value of the programOwner property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramOwnerType }
     *     
     */
    public ProgramOwnerType getProgramOwner() {
        return programOwner;
    }

    /**
     * Sets the value of the programOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramOwnerType }
     *     
     */
    public void setProgramOwner(ProgramOwnerType value) {
        this.programOwner = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

}
