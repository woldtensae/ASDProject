package edu.mum.framework.controller;

import edu.mum.framework.domain.concrete.Credential;
import edu.mum.framework.service.CredentialService;
import edu.mum.framework.service.factory.ServiceFactory;

public class LoginController{
	public boolean authenticateUser(String userName, String password){
		@SuppressWarnings("unchecked")
		CredentialService<Credential> cs = ServiceFactory.createCredentialService(Credential.class, 
				Credential.class.getSimpleName());
		return  cs.login(userName, password);	
	}	
}
