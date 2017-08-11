package edu.mum.app.controller;

import edu.mum.framework.controller.LoginController;
import edu.mum.app.domain.MemberCredential;

public class MemberLoginController extends LoginController<MemberCredential>{
	public boolean authentiate(String username, String password){
		return this.authenticateUser(username, password);
	}
}
