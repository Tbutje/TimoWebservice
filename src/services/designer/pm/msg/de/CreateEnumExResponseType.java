/**
 * CreateEnumExResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class CreateEnumExResponseType  implements java.io.Serializable {
    /* return value of this operation */
    private services.designer.pm.msg.de.OperationResponseType operationResponse;

    /* id of created enum */
    private java.lang.String enumID;

    public CreateEnumExResponseType() {
    }

    public CreateEnumExResponseType(
           services.designer.pm.msg.de.OperationResponseType operationResponse,
           java.lang.String enumID) {
           this.operationResponse = operationResponse;
           this.enumID = enumID;
    }


    /**
     * Gets the operationResponse value for this CreateEnumExResponseType.
     * 
     * @return operationResponse   * return value of this operation
     */
    public services.designer.pm.msg.de.OperationResponseType getOperationResponse() {
        return operationResponse;
    }


    /**
     * Sets the operationResponse value for this CreateEnumExResponseType.
     * 
     * @param operationResponse   * return value of this operation
     */
    public void setOperationResponse(services.designer.pm.msg.de.OperationResponseType operationResponse) {
        this.operationResponse = operationResponse;
    }


    /**
     * Gets the enumID value for this CreateEnumExResponseType.
     * 
     * @return enumID   * id of created enum
     */
    public java.lang.String getEnumID() {
        return enumID;
    }


    /**
     * Sets the enumID value for this CreateEnumExResponseType.
     * 
     * @param enumID   * id of created enum
     */
    public void setEnumID(java.lang.String enumID) {
        this.enumID = enumID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateEnumExResponseType)) return false;
        CreateEnumExResponseType other = (CreateEnumExResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operationResponse==null && other.getOperationResponse()==null) || 
             (this.operationResponse!=null &&
              this.operationResponse.equals(other.getOperationResponse()))) &&
            ((this.enumID==null && other.getEnumID()==null) || 
             (this.enumID!=null &&
              this.enumID.equals(other.getEnumID())));
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
        if (getOperationResponse() != null) {
            _hashCode += getOperationResponse().hashCode();
        }
        if (getEnumID() != null) {
            _hashCode += getEnumID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateEnumExResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "CreateEnumExResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operationResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enumID"));
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
