//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.29 at 03:02:40 PM EDT 
//


package flinn.rcopia.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ComplexRcopiaIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplexRcopiaIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="RcopiaID" type="{http://www.drfirst.com/}RcopiaIDType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplexRcopiaIDType", propOrder = {
    "rcopiaID"
})
@XmlSeeAlso({
    flinn.rcopia.model.MedicationType.Prescription.class
})
public class ComplexRcopiaIDType {

    @XmlElement(name = "RcopiaID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rcopiaID;

    /**
     * Gets the value of the rcopiaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcopiaID() {
        return rcopiaID;
    }

    /**
     * Sets the value of the rcopiaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcopiaID(String value) {
        this.rcopiaID = value;
    }

}
