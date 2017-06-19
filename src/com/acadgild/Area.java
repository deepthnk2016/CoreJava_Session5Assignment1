package com.acadgild;

/**
 * 
 * Objective - To show the use of abstract class and method
 * -----------------------------------------------------------------
 * Explanation - In this class there is an abstract method calcArea. Body will
 * be given by the classes extending it.
 * -----------------------------------------------------------------
 *
 */
public abstract class Area {

	private double area;

	// Getter Method
	public double getArea() {
		return area;
	}

	// Setter Method
	public void setArea(double area) {
		this.area = area;
	}

	// Display the calculated area
	void displayArea(double area) {
		System.out.println("Area = " + area);
	}

	// Abstract method
	abstract double calcArea();

}
