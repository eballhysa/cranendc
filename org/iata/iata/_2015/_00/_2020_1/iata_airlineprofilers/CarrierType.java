
package org.iata.iata._2015._00._2020_1.iata_airlineprofilers;

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
 * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
 *  
 * 
 * <p>Java class for CarrierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarrierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirlineDesigCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}AirlineDesigCodeType"/>
 *         &lt;element name="ContactInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}ContactInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DuplicateDesigInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}IndType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}NameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierType", propOrder = {
    "airlineDesigCode",
    "contactInfo",
    "duplicateDesigInd",
    "name"
})
public class CarrierType {

    @XmlElement(name = "AirlineDesigCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String airlineDesigCode;
    @XmlElement(name = "ContactInfo")
    protected List<ContactInfoType> contactInfo;
    @XmlElement(name = "DuplicateDesigInd")
    protected Boolean duplicateDesigInd;
    @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;

    /**
     * Gets the value of the airlineDesigCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineDesigCode() {
        return airlineDesigCode;
    }

    /**
     * Sets the value of the airlineDesigCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineDesigCode(String value) {
        this.airlineDesigCode = value;
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
     * Gets the value of the duplicateDesigInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDuplicateDesigInd() {
        return duplicateDesigInd;
    }

    /**
     * Sets the value of the duplicateDesigInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDuplicateDesigInd(Boolean value) {
        this.duplicateDesigInd = value;
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
