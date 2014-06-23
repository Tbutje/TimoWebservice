/**
 * TableValueRestrictionKind.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class TableValueRestrictionKind implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TableValueRestrictionKind(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _none = "none";
    public static final java.lang.String _equal = "equal";
    public static final java.lang.String _notequal = "notequal";
    public static final java.lang.String _greater = "greater";
    public static final java.lang.String _greaterequal = "greaterequal";
    public static final java.lang.String _less = "less";
    public static final java.lang.String _lessequal = "lessequal";
    public static final java.lang.String _unsupported = "unsupported";
    public static final TableValueRestrictionKind none = new TableValueRestrictionKind(_none);
    public static final TableValueRestrictionKind equal = new TableValueRestrictionKind(_equal);
    public static final TableValueRestrictionKind notequal = new TableValueRestrictionKind(_notequal);
    public static final TableValueRestrictionKind greater = new TableValueRestrictionKind(_greater);
    public static final TableValueRestrictionKind greaterequal = new TableValueRestrictionKind(_greaterequal);
    public static final TableValueRestrictionKind less = new TableValueRestrictionKind(_less);
    public static final TableValueRestrictionKind lessequal = new TableValueRestrictionKind(_lessequal);
    public static final TableValueRestrictionKind unsupported = new TableValueRestrictionKind(_unsupported);
    public java.lang.String getValue() { return _value_;}
    public static TableValueRestrictionKind fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TableValueRestrictionKind enumeration = (TableValueRestrictionKind)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TableValueRestrictionKind fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TableValueRestrictionKind.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableValueRestrictionKind"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
