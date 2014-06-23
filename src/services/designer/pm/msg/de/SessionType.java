/**
 * SessionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class SessionType  implements java.io.Serializable {
    /* token of session */
    private org.apache.axis.types.UnsignedInt sessionToken;

    /* id of session */
    private java.lang.String sessionID;

    public SessionType() {
    }

    public SessionType(
           org.apache.axis.types.UnsignedInt sessionToken,
           java.lang.String sessionID) {
           this.sessionToken = sessionToken;
           this.sessionID = sessionID;
    }


    /**
     * Gets the sessionToken value for this SessionType.
     * 
     * @return sessionToken   * token of session
     */
    public org.apache.axis.types.UnsignedInt getSessionToken() {
        return sessionToken;
    }


    /**
     * Sets the sessionToken value for this SessionType.
     * 
     * @param sessionToken   * token of session
     */
    public void setSessionToken(org.apache.axis.types.UnsignedInt sessionToken) {
        this.sessionToken = sessionToken;
    }


    /**
     * Gets the sessionID value for this SessionType.
     * 
     * @return sessionID   * id of session
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this SessionType.
     * 
     * @param sessionID   * id of session
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SessionType)) return false;
        SessionType other = (SessionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionToken==null && other.getSessionToken()==null) || 
             (this.sessionToken!=null &&
              this.sessionToken.equals(other.getSessionToken()))) &&
            ((this.sessionID==null && other.getSessionID()==null) || 
             (this.sessionID!=null &&
              this.sessionID.equals(other.getSessionID())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSessionToken() != null) {
            _hashCode += getSessionToken().hashCode();
        }
        if (getSessionID() != null) {
            _hashCode += getSessionID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SessionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionToken");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
