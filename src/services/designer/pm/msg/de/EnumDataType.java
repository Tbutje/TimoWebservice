/**
 * EnumDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class EnumDataType  implements java.io.Serializable {
    private java.lang.String identifier;

    private java.lang.String newValue;

    private services.designer.pm.msg.de.EnumLanguageDataType[] languageData;

    public EnumDataType() {
    }

    public EnumDataType(
           java.lang.String identifier,
           java.lang.String newValue,
           services.designer.pm.msg.de.EnumLanguageDataType[] languageData) {
           this.identifier = identifier;
           this.newValue = newValue;
           this.languageData = languageData;
    }


    /**
     * Gets the identifier value for this EnumDataType.
     * 
     * @return identifier
     */
    public java.lang.String getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this EnumDataType.
     * 
     * @param identifier
     */
    public void setIdentifier(java.lang.String identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the newValue value for this EnumDataType.
     * 
     * @return newValue
     */
    public java.lang.String getNewValue() {
        return newValue;
    }


    /**
     * Sets the newValue value for this EnumDataType.
     * 
     * @param newValue
     */
    public void setNewValue(java.lang.String newValue) {
        this.newValue = newValue;
    }


    /**
     * Gets the languageData value for this EnumDataType.
     * 
     * @return languageData
     */
    public services.designer.pm.msg.de.EnumLanguageDataType[] getLanguageData() {
        return languageData;
    }


    /**
     * Sets the languageData value for this EnumDataType.
     * 
     * @param languageData
     */
    public void setLanguageData(services.designer.pm.msg.de.EnumLanguageDataType[] languageData) {
        this.languageData = languageData;
    }

    public services.designer.pm.msg.de.EnumLanguageDataType getLanguageData(int i) {
        return this.languageData[i];
    }

    public void setLanguageData(int i, services.designer.pm.msg.de.EnumLanguageDataType _value) {
        this.languageData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnumDataType)) return false;
        EnumDataType other = (EnumDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.newValue==null && other.getNewValue()==null) || 
             (this.newValue!=null &&
              this.newValue.equals(other.getNewValue()))) &&
            ((this.languageData==null && other.getLanguageData()==null) || 
             (this.languageData!=null &&
              java.util.Arrays.equals(this.languageData, other.getLanguageData())));
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
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getNewValue() != null) {
            _hashCode += getNewValue().hashCode();
        }
        if (getLanguageData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLanguageData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLanguageData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnumDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "EnumDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "languageData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "EnumLanguageDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
