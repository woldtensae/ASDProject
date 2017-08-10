package edu.mum.framework.controller;

import edu.mum.framework.service.UserService;
import edu.mum.framework.service.factory.ServiceFactory;

public class UserController {
	
	UserDirector userDirector = new UserDirector(new UserCreator());
	public UserDirector getUserDirector(){
		return userDirector;
	}
	
	public UserService getUserServices(){
		return ServiceFactory.createUserService();
	}
}
