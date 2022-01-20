package com.in28minutes.JspidersQuestion;

import java.util.ArrayList;
import java.util.List;

public class Food implements Comparable<Food> {

	private int foodId;
	private String foodType;
	private String producingState;
	private double price;

	public Food() {

	}

	public Food(int foodId, String foodType, String producingState, double price) {
		super();
		this.foodId = foodId;
		this.foodType = foodType;
		this.producingState = producingState;
		this.price = price;
	}

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public String getProducingState() {
		return producingState;
	}

	public void setProducingState(String producingState) {
		this.producingState = producingState;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static ArrayList<Food> printTypeOfFoodUsingFP(String state, Food... x) {
		List<Food> foods = List.of(x);
		ArrayList<Food> foodsAl = new ArrayList<>();
		foods.stream().filter(element -> element.getProducingState().equals(state))
				.forEach(element -> foodsAl.add(element));
		return foodsAl;
	}

	public static ArrayList<Food> sortTheFoodsAccordingToPrice(double sortingPrice, Food... y) {
		List<Food> foods = List.of(y);
		ArrayList<Food> foodsAl = new ArrayList<>();
		foods.stream().filter(element -> element.getPrice() > sortingPrice).forEach(element -> foodsAl.add(element));
		return foodsAl;
	}

	@Override
	public String toString() {
		return String.format("Food Id : %d , Food Type : %s , Producing State : %s , Food Price : %f", foodId, foodType,
				producingState, price);
	}

	@Override
	public int compareTo(Food that) {
		return Double.compare(this.getPrice(), that.getPrice());
	}

}
