
package org.iata.iata._2015._00._2020_1.iata_orderreshoprs;

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
 * <p>Java class for ExistingOrderItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExistingOrderItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExistingService" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}ExistingServiceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrderItemRefID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRS}ID_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExistingOrderItemType", propOrder = {
    "existingService",
    "orderItemRefID"
})
public class ExistingOrderItemType {

    @XmlElement(name = "ExistingService")
    protected List<ExistingServiceType> existingService;
    @XmlElement(name = "OrderItemRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderItemRefID;

    /**
     * Gets the value of the existingService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the existingService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExistingService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExistingServiceType }
     * 
     * 
     */
    public List<ExistingServiceType> getExistingService() {
        if (existingService == null) {
            existingService = new ArrayList<ExistingServiceType>();
        }
        return this.existingService;
    }

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

}
