/**
 * This is a class that implements Shape for a circle
 */
package com.ss.assignments.two;

/**
 * @author Samuel Johnson
 *
 */
public class Circle implements Shape{

	@Override
	public void calculateArea() {
		System.out.println("The area of a rectangle is pi times radius squared");
	}

	@Override
	public void display() {
		System.out.println("This method would display a circle");
	}

}
