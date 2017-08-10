package edu.mum.framework.controller;

import java.time.LocalDate;

import edu.mum.framework.domain.Address;
import edu.mum.framework.domain.Credential;
import edu.mum.framework.domain.User;

public class UserBuilderImpl implements UserBuilder{
	User user;
	public UserBuilderImpl(String id, LocalDate dob, String firstName, String lastName, String phoneNumber){
		user = new User(id, dob,firstName, lastName, phoneNumber);
	}
	@Override
	public void buildAddress(String address, String city, String state, int zip) {
		user.setAddress(new Address(address, city, state, zip));	
	}
	@Override
	public void buildCredential(String userName, String password) {
		user.setCredential(new Credential(userName, password));
	}
	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return null;
	}
}
