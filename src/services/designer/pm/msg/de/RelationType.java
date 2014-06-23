/**
 * RelationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class RelationType  implements java.io.Serializable {
    /* name of relation */
    private java.lang.String name;

    /* name of reverse relation */
    private java.lang.String reverseName;

    /* minimal cardinality */
    private java.lang.Integer minCardinality;

    /* maximal cardinality (0 = * ) */
    private java.lang.Integer maxCardinality;

    /* minimal cardinality of reverse relation */
    private java.lang.Integer minReverseCardinality;

    /* maximal cardinality of reverse relation (0 = * ) */
    private java.lang.Integer maxReverseCardinality;

    public RelationType() {
    }

    public RelationType(
           java.lang.String name,
           java.lang.String reverseName,
           java.lang.Integer minCardinality,
           java.lang.Integer maxCardinality,
           java.lang.Integer minReverseCardinality,
           java.lang.Integer maxReverseCardinality) {
           this.name = name;
           this.reverseName = reverseName;
           this.minCardinality = minCardinality;
           this.maxCardinality = maxCardinality;
           this.minReverseCardinality = minReverseCardinality;
           this.maxReverseCardinality = maxReverseCardinality;
    }


    /**
     * Gets the name value for this RelationType.
     * 
     * @return name   * name of relation
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RelationType.
     * 
     * @param name   * name of relation
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the reverseName value for this RelationType.
     * 
     * @return reverseName   * name of reverse relation
     */
    public java.lang.String getReverseName() {
        return reverseName;
    }


    /**
     * Sets the reverseName value for this RelationType.
     * 
     * @param reverseName   * name of reverse relation
     */
    public void setReverseName(java.lang.String reverseName) {
        this.reverseName = reverseName;
    }


    /**
     * Gets the minCardinality value for this RelationType.
     * 
     * @return minCardinality   * minimal cardinality
     */
    public java.lang.Integer getMinCardinality() {
        return minCardinality;
    }


    /**
     * Sets the minCardinality value for this RelationType.
     * 
     * @param minCardinality   * minimal cardinality
     */
    public void setMinCardinality(java.lang.Integer minCardinality) {
        this.minCardinality = minCardinality;
    }


    /**
     * Gets the maxCardinality value for this RelationType.
     * 
     * @return maxCardinality   * maximal cardinality (0 = * )
     */
    public java.lang.Integer getMaxCardinality() {
        return maxCardinality;
    }


    /**
     * Sets the maxCardinality value for this RelationType.
     * 
     * @param maxCardinality   * maximal cardinality (0 = * )
     */
    public void setMaxCardinality(java.lang.Integer maxCardinality) {
        this.maxCardinality = maxCardinality;
    }


    /**
     * Gets the minReverseCardinality value for this RelationType.
     * 
     * @return minReverseCardinality   * minimal cardinality of reverse relation
     */
    public java.lang.Integer getMinReverseCardinality() {
        return minReverseCardinality;
    }


    /**
     * Sets the minReverseCardinality value for this RelationType.
     * 
     * @param minReverseCardinality   * minimal cardinality of reverse relation
     */
    public void setMinReverseCardinality(java.lang.Integer minReverseCardinality) {
        this.minReverseCardinality = minReverseCardinality;
    }


    /**
     * Gets the maxReverseCardinality value for this RelationType.
     * 
     * @return maxReverseCardinality   * maximal cardinality of reverse relation (0 = * )
     */
    public java.lang.Integer getMaxReverseCardinality() {
        return maxReverseCardinality;
    }


    /**
     * Sets the maxReverseCardinality value for this RelationType.
     * 
     * @param maxReverseCardinality   * maximal cardinality of reverse relation (0 = * )
     */
    public void setMaxReverseCardinality(java.lang.Integer maxReverseCardinality) {
        this.maxReverseCardinality = maxReverseCardinality;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RelationType)) return false;
        RelationType other = (RelationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.reverseName==null && other.getReverseName()==null) || 
             (this.reverseName!=null &&
              this.reverseName.equals(other.getReverseName()))) &&
            ((this.minCardinality==null && other.getMinCardinality()==null) || 
             (this.minCardinality!=null &&
              this.minCardinality.equals(other.getMinCardinality()))) &&
            ((this.maxCardinality==null && other.getMaxCardinality()==null) || 
             (this.maxCardinality!=null &&
              this.maxCardinality.equals(other.getMaxCardinality()))) &&
            ((this.minReverseCardinality==null && other.getMinReverseCardinality()==null) || 
             (this.minReverseCardinality!=null &&
              this.minReverseCardinality.equals(other.getMinReverseCardinality()))) &&
            ((this.maxReverseCardinality==null && other.getMaxReverseCardinality()==null) || 
             (this.maxReverseCardinality!=null &&
              this.maxReverseCardinality.equals(other.getMaxReverseCardinality())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getReverseName() != null) {
            _hashCode += getReverseName().hashCode();
        }
        if (getMinCardinality() != null) {
            _hashCode += getMinCardinality().hashCode();
        }
        if (getMaxCardinality() != null) {
            _hashCode += getMaxCardinality().hashCode();
        }
        if (getMinReverseCardinality() != null) {
            _hashCode += getMinReverseCardinality().hashCode();
        }
        if (getMaxReverseCardinality() != null) {
            _hashCode += getMaxReverseCardinality().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RelationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "RelationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reverseName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reverseName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minCardinality");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minCardinality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCardinality");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxCardinality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minReverseCardinality");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minReverseCardinality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxReverseCardinality");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxReverseCardinality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
