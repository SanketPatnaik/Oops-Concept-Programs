package com.in28minutes.JspidersQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SpudRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Spud[] spuds = { new Spud(), new Spud(), new Spud(), new Spud(), new Spud() };

		for (Spud spud : spuds) {
			System.out.print("Enter the Market Id :");
			int id = scan.nextInt();
			spud.setMarketId(id);
			System.out.println();

			//String type = scanSpudType();
			//spud.setSpudType(type);
			System.out.print("Enter the Spud Type :");
			String type = scan.next();
			spud.setSpudType(type);
			System.out.println();

			//String state = scanProducingState();
			//spud.setProducingState(state);
			System.out.print("Enter the Producing State :");
			String state = scan.next();
			spud.setProducingState(state);
			System.out.println();

			System.out.print("Enter the Price :");
			int price = scan.nextInt();
			spud.setPrice(price);
			System.out.println();
		}

		for (Spud spud : spuds) {
			System.out.println(spud);
		}

		System.out.println("Enter the Finding State :");
		String state = scan.next();

		System.out.println("Enter the Sorting Value :");
		int sort = scan.nextInt();

		String type = Spud.findTypeByState(state, spuds);
		ArrayList<Spud> spudList = Spud.sortByprice(sort, spuds);

		if (type.equals(null)) {
			System.out.println("There is no such Spud type");
		} else {
		System.out.println(type);
		}
		if (spudList.equals(null)) {
			System.out.println("There is no such Spud to sort by Price");
		} else {
		Collections.sort(spudList);
		for (int i = 0; i < spudList.size(); i++) {
			System.out.println(spudList.get(i));
		}
	}
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
