package com.in28minutes.JspidersQuestion;

import java.util.ArrayList;
import java.util.Collections;

public class Toy implements Comparable<Toy> {
	private int toyId;
	private String toyName;
	private String category;
	private double price;
	private double discount;

	public Toy() {

	}

	public Toy(int toyId, String toyName, String category, double price, double discount) {
		this.toyId = toyId;
		this.toyName = toyName;
		this.category = category;
		this.price = price;
		this.discount = discount;
	}

	public int getToyId() {
		return toyId;
	}

	public void setToyId(int toyId) {
		this.toyId = toyId;
	}

	public String getToyName() {
		return toyName;
	}

	public void setToyName(String toyName) {
		this.toyName = toyName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public static Toy obj() {
		return new Toy();
	}

	public static int countToyWithCategory(String category, Toy... toys) {
		int count = 0;
		for (Toy toy : toys) {
			if (toy.getCategory().equals(category)) {
				count++;
			}
		}
		return count;
	}

	public static Toy findTheSecondLeastCostingToy(double price, Toy... toys) {
		ArrayList<Toy> toysAl = new ArrayList<>();
		for (Toy toy : toys) {
			if (toy.getPrice() > price) {
				toysAl.add(toy);
			}
		}
		Collections.sort(toysAl);
		try {
			return toysAl.get(1);
		} catch (Exception e) {
			System.out.println("There are no least second costing Toy");
			return toysAl.get(0);
		}
	}

	@Override
	public int compareTo(Toy that) {
		return Integer.compare(this.toyId, that.toyId);
	}

	@Override
	public String toString() {
		return "ToyId = " + toyId + "Toy Name = " + toyName + "Toy Category = " + category + "Toy Price = " + price
				+ "Toy Discount = " + discount;
	}
}
