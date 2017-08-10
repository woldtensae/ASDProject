package edu.mum.framework.controller;

import edu.mum.framework.domain.concrete.User;
import edu.mum.framework.service.UserService;
import edu.mum.framework.service.factory.ServiceFactory;

public class UserController {
	public final static UserController userController = new UserController();
	private UserController() {}
	
	public static UserController getUserController(){
		return userController;
	}
	
	UserDirector userDirector = new UserDirector(new UserCreator());
	public UserDirector getUserDirector(){
		return userDirector;
	}
	
	@SuppressWarnings("unchecked")
	public UserService<User> getUserServices(){
		return ServiceFactory.createUserService(User.class, User.class.getSimpleName());
	}
}
