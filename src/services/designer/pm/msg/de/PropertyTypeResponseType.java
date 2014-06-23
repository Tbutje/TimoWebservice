/**
 * PropertyTypeResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class PropertyTypeResponseType  implements java.io.Serializable {
    /* type of property: "string", "integer",
     * 								"float", "date", "boolean", "time" or
     * 								"multilanguage" */
    private java.lang.String type;

    /* dimension of property */
    private int dimension;

    /* return value of this operation */
    private services.designer.pm.msg.de.OperationResponseType operationResponse;

    public PropertyTypeResponseType() {
    }

    public PropertyTypeResponseType(
           java.lang.String type,
           int dimension,
           services.designer.pm.msg.de.OperationResponseType operationResponse) {
           this.type = type;
           this.dimension = dimension;
           this.operationResponse = operationResponse;
    }


    /**
     * Gets the type value for this PropertyTypeResponseType.
     * 
     * @return type   * type of property: "string", "integer",
     * 								"float", "date", "boolean", "time" or
     * 								"multilanguage"
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this PropertyTypeResponseType.
     * 
     * @param type   * type of property: "string", "integer",
     * 								"float", "date", "boolean", "time" or
     * 								"multilanguage"
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the dimension value for this PropertyTypeResponseType.
     * 
     * @return dimension   * dimension of property
     */
    public int getDimension() {
        return dimension;
    }


    /**
     * Sets the dimension value for this PropertyTypeResponseType.
     * 
     * @param dimension   * dimension of property
     */
    public void setDimension(int dimension) {
        this.dimension = dimension;
    }


    /**
     * Gets the operationResponse value for this PropertyTypeResponseType.
     * 
     * @return operationResponse   * return value of this operation
     */
    public services.designer.pm.msg.de.OperationResponseType getOperationResponse() {
        return operationResponse;
    }


    /**
     * Sets the operationResponse value for this PropertyTypeResponseType.
     * 
     * @param operationResponse   * return value of this operation
     */
    public void setOperationResponse(services.designer.pm.msg.de.OperationResponseType operationResponse) {
        this.operationResponse = operationResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PropertyTypeResponseType)) return false;
        PropertyTypeResponseType other = (PropertyTypeResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.dimension == other.getDimension() &&
            ((this.operationResponse==null && other.getOperationResponse()==null) || 
             (this.operationResponse!=null &&
              this.operationResponse.equals(other.getOperationResponse())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += getDimension();
        if (getOperationResponse() != null) {
            _hashCode += getOperationResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PropertyTypeResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyTypeResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimension");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dimension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operationResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
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
