
package com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendGPRSSettingsAVP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendGPRSSettingsAVP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wap" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="internet" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="mms" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendGPRSSettingsAVP", propOrder = {
    "msisdn",
    "wap",
    "internet",
    "mms"
})
public class SendGPRSSettingsAVP {

    protected String msisdn;
    protected boolean wap;
    protected boolean internet;
    protected boolean mms;

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the wap property.
     * 
     */
    public boolean isWap() {
        return wap;
    }

    /**
     * Sets the value of the wap property.
     * 
     */
    public void setWap(boolean value) {
        this.wap = value;
    }

    /**
     * Gets the value of the internet property.
     * 
     */
    public boolean isInternet() {
        return internet;
    }

    /**
     * Sets the value of the internet property.
     * 
     */
    public void setInternet(boolean value) {
        this.internet = value;
    }

    /**
     * Gets the value of the mms property.
     * 
     */
    public boolean isMms() {
        return mms;
    }

    /**
     * Sets the value of the mms property.
     * 
     */
    public void setMms(boolean value) {
        this.mms = value;
    }

}
