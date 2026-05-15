package com.oops1;

public class Passenger {

	private String name;
	private long contact;
	private String email;
	public final int passportNumber = 12341234;

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setContact(long contact) {
		this.contact = contact;
	}

	long getContact() {
		return contact;
	}

	void setEmail(String email) {
		this.email = email;
	}

	String getEmail() {
		return email;
	}
}
