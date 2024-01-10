
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Order Change request.
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
 *         &lt;element name="BookingRef" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}BookingRefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ChangeOrder" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ChangeOrderType" minOccurs="0"/>
 *         &lt;element name="DataLists" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}DataListsType" minOccurs="0"/>
 *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}MetadataType" minOccurs="0"/>
 *         &lt;element name="Order" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}OrderType"/>
 *         &lt;element name="OrderChangeParameters" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}ResponseParametersType" minOccurs="0"/>
 *         &lt;element name="PaxGroup" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}PaxGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentFunctions" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}PaymentFunctionsType" minOccurs="0"/>
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
    "changeOrder",
    "dataLists",
    "metadata",
    "order",
    "orderChangeParameters",
    "paxGroup",
    "paymentFunctions"
})
public class RequestType {

    @XmlElement(name = "BookingRef")
    protected List<BookingRefType> bookingRef;
    @XmlElement(name = "ChangeOrder")
    protected ChangeOrderType changeOrder;
    @XmlElement(name = "DataLists")
    protected DataListsType dataLists;
    @XmlElement(name = "Metadata")
    protected MetadataType metadata;
    @XmlElement(name = "Order", required = true)
    protected OrderType order;
    @XmlElement(name = "OrderChangeParameters")
    protected ResponseParametersType orderChangeParameters;
    @XmlElement(name = "PaxGroup")
    protected List<PaxGroupType> paxGroup;
    @XmlElement(name = "PaymentFunctions")
    protected PaymentFunctionsType paymentFunctions;

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
     * Gets the value of the changeOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeOrderType }
     *     
     */
    public ChangeOrderType getChangeOrder() {
        return changeOrder;
    }

    /**
     * Sets the value of the changeOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeOrderType }
     *     
     */
    public void setChangeOrder(ChangeOrderType value) {
        this.changeOrder = value;
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
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataType }
     *     
     */
    public MetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataType }
     *     
     */
    public void setMetadata(MetadataType value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link OrderType }
     *     
     */
    public OrderType getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType }
     *     
     */
    public void setOrder(OrderType value) {
        this.order = value;
    }

    /**
     * Gets the value of the orderChangeParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseParametersType }
     *     
     */
    public ResponseParametersType getOrderChangeParameters() {
        return orderChangeParameters;
    }

    /**
     * Sets the value of the orderChangeParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseParametersType }
     *     
     */
    public void setOrderChangeParameters(ResponseParametersType value) {
        this.orderChangeParameters = value;
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

}
