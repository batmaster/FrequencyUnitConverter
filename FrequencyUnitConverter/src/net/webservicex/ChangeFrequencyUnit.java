
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FrequencyValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fromFrequencyUnit" type="{http://www.webserviceX.NET/}Frequencys"/>
 *         &lt;element name="toFrequencyUnit" type="{http://www.webserviceX.NET/}Frequencys"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "frequencyValue",
    "fromFrequencyUnit",
    "toFrequencyUnit"
})
@XmlRootElement(name = "ChangeFrequencyUnit")
public class ChangeFrequencyUnit {

    @XmlElement(name = "FrequencyValue")
    protected double frequencyValue;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Frequencys fromFrequencyUnit;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Frequencys toFrequencyUnit;

    /**
     * Gets the value of the frequencyValue property.
     * 
     */
    public double getFrequencyValue() {
        return frequencyValue;
    }

    /**
     * Sets the value of the frequencyValue property.
     * 
     */
    public void setFrequencyValue(double value) {
        this.frequencyValue = value;
    }

    /**
     * Gets the value of the fromFrequencyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Frequencys }
     *     
     */
    public Frequencys getFromFrequencyUnit() {
        return fromFrequencyUnit;
    }

    /**
     * Sets the value of the fromFrequencyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequencys }
     *     
     */
    public void setFromFrequencyUnit(Frequencys value) {
        this.fromFrequencyUnit = value;
    }

    /**
     * Gets the value of the toFrequencyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Frequencys }
     *     
     */
    public Frequencys getToFrequencyUnit() {
        return toFrequencyUnit;
    }

    /**
     * Sets the value of the toFrequencyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequencys }
     *     
     */
    public void setToFrequencyUnit(Frequencys value) {
        this.toFrequencyUnit = value;
    }

}
