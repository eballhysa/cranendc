
package org.iata.iata._2015._00._2020_1.iata_orderchangerq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An exit/entry from an airport building to an aircraft. Could for example be a boarding gate, arrival gate, departing gate etc. 
 *  
 * 
 * <p>Java class for BoardingGateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BoardingGateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BoardingGateID" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_OrderChangeRQ}BoardingGateID_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoardingGateType", propOrder = {
    "boardingGateID"
})
public class BoardingGateType {

    @XmlElement(name = "BoardingGateID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String boardingGateID;

    /**
     * Gets the value of the boardingGateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardingGateID() {
        return boardingGateID;
    }

    /**
     * Sets the value of the boardingGateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardingGateID(String value) {
        this.boardingGateID = value;
    }

}
