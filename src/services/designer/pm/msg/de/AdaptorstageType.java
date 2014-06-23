/**
 * AdaptorstageType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class AdaptorstageType  implements java.io.Serializable {
    /* name of adaptorstage */
    private java.lang.String name;

    /* date of valid from (YYYYMMDD, LOWDATE=-99999999) */
    private java.lang.Integer validFrom;

    /* date of valid to (YYYYMMDD, HIGHDATE=99999999) */
    private java.lang.Integer validTo;

    public AdaptorstageType() {
    }

    public AdaptorstageType(
           java.lang.String name,
           java.lang.Integer validFrom,
           java.lang.Integer validTo) {
           this.name = name;
           this.validFrom = validFrom;
           this.validTo = validTo;
    }


    /**
     * Gets the name value for this AdaptorstageType.
     * 
     * @return name   * name of adaptorstage
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AdaptorstageType.
     * 
     * @param name   * name of adaptorstage
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the validFrom value for this AdaptorstageType.
     * 
     * @return validFrom   * date of valid from (YYYYMMDD, LOWDATE=-99999999)
     */
    public java.lang.Integer getValidFrom() {
        return validFrom;
    }


    /**
     * Sets the validFrom value for this AdaptorstageType.
     * 
     * @param validFrom   * date of valid from (YYYYMMDD, LOWDATE=-99999999)
     */
    public void setValidFrom(java.lang.Integer validFrom) {
        this.validFrom = validFrom;
    }


    /**
     * Gets the validTo value for this AdaptorstageType.
     * 
     * @return validTo   * date of valid to (YYYYMMDD, HIGHDATE=99999999)
     */
    public java.lang.Integer getValidTo() {
        return validTo;
    }


    /**
     * Sets the validTo value for this AdaptorstageType.
     * 
     * @param validTo   * date of valid to (YYYYMMDD, HIGHDATE=99999999)
     */
    public void setValidTo(java.lang.Integer validTo) {
        this.validTo = validTo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdaptorstageType)) return false;
        AdaptorstageType other = (AdaptorstageType) obj;
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
            ((this.validFrom==null && other.getValidFrom()==null) || 
             (this.validFrom!=null &&
              this.validFrom.equals(other.getValidFrom()))) &&
            ((this.validTo==null && other.getValidTo()==null) || 
             (this.validTo!=null &&
              this.validTo.equals(other.getValidTo())));
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
        if (getValidFrom() != null) {
            _hashCode += getValidFrom().hashCode();
        }
        if (getValidTo() != null) {
            _hashCode += getValidTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdaptorstageType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "AdaptorstageType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validTo"));
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
