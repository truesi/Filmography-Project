
package com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pinPukDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pinPukDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="puk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pin2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="puk2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pinPukDTO", propOrder = {
    "pin",
    "puk",
    "pin2",
    "puk2"
})
public class PinPukDTO {

    protected String pin;
    protected String puk;
    protected String pin2;
    protected String puk2;

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the puk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPuk() {
        return puk;
    }

    /**
     * Sets the value of the puk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPuk(String value) {
        this.puk = value;
    }

    /**
     * Gets the value of the pin2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin2() {
        return pin2;
    }

    /**
     * Sets the value of the pin2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin2(String value) {
        this.pin2 = value;
    }

    /**
     * Gets the value of the puk2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPuk2() {
        return puk2;
    }

    /**
     * Sets the value of the puk2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPuk2(String value) {
        this.puk2 = value;
    }

}
