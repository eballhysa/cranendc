
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Order View - information related to the response
 * 
 * <p>Java class for ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Commission" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CommissionType" minOccurs="0"/>
 *         &lt;element name="DataLists" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}DataListsType" minOccurs="0"/>
 *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}MetadataType" minOccurs="0"/>
 *         &lt;element name="Order" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}OrderType" maxOccurs="unbounded"/>
 *         &lt;element name="Processing" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}ResponseParametersType" minOccurs="0"/>
 *         &lt;element name="TicketDocInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TicketDocInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Warning" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}WarningType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType", propOrder = {
    "commission",
    "dataLists",
    "metadata",
    "order",
    "processing",
    "ticketDocInfo",
    "warning"
})
public class ResponseType {

    @XmlElement(name = "Commission")
    protected CommissionType commission;
    @XmlElement(name = "DataLists")
    protected DataListsType dataLists;
    @XmlElement(name = "Metadata")
    protected MetadataType metadata;
    @XmlElement(name = "Order", required = true)
    protected List<OrderType> order;
    @XmlElement(name = "Processing")
    protected ResponseParametersType processing;
    @XmlElement(name = "TicketDocInfo")
    protected List<TicketDocInfoType> ticketDocInfo;
    @XmlElement(name = "Warning")
    protected List<WarningType> warning;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the order property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderType }
     * 
     * 
     */
    public List<OrderType> getOrder() {
        if (order == null) {
            order = new ArrayList<OrderType>();
        }
        return this.order;
    }

    /**
     * Gets the value of the processing property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseParametersType }
     *     
     */
    public ResponseParametersType getProcessing() {
        return processing;
    }

    /**
     * Sets the value of the processing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseParametersType }
     *     
     */
    public void setProcessing(ResponseParametersType value) {
        this.processing = value;
    }

    /**
     * Gets the value of the ticketDocInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketDocInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketDocInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketDocInfoType }
     * 
     * 
     */
    public List<TicketDocInfoType> getTicketDocInfo() {
        if (ticketDocInfo == null) {
            ticketDocInfo = new ArrayList<TicketDocInfoType>();
        }
        return this.ticketDocInfo;
    }

    /**
     * Gets the value of the warning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarningType }
     * 
     * 
     */
    public List<WarningType> getWarning() {
        if (warning == null) {
            warning = new ArrayList<WarningType>();
        }
        return this.warning;
    }

}
