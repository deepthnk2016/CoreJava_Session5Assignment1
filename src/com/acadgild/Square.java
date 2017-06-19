package com.acadgild;

/**
 * 
 * Objective - To show the use of abstract class and method
 * ---------------------------------------------------------------------------
 * Explanation - This is the Square Class which extends the abstract class Area
 * In this class we have given body to the abstract method calcArea
 * ----------------------------------------------------------------------------
 *
 */
public class Square extends Area {

	int length;

	// Constructor to set the length of the square
	Square(int length) {
		this.length = length;
	}

	// Body given to the abstract method calcArea
	double calcArea() {
		System.out.println("Calculating Area of Square");
		this.setArea(length * length);
		return this.getArea();
	}

}
