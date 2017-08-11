package edu.mum.framework.controller;

import edu.mum.framework.domain.concrete.User;
import edu.mum.framework.service.UserService;
import edu.mum.framework.service.factory.ServiceFactory;

public class UserController<T> {
	
	
	UserDirector userDirector = new UserDirector(new UserCreator());
	public UserDirector getUserDirector(){
		return userDirector;
	}
	
	@SuppressWarnings("unchecked")
	public UserService<T> getUserServices(){
		return ServiceFactory.createUserService((Class<T>)getClass(), 
				((Class<T>)getClass()).getSimpleName());
	}
}
