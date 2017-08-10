package edu.mum.app.domain;

import edu.mum.framework.domain.Credential;

public class MemberCredential extends Credential{
	   
	private static final long serialVersionUID = 1L;

	public MemberCredential(String userName, String password) {
		super(userName, password);

	}

	public MemberCredential() {

	}
	

}
