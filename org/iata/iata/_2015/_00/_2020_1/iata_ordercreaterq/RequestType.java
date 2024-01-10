
package org.iata.iata._2015._00._2020_1.iata_ordercreaterq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Order Create request.
 * 
 * <p>Java class for RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingRef" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}BookingRefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Commission" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}CommissionType" minOccurs="0"/>
 *         &lt;element name="CreateOrder" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}CreateOrderType"/>
 *         &lt;element name="DataLists" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}DataListsType" minOccurs="0"/>
 *         &lt;element name="OrderCreateParameters" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}ResponseParametersType" minOccurs="0"/>
 *         &lt;element name="PaxGroup" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}PaxGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentFunctions" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}PaymentFunctionsType" minOccurs="0"/>
 *         &lt;element name="Promotion" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderCreateRQ}PromotionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType", propOrder = {
    "bookingRef",
    "commission",
    "createOrder",
    "dataLists",
    "orderCreateParameters",
    "paxGroup",
    "paymentFunctions",
    "promotion"
})
public class RequestType {

    @XmlElement(name = "BookingRef")
    protected List<BookingRefType> bookingRef;
    @XmlElement(name = "Commission")
    protected CommissionType commission;
    @XmlElement(name = "CreateOrder", required = true)
    protected CreateOrderType createOrder;
    @XmlElement(name = "DataLists")
    protected DataListsType dataLists;
    @XmlElement(name = "OrderCreateParameters")
    protected ResponseParametersType orderCreateParameters;
    @XmlElement(name = "PaxGroup")
    protected List<PaxGroupType> paxGroup;
    @XmlElement(name = "PaymentFunctions")
    protected PaymentFunctionsType paymentFunctions;
    @XmlElement(name = "Promotion")
    protected List<PromotionType> promotion;

    /**
     * Gets the value of the bookingRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingRefType }
     * 
     * 
     */
    public List<BookingRefType> getBookingRef() {
        if (bookingRef == null) {
            bookingRef = new ArrayList<BookingRefType>();
        }
        return this.bookingRef;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType }
     *     
     */
    public CommissionType getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType }
     *     
     */
    public void setCommission(CommissionType value) {
        this.commission = value;
    }

    /**
     * Gets the value of the createOrder property.
     * 
     * @return
     *     possible object is
     *     {@link CreateOrderType }
     *     
     */
    public CreateOrderType getCreateOrder() {
        return createOrder;
    }

    /**
     * Sets the value of the createOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateOrderType }
     *     
     */
    public void setCreateOrder(CreateOrderType value) {
        this.createOrder = value;
    }

    /**
     * Gets the value of the dataLists property.
     * 
     * @return
     *     possible object is
     *     {@link DataListsType }
     *     
     */
    public DataListsType getDataLists() {
        return dataLists;
    }

    /**
     * Sets the value of the dataLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataListsType }
     *     
     */
    public void setDataLists(DataListsType value) {
        this.dataLists = value;
    }

    /**
     * Gets the value of the orderCreateParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseParametersType }
     *     
     */
    public ResponseParametersType getOrderCreateParameters() {
        return orderCreateParameters;
    }

    /**
     * Sets the value of the orderCreateParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseParametersType }
     *     
     */
    public void setOrderCreateParameters(ResponseParametersType value) {
        this.orderCreateParameters = value;
    }

    /**
     * Gets the value of the paxGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxGroupType }
     * 
     * 
     */
    public List<PaxGroupType> getPaxGroup() {
        if (paxGroup == null) {
            paxGroup = new ArrayList<PaxGroupType>();
        }
        return this.paxGroup;
    }

    /**
     * Gets the value of the paymentFunctions property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFunctionsType }
     *     
     */
    public PaymentFunctionsType getPaymentFunctions() {
        return paymentFunctions;
    }

    /**
     * Sets the value of the paymentFunctions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFunctionsType }
     *     
     */
    public void setPaymentFunctions(PaymentFunctionsType value) {
        this.paymentFunctions = value;
    }

    /**
     * Gets the value of the promotion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionType }
     * 
     * 
     */
    public List<PromotionType> getPromotion() {
        if (promotion == null) {
            promotion = new ArrayList<PromotionType>();
        }
        return this.promotion;
    }

}
