/**
 * ObjectKeyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class ObjectKeyType  implements java.io.Serializable {
    /* name of class */
    private java.lang.String className;

    /* name of product module */
    private java.lang.String productModuleName;

    /* name of generation */
    private java.lang.String generationName;

    /* name of adaptor stage */
    private java.lang.String adaptorstageName;

    public ObjectKeyType() {
    }

    public ObjectKeyType(
           java.lang.String className,
           java.lang.String productModuleName,
           java.lang.String generationName,
           java.lang.String adaptorstageName) {
           this.className = className;
           this.productModuleName = productModuleName;
           this.generationName = generationName;
           this.adaptorstageName = adaptorstageName;
    }


    /**
     * Gets the className value for this ObjectKeyType.
     * 
     * @return className   * name of class
     */
    public java.lang.String getClassName() {
        return className;
    }


    /**
     * Sets the className value for this ObjectKeyType.
     * 
     * @param className   * name of class
     */
    public void setClassName(java.lang.String className) {
        this.className = className;
    }


    /**
     * Gets the productModuleName value for this ObjectKeyType.
     * 
     * @return productModuleName   * name of product module
     */
    public java.lang.String getProductModuleName() {
        return productModuleName;
    }


    /**
     * Sets the productModuleName value for this ObjectKeyType.
     * 
     * @param productModuleName   * name of product module
     */
    public void setProductModuleName(java.lang.String productModuleName) {
        this.productModuleName = productModuleName;
    }


    /**
     * Gets the generationName value for this ObjectKeyType.
     * 
     * @return generationName   * name of generation
     */
    public java.lang.String getGenerationName() {
        return generationName;
    }


    /**
     * Sets the generationName value for this ObjectKeyType.
     * 
     * @param generationName   * name of generation
     */
    public void setGenerationName(java.lang.String generationName) {
        this.generationName = generationName;
    }


    /**
     * Gets the adaptorstageName value for this ObjectKeyType.
     * 
     * @return adaptorstageName   * name of adaptor stage
     */
    public java.lang.String getAdaptorstageName() {
        return adaptorstageName;
    }


    /**
     * Sets the adaptorstageName value for this ObjectKeyType.
     * 
     * @param adaptorstageName   * name of adaptor stage
     */
    public void setAdaptorstageName(java.lang.String adaptorstageName) {
        this.adaptorstageName = adaptorstageName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjectKeyType)) return false;
        ObjectKeyType other = (ObjectKeyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.className==null && other.getClassName()==null) || 
             (this.className!=null &&
              this.className.equals(other.getClassName()))) &&
            ((this.productModuleName==null && other.getProductModuleName()==null) || 
             (this.productModuleName!=null &&
              this.productModuleName.equals(other.getProductModuleName()))) &&
            ((this.generationName==null && other.getGenerationName()==null) || 
             (this.generationName!=null &&
              this.generationName.equals(other.getGenerationName()))) &&
            ((this.adaptorstageName==null && other.getAdaptorstageName()==null) || 
             (this.adaptorstageName!=null &&
              this.adaptorstageName.equals(other.getAdaptorstageName())));
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
        if (getClassName() != null) {
            _hashCode += getClassName().hashCode();
        }
        if (getProductModuleName() != null) {
            _hashCode += getProductModuleName().hashCode();
        }
        if (getGenerationName() != null) {
            _hashCode += getGenerationName().hashCode();
        }
        if (getAdaptorstageName() != null) {
            _hashCode += getAdaptorstageName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjectKeyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "ObjectKeyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("className");
        elemField.setXmlName(new javax.xml.namespace.QName("", "className"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productModuleName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productModuleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generationName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "generationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adaptorstageName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adaptorstageName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
