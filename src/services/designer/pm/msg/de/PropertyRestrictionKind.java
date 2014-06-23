/**
 * PropertyRestrictionKind.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class PropertyRestrictionKind implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PropertyRestrictionKind(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _none = "none";
    public static final java.lang.String _singleValue = "singleValue";
    public static final java.lang.String _range = "range";
    public static final java.lang.String _singleList = "singleList";
    public static final java.lang.String _enumAssignment = "enumAssignment";
    public static final java.lang.String _enumAssignmentSelectedValues = "enumAssignmentSelectedValues";
    public static final java.lang.String _tableColumnAssignment = "tableColumnAssignment";
    public static final java.lang.String _tableColumnAssignmentSelectedValues = "tableColumnAssignmentSelectedValues";
    public static final java.lang.String _unsupported = "unsupported";
    public static final PropertyRestrictionKind none = new PropertyRestrictionKind(_none);
    public static final PropertyRestrictionKind singleValue = new PropertyRestrictionKind(_singleValue);
    public static final PropertyRestrictionKind range = new PropertyRestrictionKind(_range);
    public static final PropertyRestrictionKind singleList = new PropertyRestrictionKind(_singleList);
    public static final PropertyRestrictionKind enumAssignment = new PropertyRestrictionKind(_enumAssignment);
    public static final PropertyRestrictionKind enumAssignmentSelectedValues = new PropertyRestrictionKind(_enumAssignmentSelectedValues);
    public static final PropertyRestrictionKind tableColumnAssignment = new PropertyRestrictionKind(_tableColumnAssignment);
    public static final PropertyRestrictionKind tableColumnAssignmentSelectedValues = new PropertyRestrictionKind(_tableColumnAssignmentSelectedValues);
    public static final PropertyRestrictionKind unsupported = new PropertyRestrictionKind(_unsupported);
    public java.lang.String getValue() { return _value_;}
    public static PropertyRestrictionKind fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PropertyRestrictionKind enumeration = (PropertyRestrictionKind)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PropertyRestrictionKind fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PropertyRestrictionKind.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyRestrictionKind"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
