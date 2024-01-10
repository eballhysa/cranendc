
package org.iata.iata._2015._00._2020_1.iata_airshoppingrs;

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
 * Disclosure information specifically related to baggage.
 * 
 * <p>Java class for BaggageDisclosureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageDisclosureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaggageDisclosureID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="BDC" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}BDC_Type" minOccurs="0"/>
 *         &lt;element name="CheckInChargesInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}IndType" minOccurs="0"/>
 *         &lt;element name="CommercialAgreementID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="DeferralInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}IndType" minOccurs="0"/>
 *         &lt;element name="Desc" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}DescType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FixedPrePaidInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}IndType" minOccurs="0"/>
 *         &lt;element name="RuleTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}BagDisclosureRuleTypeCodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageDisclosureType", propOrder = {
    "baggageDisclosureID",
    "bdc",
    "checkInChargesInd",
    "commercialAgreementID",
    "deferralInd",
    "desc",
    "descText",
    "fixedPrePaidInd",
    "ruleTypeCode"
})
public class BaggageDisclosureType {

    @XmlElement(name = "BaggageDisclosureID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String baggageDisclosureID;
    @XmlElement(name = "BDC")
    protected BDCType bdc;
    @XmlElement(name = "CheckInChargesInd")
    protected Boolean checkInChargesInd;
    @XmlElement(name = "CommercialAgreementID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String commercialAgreementID;
    @XmlElement(name = "DeferralInd")
    protected Boolean deferralInd;
    @XmlElement(name = "Desc")
    protected List<DescType> desc;
    @XmlElement(name = "DescText")
    protected List<String> descText;
    @XmlElement(name = "FixedPrePaidInd")
    protected Boolean fixedPrePaidInd;
    @XmlElement(name = "RuleTypeCode", required = true)
    @XmlSchemaType(name = "token")
    protected BagDisclosureRuleTypeCodeContentType ruleTypeCode;

    /**
     * Gets the value of the baggageDisclosureID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageDisclosureID() {
        return baggageDisclosureID;
    }

    /**
     * Sets the value of the baggageDisclosureID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaggageDisclosureID(String value) {
        this.baggageDisclosureID = value;
    }

    /**
     * Gets the value of the bdc property.
     * 
     * @return
     *     possible object is
     *     {@link BDCType }
     *     
     */
    public BDCType getBDC() {
        return bdc;
    }

    /**
     * Sets the value of the bdc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BDCType }
     *     
     */
    public void setBDC(BDCType value) {
        this.bdc = value;
    }

    /**
     * Gets the value of the checkInChargesInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckInChargesInd() {
        return checkInChargesInd;
    }

    /**
     * Sets the value of the checkInChargesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckInChargesInd(Boolean value) {
        this.checkInChargesInd = value;
    }

    /**
     * Gets the value of the commercialAgreementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialAgreementID() {
        return commercialAgreementID;
    }

    /**
     * Sets the value of the commercialAgreementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialAgreementID(String value) {
        this.commercialAgreementID = value;
    }

    /**
     * Gets the value of the deferralInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeferralInd() {
        return deferralInd;
    }

    /**
     * Sets the value of the deferralInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeferralInd(Boolean value) {
        this.deferralInd = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescType }
     * 
     * 
     */
    public List<DescType> getDesc() {
        if (desc == null) {
            desc = new ArrayList<DescType>();
        }
        return this.desc;
    }

    /**
     * Gets the value of the descText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescText() {
        if (descText == null) {
            descText = new ArrayList<String>();
        }
        return this.descText;
    }

    /**
     * Gets the value of the fixedPrePaidInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFixedPrePaidInd() {
        return fixedPrePaidInd;
    }

    /**
     * Sets the value of the fixedPrePaidInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixedPrePaidInd(Boolean value) {
        this.fixedPrePaidInd = value;
    }

    /**
     * Gets the value of the ruleTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BagDisclosureRuleTypeCodeContentType }
     *     
     */
    public BagDisclosureRuleTypeCodeContentType getRuleTypeCode() {
        return ruleTypeCode;
    }

    /**
     * Sets the value of the ruleTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagDisclosureRuleTypeCodeContentType }
     *     
     */
    public void setRuleTypeCode(BagDisclosureRuleTypeCodeContentType value) {
        this.ruleTypeCode = value;
    }

}
