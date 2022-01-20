package com.in28minutes.oops2;

import java.util.TreeSet;

public class Spud {

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
			if (spud.producingState.equals(state)) {
				return spud.spudType;
			}
		}
		return null;
	}

	public static TreeSet<Spud> sortByprice(int sort, Spud... b) {
		TreeSet<Spud> spuds = new TreeSet<>();
		for (Spud spud : b) {
				spuds.add(spud);
		}
		if (spuds.isEmpty()) {
			return null;
		} else {
			return spuds;
		}
	}

	@Override
	public String toString() {
		return "MarketId :" + marketId + "Spud Type :" + spudType + "Producing State :" + producingState + "Price :"
				+ price;
	}

}
