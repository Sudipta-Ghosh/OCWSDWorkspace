package com.example.ws.security.basicauthentication;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ServerInfo{
 
	@WebMethod
	public String getServerName() {
		System.out.println("Inside Server Info");
		return "Weblogic server";
 
	}
 
}