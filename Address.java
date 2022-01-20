package com.in28minutes.oops2;

public class Address {
	String line1;
	String city;
	String pin;

	public Address(String line1, String city, String pin) {
		this.line1 = line1;
		this.city = city;
		this.pin = pin;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return String.format(" %s , %s , %s ", line1, city, pin);
	}
}
