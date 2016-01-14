package com.varun.restbasic1;

public class RestBasicProxy implements com.varun.restbasic1.RestBasic {
  private String _endpoint = null;
  private com.varun.restbasic1.RestBasic restBasic = null;
  
  public RestBasicProxy() {
    _initRestBasicProxy();
  }
  
  public RestBasicProxy(String endpoint) {
    _endpoint = endpoint;
    _initRestBasicProxy();
  }
  
  private void _initRestBasicProxy() {
    try {
      restBasic = (new com.varun.restbasic1.RestBasicServiceLocator()).getRestBasic();
      if (restBasic != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)restBasic)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)restBasic)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (restBasic != null)
      ((javax.xml.rpc.Stub)restBasic)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.varun.restbasic1.RestBasic getRestBasic() {
    if (restBasic == null)
      _initRestBasicProxy();
    return restBasic;
  }
  
  public float addValue(float value) throws java.rmi.RemoteException{
    if (restBasic == null)
      _initRestBasicProxy();
    return restBasic.addValue(value);
  }
  
  public float subtractValue(float value) throws java.rmi.RemoteException{
    if (restBasic == null)
      _initRestBasicProxy();
    return restBasic.subtractValue(value);
  }
  
  
}