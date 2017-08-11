package edu.mum.app.controller;

import edu.mum.app.domain.Member;
import edu.mum.framework.controller.UserController;

public class MemberController extends UserController<Member>{
	
	public MemberController() {
		super(Member.class);
	}
	//public 
}
