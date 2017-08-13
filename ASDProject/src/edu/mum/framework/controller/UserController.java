package edu.mum.framework.controller;


import edu.mum.framework.domain.AUser;
import edu.mum.framework.service.UserService;
import edu.mum.framework.service.factory.ServiceFactory;

public class UserController<T>{
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	UserDirector<AUser> userDirector = new UserDirector<AUser>(new UserCreator());
	Class<T> classType;
	
	
	public UserController(Class<T> classType) {
		this.classType = classType;
	}
			
		
	public UserDirector<AUser> getUserDirector(){
		return userDirector;
	}
	
	@SuppressWarnings("unchecked")
	public UserService<T> getUserServices(){
		return ServiceFactory.createUserService(classType.getClass(), 
				classType.getClass().getSimpleName());
	}
}