//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.05 at 03:59:09 PM CET 
//


package nl.hanze.web.rdw.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Model complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Model">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="merkNaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motorInhoud" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="typeAanduiding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeMotor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Model", propOrder = {
    "merkNaam",
    "motorInhoud",
    "typeAanduiding",
    "typeMotor"
})
public class Model {

    protected String merkNaam;
    protected float motorInhoud;
    protected String typeAanduiding;
    @XmlElement(required = true)
    protected String typeMotor;

    /**
     * Gets the value of the merkNaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerkNaam() {
        return merkNaam;
    }

    /**
     * Sets the value of the merkNaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerkNaam(String value) {
        this.merkNaam = value;
    }

    /**
     * Gets the value of the motorInhoud property.
     * 
     */
    public float getMotorInhoud() {
        return motorInhoud;
    }

    /**
     * Sets the value of the motorInhoud property.
     * 
     */
    public void setMotorInhoud(float value) {
        this.motorInhoud = value;
    }

    /**
     * Gets the value of the typeAanduiding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeAanduiding() {
        return typeAanduiding;
    }

    /**
     * Sets the value of the typeAanduiding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeAanduiding(String value) {
        this.typeAanduiding = value;
    }

    /**
     * Gets the value of the typeMotor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeMotor() {
        return typeMotor;
    }

    /**
     * Sets the value of the typeMotor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeMotor(String value) {
        this.typeMotor = value;
    }

}
