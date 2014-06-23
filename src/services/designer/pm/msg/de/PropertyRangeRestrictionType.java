/**
 * PropertyRangeRestrictionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class PropertyRangeRestrictionType  implements java.io.Serializable {
    private services.designer.pm.msg.de.PropertyRangeRestrictionValueType minValue;

    private services.designer.pm.msg.de.PropertyRangeRestrictionValueType maxValue;

    private services.designer.pm.msg.de.PropertyRangeRestrictionValueType step;

    public PropertyRangeRestrictionType() {
    }

    public PropertyRangeRestrictionType(
           services.designer.pm.msg.de.PropertyRangeRestrictionValueType minValue,
           services.designer.pm.msg.de.PropertyRangeRestrictionValueType maxValue,
           services.designer.pm.msg.de.PropertyRangeRestrictionValueType step) {
           this.minValue = minValue;
           this.maxValue = maxValue;
           this.step = step;
    }


    /**
     * Gets the minValue value for this PropertyRangeRestrictionType.
     * 
     * @return minValue
     */
    public services.designer.pm.msg.de.PropertyRangeRestrictionValueType getMinValue() {
        return minValue;
    }


    /**
     * Sets the minValue value for this PropertyRangeRestrictionType.
     * 
     * @param minValue
     */
    public void setMinValue(services.designer.pm.msg.de.PropertyRangeRestrictionValueType minValue) {
        this.minValue = minValue;
    }


    /**
     * Gets the maxValue value for this PropertyRangeRestrictionType.
     * 
     * @return maxValue
     */
    public services.designer.pm.msg.de.PropertyRangeRestrictionValueType getMaxValue() {
        return maxValue;
    }


    /**
     * Sets the maxValue value for this PropertyRangeRestrictionType.
     * 
     * @param maxValue
     */
    public void setMaxValue(services.designer.pm.msg.de.PropertyRangeRestrictionValueType maxValue) {
        this.maxValue = maxValue;
    }


    /**
     * Gets the step value for this PropertyRangeRestrictionType.
     * 
     * @return step
     */
    public services.designer.pm.msg.de.PropertyRangeRestrictionValueType getStep() {
        return step;
    }


    /**
     * Sets the step value for this PropertyRangeRestrictionType.
     * 
     * @param step
     */
    public void setStep(services.designer.pm.msg.de.PropertyRangeRestrictionValueType step) {
        this.step = step;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PropertyRangeRestrictionType)) return false;
        PropertyRangeRestrictionType other = (PropertyRangeRestrictionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.minValue==null && other.getMinValue()==null) || 
             (this.minValue!=null &&
              this.minValue.equals(other.getMinValue()))) &&
            ((this.maxValue==null && other.getMaxValue()==null) || 
             (this.maxValue!=null &&
              this.maxValue.equals(other.getMaxValue()))) &&
            ((this.step==null && other.getStep()==null) || 
             (this.step!=null &&
              this.step.equals(other.getStep())));
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
        if (getMinValue() != null) {
            _hashCode += getMinValue().hashCode();
        }
        if (getMaxValue() != null) {
            _hashCode += getMaxValue().hashCode();
        }
        if (getStep() != null) {
            _hashCode += getStep().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PropertyRangeRestrictionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyRangeRestrictionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyRangeRestrictionValueType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyRangeRestrictionValueType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("step");
        elemField.setXmlName(new javax.xml.namespace.QName("", "step"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyRangeRestrictionValueType"));
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
