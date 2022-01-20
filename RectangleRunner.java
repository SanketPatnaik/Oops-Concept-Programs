package com.in28minutes.oops2;

public class RectangleRunner {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(8.8, 4.5);
		System.out.println(rectangle);
		rectangle.findArea();
		rectangle.findPerimeter();
		rectangle.isLengthBigger();
		System.out.printf("Is the length bigger than the width? %b", rectangle.isLengthBigger()).println();
		rectangle.isWidthBigger();
		System.out.printf("Is the width bigger than the length? %b", rectangle.isWidthBigger()).println();
		rectangle.sqauresInTheRectangle();
		System.out.printf("The bigger side is %f times the size of the smaller side", rectangle.sqauresInTheRectangle())
				.println();
		}

		}
