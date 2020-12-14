/**
 * 
 */
package com.ss.assignments.weekend;

import java.util.Scanner;

/**
 * @author Samnj
 *
 */
public class AssignmentThree {
	
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
		doubling(intNumList);
	}
	
	/**
	 * @param numList
	 */
	public static void doubling(int[] numList) {
		int[] doubledNumber = new int[numList.length];
		for(int i=0; i<numList.length; i++) {
			doubledNumber[i] = numList[i];
		}
		String output = "rightDigit(["+numList[0];
		for(int i=1; i<numList.length; i++) {
			output += ", "+numList[i];
		}
		output += ")] -> ["+(doubledNumber[0]*2);
		for(int i=1; i<doubledNumber.length; i++) {
			output += ", "+(numList[i]*2);
		}
		output += "]";
		System.out.println(output);
	}
}
