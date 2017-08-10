package edu.mum.framework.domain.concrete;

import java.time.LocalDate;

import edu.mum.framework.domain.AUser;

public class User extends AUser {
	public User(String id, LocalDate dob, String firstName, String lastName, String phoneNumber) {
		super(id, dob, firstName, lastName, phoneNumber);
		
	}
}
