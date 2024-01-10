
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Reservation Booking Designator. A categorization used to facilitate access to inventory, application of filed fares, and to identify cabin entitlement. Identified using a single alpha character. E.g. 'J' for Business Class Premium, 'D' for Business Discounted.
 *  
 * 
 * <p>Java class for RBD_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RBD_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RBD_Code" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}RBD_CodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RBD_Type", propOrder = {
    "rbdCode"
})
public class RBDType {

    @XmlElement(name = "RBD_Code")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String rbdCode;

    /**
     * Gets the value of the rbdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRBDCode() {
        return rbdCode;
    }

    /**
     * Sets the value of the rbdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRBDCode(String value) {
        this.rbdCode = value;
    }

}
