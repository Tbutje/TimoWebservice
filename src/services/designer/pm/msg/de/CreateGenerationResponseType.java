/**
 * CreateGenerationResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class CreateGenerationResponseType  implements java.io.Serializable {
    /* return value of this operation */
    private services.designer.pm.msg.de.OperationResponseType operationResponse;

    /* id of the new generation */
    private java.lang.String generationID;

    /* id of the new adaptorstage */
    private java.lang.String adaptorstageID;

    public CreateGenerationResponseType() {
    }

    public CreateGenerationResponseType(
           services.designer.pm.msg.de.OperationResponseType operationResponse,
           java.lang.String generationID,
           java.lang.String adaptorstageID) {
           this.operationResponse = operationResponse;
           this.generationID = generationID;
           this.adaptorstageID = adaptorstageID;
    }


    /**
     * Gets the operationResponse value for this CreateGenerationResponseType.
     * 
     * @return operationResponse   * return value of this operation
     */
    public services.designer.pm.msg.de.OperationResponseType getOperationResponse() {
        return operationResponse;
    }


    /**
     * Sets the operationResponse value for this CreateGenerationResponseType.
     * 
     * @param operationResponse   * return value of this operation
     */
    public void setOperationResponse(services.designer.pm.msg.de.OperationResponseType operationResponse) {
        this.operationResponse = operationResponse;
    }


    /**
     * Gets the generationID value for this CreateGenerationResponseType.
     * 
     * @return generationID   * id of the new generation
     */
    public java.lang.String getGenerationID() {
        return generationID;
    }


    /**
     * Sets the generationID value for this CreateGenerationResponseType.
     * 
     * @param generationID   * id of the new generation
     */
    public void setGenerationID(java.lang.String generationID) {
        this.generationID = generationID;
    }


    /**
     * Gets the adaptorstageID value for this CreateGenerationResponseType.
     * 
     * @return adaptorstageID   * id of the new adaptorstage
     */
    public java.lang.String getAdaptorstageID() {
        return adaptorstageID;
    }


    /**
     * Sets the adaptorstageID value for this CreateGenerationResponseType.
     * 
     * @param adaptorstageID   * id of the new adaptorstage
     */
    public void setAdaptorstageID(java.lang.String adaptorstageID) {
        this.adaptorstageID = adaptorstageID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateGenerationResponseType)) return false;
        CreateGenerationResponseType other = (CreateGenerationResponseType) obj;
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
            ((this.generationID==null && other.getGenerationID()==null) || 
             (this.generationID!=null &&
              this.generationID.equals(other.getGenerationID()))) &&
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
        if (getGenerationID() != null) {
            _hashCode += getGenerationID().hashCode();
        }
        if (getAdaptorstageID() != null) {
            _hashCode += getAdaptorstageID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateGenerationResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "CreateGenerationResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operationResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generationID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "generationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
