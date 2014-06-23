/**
 * EnumLanguageDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class EnumLanguageDataType  implements java.io.Serializable {
    /* ISO code of language (f.i. "DEU" or
     *                         		"ENG") */
    private java.lang.String isoCode;

    /* column name of value */
    private java.lang.String colum;

    private java.lang.String newValue;

    public EnumLanguageDataType() {
    }

    public EnumLanguageDataType(
           java.lang.String isoCode,
           java.lang.String colum,
           java.lang.String newValue) {
           this.isoCode = isoCode;
           this.colum = colum;
           this.newValue = newValue;
    }


    /**
     * Gets the isoCode value for this EnumLanguageDataType.
     * 
     * @return isoCode   * ISO code of language (f.i. "DEU" or
     *                         		"ENG")
     */
    public java.lang.String getIsoCode() {
        return isoCode;
    }


    /**
     * Sets the isoCode value for this EnumLanguageDataType.
     * 
     * @param isoCode   * ISO code of language (f.i. "DEU" or
     *                         		"ENG")
     */
    public void setIsoCode(java.lang.String isoCode) {
        this.isoCode = isoCode;
    }


    /**
     * Gets the colum value for this EnumLanguageDataType.
     * 
     * @return colum   * column name of value
     */
    public java.lang.String getColum() {
        return colum;
    }


    /**
     * Sets the colum value for this EnumLanguageDataType.
     * 
     * @param colum   * column name of value
     */
    public void setColum(java.lang.String colum) {
        this.colum = colum;
    }


    /**
     * Gets the newValue value for this EnumLanguageDataType.
     * 
     * @return newValue
     */
    public java.lang.String getNewValue() {
        return newValue;
    }


    /**
     * Sets the newValue value for this EnumLanguageDataType.
     * 
     * @param newValue
     */
    public void setNewValue(java.lang.String newValue) {
        this.newValue = newValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnumLanguageDataType)) return false;
        EnumLanguageDataType other = (EnumLanguageDataType) obj;
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
            ((this.colum==null && other.getColum()==null) || 
             (this.colum!=null &&
              this.colum.equals(other.getColum()))) &&
            ((this.newValue==null && other.getNewValue()==null) || 
             (this.newValue!=null &&
              this.newValue.equals(other.getNewValue())));
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
        if (getColum() != null) {
            _hashCode += getColum().hashCode();
        }
        if (getNewValue() != null) {
            _hashCode += getNewValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnumLanguageDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "EnumLanguageDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "colum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newValue"));
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
