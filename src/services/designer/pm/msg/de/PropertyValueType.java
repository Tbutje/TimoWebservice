/**
 * PropertyValueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class PropertyValueType  implements java.io.Serializable {
    /* value of type string */
    private java.lang.String stringValue;

    /* value of type integer */
    private java.lang.Integer integerValue;

    /* value of type float */
    private java.lang.Double floatValue;

    /* value of type date (YYYYMMDD) */
    private java.lang.Integer dateValue;

    /* value of type boolean */
    private java.lang.Boolean booleanValue;

    /* value of type time (HH:MM) */
    private java.lang.String timeValue;

    /* id of array for multidimensional properties */
    private java.lang.String arrayID;

    /* value of type multilanguage string */
    private services.designer.pm.msg.de.MultiLanguageString multilanguageValue;

    public PropertyValueType() {
    }

    public PropertyValueType(
           java.lang.String stringValue,
           java.lang.Integer integerValue,
           java.lang.Double floatValue,
           java.lang.Integer dateValue,
           java.lang.Boolean booleanValue,
           java.lang.String timeValue,
           java.lang.String arrayID,
           services.designer.pm.msg.de.MultiLanguageString multilanguageValue) {
           this.stringValue = stringValue;
           this.integerValue = integerValue;
           this.floatValue = floatValue;
           this.dateValue = dateValue;
           this.booleanValue = booleanValue;
           this.timeValue = timeValue;
           this.arrayID = arrayID;
           this.multilanguageValue = multilanguageValue;
    }


    /**
     * Gets the stringValue value for this PropertyValueType.
     * 
     * @return stringValue   * value of type string
     */
    public java.lang.String getStringValue() {
        return stringValue;
    }


    /**
     * Sets the stringValue value for this PropertyValueType.
     * 
     * @param stringValue   * value of type string
     */
    public void setStringValue(java.lang.String stringValue) {
        this.stringValue = stringValue;
    }


    /**
     * Gets the integerValue value for this PropertyValueType.
     * 
     * @return integerValue   * value of type integer
     */
    public java.lang.Integer getIntegerValue() {
        return integerValue;
    }


    /**
     * Sets the integerValue value for this PropertyValueType.
     * 
     * @param integerValue   * value of type integer
     */
    public void setIntegerValue(java.lang.Integer integerValue) {
        this.integerValue = integerValue;
    }


    /**
     * Gets the floatValue value for this PropertyValueType.
     * 
     * @return floatValue   * value of type float
     */
    public java.lang.Double getFloatValue() {
        return floatValue;
    }


    /**
     * Sets the floatValue value for this PropertyValueType.
     * 
     * @param floatValue   * value of type float
     */
    public void setFloatValue(java.lang.Double floatValue) {
        this.floatValue = floatValue;
    }


    /**
     * Gets the dateValue value for this PropertyValueType.
     * 
     * @return dateValue   * value of type date (YYYYMMDD)
     */
    public java.lang.Integer getDateValue() {
        return dateValue;
    }


    /**
     * Sets the dateValue value for this PropertyValueType.
     * 
     * @param dateValue   * value of type date (YYYYMMDD)
     */
    public void setDateValue(java.lang.Integer dateValue) {
        this.dateValue = dateValue;
    }


    /**
     * Gets the booleanValue value for this PropertyValueType.
     * 
     * @return booleanValue   * value of type boolean
     */
    public java.lang.Boolean getBooleanValue() {
        return booleanValue;
    }


    /**
     * Sets the booleanValue value for this PropertyValueType.
     * 
     * @param booleanValue   * value of type boolean
     */
    public void setBooleanValue(java.lang.Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }


    /**
     * Gets the timeValue value for this PropertyValueType.
     * 
     * @return timeValue   * value of type time (HH:MM)
     */
    public java.lang.String getTimeValue() {
        return timeValue;
    }


    /**
     * Sets the timeValue value for this PropertyValueType.
     * 
     * @param timeValue   * value of type time (HH:MM)
     */
    public void setTimeValue(java.lang.String timeValue) {
        this.timeValue = timeValue;
    }


    /**
     * Gets the arrayID value for this PropertyValueType.
     * 
     * @return arrayID   * id of array for multidimensional properties
     */
    public java.lang.String getArrayID() {
        return arrayID;
    }


    /**
     * Sets the arrayID value for this PropertyValueType.
     * 
     * @param arrayID   * id of array for multidimensional properties
     */
    public void setArrayID(java.lang.String arrayID) {
        this.arrayID = arrayID;
    }


    /**
     * Gets the multilanguageValue value for this PropertyValueType.
     * 
     * @return multilanguageValue   * value of type multilanguage string
     */
    public services.designer.pm.msg.de.MultiLanguageString getMultilanguageValue() {
        return multilanguageValue;
    }


    /**
     * Sets the multilanguageValue value for this PropertyValueType.
     * 
     * @param multilanguageValue   * value of type multilanguage string
     */
    public void setMultilanguageValue(services.designer.pm.msg.de.MultiLanguageString multilanguageValue) {
        this.multilanguageValue = multilanguageValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PropertyValueType)) return false;
        PropertyValueType other = (PropertyValueType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.stringValue==null && other.getStringValue()==null) || 
             (this.stringValue!=null &&
              this.stringValue.equals(other.getStringValue()))) &&
            ((this.integerValue==null && other.getIntegerValue()==null) || 
             (this.integerValue!=null &&
              this.integerValue.equals(other.getIntegerValue()))) &&
            ((this.floatValue==null && other.getFloatValue()==null) || 
             (this.floatValue!=null &&
              this.floatValue.equals(other.getFloatValue()))) &&
            ((this.dateValue==null && other.getDateValue()==null) || 
             (this.dateValue!=null &&
              this.dateValue.equals(other.getDateValue()))) &&
            ((this.booleanValue==null && other.getBooleanValue()==null) || 
             (this.booleanValue!=null &&
              this.booleanValue.equals(other.getBooleanValue()))) &&
            ((this.timeValue==null && other.getTimeValue()==null) || 
             (this.timeValue!=null &&
              this.timeValue.equals(other.getTimeValue()))) &&
            ((this.arrayID==null && other.getArrayID()==null) || 
             (this.arrayID!=null &&
              this.arrayID.equals(other.getArrayID()))) &&
            ((this.multilanguageValue==null && other.getMultilanguageValue()==null) || 
             (this.multilanguageValue!=null &&
              this.multilanguageValue.equals(other.getMultilanguageValue())));
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
        if (getStringValue() != null) {
            _hashCode += getStringValue().hashCode();
        }
        if (getIntegerValue() != null) {
            _hashCode += getIntegerValue().hashCode();
        }
        if (getFloatValue() != null) {
            _hashCode += getFloatValue().hashCode();
        }
        if (getDateValue() != null) {
            _hashCode += getDateValue().hashCode();
        }
        if (getBooleanValue() != null) {
            _hashCode += getBooleanValue().hashCode();
        }
        if (getTimeValue() != null) {
            _hashCode += getTimeValue().hashCode();
        }
        if (getArrayID() != null) {
            _hashCode += getArrayID().hashCode();
        }
        if (getMultilanguageValue() != null) {
            _hashCode += getMultilanguageValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PropertyValueType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyValueType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stringValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booleanValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "booleanValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrayID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arrayID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multilanguageValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "multilanguageValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "MultiLanguageString"));
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
