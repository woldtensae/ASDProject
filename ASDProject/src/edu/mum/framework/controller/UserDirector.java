package edu.mum.framework.controller;

import java.time.LocalDate;

import edu.mum.framework.domain.Role;
import edu.mum.framework.domain.UserStatus;


public class UserDirector<T> {
	UserBuilder<T> userBuilder = null;
	public UserDirector(UserBuilder<T> userBuilder){
		this.userBuilder = userBuilder;
	}
	
	public void userInfo(LocalDate dob, String firstName, String lastName, String phoneNumber){
		userBuilder.userInfo(dob, firstName, lastName, phoneNumber);
	}
	
	public void userAddress(String address, String city, String state, int zip){
		userBuilder.buildAddress(address, city, state, zip);
	}
	
	public void userCredential(String userName, String password, Role role){
		userBuilder.buildCredential(userName, password, role);
	}
	
	public void userStatus(UserStatus userStatus){
		userBuilder.buildStatus(userStatus);
	}
	
	public T createFullUser(){
		return userBuilder.createFullUser();
	}
}
