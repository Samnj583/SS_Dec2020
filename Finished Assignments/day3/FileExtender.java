/**
 * 
 */
package com.ss.assignments.three;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Samuel Johnson
 *
 */
public class FileExtender {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Replace path's string with desired path to directory
		File path = new File
				("/Users/Samnj/eclipse-workspace/Assignments/SS_Dec2020/Assignments_Day_Three/in/TestDocument.txt");
		try {
			FileWriter fw = new FileWriter(path, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("This is an append test. ");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
