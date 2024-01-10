
package org.iata.iata._2015._00._2020_1.iata_orderretrieverq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type of compartment of an aircraft, offering specific services (e.g. business class, economy). 
 * 
 * <p>Java class for CabinTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CabinTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}CabinTypeCodeType" minOccurs="0"/>
 *         &lt;element name="CabinTypeName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}NameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinTypeType", propOrder = {
    "cabinTypeCode",
    "cabinTypeName"
})
public class CabinTypeType {

    @XmlElement(name = "CabinTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cabinTypeCode;
    @XmlElement(name = "CabinTypeName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cabinTypeName;

    /**
     * Gets the value of the cabinTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinTypeCode() {
        return cabinTypeCode;
    }

    /**
     * Sets the value of the cabinTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinTypeCode(String value) {
        this.cabinTypeCode = value;
    }

    /**
     * Gets the value of the cabinTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinTypeName() {
        return cabinTypeName;
    }

    /**
     * Sets the value of the cabinTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinTypeName(String value) {
        this.cabinTypeName = value;
    }

}
