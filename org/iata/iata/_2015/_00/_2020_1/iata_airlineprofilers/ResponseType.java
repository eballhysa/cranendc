
package org.iata.iata._2015._00._2020_1.iata_airlineprofilers;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Airline Profile- information related to the response
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
 *         &lt;element name="AirlineProfile" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}AirlineProfileType" maxOccurs="unbounded"/>
 *         &lt;element name="SupportedMessageInfo" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}KeyValuePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Warning" type="{http://www.iata.org/IATA/2015/00/2020.1/IATA_AirlineProfileRS}WarningType" maxOccurs="unbounded" minOccurs="0"/>
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
    "airlineProfile",
    "supportedMessageInfo",
    "warning"
})
public class ResponseType {

    @XmlElement(name = "AirlineProfile", required = true)
    protected List<AirlineProfileType> airlineProfile;
    @XmlElement(name = "SupportedMessageInfo")
    protected List<KeyValuePropertyType> supportedMessageInfo;
    @XmlElement(name = "Warning")
    protected List<WarningType> warning;

    /**
     * Gets the value of the airlineProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airlineProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirlineProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlineProfileType }
     * 
     * 
     */
    public List<AirlineProfileType> getAirlineProfile() {
        if (airlineProfile == null) {
            airlineProfile = new ArrayList<AirlineProfileType>();
        }
        return this.airlineProfile;
    }

    /**
     * Gets the value of the supportedMessageInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedMessageInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedMessageInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePropertyType }
     * 
     * 
     */
    public List<KeyValuePropertyType> getSupportedMessageInfo() {
        if (supportedMessageInfo == null) {
            supportedMessageInfo = new ArrayList<KeyValuePropertyType>();
        }
        return this.supportedMessageInfo;
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
