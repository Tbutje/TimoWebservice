/**
 * TableLayoutColumnType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class TableLayoutColumnType  implements java.io.Serializable {
    /* name of column */
    private java.lang.String name;

    /* type of column */
    private services.designer.pm.msg.de.TableColumnType type;

    /* key indicator */
    private boolean isKey;

    /* ISO code of language columns (f.i. "DEU"
     *                     			or "ENG") */
    private java.lang.String isoCode;

    /* specified value restriction */
    private services.designer.pm.msg.de.TableColumnValueRestrictionType restriction;

    /* additional specified value extension
     *                         		limits value between restriction and
     *                         		this value */
    private services.designer.pm.msg.de.TableColumnValueRestrictionType extensionRestriction;

    public TableLayoutColumnType() {
    }

    public TableLayoutColumnType(
           java.lang.String name,
           services.designer.pm.msg.de.TableColumnType type,
           boolean isKey,
           java.lang.String isoCode,
           services.designer.pm.msg.de.TableColumnValueRestrictionType restriction,
           services.designer.pm.msg.de.TableColumnValueRestrictionType extensionRestriction) {
           this.name = name;
           this.type = type;
           this.isKey = isKey;
           this.isoCode = isoCode;
           this.restriction = restriction;
           this.extensionRestriction = extensionRestriction;
    }


    /**
     * Gets the name value for this TableLayoutColumnType.
     * 
     * @return name   * name of column
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TableLayoutColumnType.
     * 
     * @param name   * name of column
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the type value for this TableLayoutColumnType.
     * 
     * @return type   * type of column
     */
    public services.designer.pm.msg.de.TableColumnType getType() {
        return type;
    }


    /**
     * Sets the type value for this TableLayoutColumnType.
     * 
     * @param type   * type of column
     */
    public void setType(services.designer.pm.msg.de.TableColumnType type) {
        this.type = type;
    }


    /**
     * Gets the isKey value for this TableLayoutColumnType.
     * 
     * @return isKey   * key indicator
     */
    public boolean isIsKey() {
        return isKey;
    }


    /**
     * Sets the isKey value for this TableLayoutColumnType.
     * 
     * @param isKey   * key indicator
     */
    public void setIsKey(boolean isKey) {
        this.isKey = isKey;
    }


    /**
     * Gets the isoCode value for this TableLayoutColumnType.
     * 
     * @return isoCode   * ISO code of language columns (f.i. "DEU"
     *                     			or "ENG")
     */
    public java.lang.String getIsoCode() {
        return isoCode;
    }


    /**
     * Sets the isoCode value for this TableLayoutColumnType.
     * 
     * @param isoCode   * ISO code of language columns (f.i. "DEU"
     *                     			or "ENG")
     */
    public void setIsoCode(java.lang.String isoCode) {
        this.isoCode = isoCode;
    }


    /**
     * Gets the restriction value for this TableLayoutColumnType.
     * 
     * @return restriction   * specified value restriction
     */
    public services.designer.pm.msg.de.TableColumnValueRestrictionType getRestriction() {
        return restriction;
    }


    /**
     * Sets the restriction value for this TableLayoutColumnType.
     * 
     * @param restriction   * specified value restriction
     */
    public void setRestriction(services.designer.pm.msg.de.TableColumnValueRestrictionType restriction) {
        this.restriction = restriction;
    }


    /**
     * Gets the extensionRestriction value for this TableLayoutColumnType.
     * 
     * @return extensionRestriction   * additional specified value extension
     *                         		limits value between restriction and
     *                         		this value
     */
    public services.designer.pm.msg.de.TableColumnValueRestrictionType getExtensionRestriction() {
        return extensionRestriction;
    }


    /**
     * Sets the extensionRestriction value for this TableLayoutColumnType.
     * 
     * @param extensionRestriction   * additional specified value extension
     *                         		limits value between restriction and
     *                         		this value
     */
    public void setExtensionRestriction(services.designer.pm.msg.de.TableColumnValueRestrictionType extensionRestriction) {
        this.extensionRestriction = extensionRestriction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TableLayoutColumnType)) return false;
        TableLayoutColumnType other = (TableLayoutColumnType) obj;
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
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.isKey == other.isIsKey() &&
            ((this.isoCode==null && other.getIsoCode()==null) || 
             (this.isoCode!=null &&
              this.isoCode.equals(other.getIsoCode()))) &&
            ((this.restriction==null && other.getRestriction()==null) || 
             (this.restriction!=null &&
              this.restriction.equals(other.getRestriction()))) &&
            ((this.extensionRestriction==null && other.getExtensionRestriction()==null) || 
             (this.extensionRestriction!=null &&
              this.extensionRestriction.equals(other.getExtensionRestriction())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += (isIsKey() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIsoCode() != null) {
            _hashCode += getIsoCode().hashCode();
        }
        if (getRestriction() != null) {
            _hashCode += getRestriction().hashCode();
        }
        if (getExtensionRestriction() != null) {
            _hashCode += getExtensionRestriction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TableLayoutColumnType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableLayoutColumnType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableColumnType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restriction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "restriction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableColumnValueRestrictionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionRestriction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extensionRestriction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableColumnValueRestrictionType"));
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
