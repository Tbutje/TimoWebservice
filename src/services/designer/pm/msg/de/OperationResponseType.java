/**
 * OperationResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class OperationResponseType  implements java.io.Serializable {
    /* return code of operation */
    private int resultCode;

    /* message of return code of operation */
    private java.lang.String resultMessage;

    public OperationResponseType() {
    }

    public OperationResponseType(
           int resultCode,
           java.lang.String resultMessage) {
           this.resultCode = resultCode;
           this.resultMessage = resultMessage;
    }


    /**
     * Gets the resultCode value for this OperationResponseType.
     * 
     * @return resultCode   * return code of operation
     */
    public int getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this OperationResponseType.
     * 
     * @param resultCode   * return code of operation
     */
    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the resultMessage value for this OperationResponseType.
     * 
     * @return resultMessage   * message of return code of operation
     */
    public java.lang.String getResultMessage() {
        return resultMessage;
    }


    /**
     * Sets the resultMessage value for this OperationResponseType.
     * 
     * @param resultMessage   * message of return code of operation
     */
    public void setResultMessage(java.lang.String resultMessage) {
        this.resultMessage = resultMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperationResponseType)) return false;
        OperationResponseType other = (OperationResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.resultCode == other.getResultCode() &&
            ((this.resultMessage==null && other.getResultMessage()==null) || 
             (this.resultMessage!=null &&
              this.resultMessage.equals(other.getResultMessage())));
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
        _hashCode += getResultCode();
        if (getResultMessage() != null) {
            _hashCode += getResultMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperationResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultMessage"));
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
