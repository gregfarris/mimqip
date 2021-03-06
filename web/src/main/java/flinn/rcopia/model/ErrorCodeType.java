//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.29 at 03:02:40 PM EDT 
//


package flinn.rcopia.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bad_parameter"/>
 *     &lt;enumeration value="bad_patient_id"/>
 *     &lt;enumeration value="bad_pharmacy_id"/>
 *     &lt;enumeration value="bad_provider_id"/>
 *     &lt;enumeration value="bad_prescription_id"/>
 *     &lt;enumeration value="bad_practice_id"/>
 *     &lt;enumeration value="bad_signature_password"/>
 *     &lt;enumeration value="deactivated_account"/>
 *     &lt;enumeration value="duplicate_request_id"/>
 *     &lt;enumeration value="inactive_account"/>
 *     &lt;enumeration value="inactive_rcopia"/>
 *     &lt;enumeration value="invalid_password"/>
 *     &lt;enumeration value="locked_account"/>
 *     &lt;enumeration value="not_implemented"/>
 *     &lt;enumeration value="not_permitted"/>
 *     &lt;enumeration value="password_expired"/>
 *     &lt;enumeration value="password_expiring"/>
 *     &lt;enumeration value="patient_deleted"/>
 *     &lt;enumeration value="schedule_drug_not_allowed_for_sending"/>
 *     &lt;enumeration value="system_error"/>
 *     &lt;enumeration value="unspecified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ErrorCodeType")
@XmlEnum
public enum ErrorCodeType {


    /**
     * 
     * 						A value provided in the request is missing or invalid. match the Rcopia database. This code
     * 						should be returned only when no more specific code is appropriate.
     *                     
     * 
     */
    @XmlEnumValue("bad_parameter")
    BAD_PARAMETER("bad_parameter"),

    /**
     * 
     * 						The Rcopia or External patient identifier is missing or invalid.
     *                     
     * 
     */
    @XmlEnumValue("bad_patient_id")
    BAD_PATIENT_ID("bad_patient_id"),

    /**
     * 
     * 						The Rcopia or NCPDP pharmacy identifier is missing or invalid.
     *                     
     * 
     */
    @XmlEnumValue("bad_pharmacy_id")
    BAD_PHARMACY_ID("bad_pharmacy_id"),

    /**
     * 
     * 						The Rcopia or External provider identifier is missing or invalid.
     *                     
     * 
     */
    @XmlEnumValue("bad_provider_id")
    BAD_PROVIDER_ID("bad_provider_id"),

    /**
     * 
     * 						The Rcopia or External prescription identifier is missing or invalid.
     *                     
     * 
     */
    @XmlEnumValue("bad_prescription_id")
    BAD_PRESCRIPTION_ID("bad_prescription_id"),

    /**
     * 
     * 						The Rcopia or External practice identifier is missing or invalid.
     *                     
     * 
     */
    @XmlEnumValue("bad_practice_id")
    BAD_PRACTICE_ID("bad_practice_id"),

    /**
     * The prescription signature password is missing or invalid.
     * 
     */
    @XmlEnumValue("bad_signature_password")
    BAD_SIGNATURE_PASSWORD("bad_signature_password"),

    /**
     * This Rcopia login has been deactivated.
     * 
     */
    @XmlEnumValue("deactivated_account")
    DEACTIVATED_ACCOUNT("deactivated_account"),

    /**
     * This request or prescription has already been processed.
     * 
     */
    @XmlEnumValue("duplicate_request_id")
    DUPLICATE_REQUEST_ID("duplicate_request_id"),

    /**
     * This Rcopia login has not yet been activated.
     * 
     */
    @XmlEnumValue("inactive_account")
    INACTIVE_ACCOUNT("inactive_account"),

    /**
     * 
     * 						This login has been activated for administrative functions, but not for Rcopia.
     * 					
     * 
     */
    @XmlEnumValue("inactive_rcopia")
    INACTIVE_RCOPIA("inactive_rcopia"),

    /**
     * The login password or encoded hash is invalid.
     * 
     */
    @XmlEnumValue("invalid_password")
    INVALID_PASSWORD("invalid_password"),

    /**
     * 
     * 						This account has been locked, probably due to too many invalid login attempts
     * 					
     * 
     */
    @XmlEnumValue("locked_account")
    LOCKED_ACCOUNT("locked_account"),

    /**
     * This function is not yet implemented.
     * 
     */
    @XmlEnumValue("not_implemented")
    NOT_IMPLEMENTED("not_implemented"),

    /**
     * This login does not have permission to use this function.
     * 
     */
    @XmlEnumValue("not_permitted")
    NOT_PERMITTED("not_permitted"),

    /**
     * This login password has expired.
     * 
     */
    @XmlEnumValue("password_expired")
    PASSWORD_EXPIRED("password_expired"),

    /**
     * 
     * 						This login password is due to expire soon. This code appears only as a warning
     * 					
     * 
     */
    @XmlEnumValue("password_expiring")
    PASSWORD_EXPIRING("password_expiring"),

    /**
     * This patient was found, but has been deleted.
     * 
     */
    @XmlEnumValue("patient_deleted")
    PATIENT_DELETED("patient_deleted"),

    /**
     * 
     * 						The drug is a schedule drug and is not allowed to be e-Prescribed.
     *                     
     * 
     */
    @XmlEnumValue("schedule_drug_not_allowed_for_sending")
    SCHEDULE_DRUG_NOT_ALLOWED_FOR_SENDING("schedule_drug_not_allowed_for_sending"),

    /**
     * An internal system error occurred.
     * 
     */
    @XmlEnumValue("system_error")
    SYSTEM_ERROR("system_error"),

    /**
     * An error not described by any specific code occurred.
     * 
     */
    @XmlEnumValue("unspecified")
    UNSPECIFIED("unspecified");
    private final String value;

    ErrorCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorCodeType fromValue(String v) {
        for (ErrorCodeType c: ErrorCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
