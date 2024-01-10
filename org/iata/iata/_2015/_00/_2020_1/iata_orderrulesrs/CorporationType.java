
package org.iata.iata._2015._00._2020_1.iata_orderrulesrs;

import java.math.BigDecimal;
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
 * A company or group of people authorized to act as a single entity (legally a person) and recognized as such in law.
 * 
 * <p>Java class for CorporationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorporationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}ContactInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CorporateCodeText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}TextType" minOccurs="0"/>
 *         &lt;element name="CorporateID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="IATA_Number" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}NumberType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}NameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporationType", propOrder = {
    "contactInfo",
    "corporateCodeText",
    "corporateID",
    "iataNumber",
    "name"
})
public class CorporationType {

    @XmlElement(name = "ContactInfo")
    protected List<ContactInfoType> contactInfo;
    @XmlElement(name = "CorporateCodeText")
    protected String corporateCodeText;
    @XmlElement(name = "CorporateID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String corporateID;
    @XmlElement(name = "IATA_Number")
    protected BigDecimal iataNumber;
    @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;

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
     * Gets the value of the corporateCodeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateCodeText() {
        return corporateCodeText;
    }

    /**
     * Sets the value of the corporateCodeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateCodeText(String value) {
        this.corporateCodeText = value;
    }

    /**
     * Gets the value of the corporateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateID() {
        return corporateID;
    }

    /**
     * Sets the value of the corporateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateID(String value) {
        this.corporateID = value;
    }

    /**
     * Gets the value of the iataNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIATANumber() {
        return iataNumber;
    }

    /**
     * Sets the value of the iataNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIATANumber(BigDecimal value) {
        this.iataNumber = value;
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

}
