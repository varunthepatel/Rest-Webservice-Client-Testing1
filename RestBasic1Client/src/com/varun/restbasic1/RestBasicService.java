/**
 * RestBasicService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.varun.restbasic1;

public interface RestBasicService extends javax.xml.rpc.Service {
    public java.lang.String getRestBasicAddress();

    public com.varun.restbasic1.RestBasic getRestBasic() throws javax.xml.rpc.ServiceException;

    public com.varun.restbasic1.RestBasic getRestBasic(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
