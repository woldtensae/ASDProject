package edu.mum.framework.domain;

import java.io.Serializable;

public abstract class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String  id;
	private int age;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private Address address;
	private UserStatus userStatus;
	
	public User(){
		
	}
	public User(String  id, String firstName, String lastName, String phoneNumber, Address address,int age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.age=age;
		this.userStatus=UserStatus.ACTIVE;
	}
   
	public void setId(String id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getFirstName() {
		return firstName;
	}

	public String getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public Address getAddress() {
		return address;
	}
	
	@Override
	public boolean equals(Object object) {

		if (object == null)
			return false;
		else if (object.getClass() != this.getClass())
			return false;
		User person = (User) object;
		return person.getId() == (this.id);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public UserStatus getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(UserStatus userStatus) {
		this.userStatus = userStatus;
	}
	

}
