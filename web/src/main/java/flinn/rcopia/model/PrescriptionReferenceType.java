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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PrescriptionReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrescriptionReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="RcopiaID" type="{http://www.drfirst.com/}RcopiaIDType"/>
 *         &lt;element name="Provider" type="{http://www.drfirst.com/}ProviderType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrescriptionReferenceType", propOrder = {

})
public class PrescriptionReferenceType {

    @XmlElement(name = "RcopiaID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rcopiaID;
    @XmlElement(name = "Provider", required = true)
    protected ProviderType provider;

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

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderType }
     *     
     */
    public ProviderType getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderType }
     *     
     */
    public void setProvider(ProviderType value) {
        this.provider = value;
    }

}
