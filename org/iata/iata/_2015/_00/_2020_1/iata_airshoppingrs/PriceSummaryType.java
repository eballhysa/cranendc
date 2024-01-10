
package org.iata.iata._2015._00._2020_1.iata_airshoppingrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The amount of money expected, required, or given in payment for something .
 * 
 * <p>Java class for PriceSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoyaltyUnitAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}AmountType" minOccurs="0"/>
 *         &lt;element name="LoyaltyUnitName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}NameType" minOccurs="0"/>
 *         &lt;element name="TotalAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceSummaryType", propOrder = {
    "loyaltyUnitAmount",
    "loyaltyUnitName",
    "totalAmount"
})
public class PriceSummaryType {

    @XmlElement(name = "LoyaltyUnitAmount")
    protected AmountType loyaltyUnitAmount;
    @XmlElement(name = "LoyaltyUnitName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String loyaltyUnitName;
    @XmlElement(name = "TotalAmount")
    protected AmountType totalAmount;

    /**
     * Gets the value of the loyaltyUnitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLoyaltyUnitAmount() {
        return loyaltyUnitAmount;
    }

    /**
     * Sets the value of the loyaltyUnitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLoyaltyUnitAmount(AmountType value) {
        this.loyaltyUnitAmount = value;
    }

    /**
     * Gets the value of the loyaltyUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyUnitName() {
        return loyaltyUnitName;
    }

    /**
     * Sets the value of the loyaltyUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyUnitName(String value) {
        this.loyaltyUnitName = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalAmount(AmountType value) {
        this.totalAmount = value;
    }

}
