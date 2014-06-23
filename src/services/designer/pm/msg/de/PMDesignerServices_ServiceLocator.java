/**
 * PMDesignerServices_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services.designer.pm.msg.de;

public class PMDesignerServices_ServiceLocator extends org.apache.axis.client.Service implements services.designer.pm.msg.de.PMDesignerServices_Service {

    public PMDesignerServices_ServiceLocator() {
    }


    public PMDesignerServices_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PMDesignerServices_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PMDesignerServices
    private java.lang.String PMDesignerServices_address = "http://localhost:20044/";

    public java.lang.String getPMDesignerServicesAddress() {
        return PMDesignerServices_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PMDesignerServicesWSDDServiceName = "PMDesignerServices";

    public java.lang.String getPMDesignerServicesWSDDServiceName() {
        return PMDesignerServicesWSDDServiceName;
    }

    public void setPMDesignerServicesWSDDServiceName(java.lang.String name) {
        PMDesignerServicesWSDDServiceName = name;
    }

    public services.designer.pm.msg.de.PMDesignerServices_PortType getPMDesignerServices() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PMDesignerServices_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPMDesignerServices(endpoint);
    }

    public services.designer.pm.msg.de.PMDesignerServices_PortType getPMDesignerServices(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            services.designer.pm.msg.de.PMDesignerServices_BindingStub _stub = new services.designer.pm.msg.de.PMDesignerServices_BindingStub(portAddress, this);
            _stub.setPortName(getPMDesignerServicesWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPMDesignerServicesEndpointAddress(java.lang.String address) {
        PMDesignerServices_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (services.designer.pm.msg.de.PMDesignerServices_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                services.designer.pm.msg.de.PMDesignerServices_BindingStub _stub = new services.designer.pm.msg.de.PMDesignerServices_BindingStub(new java.net.URL(PMDesignerServices_address), this);
                _stub.setPortName(getPMDesignerServicesWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PMDesignerServices".equals(inputPortName)) {
            return getPMDesignerServices();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PMDesignerServices");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:de:msg:pm:designer:services", "PMDesignerServices"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PMDesignerServices".equals(portName)) {
            setPMDesignerServicesEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
