/**
 * This code tests my ability to manipulate inputs from the command line
 */
package com.ss.assignments.two;

/**
 * @author Samuel Johnson
 *
 */
public class CommandLineTest {
	public static void main(String[] args) {
		int sum = 0;
		for(String s: args) {
			try {
				sum += Integer.parseInt(s);
			}
			catch(Exception e) {
				System.out.println("Numbers Only");
				return;
			}
		}
		System.out.println(sum);
	}
}
