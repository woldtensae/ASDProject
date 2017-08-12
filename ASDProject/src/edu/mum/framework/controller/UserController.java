package edu.mum.framework.controller;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

import edu.mum.framework.domain.AProduct;
import edu.mum.framework.domain.AUser;
import edu.mum.framework.service.UserService;
import edu.mum.framework.service.factory.ServiceFactory;

public class UserController<T> {
	
	UserDirector<T> userDirector = new UserDirector<T>(new UserCreator());
	Class<T> classType;
	public UserController(Class<T> classType) {
		this.classType = classType;
	}
		
	
	
	
	
	
	
	/*public UserDirector<T> getUserDirector(){
		return userDirector;
	}*/
	
	@SuppressWarnings("unchecked")
	public UserService<T> getUserServices(){
		return ServiceFactory.createUserService(classType.getClass(), 
				classType.getClass().getSimpleName());
	}
}