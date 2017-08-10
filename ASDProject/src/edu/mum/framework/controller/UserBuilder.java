package edu.mum.framework.controller;

import edu.mum.framework.domain.User;

public interface UserBuilder {
	public void buildAddress(String address, String city, String state, int zip);
	public void buildCredential(String userName, String password);
	public User getUser();
}
