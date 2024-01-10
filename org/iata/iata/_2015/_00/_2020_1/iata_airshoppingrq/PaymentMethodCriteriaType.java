
package org.iata.iata._2015._00._2020_1.iata_airshoppingrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Criteria for:
 *  A form of procedure for the payment of goods or services, plus any transactional information specific to the payment method other than the amount.
 * 
 * <p>Java class for PaymentMethodCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentMethodCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IATA_EasyPayCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}IATA_EasyPayType" minOccurs="0"/>
 *         &lt;element name="PaymentCardCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}PaymentCardCriteriaType" minOccurs="0"/>
 *         &lt;element name="PaymentInstrumentOwnershipCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}OwnershipTypeCodeType" minOccurs="0"/>
 *         &lt;element name="PrefLevel" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}PrefLevelType" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRQ}PaymentMethodCodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMethodCriteriaType", propOrder = {
    "iataEasyPayCriteria",
    "paymentCardCriteria",
    "paymentInstrumentOwnershipCode",
    "prefLevel",
    "typeCode"
})
public class PaymentMethodCriteriaType {

    @XmlElement(name = "IATA_EasyPayCriteria")
    protected IATAEasyPayType iataEasyPayCriteria;
    @XmlElement(name = "PaymentCardCriteria")
    protected PaymentCardCriteriaType paymentCardCriteria;
    @XmlElement(name = "PaymentInstrumentOwnershipCode")
    @XmlSchemaType(name = "token")
    protected OwnershipTypeCodeContentType paymentInstrumentOwnershipCode;
    @XmlElement(name = "PrefLevel")
    protected PrefLevelType prefLevel;
    @XmlElement(name = "TypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeCode;

    /**
     * Gets the value of the iataEasyPayCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link IATAEasyPayType }
     *     
     */
    public IATAEasyPayType getIATAEasyPayCriteria() {
        return iataEasyPayCriteria;
    }

    /**
     * Sets the value of the iataEasyPayCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link IATAEasyPayType }
     *     
     */
    public void setIATAEasyPayCriteria(IATAEasyPayType value) {
        this.iataEasyPayCriteria = value;
    }

    /**
     * Gets the value of the paymentCardCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardCriteriaType }
     *     
     */
    public PaymentCardCriteriaType getPaymentCardCriteria() {
        return paymentCardCriteria;
    }

    /**
     * Sets the value of the paymentCardCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardCriteriaType }
     *     
     */
    public void setPaymentCardCriteria(PaymentCardCriteriaType value) {
        this.paymentCardCriteria = value;
    }

    /**
     * Gets the value of the paymentInstrumentOwnershipCode property.
     * 
     * @return
     *     possible object is
     *     {@link OwnershipTypeCodeContentType }
     *     
     */
    public OwnershipTypeCodeContentType getPaymentInstrumentOwnershipCode() {
        return paymentInstrumentOwnershipCode;
    }

    /**
     * Sets the value of the paymentInstrumentOwnershipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnershipTypeCodeContentType }
     *     
     */
    public void setPaymentInstrumentOwnershipCode(OwnershipTypeCodeContentType value) {
        this.paymentInstrumentOwnershipCode = value;
    }

    /**
     * Gets the value of the prefLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PrefLevelType }
     *     
     */
    public PrefLevelType getPrefLevel() {
        return prefLevel;
    }

    /**
     * Sets the value of the prefLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefLevelType }
     *     
     */
    public void setPrefLevel(PrefLevelType value) {
        this.prefLevel = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

}
