
package org.iata.iata._2015._00._2020_1.iata_orderretrieverq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * System in which a corporation's travel agency bills employees for their business travel. The employee must then submit an expense accounting and be reimbursed by the corporation.
 * 
 * <p>Java class for DirectBillType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectBillType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}ContactInfoType" minOccurs="0"/>
 *         &lt;element name="ContactRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="OrgID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="OrgName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}NameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectBillType", propOrder = {
    "contactInfo",
    "contactRefID",
    "orgID",
    "orgName"
})
public class DirectBillType {

    @XmlElement(name = "ContactInfo")
    protected ContactInfoType contactInfo;
    @XmlElement(name = "ContactRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String contactRefID;
    @XmlElement(name = "OrgID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orgID;
    @XmlElement(name = "OrgName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orgName;

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType }
     *     
     */
    public ContactInfoType getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType }
     *     
     */
    public void setContactInfo(ContactInfoType value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the contactRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactRefID() {
        return contactRefID;
    }

    /**
     * Sets the value of the contactRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactRefID(String value) {
        this.contactRefID = value;
    }

    /**
     * Gets the value of the orgID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgID() {
        return orgID;
    }

    /**
     * Sets the value of the orgID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgID(String value) {
        this.orgID = value;
    }

    /**
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgName(String value) {
        this.orgName = value;
    }

}
