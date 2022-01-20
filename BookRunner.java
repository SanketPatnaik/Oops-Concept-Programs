package com.in28minutes.oops2;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book("Game of Thrones", "George RR Martin", 412, 899);
		book.addReview(new Review(124, (byte) 8, "Awesome"));
		book.addReview(new Review(124, (byte) 8, "Awesome"));
		System.out.println(book);
	}

}
