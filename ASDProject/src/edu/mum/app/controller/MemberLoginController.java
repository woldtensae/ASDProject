package edu.mum.app.controller;

import edu.mum.app.domain.Member;
import edu.mum.framework.controller.LoginController;


public class MemberLoginController extends LoginController<Member>{
	
	public MemberLoginController() {
		super(Member.class);
	}

	public Member authentiate(String username, String password){
		return authenticateUser(username, password);
	}
}
