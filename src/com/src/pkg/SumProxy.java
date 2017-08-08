package com.src.pkg;

public class SumProxy implements com.src.pkg.Sum {
  private String _endpoint = null;
  private com.src.pkg.Sum sum = null;
  
  public SumProxy() {
    _initSumProxy();
  }
  
  public SumProxy(String endpoint) {
    _endpoint = endpoint;
    _initSumProxy();
  }
  
  private void _initSumProxy() {
    try {
      sum = (new com.src.pkg.SumServiceLocator()).getSum();
      if (sum != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sum)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sum)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sum != null)
      ((javax.xml.rpc.Stub)sum)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.src.pkg.Sum getSum() {
    if (sum == null)
      _initSumProxy();
    return sum;
  }
  
  public int add(int a, int b) throws java.rmi.RemoteException{
    if (sum == null)
      _initSumProxy();
    return sum.add(a, b);
  }
  
  
}