package edu.mum.app.domain;


import java.time.LocalDate;
import edu.mum.framework.domain.Address;
import edu.mum.framework.domain.Credential;
import edu.mum.framework.domain.User;
import edu.mum.framework.domain.UserStatus;

public class Member extends User{
	   
private static final long serialVersionUID = 1L;

	public Member() {
	}

	public Member(String id, LocalDate dob, String firstName, String lastName, String phoneNumber, Address address,
			UserStatus userStatus, Credential credential) {
		super(id, dob, firstName, lastName, phoneNumber, address, userStatus, credential);
		
	}

}
