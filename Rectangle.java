package com.in28minutes.oops2;

public class Rectangle {

	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double findArea() {
		return length * width;
	}

	public double findPerimeter() {
		return 2 * (length + width);
	}

	public boolean isLengthBigger() {
		if (length > width) {
			return true;
		}
		return false;
	}

	public boolean isWidthBigger() {
		if (length < width) {
			return true;
		}
		return false;
	}

	public double sqauresInTheRectangle() {
		if (isLengthBigger()) {
			return length / width;
		} else if (isWidthBigger()) {
			return width / length;
		}
		return 0.0;
	}
	@Override
	public String toString() {
		return String.format("The Length is %f and the width is %f. The area that we calculated is %f, "
				+ "and the perimeter that we calculated is %f", length, width, findArea(), findPerimeter());
	}

}
