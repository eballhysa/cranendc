
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This is used for additional name types
 *  
 *  The structure consists of a generic proper name with associated type
 *  example
 *  Name - Smith
 *  Name Type Code : Fathers Surname
 *  Name - Park
 *  Name Type Code : Mothers Surname
 * 
 * <p>Java class for AddlNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddlNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ProperNameType" minOccurs="0"/>
 *         &lt;element name="NameTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}AddlNameTypeCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddlNameType", propOrder = {
    "name",
    "nameTypeCode"
})
public class AddlNameType {

    @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlElement(name = "NameTypeCode")
    @XmlSchemaType(name = "token")
    protected AddlNameTypeCodeContentType nameTypeCode;

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
     * Gets the value of the nameTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link AddlNameTypeCodeContentType }
     *     
     */
    public AddlNameTypeCodeContentType getNameTypeCode() {
        return nameTypeCode;
    }

    /**
     * Sets the value of the nameTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddlNameTypeCodeContentType }
     *     
     */
    public void setNameTypeCode(AddlNameTypeCodeContentType value) {
        this.nameTypeCode = value;
    }

}
