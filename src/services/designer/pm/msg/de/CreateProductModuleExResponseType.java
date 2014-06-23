/**
 * CreateProductModuleExResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class CreateProductModuleExResponseType  implements java.io.Serializable {
    /* return value of this operation */
    private services.designer.pm.msg.de.OperationResponseType operationResponse;

    /* description of created product module */
    private services.designer.pm.msg.de.ModuleDescriptionType createdModule;

    /* object key of created product module */
    private services.designer.pm.msg.de.ObjectKeyType objectKey;

    public CreateProductModuleExResponseType() {
    }

    public CreateProductModuleExResponseType(
           services.designer.pm.msg.de.OperationResponseType operationResponse,
           services.designer.pm.msg.de.ModuleDescriptionType createdModule,
           services.designer.pm.msg.de.ObjectKeyType objectKey) {
           this.operationResponse = operationResponse;
           this.createdModule = createdModule;
           this.objectKey = objectKey;
    }


    /**
     * Gets the operationResponse value for this CreateProductModuleExResponseType.
     * 
     * @return operationResponse   * return value of this operation
     */
    public services.designer.pm.msg.de.OperationResponseType getOperationResponse() {
        return operationResponse;
    }


    /**
     * Sets the operationResponse value for this CreateProductModuleExResponseType.
     * 
     * @param operationResponse   * return value of this operation
     */
    public void setOperationResponse(services.designer.pm.msg.de.OperationResponseType operationResponse) {
        this.operationResponse = operationResponse;
    }


    /**
     * Gets the createdModule value for this CreateProductModuleExResponseType.
     * 
     * @return createdModule   * description of created product module
     */
    public services.designer.pm.msg.de.ModuleDescriptionType getCreatedModule() {
        return createdModule;
    }


    /**
     * Sets the createdModule value for this CreateProductModuleExResponseType.
     * 
     * @param createdModule   * description of created product module
     */
    public void setCreatedModule(services.designer.pm.msg.de.ModuleDescriptionType createdModule) {
        this.createdModule = createdModule;
    }


    /**
     * Gets the objectKey value for this CreateProductModuleExResponseType.
     * 
     * @return objectKey   * object key of created product module
     */
    public services.designer.pm.msg.de.ObjectKeyType getObjectKey() {
        return objectKey;
    }


    /**
     * Sets the objectKey value for this CreateProductModuleExResponseType.
     * 
     * @param objectKey   * object key of created product module
     */
    public void setObjectKey(services.designer.pm.msg.de.ObjectKeyType objectKey) {
        this.objectKey = objectKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateProductModuleExResponseType)) return false;
        CreateProductModuleExResponseType other = (CreateProductModuleExResponseType) obj;
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
            ((this.createdModule==null && other.getCreatedModule()==null) || 
             (this.createdModule!=null &&
              this.createdModule.equals(other.getCreatedModule()))) &&
            ((this.objectKey==null && other.getObjectKey()==null) || 
             (this.objectKey!=null &&
              this.objectKey.equals(other.getObjectKey())));
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
        if (getCreatedModule() != null) {
            _hashCode += getCreatedModule().hashCode();
        }
        if (getObjectKey() != null) {
            _hashCode += getObjectKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateProductModuleExResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "CreateProductModuleExResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operationResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdModule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdModule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "ModuleDescriptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objectKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "ObjectKeyType"));
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
