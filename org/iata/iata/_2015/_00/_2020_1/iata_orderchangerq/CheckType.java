
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A written order instructing a financial institution to pay immediately on demand a specified amount of money from the check writer's account to the person named on the check or, if a specific person is not named, to whoever bears the check to the institution for payment.
 * 
 * <p>Java class for CheckType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CheckNumber" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}NumberType" minOccurs="0"/>
 *         &lt;element name="PayeeName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ProperNameType" minOccurs="0"/>
 *         &lt;element name="SignedDate" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}DateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckType", propOrder = {
    "checkNumber",
    "payeeName",
    "signedDate"
})
public class CheckType {

    @XmlElement(name = "CheckNumber")
    protected BigDecimal checkNumber;
    @XmlElement(name = "PayeeName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String payeeName;
    @XmlElement(name = "SignedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar signedDate;

    /**
     * Gets the value of the checkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCheckNumber(BigDecimal value) {
        this.checkNumber = value;
    }

    /**
     * Gets the value of the payeeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeName() {
        return payeeName;
    }

    /**
     * Sets the value of the payeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeName(String value) {
        this.payeeName = value;
    }

    /**
     * Gets the value of the signedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignedDate() {
        return signedDate;
    }

    /**
     * Sets the value of the signedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignedDate(XMLGregorianCalendar value) {
        this.signedDate = value;
    }

}
