/**
 * GetPropertyRestrictionResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class GetPropertyRestrictionResponseType  implements java.io.Serializable {
    /* return value of this operation */
    private services.designer.pm.msg.de.OperationResponseType operationResponse;

    private services.designer.pm.msg.de.PropertyRestrictionType restriction;

    public GetPropertyRestrictionResponseType() {
    }

    public GetPropertyRestrictionResponseType(
           services.designer.pm.msg.de.OperationResponseType operationResponse,
           services.designer.pm.msg.de.PropertyRestrictionType restriction) {
           this.operationResponse = operationResponse;
           this.restriction = restriction;
    }


    /**
     * Gets the operationResponse value for this GetPropertyRestrictionResponseType.
     * 
     * @return operationResponse   * return value of this operation
     */
    public services.designer.pm.msg.de.OperationResponseType getOperationResponse() {
        return operationResponse;
    }


    /**
     * Sets the operationResponse value for this GetPropertyRestrictionResponseType.
     * 
     * @param operationResponse   * return value of this operation
     */
    public void setOperationResponse(services.designer.pm.msg.de.OperationResponseType operationResponse) {
        this.operationResponse = operationResponse;
    }


    /**
     * Gets the restriction value for this GetPropertyRestrictionResponseType.
     * 
     * @return restriction
     */
    public services.designer.pm.msg.de.PropertyRestrictionType getRestriction() {
        return restriction;
    }


    /**
     * Sets the restriction value for this GetPropertyRestrictionResponseType.
     * 
     * @param restriction
     */
    public void setRestriction(services.designer.pm.msg.de.PropertyRestrictionType restriction) {
        this.restriction = restriction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPropertyRestrictionResponseType)) return false;
        GetPropertyRestrictionResponseType other = (GetPropertyRestrictionResponseType) obj;
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
            ((this.restriction==null && other.getRestriction()==null) || 
             (this.restriction!=null &&
              this.restriction.equals(other.getRestriction())));
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
        if (getRestriction() != null) {
            _hashCode += getRestriction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPropertyRestrictionResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "GetPropertyRestrictionResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operationResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restriction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "restriction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyRestrictionType"));
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
