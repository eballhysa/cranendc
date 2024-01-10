
package org.iata.iata._2015._00._2020_1.iata_orderrulesrs;

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
 * The electronic or geographic address which a party has provided as the contact channel. For example, contact email, contact postal address, contact phone number.
 * 
 * <p>Java class for ContactInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactInfoID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="ContactPurposeText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}TextType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="ContactRefusedInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}IndType" minOccurs="0"/>
 *         &lt;element name="IndividualRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}ID_Type" minOccurs="0"/>
 *         &lt;element name="PaxSegmentRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RelationshipToPax" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRulesRS}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfoType", propOrder = {
    "contactInfoID",
    "contactPurposeText",
    "contactRefusedInd",
    "individualRefID",
    "paxSegmentRefID",
    "relationshipToPax"
})
public class ContactInfoType {

    @XmlElement(name = "ContactInfoID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String contactInfoID;
    @XmlElement(name = "ContactPurposeText")
    protected List<String> contactPurposeText;
    @XmlElement(name = "ContactRefusedInd")
    protected Boolean contactRefusedInd;
    @XmlElement(name = "IndividualRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String individualRefID;
    @XmlElement(name = "PaxSegmentRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> paxSegmentRefID;
    @XmlElement(name = "RelationshipToPax")
    protected String relationshipToPax;

    /**
     * Gets the value of the contactInfoID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactInfoID() {
        return contactInfoID;
    }

    /**
     * Sets the value of the contactInfoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactInfoID(String value) {
        this.contactInfoID = value;
    }

    /**
     * Gets the value of the contactPurposeText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPurposeText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPurposeText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContactPurposeText() {
        if (contactPurposeText == null) {
            contactPurposeText = new ArrayList<String>();
        }
        return this.contactPurposeText;
    }

    /**
     * Gets the value of the contactRefusedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContactRefusedInd() {
        return contactRefusedInd;
    }

    /**
     * Sets the value of the contactRefusedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContactRefusedInd(Boolean value) {
        this.contactRefusedInd = value;
    }

    /**
     * Gets the value of the individualRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividualRefID() {
        return individualRefID;
    }

    /**
     * Sets the value of the individualRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndividualRefID(String value) {
        this.individualRefID = value;
    }

    /**
     * Gets the value of the paxSegmentRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxSegmentRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxSegmentRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPaxSegmentRefID() {
        if (paxSegmentRefID == null) {
            paxSegmentRefID = new ArrayList<String>();
        }
        return this.paxSegmentRefID;
    }

    /**
     * Gets the value of the relationshipToPax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipToPax() {
        return relationshipToPax;
    }

    /**
     * Sets the value of the relationshipToPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipToPax(String value) {
        this.relationshipToPax = value;
    }

}
