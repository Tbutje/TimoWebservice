/**
 * GetTableDataResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class GetTableDataResponseType  implements java.io.Serializable {
    /* return value of this operation */
    private services.designer.pm.msg.de.OperationResponseType operationResponse;

    /* list of logical columns */
    private services.designer.pm.msg.de.TableLayoutColumnType[] tableColumns;

    /* table data, according to columns of layout */
    private java.lang.String[][] tableValues;

    public GetTableDataResponseType() {
    }

    public GetTableDataResponseType(
           services.designer.pm.msg.de.OperationResponseType operationResponse,
           services.designer.pm.msg.de.TableLayoutColumnType[] tableColumns,
           java.lang.String[][] tableValues) {
           this.operationResponse = operationResponse;
           this.tableColumns = tableColumns;
           this.tableValues = tableValues;
    }


    /**
     * Gets the operationResponse value for this GetTableDataResponseType.
     * 
     * @return operationResponse   * return value of this operation
     */
    public services.designer.pm.msg.de.OperationResponseType getOperationResponse() {
        return operationResponse;
    }


    /**
     * Sets the operationResponse value for this GetTableDataResponseType.
     * 
     * @param operationResponse   * return value of this operation
     */
    public void setOperationResponse(services.designer.pm.msg.de.OperationResponseType operationResponse) {
        this.operationResponse = operationResponse;
    }


    /**
     * Gets the tableColumns value for this GetTableDataResponseType.
     * 
     * @return tableColumns   * list of logical columns
     */
    public services.designer.pm.msg.de.TableLayoutColumnType[] getTableColumns() {
        return tableColumns;
    }


    /**
     * Sets the tableColumns value for this GetTableDataResponseType.
     * 
     * @param tableColumns   * list of logical columns
     */
    public void setTableColumns(services.designer.pm.msg.de.TableLayoutColumnType[] tableColumns) {
        this.tableColumns = tableColumns;
    }

    public services.designer.pm.msg.de.TableLayoutColumnType getTableColumns(int i) {
        return this.tableColumns[i];
    }

    public void setTableColumns(int i, services.designer.pm.msg.de.TableLayoutColumnType _value) {
        this.tableColumns[i] = _value;
    }


    /**
     * Gets the tableValues value for this GetTableDataResponseType.
     * 
     * @return tableValues   * table data, according to columns of layout
     */
    public java.lang.String[][] getTableValues() {
        return tableValues;
    }


    /**
     * Sets the tableValues value for this GetTableDataResponseType.
     * 
     * @param tableValues   * table data, according to columns of layout
     */
    public void setTableValues(java.lang.String[][] tableValues) {
        this.tableValues = tableValues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTableDataResponseType)) return false;
        GetTableDataResponseType other = (GetTableDataResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operationResponse==null && other.getOperationResponse()==null) || 
             (this.operationResponse!=null &&
              this.operationResponse.equals(other.getOperationResponse()))) &&
            ((this.tableColumns==null && other.getTableColumns()==null) || 
             (this.tableColumns!=null &&
              java.util.Arrays.equals(this.tableColumns, other.getTableColumns()))) &&
            ((this.tableValues==null && other.getTableValues()==null) || 
             (this.tableValues!=null &&
              java.util.Arrays.equals(this.tableValues, other.getTableValues())));
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
        if (getOperationResponse() != null) {
            _hashCode += getOperationResponse().hashCode();
        }
        if (getTableColumns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTableColumns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTableColumns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTableValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTableValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTableValues(), i);
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
        new org.apache.axis.description.TypeDesc(GetTableDataResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "GetTableDataResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operationResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableColumns");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tableColumns"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableLayoutColumnType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableValues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tableValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableRowValuesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "rowValues"));
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
