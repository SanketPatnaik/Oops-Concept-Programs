package com.in28minutes.oops2;

import java.util.Scanner;
import java.util.TreeSet;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Spud[] spuds = { new Spud(), new Spud(), new Spud(), new Spud(), new Spud() };

		for (Spud spud : spuds) {
			System.out.print("Enter the Market Id :");
			int id = scan.nextInt();
			spud.setMarketId(id);
			System.out.println();
			System.out.println("You have entered " + id);

			//String type = scanSpudType();
			//spud.setSpudType(type);
			System.out.print("Enter the Spud Type :");
			String type = scan.nextLine();
			System.out.println();
			System.out.println("You have entered " + type);

			//String state = scanProducingState();
			//spud.setProducingState(state);
			System.out.print("Enter the Producing State :");
			String state = scan.nextLine();
			System.out.println();
			System.out.println("You have entered " + state);

			System.out.print("Enter the Price :");
			int price = scan.nextInt();
			spud.setPrice(price);
			System.out.println();
			System.out.println("You have entered " + price);
		}

		System.out.println("Enter the Producing State :");
		String state = scan.nextLine();
		String type = Spud.findTypeByState(state, spuds);
		System.out.println(type);

		System.out.println("Enter the Sorting Value :");
		int sort = scan.nextInt();
		TreeSet<Spud> spudList = Spud.sortByprice(sort, spuds);
		System.out.println(spudList);
	}

	public static String scanProducingState() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Producing State :");
		String state = scan.nextLine();
		System.out.println();
		System.out.println("You have entered " + state);
		return state;
	}

	public static String scanSpudType() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Spud Type :");
		String type = scan.nextLine();
		System.out.println();
		System.out.println("You have entered " + type);
		return type;
	}

}
