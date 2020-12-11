/**
 * 
 */
package com.ss.assignments.three;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Samuel Johnson
 *
 */
public class FileCharacterCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 0;
		for(String s: args) {
			count++;
		}
		String input = null;
		char[] character = null;
		int charCount = 0;
		try {
			 input = args[0];
			 character = input.toCharArray();
			 if(count > 1 || count < 0 || input.length() > 1 || character.length > 1) {
					System.out.println("Please put one a single character ");
					System.exit(0);
			 }
		}
		catch(Exception e){
			System.exit(0);
		}
		

		try {
			//Replace String with desired path to directory
			FileReader fr = new FileReader("/Users/Samnj/eclipse-workspace/Assignments/SS_Dec2020/Assignments_Day_Three/in/TestDocument.txt");
			int i;
			while((i = fr.read()) != -1) {
				if(Character.toLowerCase(i) == Character.toLowerCase(character[0])) {
					charCount++;
				}
			}
			System.out.println(charCount);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
