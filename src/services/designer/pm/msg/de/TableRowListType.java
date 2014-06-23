/**
 * TableRowListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class TableRowListType  implements java.io.Serializable {
    private java.lang.String[] columnNames;

    private java.lang.String[][] rowValues;

    public TableRowListType() {
    }

    public TableRowListType(
           java.lang.String[] columnNames,
           java.lang.String[][] rowValues) {
           this.columnNames = columnNames;
           this.rowValues = rowValues;
    }


    /**
     * Gets the columnNames value for this TableRowListType.
     * 
     * @return columnNames
     */
    public java.lang.String[] getColumnNames() {
        return columnNames;
    }


    /**
     * Sets the columnNames value for this TableRowListType.
     * 
     * @param columnNames
     */
    public void setColumnNames(java.lang.String[] columnNames) {
        this.columnNames = columnNames;
    }

    public java.lang.String getColumnNames(int i) {
        return this.columnNames[i];
    }

    public void setColumnNames(int i, java.lang.String _value) {
        this.columnNames[i] = _value;
    }


    /**
     * Gets the rowValues value for this TableRowListType.
     * 
     * @return rowValues
     */
    public java.lang.String[][] getRowValues() {
        return rowValues;
    }


    /**
     * Sets the rowValues value for this TableRowListType.
     * 
     * @param rowValues
     */
    public void setRowValues(java.lang.String[][] rowValues) {
        this.rowValues = rowValues;
    }

    public java.lang.String[] getRowValues(int i) {
        return this.rowValues[i];
    }

    public void setRowValues(int i, java.lang.String[] _value) {
        this.rowValues[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TableRowListType)) return false;
        TableRowListType other = (TableRowListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.columnNames==null && other.getColumnNames()==null) || 
             (this.columnNames!=null &&
              java.util.Arrays.equals(this.columnNames, other.getColumnNames()))) &&
            ((this.rowValues==null && other.getRowValues()==null) || 
             (this.rowValues!=null &&
              java.util.Arrays.equals(this.rowValues, other.getRowValues())));
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
        if (getColumnNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColumnNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColumnNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRowValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRowValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRowValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TableRowListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableRowListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "columnNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowValues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableRowValuesType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
