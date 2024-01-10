
package org.iata.iata._2015._00._2020_1.iata_orderreshoprq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reshop order Choice
 * 
 * <p>Java class for ReshopOrderChoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReshopOrderChoiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ServiceOrder" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}ServiceOrderType"/>
 *         &lt;element name="UpdatePax" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}UpdatePaxType"/>
 *         &lt;element name="UpdatePaxName" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderReshopRQ}UpdatePaxNameType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReshopOrderChoiceType", propOrder = {
    "serviceOrder",
    "updatePax",
    "updatePaxName"
})
public class ReshopOrderChoiceType {

    @XmlElement(name = "ServiceOrder")
    protected ServiceOrderType serviceOrder;
    @XmlElement(name = "UpdatePax")
    protected UpdatePaxType updatePax;
    @XmlElement(name = "UpdatePaxName")
    protected UpdatePaxNameType updatePaxName;

    /**
     * Gets the value of the serviceOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceOrderType }
     *     
     */
    public ServiceOrderType getServiceOrder() {
        return serviceOrder;
    }

    /**
     * Sets the value of the serviceOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceOrderType }
     *     
     */
    public void setServiceOrder(ServiceOrderType value) {
        this.serviceOrder = value;
    }

    /**
     * Gets the value of the updatePax property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatePaxType }
     *     
     */
    public UpdatePaxType getUpdatePax() {
        return updatePax;
    }

    /**
     * Sets the value of the updatePax property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatePaxType }
     *     
     */
    public void setUpdatePax(UpdatePaxType value) {
        this.updatePax = value;
    }

    /**
     * Gets the value of the updatePaxName property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatePaxNameType }
     *     
     */
    public UpdatePaxNameType getUpdatePaxName() {
        return updatePaxName;
    }

    /**
     * Sets the value of the updatePaxName property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatePaxNameType }
     *     
     */
    public void setUpdatePaxName(UpdatePaxNameType value) {
        this.updatePaxName = value;
    }

}
