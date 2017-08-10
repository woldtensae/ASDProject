package edu.mum.framework.domain.concrete;

import java.io.Serializable;

import edu.mum.framework.domain.ACredential;
import edu.mum.framework.domain.Role;

public class Credential extends ACredential implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Credential(String userName, String password, Role userRole) {
		super(userName, password, userRole);
	}
}
