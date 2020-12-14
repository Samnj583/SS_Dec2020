/**
 * 
 */
package com.ss.assignments.weekend;

import java.util.Scanner;

/**
 * @author Samuel Johnson
 *
 */
public class AssignmentFive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Please insert numbers with only spaces separating them. Last one is the wanted number");
		Scanner input = new Scanner(System.in);
		String nums = input.nextLine();
		String[] numList = nums.split("[ ]");
		int[] intNumList = new int[numList.length-1];
		for(int i=0; i<numList.length-1; i++) {
			try {
			intNumList[i] = Integer.parseInt(numList[i]);
			}
			catch(Exception e) {
				System.out.println("Follow Instructions");
			}
		}
		int wanted = Integer.parseInt(numList[numList.length-1]);
		System.out.println(groupSumClump(0, intNumList, wanted));
	}
	
	/**
	 * @param start
	 * @param nums
	 * @param val
	 */
	public static boolean groupSumClump(int start, int[] nums, int val) {
		  if (start >= nums.length) return (val == 0);
		  int index = start;
		  int repSum = 0;
		  while(index<nums.length && nums[index] == nums[start]) {
			  repSum = nums[start];
			  index++;
		  }
		  if (groupSumClump(start+1, nums, val-nums[start]) )
		    return true;
		  if (groupSumClump(start+1, nums, val)) return true;
		  return false;
		}

}
