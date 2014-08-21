package com.examples.webservices.jaxws.simple;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name="HelloWorldPortType", serviceName="HelloWorldService")

/**
 * This JWS file forms the basis of simple Java-class implemented WebLogic
 * Web Service with a single operation: sayHelloWorld
 *
 * @author Copyright (c) 2005 by BEA Systems.  All rights reserved.
 */

public class HelloWorldImpl {

  // By default, all public methods are exposed as Web Services operation

  public String sayHelloWorld(String message) {
    System.out.println("sayHelloWorld:" + message);
    return "Here is the message: '" + message + "'";
  }
}
