package edu.mum.app.controller;

import edu.mum.app.dao.MemberDao;
import edu.mum.app.service.MemberService;
import edu.mum.framework.controller.UserController;
import edu.mum.framework.domain.AUser;


public class MemberController extends UserController<AUser>{	
	public MemberController() {
		super(AUser.class);
	}
	
	MemberService ms = new MemberService(new MemberDao());	
	public MemberService getMemberService(){
		return ms;
	}
}