package edu.mum.framework.controller;

import java.time.LocalDate;

import edu.mum.framework.domain.Address;
import edu.mum.framework.domain.CredentialTemplate;
import edu.mum.framework.domain.User;
import edu.mum.framework.domain.UserTemplate;
import edu.umu.idGenerator.AutoGenerate;
import edu.umu.idGenerator.IDGenerator;

public class UserCreator implements UserBuilder{
	AutoGenerate autoGenerate;
	User user;
	public void userInfo(LocalDate dob, String firstName, String lastName, String phoneNumber){
		autoGenerate = IDGenerator.getInstance();
		String id = String.valueOf(autoGenerate.getUniqueId(User.class.getSimpleName()));
		user = new UserTemplate(id, dob,firstName, lastName, phoneNumber);
	}
	@Override
	public void buildAddress(String address, String city, String state, int zip) {
		user.setAddress(new Address(address, city, state, zip));	
	}
	@Override
	public void buildCredential(String userName, String password) {
		CredentialTemplate credential = new CredentialTemplate(userName, password);
		user.setCredential(credential);
	}
	@Override
	public User getUser() {
		return user;
	}	
}
