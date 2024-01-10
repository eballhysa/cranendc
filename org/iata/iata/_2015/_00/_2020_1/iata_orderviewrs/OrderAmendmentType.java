
package org.iata.iata._2015._00._2020_1.iata_orderviewrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Order amendment information and action type.
 * 
 * <p>Java class for OrderAmendmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderAmendmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActionReasonCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}CodeType" minOccurs="0"/>
 *         &lt;element name="ActionTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}ActionCodeType"/>
 *         &lt;element name="Remark" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}RemarkType" minOccurs="0"/>
 *         &lt;element name="TicketDocInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderViewRS}TicketDocInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderAmendmentType", propOrder = {
    "actionReasonCode",
    "actionTypeCode",
    "remark",
    "ticketDocInfo"
})
public class OrderAmendmentType {

    @XmlElement(name = "ActionReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String actionReasonCode;
    @XmlElement(name = "ActionTypeCode", required = true)
    @XmlSchemaType(name = "token")
    protected ActionCodeContentType actionTypeCode;
    @XmlElement(name = "Remark")
    protected RemarkType remark;
    @XmlElement(name = "TicketDocInfo")
    protected TicketDocInfoType ticketDocInfo;

    /**
     * Gets the value of the actionReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionReasonCode() {
        return actionReasonCode;
    }

    /**
     * Sets the value of the actionReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionReasonCode(String value) {
        this.actionReasonCode = value;
    }

    /**
     * Gets the value of the actionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionCodeContentType }
     *     
     */
    public ActionCodeContentType getActionTypeCode() {
        return actionTypeCode;
    }

    /**
     * Sets the value of the actionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCodeContentType }
     *     
     */
    public void setActionTypeCode(ActionCodeContentType value) {
        this.actionTypeCode = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link RemarkType }
     *     
     */
    public RemarkType getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemarkType }
     *     
     */
    public void setRemark(RemarkType value) {
        this.remark = value;
    }

    /**
     * Gets the value of the ticketDocInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TicketDocInfoType }
     *     
     */
    public TicketDocInfoType getTicketDocInfo() {
        return ticketDocInfo;
    }

    /**
     * Sets the value of the ticketDocInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketDocInfoType }
     *     
     */
    public void setTicketDocInfo(TicketDocInfoType value) {
        this.ticketDocInfo = value;
    }

}
