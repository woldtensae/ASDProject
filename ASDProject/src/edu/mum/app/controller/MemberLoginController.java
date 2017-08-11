package edu.mum.app.controller;

import edu.mum.app.domain.MemberCredential;
import edu.mum.framework.controller.LoginController;

public class MemberLoginController extends LoginController<MemberCredential>{
	
	public MemberLoginController() {
		super(MemberCredential.class);
	}

	public boolean authentiate(String username, String password){
		return authenticateUser(username, password);
	}
}
