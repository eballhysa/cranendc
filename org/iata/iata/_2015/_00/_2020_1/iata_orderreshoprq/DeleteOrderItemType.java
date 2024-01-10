
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
 * Function to request the removal of Order Items from this specific Order. If used alone (without a shopping query from the 'Add' function), the RS will assume a cancellation is desired for the Order Items specified and will return incurred fees/refund
 * 
 * <p>Java class for DeleteOrderItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteOrderItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderItemRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}ID_Type"/>
 *         &lt;element name="RespendInd" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}IndType" minOccurs="0"/>
 *         &lt;element name="RetainServiceID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteOrderItemType", propOrder = {
    "orderItemRefID",
    "respendInd",
    "retainServiceID"
})
public class DeleteOrderItemType {

    @XmlElement(name = "OrderItemRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderItemRefID;
    @XmlElement(name = "RespendInd")
    protected Boolean respendInd;
    @XmlElement(name = "RetainServiceID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> retainServiceID;

    /**
     * Gets the value of the orderItemRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderItemRefID() {
        return orderItemRefID;
    }

    /**
     * Sets the value of the orderItemRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderItemRefID(String value) {
        this.orderItemRefID = value;
    }

    /**
     * Gets the value of the respendInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRespendInd() {
        return respendInd;
    }

    /**
     * Sets the value of the respendInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRespendInd(Boolean value) {
        this.respendInd = value;
    }

    /**
     * Gets the value of the retainServiceID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retainServiceID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetainServiceID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRetainServiceID() {
        if (retainServiceID == null) {
            retainServiceID = new ArrayList<String>();
        }
        return this.retainServiceID;
    }

}
