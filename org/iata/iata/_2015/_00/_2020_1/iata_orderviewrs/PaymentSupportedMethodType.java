
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

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
 * <p>Java class for PaymentSupportedMethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentSupportedMethodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderAssociation" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}OrderAssociationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OtherPaymentMethod" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}OtherPaymentMethodType" minOccurs="0"/>
 *         &lt;element name="PaymentCard" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}PaymentCard2Type" minOccurs="0"/>
 *         &lt;element name="PaymentRedirection" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}PaymentRedirectionType" minOccurs="0"/>
 *         &lt;element name="SurchargeInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}SurchargeInfoType" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}PaymentMethodCodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentSupportedMethodType", propOrder = {
    "orderAssociation",
    "otherPaymentMethod",
    "paymentCard",
    "paymentRedirection",
    "surchargeInfo",
    "typeCode"
})
public class PaymentSupportedMethodType {

    @XmlElement(name = "OrderAssociation")
    protected List<OrderAssociationType> orderAssociation;
    @XmlElement(name = "OtherPaymentMethod")
    protected OtherPaymentMethodType otherPaymentMethod;
    @XmlElement(name = "PaymentCard")
    protected PaymentCard2Type paymentCard;
    @XmlElement(name = "PaymentRedirection")
    protected PaymentRedirectionType paymentRedirection;
    @XmlElement(name = "SurchargeInfo")
    protected SurchargeInfoType surchargeInfo;
    @XmlElement(name = "TypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeCode;

    /**
     * Gets the value of the orderAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderAssociationType }
     * 
     * 
     */
    public List<OrderAssociationType> getOrderAssociation() {
        if (orderAssociation == null) {
            orderAssociation = new ArrayList<OrderAssociationType>();
        }
        return this.orderAssociation;
    }

    /**
     * Gets the value of the otherPaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link OtherPaymentMethodType }
     *     
     */
    public OtherPaymentMethodType getOtherPaymentMethod() {
        return otherPaymentMethod;
    }

    /**
     * Sets the value of the otherPaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherPaymentMethodType }
     *     
     */
    public void setOtherPaymentMethod(OtherPaymentMethodType value) {
        this.otherPaymentMethod = value;
    }

    /**
     * Gets the value of the paymentCard property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard2Type }
     *     
     */
    public PaymentCard2Type getPaymentCard() {
        return paymentCard;
    }

    /**
     * Sets the value of the paymentCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard2Type }
     *     
     */
    public void setPaymentCard(PaymentCard2Type value) {
        this.paymentCard = value;
    }

    /**
     * Gets the value of the paymentRedirection property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRedirectionType }
     *     
     */
    public PaymentRedirectionType getPaymentRedirection() {
        return paymentRedirection;
    }

    /**
     * Sets the value of the paymentRedirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRedirectionType }
     *     
     */
    public void setPaymentRedirection(PaymentRedirectionType value) {
        this.paymentRedirection = value;
    }

    /**
     * Gets the value of the surchargeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SurchargeInfoType }
     *     
     */
    public SurchargeInfoType getSurchargeInfo() {
        return surchargeInfo;
    }

    /**
     * Sets the value of the surchargeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurchargeInfoType }
     *     
     */
    public void setSurchargeInfo(SurchargeInfoType value) {
        this.surchargeInfo = value;
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
