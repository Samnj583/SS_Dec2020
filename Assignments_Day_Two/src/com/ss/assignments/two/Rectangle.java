/**
 * This is a class that implements Shape for a rectangle
 */
package com.ss.assignments.two;

/**
 * @author Samuel Johnson
 *
 */
public class Rectangle implements Shape {

	@Override
	public void calculateArea() {
		System.out.println("The area of a rectangle is length times width");
	}

	@Override
	public void display() {
		System.out.println("This method would display a rectangle");
	}

}
