
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="ChangeFrequencyUnitResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "changeFrequencyUnitResult"
})
@XmlRootElement(name = "ChangeFrequencyUnitResponse")
public class ChangeFrequencyUnitResponse {

    @XmlElement(name = "ChangeFrequencyUnitResult")
    protected double changeFrequencyUnitResult;

    /**
     * Gets the value of the changeFrequencyUnitResult property.
     * 
     */
    public double getChangeFrequencyUnitResult() {
        return changeFrequencyUnitResult;
    }

    /**
     * Sets the value of the changeFrequencyUnitResult property.
     * 
     */
    public void setChangeFrequencyUnitResult(double value) {
        this.changeFrequencyUnitResult = value;
    }

}
