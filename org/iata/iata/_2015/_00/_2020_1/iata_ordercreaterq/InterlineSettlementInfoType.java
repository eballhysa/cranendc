
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

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
 * Information related to the value of a product or service as it pertains to interline transactions.
 * 
 * <p>Java class for InterlineSettlementInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterlineSettlementInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Fee" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}FeeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MethodCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}SettlementMethodCodeType"/>
 *         &lt;element name="SettlementAmount" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}AmountType"/>
 *         &lt;element name="Surcharge" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}SurchargeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}TaxType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaxableInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}IndType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterlineSettlementInfoType", propOrder = {
    "fee",
    "methodCode",
    "settlementAmount",
    "surcharge",
    "tax",
    "taxableInd"
})
public class InterlineSettlementInfoType {

    @XmlElement(name = "Fee")
    protected List<FeeType> fee;
    @XmlElement(name = "MethodCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String methodCode;
    @XmlElement(name = "SettlementAmount", required = true)
    protected AmountType settlementAmount;
    @XmlElement(name = "Surcharge")
    protected List<SurchargeType> surcharge;
    @XmlElement(name = "Tax")
    protected List<TaxType> tax;
    @XmlElement(name = "TaxableInd")
    protected Boolean taxableInd;

    /**
     * Gets the value of the fee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeType }
     * 
     * 
     */
    public List<FeeType> getFee() {
        if (fee == null) {
            fee = new ArrayList<FeeType>();
        }
        return this.fee;
    }

    /**
     * Gets the value of the methodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodCode() {
        return methodCode;
    }

    /**
     * Sets the value of the methodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodCode(String value) {
        this.methodCode = value;
    }

    /**
     * Gets the value of the settlementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSettlementAmount() {
        return settlementAmount;
    }

    /**
     * Sets the value of the settlementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSettlementAmount(AmountType value) {
        this.settlementAmount = value;
    }

    /**
     * Gets the value of the surcharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surcharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurcharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurchargeType }
     * 
     * 
     */
    public List<SurchargeType> getSurcharge() {
        if (surcharge == null) {
            surcharge = new ArrayList<SurchargeType>();
        }
        return this.surcharge;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxType }
     * 
     * 
     */
    public List<TaxType> getTax() {
        if (tax == null) {
            tax = new ArrayList<TaxType>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the taxableInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxableInd() {
        return taxableInd;
    }

    /**
     * Sets the value of the taxableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxableInd(Boolean value) {
        this.taxableInd = value;
    }

}
