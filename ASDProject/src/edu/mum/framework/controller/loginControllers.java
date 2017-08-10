package edu.mum.framework.controller;


import edu.mum.framework.service.CredentialService;
import edu.mum.framework.service.factory.ServiceFactory;

public class loginControllers {
	public boolean authenticateUser(String userName, String password){
		CredentialService cs = ServiceFactory.createCredentialService();
		return cs.login(userName, password);
	}
}
