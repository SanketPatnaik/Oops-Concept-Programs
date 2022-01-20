package com.in28minutes.oops2;

public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("Jail Colony", "Berhampur", "760001");
		Customer c1 = new Customer("Neetushri Kabi", homeAddress);
		Address workAddress = new Address("Rama Hospital", "Ghaziabad", "201301");
		System.out.println(c1);
		c1.setWorkAddress(workAddress);
		System.out.println(c1);

	}

}
