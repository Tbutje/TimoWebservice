/**
 * PMDesignerServices_BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class PMDesignerServices_BindingStub extends org.apache.axis.client.Stub implements services.designer.pm.msg.de.PMDesignerServices_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[46];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modifyProperty");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "adaptorstageID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "propertyName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "newValue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyValueType"), services.designer.pm.msg.de.PropertyValueType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.OperationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("openSession");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "datasource"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "workspaceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OpenSessionResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.OpenSessionResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("closeSession");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.OperationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createProductModule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "folderID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "templateID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "CreateProductModuleResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.CreateProductModuleResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setModuleName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.OperationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setGenerationName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "generationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.OperationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setAdaptorstageName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "adaptorstageID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.OperationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("beginTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.OperationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rollbackTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.OperationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("commitTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.OperationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteProductModule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.OperationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createGeneration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "CreateGenerationResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.CreateGenerationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createAdaptorstage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "generationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "templateID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "CreateAdaptorstageResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.CreateAdaptorstageResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createRelation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "adaptorstageID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "modelRelationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "targetObjectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "CreateRelationResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.CreateRelationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteRelation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "adaptorstageID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "relationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.OperationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modifyAdaptorstage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "generationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "adaptorstageID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "adaptorstageData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "AdaptorstageType"), services.designer.pm.msg.de.AdaptorstageType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.OperationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modifyGeneration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "generationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "generationData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "GenerationType"), services.designer.pm.msg.de.GenerationType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.OperationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteGeneration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "generationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.OperationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteAdaptorstage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "adaptorstageID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.OperationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modifyRelation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "adaptorstageID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "relationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "relationData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "RelationType"), services.designer.pm.msg.de.RelationType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.OperationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findObjectID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "className"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "FindIDResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.FindIDResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findClassID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "className"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "FindIDResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.FindIDResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findGenerationID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "className"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "generationName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "FindIDResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.FindIDResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findAdaptStageID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "className"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "generationName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "adaptStageName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "FindIDResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.FindIDResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findFolderID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "className"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fullPath"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "libraryName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "FindIDResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.FindIDResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findTemplateID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "className"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "templateName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "FindIDResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.FindIDResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findModelRelationID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sourceClassID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "destClassID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "modelRelationName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "FindIDResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.FindIDResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPropertyType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "className"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "propertyName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "generationName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "adaptStageName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyTypeResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.PropertyTypeResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFolderPath");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "templateID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "GetFolderPathResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.GetFolderPathResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPropertyRestriction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "adaptorstageID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "propertyName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "GetPropertyRestrictionResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.GetPropertyRestrictionResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modifyPropertyRestriction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "adaptorstageID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "propertyName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "restriction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyRestrictionType"), services.designer.pm.msg.de.PropertyRestrictionType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.OperationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modifyPropertyList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "ObjectKeyType"), services.designer.pm.msg.de.ObjectKeyType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "propertyList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyDataType"), services.designer.pm.msg.de.PropertyDataType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "replaceAll"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.OperationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createProductModuleEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "className"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "productModuleName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "folderID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "templateName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "propertyList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyDataType"), services.designer.pm.msg.de.PropertyDataType[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "CreateProductModuleExResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.CreateProductModuleExResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createAdaptorStageEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "className"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "productModuleName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "folderID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "templateName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "generation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "GenerationType"), services.designer.pm.msg.de.GenerationType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "adaptorstage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "AdaptorstageType"), services.designer.pm.msg.de.AdaptorstageType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "propertyList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyDataType"), services.designer.pm.msg.de.PropertyDataType[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "CreateAdaptorStageExResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.CreateAdaptorStageExResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteProductModuleByObjectKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "ObjectKeyType"), services.designer.pm.msg.de.ObjectKeyType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.OperationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteAdaptorStageByObjectKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "ObjectKeyType"), services.designer.pm.msg.de.ObjectKeyType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.OperationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createRelations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "ObjectKeyType"), services.designer.pm.msg.de.ObjectKeyType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "relationList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "RelationDescriptionType"), services.designer.pm.msg.de.RelationDescriptionType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "replaceAll"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "CreateRelationsResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.CreateRelationsResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteRelations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "ObjectKeyType"), services.designer.pm.msg.de.ObjectKeyType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "relationKeyList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "RelationKeyType"), services.designer.pm.msg.de.RelationKeyType[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.OperationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modifyTableData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "delRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableRowListType"), services.designer.pm.msg.de.TableRowListType.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "updRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableModifyRowType"), services.designer.pm.msg.de.TableModifyRowType.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "addRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableRowListType"), services.designer.pm.msg.de.TableRowListType.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.OperationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modifyEnumeration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "delValues"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "updValues"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "EnumDataType"), services.designer.pm.msg.de.EnumDataType[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "replaceAll"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.OperationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTableLayout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "GetTableLayoutResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.GetTableLayoutResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTableData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "GetTableDataResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.GetTableDataResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modifyPropertyTag");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "adaptorstageID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "propertyName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tagID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "newTagValue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.OperationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createTableEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "libraryID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "folderID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tableName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tableColumns"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableLayoutColumnType"), services.designer.pm.msg.de.TableLayoutColumnType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tableValue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableRowListType"), services.designer.pm.msg.de.TableRowListType[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "CreateTableExResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.CreateTableExResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createEnumEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "libraryID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "folderID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enumName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enumType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "EnumType"), services.designer.pm.msg.de.EnumType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enumLayout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "enumValues"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "EnumDataType"), services.designer.pm.msg.de.EnumDataType[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "CreateEnumExResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.CreateEnumExResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findLibraryID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType"), services.designer.pm.msg.de.SessionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "libraryName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "FindIDResponseType"));
        oper.setReturnClass(services.designer.pm.msg.de.FindIDResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

    }

    public PMDesignerServices_BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public PMDesignerServices_BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public PMDesignerServices_BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "AdaptorstageType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.AdaptorstageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "CreateAdaptorStageExResponseType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.CreateAdaptorStageExResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "CreateAdaptorstageResponseType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.CreateAdaptorstageResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "CreateEnumExResponseType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.CreateEnumExResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "CreateGenerationResponseType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.CreateGenerationResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "CreateProductModuleExResponseType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.CreateProductModuleExResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "CreateProductModuleResponseType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.CreateProductModuleResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "CreateRelationResponseType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.CreateRelationResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "CreateRelationsResponseType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.CreateRelationsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "CreateTableExResponseType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.CreateTableExResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "EnumDataType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.EnumDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "EnumLanguageDataType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.EnumLanguageDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "EnumType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.EnumType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "FindIDResponseType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.FindIDResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "GenerationType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.GenerationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "GetFolderPathResponseType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.GetFolderPathResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "GetPropertyRestrictionResponseType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.GetPropertyRestrictionResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "GetTableDataResponseType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.GetTableDataResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "GetTableLayoutResponseType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.GetTableLayoutResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "ModuleDescriptionType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.ModuleDescriptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "MultiLanguageString");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.MultiLanguageString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "ObjectKeyType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.ObjectKeyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OpenSessionResponseType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.OpenSessionResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "OperationResponseType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.OperationResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyDataType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.PropertyDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyEnumRestrictionType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.PropertyEnumRestrictionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyRangeRestrictionType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.PropertyRangeRestrictionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyRangeRestrictionValueType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.PropertyRangeRestrictionValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyRestrictionKind");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.PropertyRestrictionKind.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyRestrictionType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.PropertyRestrictionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyTableColumnRestrictionType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.PropertyTableColumnRestrictionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyTypeResponseType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.PropertyTypeResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyValueListType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.PropertyValueType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyValueType");
            qName2 = new javax.xml.namespace.QName("", "valueList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PropertyValueType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.PropertyValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "RelationDescriptionType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.RelationDescriptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "RelationKeyType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.RelationKeyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "RelationType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.RelationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "SessionType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.SessionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableColumnType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.TableColumnType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableColumnValueRestrictionType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.TableColumnValueRestrictionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableLayoutColumnType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.TableLayoutColumnType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableModifyRowType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.TableModifyRowType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableRowListType");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.TableRowListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableRowValuesListType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableRowValuesType");
            qName2 = new javax.xml.namespace.QName("", "rowValues");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableRowValuesType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "columnValue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "TableValueRestrictionKind");
            cachedSerQNames.add(qName);
            cls = services.designer.pm.msg.de.TableValueRestrictionKind.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public services.designer.pm.msg.de.OperationResponseType modifyProperty(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String adaptorstageID, java.lang.String propertyName, services.designer.pm.msg.de.PropertyValueType newValue) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/modifyProperty");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "modifyProperty"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, objectID, adaptorstageID, propertyName, newValue});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.OperationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.OperationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.OperationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.OpenSessionResponseType openSession(java.lang.String userName, java.lang.String password, java.lang.String datasource, java.lang.String workspaceID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/openSession");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "openSession"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password, datasource, workspaceID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.OpenSessionResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.OpenSessionResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.OpenSessionResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.OperationResponseType closeSession(services.designer.pm.msg.de.SessionType session) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/closeSession");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "closeSession"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.OperationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.OperationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.OperationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.CreateProductModuleResponseType createProductModule(services.designer.pm.msg.de.SessionType session, java.lang.String folderID, java.lang.String templateID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/createProductModule");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "createProductModule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, folderID, templateID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.CreateProductModuleResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.CreateProductModuleResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.CreateProductModuleResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.OperationResponseType setModuleName(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String name) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/setModuleName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "setModuleName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, objectID, name});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.OperationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.OperationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.OperationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.OperationResponseType setGenerationName(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String generationID, java.lang.String name) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/setGenerationName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "setGenerationName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, objectID, generationID, name});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.OperationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.OperationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.OperationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.OperationResponseType setAdaptorstageName(services.designer.pm.msg.de.SessionType session, java.lang.String adaptorstageID, java.lang.String name) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/setAdaptorstageName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "setAdaptorstageName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, adaptorstageID, name});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.OperationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.OperationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.OperationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.OperationResponseType beginTransaction(services.designer.pm.msg.de.SessionType session) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/beginTransaction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "beginTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.OperationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.OperationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.OperationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.OperationResponseType rollbackTransaction(services.designer.pm.msg.de.SessionType session) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/rollbackTransaction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "rollbackTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.OperationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.OperationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.OperationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.OperationResponseType commitTransaction(services.designer.pm.msg.de.SessionType session) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/commitTransaction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "commitTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.OperationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.OperationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.OperationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.OperationResponseType deleteProductModule(services.designer.pm.msg.de.SessionType session, java.lang.String objectID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/deleteProductModule");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "deleteProductModule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, objectID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.OperationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.OperationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.OperationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.CreateGenerationResponseType createGeneration(services.designer.pm.msg.de.SessionType session, java.lang.String objectID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/createGeneration");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "createGeneration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, objectID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.CreateGenerationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.CreateGenerationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.CreateGenerationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.CreateAdaptorstageResponseType createAdaptorstage(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String generationID, java.lang.String templateID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/createAdaptorstage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "createAdaptorstage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, objectID, generationID, templateID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.CreateAdaptorstageResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.CreateAdaptorstageResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.CreateAdaptorstageResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.CreateRelationResponseType createRelation(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String adaptorstageID, java.lang.String modelRelationID, java.lang.String targetObjectID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/createRelation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "createRelation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, objectID, adaptorstageID, modelRelationID, targetObjectID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.CreateRelationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.CreateRelationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.CreateRelationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.OperationResponseType deleteRelation(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String adaptorstageID, java.lang.String relationID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/deleteRelation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "deleteRelation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, objectID, adaptorstageID, relationID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.OperationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.OperationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.OperationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.OperationResponseType modifyAdaptorstage(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String generationID, java.lang.String adaptorstageID, services.designer.pm.msg.de.AdaptorstageType adaptorstageData) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/modifyAdaptorstage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "modifyAdaptorstage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, objectID, generationID, adaptorstageID, adaptorstageData});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.OperationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.OperationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.OperationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.OperationResponseType modifyGeneration(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String generationID, services.designer.pm.msg.de.GenerationType generationData) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/modifyGeneration");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "modifyGeneration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, objectID, generationID, generationData});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.OperationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.OperationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.OperationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.OperationResponseType deleteGeneration(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String generationID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/deleteGeneration");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "deleteGeneration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, objectID, generationID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.OperationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.OperationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.OperationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.OperationResponseType deleteAdaptorstage(services.designer.pm.msg.de.SessionType session, java.lang.String adaptorstageID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/deleteAdaptorstage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "deleteAdaptorstage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, adaptorstageID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.OperationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.OperationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.OperationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.OperationResponseType modifyRelation(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String adaptorstageID, java.lang.String relationID, services.designer.pm.msg.de.RelationType relationData) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/modifyRelation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "modifyRelation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, objectID, adaptorstageID, relationID, relationData});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.OperationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.OperationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.OperationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.FindIDResponseType findObjectID(services.designer.pm.msg.de.SessionType session, java.lang.String className, java.lang.String objectName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/findObjectID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "findObjectID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, className, objectName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.FindIDResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.FindIDResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.FindIDResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.FindIDResponseType findClassID(services.designer.pm.msg.de.SessionType session, java.lang.String className) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/findClassID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "findClassID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, className});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.FindIDResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.FindIDResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.FindIDResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.FindIDResponseType findGenerationID(services.designer.pm.msg.de.SessionType session, java.lang.String className, java.lang.String objectName, java.lang.String generationName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/findGenerationID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "findGenerationID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, className, objectName, generationName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.FindIDResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.FindIDResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.FindIDResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.FindIDResponseType findAdaptStageID(services.designer.pm.msg.de.SessionType session, java.lang.String className, java.lang.String objectName, java.lang.String generationName, java.lang.String adaptStageName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/findAdaptStageID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "findAdaptStageID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, className, objectName, generationName, adaptStageName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.FindIDResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.FindIDResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.FindIDResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.FindIDResponseType findFolderID(services.designer.pm.msg.de.SessionType session, java.lang.String className, java.lang.String fullPath, java.lang.String libraryName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/findFolderID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "findFolderID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, className, fullPath, libraryName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.FindIDResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.FindIDResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.FindIDResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.FindIDResponseType findTemplateID(services.designer.pm.msg.de.SessionType session, java.lang.String className, java.lang.String templateName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/findTemplateID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "findTemplateID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, className, templateName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.FindIDResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.FindIDResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.FindIDResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.FindIDResponseType findModelRelationID(services.designer.pm.msg.de.SessionType session, java.lang.String sourceClassID, java.lang.String destClassID, java.lang.String modelRelationName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/findModelRelationID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "findModelRelationID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, sourceClassID, destClassID, modelRelationName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.FindIDResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.FindIDResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.FindIDResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.PropertyTypeResponseType getPropertyType(services.designer.pm.msg.de.SessionType session, java.lang.String className, java.lang.String objectName, java.lang.String propertyName, java.lang.String generationName, java.lang.String adaptStageName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/getPropertyType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "getPropertyType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, className, objectName, propertyName, generationName, adaptStageName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.PropertyTypeResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.PropertyTypeResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.PropertyTypeResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.GetFolderPathResponseType getFolderPath(services.designer.pm.msg.de.SessionType session, java.lang.String templateID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/getFolderPath");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "getFolderPath"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, templateID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.GetFolderPathResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.GetFolderPathResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.GetFolderPathResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.GetPropertyRestrictionResponseType getPropertyRestriction(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String adaptorstageID, java.lang.String propertyName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/getPropertyRestriction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "getPropertyRestriction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, objectID, adaptorstageID, propertyName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.GetPropertyRestrictionResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.GetPropertyRestrictionResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.GetPropertyRestrictionResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.OperationResponseType modifyPropertyRestriction(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String adaptorstageID, java.lang.String propertyName, services.designer.pm.msg.de.PropertyRestrictionType restriction) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/modifyPropertyRestriction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "modifyPropertyRestriction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, objectID, adaptorstageID, propertyName, restriction});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.OperationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.OperationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.OperationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.OperationResponseType modifyPropertyList(services.designer.pm.msg.de.SessionType session, services.designer.pm.msg.de.ObjectKeyType objectKey, services.designer.pm.msg.de.PropertyDataType[] propertyList, boolean replaceAll) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/modifyPropertyList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "modifyPropertyList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, objectKey, propertyList, new java.lang.Boolean(replaceAll)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.OperationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.OperationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.OperationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.CreateProductModuleExResponseType createProductModuleEx(services.designer.pm.msg.de.SessionType session, java.lang.String className, java.lang.String productModuleName, java.lang.String folderID, java.lang.String templateName, services.designer.pm.msg.de.PropertyDataType[] propertyList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/createProductModuleEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "createProductModuleEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, className, productModuleName, folderID, templateName, propertyList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.CreateProductModuleExResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.CreateProductModuleExResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.CreateProductModuleExResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.CreateAdaptorStageExResponseType createAdaptorStageEx(services.designer.pm.msg.de.SessionType session, java.lang.String className, java.lang.String productModuleName, java.lang.String folderID, java.lang.String templateName, services.designer.pm.msg.de.GenerationType generation, services.designer.pm.msg.de.AdaptorstageType adaptorstage, services.designer.pm.msg.de.PropertyDataType[] propertyList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/createAdaptorStageEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "createAdaptorStageEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, className, productModuleName, folderID, templateName, generation, adaptorstage, propertyList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.CreateAdaptorStageExResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.CreateAdaptorStageExResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.CreateAdaptorStageExResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.OperationResponseType deleteProductModuleByObjectKey(services.designer.pm.msg.de.SessionType session, services.designer.pm.msg.de.ObjectKeyType objectKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/deleteProductModuleByObjectKey");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "deleteProductModuleByObjectKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, objectKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.OperationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.OperationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.OperationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.OperationResponseType deleteAdaptorStageByObjectKey(services.designer.pm.msg.de.SessionType session, services.designer.pm.msg.de.ObjectKeyType objectKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/deleteAdaptorStageByObjectKey");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "deleteAdaptorStageByObjectKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, objectKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.OperationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.OperationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.OperationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.CreateRelationsResponseType createRelations(services.designer.pm.msg.de.SessionType session, services.designer.pm.msg.de.ObjectKeyType objectKey, services.designer.pm.msg.de.RelationDescriptionType[] relationList, boolean replaceAll) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/createRelations");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "createRelations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, objectKey, relationList, new java.lang.Boolean(replaceAll)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.CreateRelationsResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.CreateRelationsResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.CreateRelationsResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.OperationResponseType deleteRelations(services.designer.pm.msg.de.SessionType session, services.designer.pm.msg.de.ObjectKeyType objectKey, services.designer.pm.msg.de.RelationKeyType[] relationKeyList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/deleteRelations");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "deleteRelations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, objectKey, relationKeyList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.OperationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.OperationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.OperationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.OperationResponseType modifyTableData(services.designer.pm.msg.de.SessionType session, java.lang.String name, services.designer.pm.msg.de.TableRowListType delRows, services.designer.pm.msg.de.TableModifyRowType updRows, services.designer.pm.msg.de.TableRowListType addRows) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/modifyTableData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "modifyTableData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, name, delRows, updRows, addRows});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.OperationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.OperationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.OperationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.OperationResponseType modifyEnumeration(services.designer.pm.msg.de.SessionType session, java.lang.String name, java.lang.String[] delValues, services.designer.pm.msg.de.EnumDataType[] updValues, boolean replaceAll) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/modifyEnumeration");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "modifyEnumeration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, name, delValues, updValues, new java.lang.Boolean(replaceAll)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.OperationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.OperationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.OperationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.GetTableLayoutResponseType getTableLayout(services.designer.pm.msg.de.SessionType session, java.lang.String name) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/getTableLayout");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "getTableLayout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, name});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.GetTableLayoutResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.GetTableLayoutResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.GetTableLayoutResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.GetTableDataResponseType getTableData(services.designer.pm.msg.de.SessionType session, java.lang.String name) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/getTableData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "getTableData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, name});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.GetTableDataResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.GetTableDataResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.GetTableDataResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.OperationResponseType modifyPropertyTag(services.designer.pm.msg.de.SessionType session, java.lang.String objectID, java.lang.String adaptorstageID, java.lang.String propertyName, java.lang.String tagID, java.lang.String newTagValue) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/modifyPropertyTag");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "modifyPropertyTag"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, objectID, adaptorstageID, propertyName, tagID, newTagValue});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.OperationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.OperationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.OperationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.CreateTableExResponseType createTableEx(services.designer.pm.msg.de.SessionType session, java.lang.String libraryID, java.lang.String folderID, java.lang.String tableName, services.designer.pm.msg.de.TableLayoutColumnType[] tableColumns, services.designer.pm.msg.de.TableRowListType[] tableValue) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/createTableEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "createTableEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, libraryID, folderID, tableName, tableColumns, tableValue});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.CreateTableExResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.CreateTableExResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.CreateTableExResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.CreateEnumExResponseType createEnumEx(services.designer.pm.msg.de.SessionType session, java.lang.String libraryID, java.lang.String folderID, java.lang.String enumName, services.designer.pm.msg.de.EnumType enumType, java.lang.String[] enumLayout, services.designer.pm.msg.de.EnumDataType[] enumValues) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/createEnumEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "createEnumEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, libraryID, folderID, enumName, enumType, enumLayout, enumValues});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.CreateEnumExResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.CreateEnumExResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.CreateEnumExResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public services.designer.pm.msg.de.FindIDResponseType findLibraryID(services.designer.pm.msg.de.SessionType session, java.lang.String libraryName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:de:msg:pm:designer:services/findLibraryID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "findLibraryID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {session, libraryName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (services.designer.pm.msg.de.FindIDResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (services.designer.pm.msg.de.FindIDResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, services.designer.pm.msg.de.FindIDResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
