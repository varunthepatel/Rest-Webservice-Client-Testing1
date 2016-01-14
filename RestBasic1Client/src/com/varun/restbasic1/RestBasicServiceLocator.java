/**
 * RestBasicServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.varun.restbasic1;

public class RestBasicServiceLocator extends org.apache.axis.client.Service implements com.varun.restbasic1.RestBasicService {

    public RestBasicServiceLocator() {
    }


    public RestBasicServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RestBasicServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RestBasic
    private java.lang.String RestBasic_address = "http://localhost:8080/RestBasic1/services/RestBasic";

    public java.lang.String getRestBasicAddress() {
        return RestBasic_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RestBasicWSDDServiceName = "RestBasic";

    public java.lang.String getRestBasicWSDDServiceName() {
        return RestBasicWSDDServiceName;
    }

    public void setRestBasicWSDDServiceName(java.lang.String name) {
        RestBasicWSDDServiceName = name;
    }

    public com.varun.restbasic1.RestBasic getRestBasic() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RestBasic_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRestBasic(endpoint);
    }

    public com.varun.restbasic1.RestBasic getRestBasic(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.varun.restbasic1.RestBasicSoapBindingStub _stub = new com.varun.restbasic1.RestBasicSoapBindingStub(portAddress, this);
            _stub.setPortName(getRestBasicWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRestBasicEndpointAddress(java.lang.String address) {
        RestBasic_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.varun.restbasic1.RestBasic.class.isAssignableFrom(serviceEndpointInterface)) {
                com.varun.restbasic1.RestBasicSoapBindingStub _stub = new com.varun.restbasic1.RestBasicSoapBindingStub(new java.net.URL(RestBasic_address), this);
                _stub.setPortName(getRestBasicWSDDServiceName());
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
        if ("RestBasic".equals(inputPortName)) {
            return getRestBasic();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://restbasic1.varun.com", "RestBasicService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://restbasic1.varun.com", "RestBasic"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RestBasic".equals(portName)) {
            setRestBasicEndpointAddress(address);
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
