package edu.mum.framework.controller;


import edu.mum.framework.service.UserService;
import edu.mum.framework.service.factory.ServiceFactory;

public class LoginController<T>{
	
	private Class<T> classType;
	
	public LoginController(Class<T> classType) {
		this.classType = classType;
	}

	public T authenticateUser(String userName, String password){
			
		@SuppressWarnings("unchecked")
		UserService<T> cs = ServiceFactory.createUserService(classType, 
				classType.getSimpleName());
		return  (T)cs.login(userName, password);
	}	
}
