package com.in28minutes.oops2;

import java.util.ArrayList;

public class Book {

	private String title;
	private String author;
	private ArrayList<Review> r1 = new ArrayList<Review>();
	private int pages;
	private int price;

	public Book(String title, String author, int price, int pages) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public void addReview(Review r1) {
		this.r1.add(r1);
	}

	@Override
	public String toString() {
		return String.format(" Title - %s, Author - %s, Pages %d, Price - %d , Review - %s", title, author, price,
				pages, r1);
	}
}
