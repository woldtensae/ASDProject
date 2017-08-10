package edu.mum.framework.controller;

import java.time.LocalDate;

import edu.mum.framework.domain.User;

public interface UserBuilder {
	public void buildAddress(String address, String city, String state, int zip);
	public void buildCredential(String userName, String password);
	public void userInfo(LocalDate dob, String firstName, String lastName, String phoneNumber);
	public User getUser();
}
