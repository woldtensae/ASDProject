package edu.mum.framework.controller;

import edu.mum.framework.service.CredentialService;
import edu.mum.framework.service.factory.ServiceFactory;

public class LoginController<T>{
	
	
	public boolean authenticateUser(String userName, String password){
		
		/*Any class can extend this class and use the authenticate method by passing a 
		 * concrete class*/		
		@SuppressWarnings("unchecked")
		CredentialService<T> cs = ServiceFactory.createCredentialService((Class<T>)getClass(), 
				((Class<T>)getClass()).getSimpleName());
		return  cs.login(userName, password);	
	}	
}
