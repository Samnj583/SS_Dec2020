/**
 * This code will traverse a 2D array, find the biggest number, and print its coordinates
 */
package com.ss.assignments.two;


/**
 * @author Samuel Johnson
 *
 */
public class ArrayTraversal {
	public static void main(String[] args) {
		int[][] num = new int[3][3];
		num[0][0] = 4;
		num[0][1] = 7;
		num[0][2] = 2;
		num[1][0] = 8;
		num[1][1] = 3;
		num[1][2] = 53;
		num[2][0] = 5;
		num[2][1] = 1;
		num[2][2] = 9;
		
		int highestNum = num[0][0];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(num[i][j] > highestNum) {
					highestNum = num[i][j];
				}
			}
		}
		System.out.println(highestNum);
	}
	
}
