package com.example.ws.soaphandler.server;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
@HandlerChain(file = "handler-chain.xml")
public class ServerInfo{
 
	@WebMethod
	public String getServerName() {
		System.out.println("Inside Server Info");
		return "Weblogic server";
 
	}
 
}