package edu.mum.framework.domain;

import java.io.Serializable;
import java.time.LocalDate;

public class UserTemplate extends User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserTemplate(String id, LocalDate dob, String firstName, String lastName, String phoneNumber){
		super(id, dob, firstName, lastName, phoneNumber);
	}
}
