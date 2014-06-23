/**
 * RelationDescriptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class RelationDescriptionType  implements java.io.Serializable {
    private java.lang.String targetClassName;

    private java.lang.String targetProductModuleName;

    private java.lang.String modelRelationName;

    private services.designer.pm.msg.de.RelationType relation;

    public RelationDescriptionType() {
    }

    public RelationDescriptionType(
           java.lang.String targetClassName,
           java.lang.String targetProductModuleName,
           java.lang.String modelRelationName,
           services.designer.pm.msg.de.RelationType relation) {
           this.targetClassName = targetClassName;
           this.targetProductModuleName = targetProductModuleName;
           this.modelRelationName = modelRelationName;
           this.relation = relation;
    }


    /**
     * Gets the targetClassName value for this RelationDescriptionType.
     * 
     * @return targetClassName
     */
    public java.lang.String getTargetClassName() {
        return targetClassName;
    }


    /**
     * Sets the targetClassName value for this RelationDescriptionType.
     * 
     * @param targetClassName
     */
    public void setTargetClassName(java.lang.String targetClassName) {
        this.targetClassName = targetClassName;
    }


    /**
     * Gets the targetProductModuleName value for this RelationDescriptionType.
     * 
     * @return targetProductModuleName
     */
    public java.lang.String getTargetProductModuleName() {
        return targetProductModuleName;
    }


    /**
     * Sets the targetProductModuleName value for this RelationDescriptionType.
     * 
     * @param targetProductModuleName
     */
    public void setTargetProductModuleName(java.lang.String targetProductModuleName) {
        this.targetProductModuleName = targetProductModuleName;
    }


    /**
     * Gets the modelRelationName value for this RelationDescriptionType.
     * 
     * @return modelRelationName
     */
    public java.lang.String getModelRelationName() {
        return modelRelationName;
    }


    /**
     * Sets the modelRelationName value for this RelationDescriptionType.
     * 
     * @param modelRelationName
     */
    public void setModelRelationName(java.lang.String modelRelationName) {
        this.modelRelationName = modelRelationName;
    }


    /**
     * Gets the relation value for this RelationDescriptionType.
     * 
     * @return relation
     */
    public services.designer.pm.msg.de.RelationType getRelation() {
        return relation;
    }


    /**
     * Sets the relation value for this RelationDescriptionType.
     * 
     * @param relation
     */
    public void setRelation(services.designer.pm.msg.de.RelationType relation) {
        this.relation = relation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RelationDescriptionType)) return false;
        RelationDescriptionType other = (RelationDescriptionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetClassName==null && other.getTargetClassName()==null) || 
             (this.targetClassName!=null &&
              this.targetClassName.equals(other.getTargetClassName()))) &&
            ((this.targetProductModuleName==null && other.getTargetProductModuleName()==null) || 
             (this.targetProductModuleName!=null &&
              this.targetProductModuleName.equals(other.getTargetProductModuleName()))) &&
            ((this.modelRelationName==null && other.getModelRelationName()==null) || 
             (this.modelRelationName!=null &&
              this.modelRelationName.equals(other.getModelRelationName()))) &&
            ((this.relation==null && other.getRelation()==null) || 
             (this.relation!=null &&
              this.relation.equals(other.getRelation())));
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
        if (getTargetClassName() != null) {
            _hashCode += getTargetClassName().hashCode();
        }
        if (getTargetProductModuleName() != null) {
            _hashCode += getTargetProductModuleName().hashCode();
        }
        if (getModelRelationName() != null) {
            _hashCode += getModelRelationName().hashCode();
        }
        if (getRelation() != null) {
            _hashCode += getRelation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RelationDescriptionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "RelationDescriptionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetClassName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetClassName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetProductModuleName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetProductModuleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("relation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "RelationType"));
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
