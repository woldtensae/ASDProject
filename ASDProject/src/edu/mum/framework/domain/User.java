package edu.mum.framework.domain;

import java.io.Serializable;
import java.time.LocalDate;

public abstract  class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private LocalDate dob;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private Address address;
	private UserStatus userStatus;
	private Credential credential;

	public Credential getCredential() {
		return credential;
	}

	public void setCredential(Credential credential) {
		this.credential = credential;
	}

	public User() {

	}

	public User(String id, LocalDate dob, String firstName, String lastName, String phoneNumber, Address address,
			UserStatus userStatus, Credential credential) {

		this.id = id;
		this.dob = dob;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.userStatus = userStatus;
		this.credential = credential;
	}
	
	public User(String id, LocalDate dob, String firstName, String lastName, String phoneNumber) {

		this.id = id;
		this.dob = dob;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		
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

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public UserStatus getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(UserStatus userStatus) {
		this.userStatus = userStatus;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", dob=" + dob + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNumber=" + phoneNumber + ", address=" + address + ", userStatus=" + userStatus
				+ ", credential=" + credential + "]";
	}

}
