/**
 * GenerationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class GenerationType  implements java.io.Serializable {
    /* name of generation */
    private java.lang.String name;

    /* date of sales period from (YYYYMMDD, LOWDATE=-99999999) */
    private java.lang.Integer salesPeriodFrom;

    /* date of sales period to (YYYYMMDD, HIGHDATE=99999999) */
    private java.lang.Integer salesPeriodTo;

    /* date of end modification (YYYYMMDD, HIGHDATE=99999999) */
    private java.lang.Integer endModification;

    /* date of end extension (YYYYMMDD, HIGHDATE=99999999) */
    private java.lang.Integer endExtension;

    public GenerationType() {
    }

    public GenerationType(
           java.lang.String name,
           java.lang.Integer salesPeriodFrom,
           java.lang.Integer salesPeriodTo,
           java.lang.Integer endModification,
           java.lang.Integer endExtension) {
           this.name = name;
           this.salesPeriodFrom = salesPeriodFrom;
           this.salesPeriodTo = salesPeriodTo;
           this.endModification = endModification;
           this.endExtension = endExtension;
    }


    /**
     * Gets the name value for this GenerationType.
     * 
     * @return name   * name of generation
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this GenerationType.
     * 
     * @param name   * name of generation
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the salesPeriodFrom value for this GenerationType.
     * 
     * @return salesPeriodFrom   * date of sales period from (YYYYMMDD, LOWDATE=-99999999)
     */
    public java.lang.Integer getSalesPeriodFrom() {
        return salesPeriodFrom;
    }


    /**
     * Sets the salesPeriodFrom value for this GenerationType.
     * 
     * @param salesPeriodFrom   * date of sales period from (YYYYMMDD, LOWDATE=-99999999)
     */
    public void setSalesPeriodFrom(java.lang.Integer salesPeriodFrom) {
        this.salesPeriodFrom = salesPeriodFrom;
    }


    /**
     * Gets the salesPeriodTo value for this GenerationType.
     * 
     * @return salesPeriodTo   * date of sales period to (YYYYMMDD, HIGHDATE=99999999)
     */
    public java.lang.Integer getSalesPeriodTo() {
        return salesPeriodTo;
    }


    /**
     * Sets the salesPeriodTo value for this GenerationType.
     * 
     * @param salesPeriodTo   * date of sales period to (YYYYMMDD, HIGHDATE=99999999)
     */
    public void setSalesPeriodTo(java.lang.Integer salesPeriodTo) {
        this.salesPeriodTo = salesPeriodTo;
    }


    /**
     * Gets the endModification value for this GenerationType.
     * 
     * @return endModification   * date of end modification (YYYYMMDD, HIGHDATE=99999999)
     */
    public java.lang.Integer getEndModification() {
        return endModification;
    }


    /**
     * Sets the endModification value for this GenerationType.
     * 
     * @param endModification   * date of end modification (YYYYMMDD, HIGHDATE=99999999)
     */
    public void setEndModification(java.lang.Integer endModification) {
        this.endModification = endModification;
    }


    /**
     * Gets the endExtension value for this GenerationType.
     * 
     * @return endExtension   * date of end extension (YYYYMMDD, HIGHDATE=99999999)
     */
    public java.lang.Integer getEndExtension() {
        return endExtension;
    }


    /**
     * Sets the endExtension value for this GenerationType.
     * 
     * @param endExtension   * date of end extension (YYYYMMDD, HIGHDATE=99999999)
     */
    public void setEndExtension(java.lang.Integer endExtension) {
        this.endExtension = endExtension;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GenerationType)) return false;
        GenerationType other = (GenerationType) obj;
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
            ((this.salesPeriodFrom==null && other.getSalesPeriodFrom()==null) || 
             (this.salesPeriodFrom!=null &&
              this.salesPeriodFrom.equals(other.getSalesPeriodFrom()))) &&
            ((this.salesPeriodTo==null && other.getSalesPeriodTo()==null) || 
             (this.salesPeriodTo!=null &&
              this.salesPeriodTo.equals(other.getSalesPeriodTo()))) &&
            ((this.endModification==null && other.getEndModification()==null) || 
             (this.endModification!=null &&
              this.endModification.equals(other.getEndModification()))) &&
            ((this.endExtension==null && other.getEndExtension()==null) || 
             (this.endExtension!=null &&
              this.endExtension.equals(other.getEndExtension())));
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
        if (getSalesPeriodFrom() != null) {
            _hashCode += getSalesPeriodFrom().hashCode();
        }
        if (getSalesPeriodTo() != null) {
            _hashCode += getSalesPeriodTo().hashCode();
        }
        if (getEndModification() != null) {
            _hashCode += getEndModification().hashCode();
        }
        if (getEndExtension() != null) {
            _hashCode += getEndExtension().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GenerationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "GenerationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesPeriodFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "salesPeriodFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesPeriodTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "salesPeriodTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endModification");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endModification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endExtension"));
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
