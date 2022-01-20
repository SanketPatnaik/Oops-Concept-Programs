package com.in28minutes.JspidersQuestion;

import java.util.ArrayList;

public class Spud implements Comparable<Spud> {

	private int marketId;
	private String spudType;
	private String producingState;
	private int price;

	public Spud() {
	}

	public Spud(int marketId, String spudType, String producingState, int price) {
		super();
		this.marketId = marketId;
		this.spudType = spudType;
		this.producingState = producingState;
		this.price = price;
	}

	public int getMarketId() {
		return marketId;
	}

	public void setMarketId(int marketId) {
		this.marketId = marketId;
	}

	public String getSpudType() {
		return spudType;
	}

	public void setSpudType(String spudType) {
		this.spudType = spudType;
	}

	public String getProducingState() {
		return producingState;
	}

	public void setProducingState(String producingState) {
		this.producingState = producingState;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static String findTypeByState(String state, Spud... a) {
		for (Spud spud : a) {
			if (spud.getProducingState().equals(state)) {
				return spud.spudType;
			}
		}
		return null;
	}

	public static ArrayList<Spud> sortByprice(int sort, Spud... b) {
		ArrayList<Spud> spuds = new ArrayList<>();
		for (Spud spud : b) {
			if (spud.getPrice() >= sort) {
				spuds.add(spud);
			}
		}
		try {
			return spuds;
		} catch (Exception e) {
			System.out.println("There are no such Elements to sort");
			return null;
		}

	}

	@Override
	public String toString() {
		return "MarketId :" + marketId + " ||Spud Type :" + spudType + " ||Producing State :" + producingState
				+ " ||Price :"
				+ price;
	}

	@Override
	public int compareTo(Spud that) {
		return Integer.compare(this.getPrice(), that.getPrice());
	}

}
