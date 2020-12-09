/**
 * This is a class that implements Shape for a triangle
 */
package com.ss.assignments.two;

/**
 * @author Samuel Johnson
 *
 */
public class Triangle implements Shape {
	
	@Override
	public void calculateArea() {
		System.out.println("The area of a rectangle is base times height divided by two");
	}

	@Override
	public void display() {
		System.out.println("This method would display a triangle");
	}

}
