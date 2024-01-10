
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

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
 * A form of procedure for the payment of goods or services, plus any transactional information specific to the payment method other than the amount.
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
 *         &lt;element name="IATA_EasyPayCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}IATA_EasyPayType" minOccurs="0"/>
 *         &lt;element name="OrderAssociation" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}OrderAssociationType" minOccurs="0"/>
 *         &lt;element name="PaymentCardCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}PaymentCardCriteriaType" minOccurs="0"/>
 *         &lt;element name="PaymentInstrumentOwnershipCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}OwnershipTypeCodeType" minOccurs="0"/>
 *         &lt;element name="PrefLevel" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}PrefLevelType" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}PaymentMethodCodeType" maxOccurs="unbounded"/>
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
    "orderAssociation",
    "paymentCardCriteria",
    "paymentInstrumentOwnershipCode",
    "prefLevel",
    "typeCode"
})
public class PaymentMethodCriteriaType {

    @XmlElement(name = "IATA_EasyPayCriteria")
    protected IATAEasyPayType iataEasyPayCriteria;
    @XmlElement(name = "OrderAssociation")
    protected OrderAssociationType orderAssociation;
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
    protected List<String> typeCode;

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
     * Gets the value of the orderAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link OrderAssociationType }
     *     
     */
    public OrderAssociationType getOrderAssociation() {
        return orderAssociation;
    }

    /**
     * Sets the value of the orderAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderAssociationType }
     *     
     */
    public void setOrderAssociation(OrderAssociationType value) {
        this.orderAssociation = value;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTypeCode() {
        if (typeCode == null) {
            typeCode = new ArrayList<String>();
        }
        return this.typeCode;
    }

}
