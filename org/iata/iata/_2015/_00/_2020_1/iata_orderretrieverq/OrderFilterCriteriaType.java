
package org.iata.iata._2015._00._2020_1.iata_orderretrieverq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Order list request filter criteria.
 * 
 * <p>Java class for OrderFilterCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderFilterCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingRefFilterCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}BookingInfoType" minOccurs="0"/>
 *         &lt;element name="FlightFilterCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}FlightFilterCriteriaType" minOccurs="0"/>
 *         &lt;element name="Order" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}OrderType" minOccurs="0"/>
 *         &lt;element name="PaxFilterCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}PaxType" minOccurs="0"/>
 *         &lt;element name="PaxGroupFilterCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}PaxGroupType" minOccurs="0"/>
 *         &lt;element name="PaymentFilterCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}PaymentMethodType" minOccurs="0"/>
 *         &lt;element name="ServiceFilterCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}ServiceType" minOccurs="0"/>
 *         &lt;element name="TicketDocFilterCriteria" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderRetrieveRQ}TicketDocFilterCriteriaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderFilterCriteriaType", propOrder = {
    "bookingRefFilterCriteria",
    "flightFilterCriteria",
    "order",
    "paxFilterCriteria",
    "paxGroupFilterCriteria",
    "paymentFilterCriteria",
    "serviceFilterCriteria",
    "ticketDocFilterCriteria"
})
public class OrderFilterCriteriaType {

    @XmlElement(name = "BookingRefFilterCriteria")
    protected BookingInfoType bookingRefFilterCriteria;
    @XmlElement(name = "FlightFilterCriteria")
    protected FlightFilterCriteriaType flightFilterCriteria;
    @XmlElement(name = "Order")
    protected OrderType order;
    @XmlElement(name = "PaxFilterCriteria")
    protected PaxType paxFilterCriteria;
    @XmlElement(name = "PaxGroupFilterCriteria")
    protected PaxGroupType paxGroupFilterCriteria;
    @XmlElement(name = "PaymentFilterCriteria")
    protected PaymentMethodType paymentFilterCriteria;
    @XmlElement(name = "ServiceFilterCriteria")
    protected ServiceType serviceFilterCriteria;
    @XmlElement(name = "TicketDocFilterCriteria")
    protected TicketDocFilterCriteriaType ticketDocFilterCriteria;

    /**
     * Gets the value of the bookingRefFilterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link BookingInfoType }
     *     
     */
    public BookingInfoType getBookingRefFilterCriteria() {
        return bookingRefFilterCriteria;
    }

    /**
     * Sets the value of the bookingRefFilterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingInfoType }
     *     
     */
    public void setBookingRefFilterCriteria(BookingInfoType value) {
        this.bookingRefFilterCriteria = value;
    }

    /**
     * Gets the value of the flightFilterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link FlightFilterCriteriaType }
     *     
     */
    public FlightFilterCriteriaType getFlightFilterCriteria() {
        return flightFilterCriteria;
    }

    /**
     * Sets the value of the flightFilterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightFilterCriteriaType }
     *     
     */
    public void setFlightFilterCriteria(FlightFilterCriteriaType value) {
        this.flightFilterCriteria = value;
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
     * Gets the value of the paxFilterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link PaxType }
     *     
     */
    public PaxType getPaxFilterCriteria() {
        return paxFilterCriteria;
    }

    /**
     * Sets the value of the paxFilterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxType }
     *     
     */
    public void setPaxFilterCriteria(PaxType value) {
        this.paxFilterCriteria = value;
    }

    /**
     * Gets the value of the paxGroupFilterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link PaxGroupType }
     *     
     */
    public PaxGroupType getPaxGroupFilterCriteria() {
        return paxGroupFilterCriteria;
    }

    /**
     * Sets the value of the paxGroupFilterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxGroupType }
     *     
     */
    public void setPaxGroupFilterCriteria(PaxGroupType value) {
        this.paxGroupFilterCriteria = value;
    }

    /**
     * Gets the value of the paymentFilterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodType }
     *     
     */
    public PaymentMethodType getPaymentFilterCriteria() {
        return paymentFilterCriteria;
    }

    /**
     * Sets the value of the paymentFilterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodType }
     *     
     */
    public void setPaymentFilterCriteria(PaymentMethodType value) {
        this.paymentFilterCriteria = value;
    }

    /**
     * Gets the value of the serviceFilterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getServiceFilterCriteria() {
        return serviceFilterCriteria;
    }

    /**
     * Sets the value of the serviceFilterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setServiceFilterCriteria(ServiceType value) {
        this.serviceFilterCriteria = value;
    }

    /**
     * Gets the value of the ticketDocFilterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link TicketDocFilterCriteriaType }
     *     
     */
    public TicketDocFilterCriteriaType getTicketDocFilterCriteria() {
        return ticketDocFilterCriteria;
    }

    /**
     * Sets the value of the ticketDocFilterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketDocFilterCriteriaType }
     *     
     */
    public void setTicketDocFilterCriteria(TicketDocFilterCriteriaType value) {
        this.ticketDocFilterCriteria = value;
    }

}
