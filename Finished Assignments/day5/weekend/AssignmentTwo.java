/**
 * 
 */
package com.ss.assignments.weekend;

import java.util.Scanner;

/**
 * @author Samuel Johnson
 *
 */
public class AssignmentTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Please insert numbers with only spaces separating them");
		Scanner input = new Scanner(System.in);
		String nums = input.nextLine();
		String[] numList = nums.split("[ ]");
		int[] intNumList = new int[numList.length];
		for(int i=0; i<numList.length; i++) {
			try {
			intNumList[i] = Integer.parseInt(numList[i]);
			}
			catch(Exception e) {
				System.out.println("Follow Instructions");
			}
		}
		rightDigit(intNumList);
	}
	
	/**
	 * @param numList
	 */
	public static void rightDigit(int[] numList) {
		int[] rightMostDigit = new int[numList.length];
		for(int i=0; i<numList.length; i++) {
			rightMostDigit[i] = numList[i];
		}
		String output = "rightDigit(["+numList[0];
		for(int i=1; i<numList.length; i++) {
			output += ", "+numList[i];
		}
		output += ")] -> ["+(rightMostDigit[0]%10);
		for(int i=1; i<rightMostDigit.length; i++) {
			output += ", "+(numList[i]%10);
		}
		output += "]";
		System.out.println(output);
	}
}
