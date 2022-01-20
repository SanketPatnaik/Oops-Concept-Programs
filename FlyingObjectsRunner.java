package com.in28minutes.oops2;

public class FlyingObjectsRunner {

	public static void main(String[] args) {
		Flyable[] flyingObjects = { new Bird(), new Aeroplane() };
		for (Flyable flyingObject : flyingObjects) {
			flyingObject.fly();
		}
	}

}
