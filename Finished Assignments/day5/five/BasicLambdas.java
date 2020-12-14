/**
 * 
 */
package com.ss.assignments.five;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Samuel Johnson
 *
 */
public class BasicLambdas {
	private static List<String> unSorted = new ArrayList<>();

	public void BasicLambdas() {
		unSorted.add("Accidentally");
		unSorted.add("Recently");
		unSorted.add("Urgently");
		unSorted.add("Probably");
		unSorted.add("Dastardly");
		unSorted.add("Suddenly");
		unSorted.add("Justly");
		unSorted.add("Extremely");
		unSorted.add("Totally");
		
		unSorted.forEach(s -> System.out.println(s));
		
	}
	
	public void sortByLength() {
		unSorted.sort((s1, s2) -> s1.length()-s2.length());
	}
	
	public void reverseSortByLength() {
		unSorted.sort((s1, s2) -> s2.length()-s1.length());
	}

	public void byLetterE() {
//		unSorted.sort((s1, s2) -> ((s1.contains("e") && !s2.contains("e")) || (s1.contains("e") && !s1.contains("e")) ? 0 : 1));
	}
	
	public void byLetterERedone() {
		
	}
	
	public void addEvenOrOdd() {
		System.out.println("Please insert numbers with only commas separating them");
		Scanner input = new Scanner(System.in);
		String nums = input.nextLine();
		String[] numList = nums.split("[,]");
		int[] intNumList = new int[numList.length];
		for(int i=0; i<numList.length; i++) {
			try {
			intNumList[i] = Integer.parseInt(numList[i]);
			}
			catch(Exception e) {
				System.out.println("Follow Instructions");
			}
		}
		for(int i=0; i<intNumList.length; i++) {
			if(intNumList[i]%2 == 1) {
				numList[i] = "o"+numList[i];
			}
			else {
				numList[i] = "e"+numList[i];
			}
		}
		String output = numList[0];
		for(int i=1; i<numList.length; i++) {
			output += ","+numList[i];
		}
		System.out.println(output);
	}
	
	public List<String> search(List<String> words){
		return words.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3)
				.collect(Collectors.toList());
	}
}
