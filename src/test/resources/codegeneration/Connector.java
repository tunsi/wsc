package com.sforce.soap.enterprise;

import com.sforce.ws.ConnectorConfig;
import com.sforce.ws.ConnectionException;

/**
 * Generated by ConnectionCodeGenerator.java. Please do not edit.
 */
public class Connector {

  public static final String END_POINT = "https://login.salesforce.com/services/Soap/c/16.0";

  public static EnterpriseConnection newConnection(String username, String password) throws ConnectionException {
    ConnectorConfig config = new ConnectorConfig();
    config.setUsername(username);
    config.setPassword(password);
    return newConnection(config);
  }

  public static EnterpriseConnection newConnection(ConnectorConfig config) throws ConnectionException {
    if (config.getAuthEndpoint() == null) {
      config.setAuthEndpoint(END_POINT);
    }
    if (config.getServiceEndpoint() == null) {
      config.setServiceEndpoint(END_POINT);
    }
    return new EnterpriseConnection(config);
  }
}
