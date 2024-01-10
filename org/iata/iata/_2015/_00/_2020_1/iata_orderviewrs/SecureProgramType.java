
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Contains enrolment information of the Payment Card.
 *  
 *  e.g. Verified by Visa.
 * 
 * <p>Java class for SecureProgramType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecureProgramType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnrollmentStatusText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TextType" minOccurs="0"/>
 *         &lt;element name="SecurePaymentProgramName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}NameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecureProgramType", propOrder = {
    "enrollmentStatusText",
    "securePaymentProgramName"
})
public class SecureProgramType {

    @XmlElement(name = "EnrollmentStatusText")
    protected String enrollmentStatusText;
    @XmlElement(name = "SecurePaymentProgramName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String securePaymentProgramName;

    /**
     * Gets the value of the enrollmentStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollmentStatusText() {
        return enrollmentStatusText;
    }

    /**
     * Sets the value of the enrollmentStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollmentStatusText(String value) {
        this.enrollmentStatusText = value;
    }

    /**
     * Gets the value of the securePaymentProgramName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurePaymentProgramName() {
        return securePaymentProgramName;
    }

    /**
     * Sets the value of the securePaymentProgramName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurePaymentProgramName(String value) {
        this.securePaymentProgramName = value;
    }

}
