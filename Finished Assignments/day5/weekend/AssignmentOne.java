/**
 * 
 */
package com.ss.assignments.weekend;

/**
 * @author Samuel Johnson
 *
 */

interface PerformOperation{
	boolean express(int val);
}

public class AssignmentOne {

	/**
	 * @param args
	 */
	public PerformOperation isOdd() {
		return (num) -> (num % 2 == 1);
	}
	
	public PerformOperation isPrime() {
		return (num) -> {
			if(num <= 1) {
				return false;
			}
			for(int i=2; i<num; i++) {
				if(num%i == 0) {
					return false;
				}
			}
			return true;
		};
	}
	
	public PerformOperation isPalindrome() {
		return (num) -> {
			int reverse = 0;
			int tempNum = num;
			
			while(tempNum != 0) {
				reverse = (reverse*10) + (tempNum % 10);
				tempNum = tempNum/10;
			}
			
			if(reverse == num) {
				return true;
			}
			return false;
		};
	}

}
