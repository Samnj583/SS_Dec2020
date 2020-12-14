/**
 * 
 */
package com.ss.assignments.weekend;

import java.util.Scanner;

/**
 * @author Samnj
 *
 */
public class AssignmentFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Please insert words with only spaces separating them");
		Scanner input = new Scanner(System.in);
		String words = input.nextLine();
		String[] wordsList = words.split("[ ]");
		noX(wordsList);
	}

	/**
	 * @param words
	 */
	public static void noX(String[] words){
		String output = "noX([\""+ words[0] + "\"";
		for(int i=1; i<words.length; i++) {
			output += ", \"" + words[i] +"\"";
		}
		for(int i=0; i<words.length; i++) {
			words[i] = words[i].replace("x", "");
		}
		output += "]) -> "+ "(\""+ words[0] + "\"";
		for(int i=1; i<words.length; i++) {
			output += ", \"" + words[i] +"\"";
		}
		output += ")";
		System.out.println(output);
	}
}
