/**
 * PropertyEnumRestrictionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class PropertyEnumRestrictionType  implements java.io.Serializable {
    private java.lang.String enumName;

    private services.designer.pm.msg.de.PropertyValueType[] listSelectedValues;

    public PropertyEnumRestrictionType() {
    }

    public PropertyEnumRestrictionType(
           java.lang.String enumName,
           services.designer.pm.msg.de.PropertyValueType[] listSelectedValues) {
           this.enumName = enumName;
           this.listSelectedValues = listSelectedValues;
    }


    /**
     * Gets the enumName value for this PropertyEnumRestrictionType.
     * 
     * @return enumName
     */
    public java.lang.String getEnumName() {
        return enumName;
    }


    /**
     * Sets the enumName value for this PropertyEnumRestrictionType.
     * 
     * @param enumName
     */
    public void setEnumName(java.lang.String enumName) {
        this.enumName = enumName;
    }


    /**
     * Gets the listSelectedValues value for this PropertyEnumRestrictionType.
     * 
     * @return listSelectedValues
     */
    public services.designer.pm.msg.de.PropertyValueType[] getListSelectedValues() {
        return listSelectedValues;
    }


    /**
     * Sets the listSelectedValues value for this PropertyEnumRestrictionType.
     * 
     * @param listSelectedValues
     */
    public void setListSelectedValues(services.designer.pm.msg.de.PropertyValueType[] listSelectedValues) {
        this.listSelectedValues = listSelectedValues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PropertyEnumRestrictionType)) return false;
        PropertyEnumRestrictionType other = (PropertyEnumRestrictionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enumName==null && other.getEnumName()==null) || 
             (this.enumName!=null &&
              this.enumName.equals(other.getEnumName()))) &&
            ((this.listSelectedValues==null && other.getListSelectedValues()==null) || 
             (this.listSelectedValues!=null &&
              java.util.Arrays.equals(this.listSelectedValues, other.getListSelectedValues())));
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
        if (getEnumName() != null) {
            _hashCode += getEnumName().hashCode();
        }
        if (getListSelectedValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListSelectedValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListSelectedValues(), i);
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
        new org.apache.axis.description.TypeDesc(PropertyEnumRestrictionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyEnumRestrictionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enumName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listSelectedValues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listSelectedValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyValueType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "valueList"));
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
