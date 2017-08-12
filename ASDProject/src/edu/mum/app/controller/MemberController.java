package edu.mum.app.controller;

import edu.mum.framework.controller.UserController;
import edu.mum.framework.domain.concrete.User;


public class MemberController extends UserController<User>{	
	public MemberController() {
		super(User.class);
	}	
}


