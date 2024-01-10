
package org.iata.iata._2015._00._2020_1.iata_airshoppingrs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used by Seller if 3D-Secure is supported. Seller can specify which version of 3D-Secure is supported. Note: 3D-Secure context should be used when the Customer-Seller interaction type is web and/or mobile.
 * 
 * <p>Java class for SecurePayerAuthenticationVersionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurePayerAuthenticationVersionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardEnrollmentVersionText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SupportedVersionText" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}TextType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurePayerAuthenticationVersionType", propOrder = {
    "cardEnrollmentVersionText",
    "supportedVersionText"
})
public class SecurePayerAuthenticationVersionType {

    @XmlElement(name = "CardEnrollmentVersionText")
    protected List<String> cardEnrollmentVersionText;
    @XmlElement(name = "SupportedVersionText", required = true)
    protected List<String> supportedVersionText;

    /**
     * Gets the value of the cardEnrollmentVersionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardEnrollmentVersionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardEnrollmentVersionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCardEnrollmentVersionText() {
        if (cardEnrollmentVersionText == null) {
            cardEnrollmentVersionText = new ArrayList<String>();
        }
        return this.cardEnrollmentVersionText;
    }

    /**
     * Gets the value of the supportedVersionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedVersionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedVersionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSupportedVersionText() {
        if (supportedVersionText == null) {
            supportedVersionText = new ArrayList<String>();
        }
        return this.supportedVersionText;
    }

}
