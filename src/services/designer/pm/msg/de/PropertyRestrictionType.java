/**
 * PropertyRestrictionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class PropertyRestrictionType  implements java.io.Serializable {
    private services.designer.pm.msg.de.PropertyRestrictionKind kind;

    private services.designer.pm.msg.de.PropertyValueType singleValue;

    private services.designer.pm.msg.de.PropertyValueType[] listValue;

    private services.designer.pm.msg.de.PropertyRangeRestrictionType range;

    private services.designer.pm.msg.de.PropertyEnumRestrictionType enumReference;

    private services.designer.pm.msg.de.PropertyTableColumnRestrictionType tableColumnReference;

    public PropertyRestrictionType() {
    }

    public PropertyRestrictionType(
           services.designer.pm.msg.de.PropertyRestrictionKind kind,
           services.designer.pm.msg.de.PropertyValueType singleValue,
           services.designer.pm.msg.de.PropertyValueType[] listValue,
           services.designer.pm.msg.de.PropertyRangeRestrictionType range,
           services.designer.pm.msg.de.PropertyEnumRestrictionType enumReference,
           services.designer.pm.msg.de.PropertyTableColumnRestrictionType tableColumnReference) {
           this.kind = kind;
           this.singleValue = singleValue;
           this.listValue = listValue;
           this.range = range;
           this.enumReference = enumReference;
           this.tableColumnReference = tableColumnReference;
    }


    /**
     * Gets the kind value for this PropertyRestrictionType.
     * 
     * @return kind
     */
    public services.designer.pm.msg.de.PropertyRestrictionKind getKind() {
        return kind;
    }


    /**
     * Sets the kind value for this PropertyRestrictionType.
     * 
     * @param kind
     */
    public void setKind(services.designer.pm.msg.de.PropertyRestrictionKind kind) {
        this.kind = kind;
    }


    /**
     * Gets the singleValue value for this PropertyRestrictionType.
     * 
     * @return singleValue
     */
    public services.designer.pm.msg.de.PropertyValueType getSingleValue() {
        return singleValue;
    }


    /**
     * Sets the singleValue value for this PropertyRestrictionType.
     * 
     * @param singleValue
     */
    public void setSingleValue(services.designer.pm.msg.de.PropertyValueType singleValue) {
        this.singleValue = singleValue;
    }


    /**
     * Gets the listValue value for this PropertyRestrictionType.
     * 
     * @return listValue
     */
    public services.designer.pm.msg.de.PropertyValueType[] getListValue() {
        return listValue;
    }


    /**
     * Sets the listValue value for this PropertyRestrictionType.
     * 
     * @param listValue
     */
    public void setListValue(services.designer.pm.msg.de.PropertyValueType[] listValue) {
        this.listValue = listValue;
    }


    /**
     * Gets the range value for this PropertyRestrictionType.
     * 
     * @return range
     */
    public services.designer.pm.msg.de.PropertyRangeRestrictionType getRange() {
        return range;
    }


    /**
     * Sets the range value for this PropertyRestrictionType.
     * 
     * @param range
     */
    public void setRange(services.designer.pm.msg.de.PropertyRangeRestrictionType range) {
        this.range = range;
    }


    /**
     * Gets the enumReference value for this PropertyRestrictionType.
     * 
     * @return enumReference
     */
    public services.designer.pm.msg.de.PropertyEnumRestrictionType getEnumReference() {
        return enumReference;
    }


    /**
     * Sets the enumReference value for this PropertyRestrictionType.
     * 
     * @param enumReference
     */
    public void setEnumReference(services.designer.pm.msg.de.PropertyEnumRestrictionType enumReference) {
        this.enumReference = enumReference;
    }


    /**
     * Gets the tableColumnReference value for this PropertyRestrictionType.
     * 
     * @return tableColumnReference
     */
    public services.designer.pm.msg.de.PropertyTableColumnRestrictionType getTableColumnReference() {
        return tableColumnReference;
    }


    /**
     * Sets the tableColumnReference value for this PropertyRestrictionType.
     * 
     * @param tableColumnReference
     */
    public void setTableColumnReference(services.designer.pm.msg.de.PropertyTableColumnRestrictionType tableColumnReference) {
        this.tableColumnReference = tableColumnReference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PropertyRestrictionType)) return false;
        PropertyRestrictionType other = (PropertyRestrictionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kind==null && other.getKind()==null) || 
             (this.kind!=null &&
              this.kind.equals(other.getKind()))) &&
            ((this.singleValue==null && other.getSingleValue()==null) || 
             (this.singleValue!=null &&
              this.singleValue.equals(other.getSingleValue()))) &&
            ((this.listValue==null && other.getListValue()==null) || 
             (this.listValue!=null &&
              java.util.Arrays.equals(this.listValue, other.getListValue()))) &&
            ((this.range==null && other.getRange()==null) || 
             (this.range!=null &&
              this.range.equals(other.getRange()))) &&
            ((this.enumReference==null && other.getEnumReference()==null) || 
             (this.enumReference!=null &&
              this.enumReference.equals(other.getEnumReference()))) &&
            ((this.tableColumnReference==null && other.getTableColumnReference()==null) || 
             (this.tableColumnReference!=null &&
              this.tableColumnReference.equals(other.getTableColumnReference())));
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
        if (getKind() != null) {
            _hashCode += getKind().hashCode();
        }
        if (getSingleValue() != null) {
            _hashCode += getSingleValue().hashCode();
        }
        if (getListValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRange() != null) {
            _hashCode += getRange().hashCode();
        }
        if (getEnumReference() != null) {
            _hashCode += getEnumReference().hashCode();
        }
        if (getTableColumnReference() != null) {
            _hashCode += getTableColumnReference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PropertyRestrictionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyRestrictionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kind");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kind"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyRestrictionKind"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("singleValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "singleValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyValueType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyValueType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "valueList"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("range");
        elemField.setXmlName(new javax.xml.namespace.QName("", "range"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyRangeRestrictionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enumReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyEnumRestrictionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableColumnReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tableColumnReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyTableColumnRestrictionType"));
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
