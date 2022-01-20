package com.in28minutes.JspidersQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Food[] foods = { new Food(), new Food(), new Food(), new Food() };

		for (Food food : foods) {
			System.out.print("Enter the Food Id :");
			int id = scan.nextInt();
			food.setFoodId(id);
			System.out.println();

			System.out.print("Enter the Food Type :");
			String type = scan.next();
			food.setFoodType(type);
			System.out.println();

			System.out.print("Enter the Producing State :");
			String state = scan.next();
			food.setProducingState(state);
			System.out.println();

			System.out.print("Enter the Food Price :");
			double price = scan.nextDouble();
			food.setPrice(price);
			System.out.println();
		}

		for (Food food : foods) {
			System.out.println(food);
		}
		System.out.print("Enter the sorting State :");
		String state = scan.next();
		ArrayList<Food> foodsAl1 = Food.printTypeOfFoodUsingFP(state, foods);
		foodsAl1.stream().forEach(element -> System.out.println(element.getFoodType()));

		System.out.println("Enter the sorting Price :");
		double price = scan.nextDouble();
		ArrayList<Food> foodsAl2 = Food.sortTheFoodsAccordingToPrice(price, foods);
		foodsAl2.stream()
				.forEach(element -> System.out.println(element.getFoodType() + " " + element.getProducingState()));

	}

}
