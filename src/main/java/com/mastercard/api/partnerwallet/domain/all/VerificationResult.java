//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-548 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 10:26:14 AM CST 
//


package com.mastercard.api.partnerwallet.domain.all;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerificationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerificationResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CountrySubdivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Accepted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ExtensionPoint" type="{}ExtensionPoint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificationResult", propOrder = {
    "country",
    "countrySubdivision",
    "accepted"
})
public class VerificationResult {

    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlElement(name = "CountrySubdivision")
    protected String countrySubdivision;
    @XmlElement(name = "Accepted")
    protected boolean accepted;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the countrySubdivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrySubdivision() {
        return countrySubdivision;
    }

    /**
     * Sets the value of the countrySubdivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrySubdivision(String value) {
        this.countrySubdivision = value;
    }

    /**
     * Gets the value of the accepted property.
     * 
     */
    public boolean isAccepted() {
        return accepted;
    }

    /**
     * Sets the value of the accepted property.
     * 
     */
    public void setAccepted(boolean value) {
        this.accepted = value;
    }

}
