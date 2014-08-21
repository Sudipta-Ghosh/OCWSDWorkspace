package com.example.ws.security.MessageLevelSecurity_1;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;

import weblogic.jws.Policies;
import weblogic.jws.Policy;

@WebService
@Policies( { @Policy(uri = "policy:usernametoken.xml") } )
public class ServerInfo{
 
	@WebMethod
	public String getServerName() {
		System.out.println("Inside Server Info");
		return "Weblogic server";
 
	}
 
}