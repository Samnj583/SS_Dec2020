/**
 *  This is a program that lets the user guess a number randomly chosen
 */
package com.ss.assignments.day1;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Samuel Johnson
 *
 */
public class GuessTest {
	public static void main(String[] args) {
		Random rand = new Random();
		int ans = rand.nextInt(100)+1;
		int guesses = 5;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Guess the number between 1 and 100");
		
		int userGuessInt;
		
		while(guesses > 0) {
			String userGuessStr = scan.nextLine();						//Read user input
			try {														//Catch any error if parseInt fails
			userGuessInt = Integer.parseInt(userGuessStr);
			}
			catch(Exception e){
				System.out.println("Integers only");
				continue;
			}
			if(userGuessInt > 100 || userGuessInt < 0) {				//Remind user of parameters
				System.out.println("Remember it is between 1 and 100. Try again");
			}
			if((ans+10) >= userGuessInt && userGuessInt >= (ans-10)) {	//Check for correct answer
				System.out.println("Good, the answer is "+ans);
				break;
			}
			else {
				guesses--;
				if(guesses == 0) {										//Check if user has guesses left
					System.out.println("Sorry the answer is "+ans);
					break;
				}
				System.out.println("Try again");
			}
		}
	}
}
