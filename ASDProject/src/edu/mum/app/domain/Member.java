package edu.mum.app.domain;


import java.time.LocalDate;


import edu.mum.framework.domain.AUser;

public class Member extends AUser{




	public Member(String id, LocalDate dob, String firstName, String lastName, String phoneNumber) {
		super(id, dob, firstName, lastName, phoneNumber);

	}

	private static final long serialVersionUID = 1L;
	
}
