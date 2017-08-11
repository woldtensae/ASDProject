package edu.mum.framework.controller;


import java.util.List;

import edu.mum.framework.domain.concrete.Credential;
import edu.mum.framework.service.CredentialService;
import edu.mum.framework.service.factory.ServiceFactory;

public class LoginController{
	public boolean authenticateUser(String userName, String password){
		@SuppressWarnings("unchecked")
		CredentialService<Credential> cs = ServiceFactory.createCredentialService(Credential.class, 
				Credential.class.getSimpleName());
		List<Credential> credentialList = cs.findAllCredential();
		for(Credential credential: credentialList){
			if(credential.getUserName().equals(userName) && credential.getPassword().equals(password)){
				return true;
			}
		}
		return false;
	}

	
}
