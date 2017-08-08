/**
 * SumServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.src.pkg;

public class SumServiceLocator extends org.apache.axis.client.Service implements com.src.pkg.SumService {

    public SumServiceLocator() {
    }


    public SumServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SumServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Sum
    private java.lang.String Sum_address = "http://localhost:8080/MavenAdd/services/Sum";

    public java.lang.String getSumAddress() {
        return Sum_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SumWSDDServiceName = "Sum";

    public java.lang.String getSumWSDDServiceName() {
        return SumWSDDServiceName;
    }

    public void setSumWSDDServiceName(java.lang.String name) {
        SumWSDDServiceName = name;
    }

    public com.src.pkg.Sum getSum() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Sum_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSum(endpoint);
    }

    public com.src.pkg.Sum getSum(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.src.pkg.SumSoapBindingStub _stub = new com.src.pkg.SumSoapBindingStub(portAddress, this);
            _stub.setPortName(getSumWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSumEndpointAddress(java.lang.String address) {
        Sum_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.src.pkg.Sum.class.isAssignableFrom(serviceEndpointInterface)) {
                com.src.pkg.SumSoapBindingStub _stub = new com.src.pkg.SumSoapBindingStub(new java.net.URL(Sum_address), this);
                _stub.setPortName(getSumWSDDServiceName());
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
        if ("Sum".equals(inputPortName)) {
            return getSum();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://pkg.src.com", "SumService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://pkg.src.com", "Sum"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Sum".equals(portName)) {
            setSumEndpointAddress(address);
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
