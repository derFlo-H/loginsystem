package loginsystem;

import java.io.*;
import java.util.Scanner;

/*
 * File reader and writer
 * 
 * Date: 051021
 * Author: Florian
 */

public class FileIO {
	
	// Method for writing to a file
	public static void output(String fileName, String fileOutput) {
		FileWriter out;
		try {
			out = new FileWriter(fileName + ".txt");
			out.write(b);
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	// Input method for file
	public static String input(String fileName) {
		
		String output = "";
		File inputFile = new File(fileName);
		
		// reading file
		try {
			
			Scanner s = new Scanner(inputFile);
			if(s.hasNextLine()) { output = s.nextLine(); }
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return output;
		
	}
	
}
