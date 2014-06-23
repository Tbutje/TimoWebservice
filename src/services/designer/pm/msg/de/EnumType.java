/**
 * EnumType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class EnumType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EnumType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "none";
    public static final java.lang.String _value2 = "float";
    public static final java.lang.String _value3 = "integer";
    public static final java.lang.String _value4 = "string";
    public static final java.lang.String _value5 = "date";
    public static final java.lang.String _value6 = "bool";
    public static final java.lang.String _value7 = "unsupported";
    public static final EnumType value1 = new EnumType(_value1);
    public static final EnumType value2 = new EnumType(_value2);
    public static final EnumType value3 = new EnumType(_value3);
    public static final EnumType value4 = new EnumType(_value4);
    public static final EnumType value5 = new EnumType(_value5);
    public static final EnumType value6 = new EnumType(_value6);
    public static final EnumType value7 = new EnumType(_value7);
    public java.lang.String getValue() { return _value_;}
    public static EnumType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EnumType enumeration = (EnumType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EnumType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EnumType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "EnumType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
