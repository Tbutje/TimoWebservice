/**
 * CreateAdaptorstageResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class CreateAdaptorstageResponseType  implements java.io.Serializable {
    /* return value of this opertaion */
    private services.designer.pm.msg.de.OperationResponseType operationResponse;

    /* id of new adaptorstage */
    private java.lang.String adaptorstageID;

    public CreateAdaptorstageResponseType() {
    }

    public CreateAdaptorstageResponseType(
           services.designer.pm.msg.de.OperationResponseType operationResponse,
           java.lang.String adaptorstageID) {
           this.operationResponse = operationResponse;
           this.adaptorstageID = adaptorstageID;
    }


    /**
     * Gets the operationResponse value for this CreateAdaptorstageResponseType.
     * 
     * @return operationResponse   * return value of this opertaion
     */
    public services.designer.pm.msg.de.OperationResponseType getOperationResponse() {
        return operationResponse;
    }


    /**
     * Sets the operationResponse value for this CreateAdaptorstageResponseType.
     * 
     * @param operationResponse   * return value of this opertaion
     */
    public void setOperationResponse(services.designer.pm.msg.de.OperationResponseType operationResponse) {
        this.operationResponse = operationResponse;
    }


    /**
     * Gets the adaptorstageID value for this CreateAdaptorstageResponseType.
     * 
     * @return adaptorstageID   * id of new adaptorstage
     */
    public java.lang.String getAdaptorstageID() {
        return adaptorstageID;
    }


    /**
     * Sets the adaptorstageID value for this CreateAdaptorstageResponseType.
     * 
     * @param adaptorstageID   * id of new adaptorstage
     */
    public void setAdaptorstageID(java.lang.String adaptorstageID) {
        this.adaptorstageID = adaptorstageID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateAdaptorstageResponseType)) return false;
        CreateAdaptorstageResponseType other = (CreateAdaptorstageResponseType) obj;
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
            ((this.adaptorstageID==null && other.getAdaptorstageID()==null) || 
             (this.adaptorstageID!=null &&
              this.adaptorstageID.equals(other.getAdaptorstageID())));
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
        if (getAdaptorstageID() != null) {
            _hashCode += getAdaptorstageID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateAdaptorstageResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "CreateAdaptorstageResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operationResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adaptorstageID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adaptorstageID"));
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
