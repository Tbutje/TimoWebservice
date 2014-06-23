/**
 * PropertyDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class PropertyDataType  implements java.io.Serializable {
    /* name of property */
    private java.lang.String propertyName;

    /* new property value */
    private java.lang.String newValue;

    /* new property restriction */
    private services.designer.pm.msg.de.PropertyRestrictionType newRestriction;

    public PropertyDataType() {
    }

    public PropertyDataType(
           java.lang.String propertyName,
           java.lang.String newValue,
           services.designer.pm.msg.de.PropertyRestrictionType newRestriction) {
           this.propertyName = propertyName;
           this.newValue = newValue;
           this.newRestriction = newRestriction;
    }


    /**
     * Gets the propertyName value for this PropertyDataType.
     * 
     * @return propertyName   * name of property
     */
    public java.lang.String getPropertyName() {
        return propertyName;
    }


    /**
     * Sets the propertyName value for this PropertyDataType.
     * 
     * @param propertyName   * name of property
     */
    public void setPropertyName(java.lang.String propertyName) {
        this.propertyName = propertyName;
    }


    /**
     * Gets the newValue value for this PropertyDataType.
     * 
     * @return newValue   * new property value
     */
    public java.lang.String getNewValue() {
        return newValue;
    }


    /**
     * Sets the newValue value for this PropertyDataType.
     * 
     * @param newValue   * new property value
     */
    public void setNewValue(java.lang.String newValue) {
        this.newValue = newValue;
    }


    /**
     * Gets the newRestriction value for this PropertyDataType.
     * 
     * @return newRestriction   * new property restriction
     */
    public services.designer.pm.msg.de.PropertyRestrictionType getNewRestriction() {
        return newRestriction;
    }


    /**
     * Sets the newRestriction value for this PropertyDataType.
     * 
     * @param newRestriction   * new property restriction
     */
    public void setNewRestriction(services.designer.pm.msg.de.PropertyRestrictionType newRestriction) {
        this.newRestriction = newRestriction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PropertyDataType)) return false;
        PropertyDataType other = (PropertyDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.propertyName==null && other.getPropertyName()==null) || 
             (this.propertyName!=null &&
              this.propertyName.equals(other.getPropertyName()))) &&
            ((this.newValue==null && other.getNewValue()==null) || 
             (this.newValue!=null &&
              this.newValue.equals(other.getNewValue()))) &&
            ((this.newRestriction==null && other.getNewRestriction()==null) || 
             (this.newRestriction!=null &&
              this.newRestriction.equals(other.getNewRestriction())));
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
        if (getPropertyName() != null) {
            _hashCode += getPropertyName().hashCode();
        }
        if (getNewValue() != null) {
            _hashCode += getNewValue().hashCode();
        }
        if (getNewRestriction() != null) {
            _hashCode += getNewRestriction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PropertyDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyName"));
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
        elemField.setFieldName("newRestriction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newRestriction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyRestrictionType"));
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
