package com.in28minutes.oops2;

public class Person {
	private String name;
	private String phoneNumber;
	private String emailId;

	public Person(String name, String phoneNumber, String emailId) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return String.format("Name - %s, EmailId - %s, Phone Number - %s", name, emailId, phoneNumber);
	}
}
