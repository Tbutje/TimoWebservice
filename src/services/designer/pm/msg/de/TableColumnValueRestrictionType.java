/**
 * TableColumnValueRestrictionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class TableColumnValueRestrictionType  implements java.io.Serializable {
    private services.designer.pm.msg.de.TableValueRestrictionKind restriction;

    private java.lang.String value;

    public TableColumnValueRestrictionType() {
    }

    public TableColumnValueRestrictionType(
           services.designer.pm.msg.de.TableValueRestrictionKind restriction,
           java.lang.String value) {
           this.restriction = restriction;
           this.value = value;
    }


    /**
     * Gets the restriction value for this TableColumnValueRestrictionType.
     * 
     * @return restriction
     */
    public services.designer.pm.msg.de.TableValueRestrictionKind getRestriction() {
        return restriction;
    }


    /**
     * Sets the restriction value for this TableColumnValueRestrictionType.
     * 
     * @param restriction
     */
    public void setRestriction(services.designer.pm.msg.de.TableValueRestrictionKind restriction) {
        this.restriction = restriction;
    }


    /**
     * Gets the value value for this TableColumnValueRestrictionType.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this TableColumnValueRestrictionType.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TableColumnValueRestrictionType)) return false;
        TableColumnValueRestrictionType other = (TableColumnValueRestrictionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.restriction==null && other.getRestriction()==null) || 
             (this.restriction!=null &&
              this.restriction.equals(other.getRestriction()))) &&
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
        if (getRestriction() != null) {
            _hashCode += getRestriction().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TableColumnValueRestrictionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableColumnValueRestrictionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restriction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "restriction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableValueRestrictionKind"));
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
