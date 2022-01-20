package com.in28minutes.oops2;

public class Review {
	private int reviewId;
	private byte rating;
	private String description;

	public Review(int reviewId, byte rating, String description) {
		super();
		this.reviewId = reviewId;
		this.rating = rating;
		this.description = description;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public byte getRating() {
		return rating;
	}

	public void setRating(byte rating) {
		this.rating = rating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return String.format("Id - %d , Rating - %d , %s]", reviewId, rating, description);
	}

}
