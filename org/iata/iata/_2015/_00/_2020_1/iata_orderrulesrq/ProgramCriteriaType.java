
package org.iata.iata._2015._00._2020_1.iata_orderrulesrq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Discount program specific filter criteria for shopping requests.
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
 *         &lt;element name="Carrier" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}CarrierType" minOccurs="0"/>
 *         &lt;element name="CompanyIndexText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}TextType" minOccurs="0"/>
 *         &lt;element name="ProgamContract" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}ProgamContractType" minOccurs="0"/>
 *         &lt;element name="ProgramAccount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRQ}ProgramAccountType" maxOccurs="unbounded" minOccurs="0"/>
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
    "carrier",
    "companyIndexText",
    "progamContract",
    "programAccount"
})
public class ProgramCriteriaType {

    @XmlElement(name = "Carrier")
    protected CarrierType carrier;
    @XmlElement(name = "CompanyIndexText")
    protected String companyIndexText;
    @XmlElement(name = "ProgamContract")
    protected ProgamContractType progamContract;
    @XmlElement(name = "ProgramAccount")
    protected List<ProgramAccountType> programAccount;

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

}
