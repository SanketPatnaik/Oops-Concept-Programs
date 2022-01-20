package com.in28minutes.JspidersQuestion;

import java.util.Scanner;

public class ToyRunner {

	public static void main(String[] args) {
		Toy t1 = new Toy();

		Scanner scan = new Scanner(System.in);

		Toy[] toys = { new Toy(), new Toy(), new Toy(), new Toy(), new Toy() };

		for (Toy toy : toys) {
			System.out.print("Enter the ToyId :");
			int id = scan.nextInt();
			toy.setToyId(id);
			System.out.println();

			System.out.print("Enter the Name :");
			String name = scan.next();
			toy.setToyName(name);
			System.out.println();

			System.out.print("Enter the Category :");
			String category = scan.next();
			toy.setCategory(category);
			System.out.println();

			System.out.print("Enter the price :");
			double price = scan.nextDouble();
			toy.setPrice(price);
			System.out.println();

			System.out.print("Enter the discount :");
			double discount = scan.nextDouble();
			toy.setDiscount(discount);
			System.out.println();
		}
		for (Toy toy : toys) {
			System.out.println(toy);
		}

		System.out.println("Enter the Comparing Category :");
		String compare1 = scan.next();

		System.out.println("Enter the Comparing Price :");
		double compare2 = scan.nextDouble();

		int count = Toy.countToyWithCategory(compare1, toys);
		Toy t2 = Toy.findTheSecondLeastCostingToy(compare2, toys);

		if (count == 0) {
			System.out.println("There are no such Toys");
		} else {
			System.out.println("The count is " + count);
		}
		if (t1.equals(null)) {
			System.out.println("There are no such Toys");
		} else {
			System.out.println("The Second Least Costing Toy is" + t2);
		}

	}

}
