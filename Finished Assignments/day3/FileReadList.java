/**
 * 
 */
package com.ss.assignments.three;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author Samuel Johnson
 *
 */
public class FileReadList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String path = "";
		for(String s: args) {
			path = path+s;
		}
//		System.out.println(path);
		try {
		printDirectory(path);
		}
		catch(Exception e) {
			System.out.println("Please input a valid directory path in arguements");
		}
		
	}
	
	private static void printDirectory(String path) {
		File file = new File(path);
		File[] fileList = file.listFiles();
		for(File f: fileList) {
			System.out.println(f.getName());
		}
	}

}
