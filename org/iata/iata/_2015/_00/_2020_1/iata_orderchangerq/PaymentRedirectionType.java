
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * contains all the instructions for the Seller on how to redirect the Payer to their hosted payment page.
 * 
 * <p>Java class for PaymentRedirectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentRedirectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RedirectionAcceptanceInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}IndType"/>
 *         &lt;element name="ReturnURI" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}URI_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentRedirectionType", propOrder = {
    "redirectionAcceptanceInd",
    "returnURI"
})
public class PaymentRedirectionType {

    @XmlElement(name = "RedirectionAcceptanceInd")
    protected boolean redirectionAcceptanceInd;
    @XmlElement(name = "ReturnURI")
    @XmlSchemaType(name = "anyURI")
    protected String returnURI;

    /**
     * Gets the value of the redirectionAcceptanceInd property.
     * 
     */
    public boolean isRedirectionAcceptanceInd() {
        return redirectionAcceptanceInd;
    }

    /**
     * Sets the value of the redirectionAcceptanceInd property.
     * 
     */
    public void setRedirectionAcceptanceInd(boolean value) {
        this.redirectionAcceptanceInd = value;
    }

    /**
     * Gets the value of the returnURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnURI() {
        return returnURI;
    }

    /**
     * Sets the value of the returnURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnURI(String value) {
        this.returnURI = value;
    }

}
