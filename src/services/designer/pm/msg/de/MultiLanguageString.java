/**
 * MultiLanguageString.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class MultiLanguageString  implements java.io.Serializable {
    /* ISO code of language (f.i. "DEU" or "ENG") */
    private java.lang.String isoCode;

    /* language depended string */
    private java.lang.String value;

    public MultiLanguageString() {
    }

    public MultiLanguageString(
           java.lang.String isoCode,
           java.lang.String value) {
           this.isoCode = isoCode;
           this.value = value;
    }


    /**
     * Gets the isoCode value for this MultiLanguageString.
     * 
     * @return isoCode   * ISO code of language (f.i. "DEU" or "ENG")
     */
    public java.lang.String getIsoCode() {
        return isoCode;
    }


    /**
     * Sets the isoCode value for this MultiLanguageString.
     * 
     * @param isoCode   * ISO code of language (f.i. "DEU" or "ENG")
     */
    public void setIsoCode(java.lang.String isoCode) {
        this.isoCode = isoCode;
    }


    /**
     * Gets the value value for this MultiLanguageString.
     * 
     * @return value   * language depended string
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this MultiLanguageString.
     * 
     * @param value   * language depended string
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MultiLanguageString)) return false;
        MultiLanguageString other = (MultiLanguageString) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isoCode==null && other.getIsoCode()==null) || 
             (this.isoCode!=null &&
              this.isoCode.equals(other.getIsoCode()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getIsoCode() != null) {
            _hashCode += getIsoCode().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MultiLanguageString.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "MultiLanguageString"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
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
