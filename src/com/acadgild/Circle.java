package com.acadgild;

/**
 * 
 * Objective - To show the use of abstract class and method
 * ---------------------------------------------------------------------------
 * Explanation - This is the Circle Class which extends the abstract class Area
 * In this class we have given body to the abstract method calcArea
 * ----------------------------------------------------------------------------
 *
 */

public class Circle extends Area {
	int radius;

	// Constructor to set the radius
	Circle(int radius) {
		this.radius = radius;
	}

	// Body give to calcArea method
	double calcArea() {
		System.out.println("Calculating Area of Circle");
		this.setArea(3.14 * radius * radius);
		// System.out.println("Area of Cirlce = " + this.getArea());
		return this.getArea();
	}
}
