
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

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
 * A single human being as distinct from a group, class, or family.
 * 
 * <p>Java class for IndividualType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddlName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}AddlNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Birthdate" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}DateType" minOccurs="0"/>
 *         &lt;element name="BirthplaceText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}TextType" minOccurs="0"/>
 *         &lt;element name="GenderCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}GenderCodeType" minOccurs="0"/>
 *         &lt;element name="GivenName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ProperNameType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="IndividualID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ProperNameType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="SuffixName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}SupplementNameType" minOccurs="0"/>
 *         &lt;element name="Surname" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ProperNameType"/>
 *         &lt;element name="TitleName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}SupplementNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualType", propOrder = {
    "addlName",
    "birthdate",
    "birthplaceText",
    "genderCode",
    "givenName",
    "individualID",
    "middleName",
    "suffixName",
    "surname",
    "titleName"
})
public class IndividualType {

    @XmlElement(name = "AddlName")
    protected List<AddlNameType> addlName;
    @XmlElement(name = "Birthdate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthdate;
    @XmlElement(name = "BirthplaceText")
    protected String birthplaceText;
    @XmlElement(name = "GenderCode")
    @XmlSchemaType(name = "token")
    protected GenderCodeContentType genderCode;
    @XmlElement(name = "GivenName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> givenName;
    @XmlElement(name = "IndividualID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String individualID;
    @XmlElement(name = "MiddleName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> middleName;
    @XmlElement(name = "SuffixName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String suffixName;
    @XmlElement(name = "Surname", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String surname;
    @XmlElement(name = "TitleName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String titleName;

    /**
     * Gets the value of the addlName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addlName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddlName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddlNameType }
     * 
     * 
     */
    public List<AddlNameType> getAddlName() {
        if (addlName == null) {
            addlName = new ArrayList<AddlNameType>();
        }
        return this.addlName;
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
     * Gets the value of the birthplaceText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthplaceText() {
        return birthplaceText;
    }

    /**
     * Sets the value of the birthplaceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthplaceText(String value) {
        this.birthplaceText = value;
    }

    /**
     * Gets the value of the genderCode property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCodeContentType }
     *     
     */
    public GenderCodeContentType getGenderCode() {
        return genderCode;
    }

    /**
     * Sets the value of the genderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCodeContentType }
     *     
     */
    public void setGenderCode(GenderCodeContentType value) {
        this.genderCode = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the givenName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGivenName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGivenName() {
        if (givenName == null) {
            givenName = new ArrayList<String>();
        }
        return this.givenName;
    }

    /**
     * Gets the value of the individualID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividualID() {
        return individualID;
    }

    /**
     * Sets the value of the individualID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndividualID(String value) {
        this.individualID = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the middleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiddleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMiddleName() {
        if (middleName == null) {
            middleName = new ArrayList<String>();
        }
        return this.middleName;
    }

    /**
     * Gets the value of the suffixName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffixName() {
        return suffixName;
    }

    /**
     * Sets the value of the suffixName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffixName(String value) {
        this.suffixName = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the titleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleName() {
        return titleName;
    }

    /**
     * Sets the value of the titleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleName(String value) {
        this.titleName = value;
    }

}
