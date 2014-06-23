/**
 * TableModifyRowType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class TableModifyRowType  implements java.io.Serializable {
    private services.designer.pm.msg.de.TableRowListType keyCells;

    private services.designer.pm.msg.de.TableRowListType valueCells;

    public TableModifyRowType() {
    }

    public TableModifyRowType(
           services.designer.pm.msg.de.TableRowListType keyCells,
           services.designer.pm.msg.de.TableRowListType valueCells) {
           this.keyCells = keyCells;
           this.valueCells = valueCells;
    }


    /**
     * Gets the keyCells value for this TableModifyRowType.
     * 
     * @return keyCells
     */
    public services.designer.pm.msg.de.TableRowListType getKeyCells() {
        return keyCells;
    }


    /**
     * Sets the keyCells value for this TableModifyRowType.
     * 
     * @param keyCells
     */
    public void setKeyCells(services.designer.pm.msg.de.TableRowListType keyCells) {
        this.keyCells = keyCells;
    }


    /**
     * Gets the valueCells value for this TableModifyRowType.
     * 
     * @return valueCells
     */
    public services.designer.pm.msg.de.TableRowListType getValueCells() {
        return valueCells;
    }


    /**
     * Sets the valueCells value for this TableModifyRowType.
     * 
     * @param valueCells
     */
    public void setValueCells(services.designer.pm.msg.de.TableRowListType valueCells) {
        this.valueCells = valueCells;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TableModifyRowType)) return false;
        TableModifyRowType other = (TableModifyRowType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keyCells==null && other.getKeyCells()==null) || 
             (this.keyCells!=null &&
              this.keyCells.equals(other.getKeyCells()))) &&
            ((this.valueCells==null && other.getValueCells()==null) || 
             (this.valueCells!=null &&
              this.valueCells.equals(other.getValueCells())));
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
        if (getKeyCells() != null) {
            _hashCode += getKeyCells().hashCode();
        }
        if (getValueCells() != null) {
            _hashCode += getValueCells().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TableModifyRowType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableModifyRowType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyCells");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keyCells"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableRowListType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueCells");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueCells"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableRowListType"));
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
