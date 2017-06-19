package com.acadgild;

/**
 * 
 * Objective - To show the use of abstract class and method
 * ---------------------------------------------------------------------------
 * Explanation - This is main class in which we are calculating the area of
 * Circle and Square shape objects.
 * ----------------------------------------------------------------------------
 *
 */
public class Session5Assignment1 {

	public static void main(String[] args) {
		// Calculate the area of Circle
		Circle circ = new Circle(3);
		circ.displayArea(circ.calcArea());

		System.out.println("*******************************");
		// Calculate the area of square
		Square sq = new Square(4);
		circ.displayArea(sq.calcArea());
	}

}
