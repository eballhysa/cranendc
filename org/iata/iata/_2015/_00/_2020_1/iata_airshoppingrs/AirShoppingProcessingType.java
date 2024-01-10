
package org.iata.iata._2015._00._2020_1.iata_airshoppingrs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Marketing messages for AirShoppingRS.
 * 
 * <p>Java class for AirShoppingProcessingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirShoppingProcessingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarketingMessage" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirShoppingRS}MarketingMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirShoppingProcessingType", propOrder = {
    "marketingMessage"
})
public class AirShoppingProcessingType {

    @XmlElement(name = "MarketingMessage")
    protected List<MarketingMessageType> marketingMessage;

    /**
     * Gets the value of the marketingMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketingMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketingMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketingMessageType }
     * 
     * 
     */
    public List<MarketingMessageType> getMarketingMessage() {
        if (marketingMessage == null) {
            marketingMessage = new ArrayList<MarketingMessageType>();
        }
        return this.marketingMessage;
    }

}
