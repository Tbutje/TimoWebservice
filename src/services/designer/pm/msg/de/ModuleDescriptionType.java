/**
 * ModuleDescriptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class ModuleDescriptionType  implements java.io.Serializable {
    /* id of product module */
    private java.lang.String objectID;

    /* id of generation */
    private java.lang.String generationID;

    /* id of adaptorstage */
    private java.lang.String adaptorstageID;

    public ModuleDescriptionType() {
    }

    public ModuleDescriptionType(
           java.lang.String objectID,
           java.lang.String generationID,
           java.lang.String adaptorstageID) {
           this.objectID = objectID;
           this.generationID = generationID;
           this.adaptorstageID = adaptorstageID;
    }


    /**
     * Gets the objectID value for this ModuleDescriptionType.
     * 
     * @return objectID   * id of product module
     */
    public java.lang.String getObjectID() {
        return objectID;
    }


    /**
     * Sets the objectID value for this ModuleDescriptionType.
     * 
     * @param objectID   * id of product module
     */
    public void setObjectID(java.lang.String objectID) {
        this.objectID = objectID;
    }


    /**
     * Gets the generationID value for this ModuleDescriptionType.
     * 
     * @return generationID   * id of generation
     */
    public java.lang.String getGenerationID() {
        return generationID;
    }


    /**
     * Sets the generationID value for this ModuleDescriptionType.
     * 
     * @param generationID   * id of generation
     */
    public void setGenerationID(java.lang.String generationID) {
        this.generationID = generationID;
    }


    /**
     * Gets the adaptorstageID value for this ModuleDescriptionType.
     * 
     * @return adaptorstageID   * id of adaptorstage
     */
    public java.lang.String getAdaptorstageID() {
        return adaptorstageID;
    }


    /**
     * Sets the adaptorstageID value for this ModuleDescriptionType.
     * 
     * @param adaptorstageID   * id of adaptorstage
     */
    public void setAdaptorstageID(java.lang.String adaptorstageID) {
        this.adaptorstageID = adaptorstageID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModuleDescriptionType)) return false;
        ModuleDescriptionType other = (ModuleDescriptionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.objectID==null && other.getObjectID()==null) || 
             (this.objectID!=null &&
              this.objectID.equals(other.getObjectID()))) &&
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
        if (getObjectID() != null) {
            _hashCode += getObjectID().hashCode();
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
        new org.apache.axis.description.TypeDesc(ModuleDescriptionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "ModuleDescriptionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objectID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
