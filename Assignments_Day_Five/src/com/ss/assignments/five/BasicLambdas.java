/**
 * 
 */
package com.ss.assignments.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Samuel Johnson
 *
 */
public class BasicLambdas {
	private static List<String> unsorted = new ArrayList<>();
	private static String[] unsortedList = new String[9];

	public BasicLambdas() {
		unsorted.add("Accidentally");
		unsorted.add("Recently");
		unsorted.add("Urgently");
		unsorted.add("Probably");
		unsorted.add("Dastardly");
		unsorted.add("Suddenly");
		unsorted.add("Justly");
		unsorted.add("Extremely");
		unsorted.add("Totally");
		
		unsortedList[0] = "Accidentally";
		unsortedList[1] = "Recently";
		unsortedList[2] = "Urgently";
		unsortedList[3] = "Probably";
		unsortedList[4] = "Dastardly";
		unsortedList[5] = "Suddenly";
		unsortedList[6] = "Justly";
		unsortedList[7] = "Extremely";
		unsortedList[8] = "Totally";

	}
	
	public void sortByLength() {
		unsorted.sort((s1, s2) -> s1.length()-s2.length());
	}
	
	public void reverseSortByLength() {
		unsorted.sort((s1, s2) -> s2.length()-s1.length());
	}

	public void byLetterE() {
		Arrays.sort(unsortedList, Comparator.comparingInt(s -> (s.contains("E") || s.contains("e") ? 0: 1)));
	}
	
	public void byLetterERedone() {
		Arrays.sort(unsortedList, (s1, s2) -> letterBasedSort(s1, s2));
	}
	
	public static int letterBasedSort(String s1, String s2) {
		if((s2.contains("E") || s2.contains("e")) && !(s1.contains("E") || s1.contains("e"))) {
			return 0;
		}
		return 1;
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
	
	public void printStringArrayList() {
		unsorted.forEach(s -> System.out.println(s));
	}
	
	public void printStringArray() {
		for(String s: unsortedList) {
			System.out.println(s);
		}
	}

}
