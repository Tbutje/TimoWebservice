/**
 * PropertyRangeRestrictionValueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class PropertyRangeRestrictionValueType  implements java.io.Serializable {
    /* value of type integer */
    private java.lang.Integer integerValue;

    /* value of type float */
    private java.lang.Double floatValue;

    /* value of type date (YYYYMMDD) */
    private java.lang.Integer dateValue;

    public PropertyRangeRestrictionValueType() {
    }

    public PropertyRangeRestrictionValueType(
           java.lang.Integer integerValue,
           java.lang.Double floatValue,
           java.lang.Integer dateValue) {
           this.integerValue = integerValue;
           this.floatValue = floatValue;
           this.dateValue = dateValue;
    }


    /**
     * Gets the integerValue value for this PropertyRangeRestrictionValueType.
     * 
     * @return integerValue   * value of type integer
     */
    public java.lang.Integer getIntegerValue() {
        return integerValue;
    }


    /**
     * Sets the integerValue value for this PropertyRangeRestrictionValueType.
     * 
     * @param integerValue   * value of type integer
     */
    public void setIntegerValue(java.lang.Integer integerValue) {
        this.integerValue = integerValue;
    }


    /**
     * Gets the floatValue value for this PropertyRangeRestrictionValueType.
     * 
     * @return floatValue   * value of type float
     */
    public java.lang.Double getFloatValue() {
        return floatValue;
    }


    /**
     * Sets the floatValue value for this PropertyRangeRestrictionValueType.
     * 
     * @param floatValue   * value of type float
     */
    public void setFloatValue(java.lang.Double floatValue) {
        this.floatValue = floatValue;
    }


    /**
     * Gets the dateValue value for this PropertyRangeRestrictionValueType.
     * 
     * @return dateValue   * value of type date (YYYYMMDD)
     */
    public java.lang.Integer getDateValue() {
        return dateValue;
    }


    /**
     * Sets the dateValue value for this PropertyRangeRestrictionValueType.
     * 
     * @param dateValue   * value of type date (YYYYMMDD)
     */
    public void setDateValue(java.lang.Integer dateValue) {
        this.dateValue = dateValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PropertyRangeRestrictionValueType)) return false;
        PropertyRangeRestrictionValueType other = (PropertyRangeRestrictionValueType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.integerValue==null && other.getIntegerValue()==null) || 
             (this.integerValue!=null &&
              this.integerValue.equals(other.getIntegerValue()))) &&
            ((this.floatValue==null && other.getFloatValue()==null) || 
             (this.floatValue!=null &&
              this.floatValue.equals(other.getFloatValue()))) &&
            ((this.dateValue==null && other.getDateValue()==null) || 
             (this.dateValue!=null &&
              this.dateValue.equals(other.getDateValue())));
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
        if (getIntegerValue() != null) {
            _hashCode += getIntegerValue().hashCode();
        }
        if (getFloatValue() != null) {
            _hashCode += getFloatValue().hashCode();
        }
        if (getDateValue() != null) {
            _hashCode += getDateValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PropertyRangeRestrictionValueType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyRangeRestrictionValueType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integerValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "integerValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("floatValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "floatValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
