/**
 * RelationKeyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;


/**
 * identifier of relation
 */
public class RelationKeyType  implements java.io.Serializable {
    private java.lang.String relationID;

    /* name of relation */
    private java.lang.String relationName;

    /* name of model relation */
    private java.lang.String modelRelationName;

    /* name of class of referenced product
     *                     			module */
    private java.lang.String targetClassName;

    /* name of referenced product module */
    private java.lang.String targetProductModuleName;

    public RelationKeyType() {
    }

    public RelationKeyType(
           java.lang.String relationID,
           java.lang.String relationName,
           java.lang.String modelRelationName,
           java.lang.String targetClassName,
           java.lang.String targetProductModuleName) {
           this.relationID = relationID;
           this.relationName = relationName;
           this.modelRelationName = modelRelationName;
           this.targetClassName = targetClassName;
           this.targetProductModuleName = targetProductModuleName;
    }


    /**
     * Gets the relationID value for this RelationKeyType.
     * 
     * @return relationID
     */
    public java.lang.String getRelationID() {
        return relationID;
    }


    /**
     * Sets the relationID value for this RelationKeyType.
     * 
     * @param relationID
     */
    public void setRelationID(java.lang.String relationID) {
        this.relationID = relationID;
    }


    /**
     * Gets the relationName value for this RelationKeyType.
     * 
     * @return relationName   * name of relation
     */
    public java.lang.String getRelationName() {
        return relationName;
    }


    /**
     * Sets the relationName value for this RelationKeyType.
     * 
     * @param relationName   * name of relation
     */
    public void setRelationName(java.lang.String relationName) {
        this.relationName = relationName;
    }


    /**
     * Gets the modelRelationName value for this RelationKeyType.
     * 
     * @return modelRelationName   * name of model relation
     */
    public java.lang.String getModelRelationName() {
        return modelRelationName;
    }


    /**
     * Sets the modelRelationName value for this RelationKeyType.
     * 
     * @param modelRelationName   * name of model relation
     */
    public void setModelRelationName(java.lang.String modelRelationName) {
        this.modelRelationName = modelRelationName;
    }


    /**
     * Gets the targetClassName value for this RelationKeyType.
     * 
     * @return targetClassName   * name of class of referenced product
     *                     			module
     */
    public java.lang.String getTargetClassName() {
        return targetClassName;
    }


    /**
     * Sets the targetClassName value for this RelationKeyType.
     * 
     * @param targetClassName   * name of class of referenced product
     *                     			module
     */
    public void setTargetClassName(java.lang.String targetClassName) {
        this.targetClassName = targetClassName;
    }


    /**
     * Gets the targetProductModuleName value for this RelationKeyType.
     * 
     * @return targetProductModuleName   * name of referenced product module
     */
    public java.lang.String getTargetProductModuleName() {
        return targetProductModuleName;
    }


    /**
     * Sets the targetProductModuleName value for this RelationKeyType.
     * 
     * @param targetProductModuleName   * name of referenced product module
     */
    public void setTargetProductModuleName(java.lang.String targetProductModuleName) {
        this.targetProductModuleName = targetProductModuleName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RelationKeyType)) return false;
        RelationKeyType other = (RelationKeyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.relationID==null && other.getRelationID()==null) || 
             (this.relationID!=null &&
              this.relationID.equals(other.getRelationID()))) &&
            ((this.relationName==null && other.getRelationName()==null) || 
             (this.relationName!=null &&
              this.relationName.equals(other.getRelationName()))) &&
            ((this.modelRelationName==null && other.getModelRelationName()==null) || 
             (this.modelRelationName!=null &&
              this.modelRelationName.equals(other.getModelRelationName()))) &&
            ((this.targetClassName==null && other.getTargetClassName()==null) || 
             (this.targetClassName!=null &&
              this.targetClassName.equals(other.getTargetClassName()))) &&
            ((this.targetProductModuleName==null && other.getTargetProductModuleName()==null) || 
             (this.targetProductModuleName!=null &&
              this.targetProductModuleName.equals(other.getTargetProductModuleName())));
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
        if (getRelationID() != null) {
            _hashCode += getRelationID().hashCode();
        }
        if (getRelationName() != null) {
            _hashCode += getRelationName().hashCode();
        }
        if (getModelRelationName() != null) {
            _hashCode += getModelRelationName().hashCode();
        }
        if (getTargetClassName() != null) {
            _hashCode += getTargetClassName().hashCode();
        }
        if (getTargetProductModuleName() != null) {
            _hashCode += getTargetProductModuleName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RelationKeyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "RelationKeyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelRelationName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modelRelationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetClassName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetClassName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetProductModuleName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetProductModuleName"));
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
