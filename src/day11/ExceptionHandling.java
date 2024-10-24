package day11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {
/*
 * Exception: event which disturbs the normal flow of execution
 * terminate the program when occured
 * 
 * 2 type:
 * compile Exception
 * run time Exception
 * 
 * try - any risky code
 * catch - code for handling the exception
 * throws - just throwing the exception with out handling using try and catch
 	throw - intentionally throw your own exception
 *
 *finally - executes block of code irrespective of exception occured or not
 */
	public static void main(String[] args) {
		try {
		System.out.println("Opening db connection");
		String filePath = "./src/day10/test";
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		//System.out.println("Close the db connection");
		}
		
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("Please check the file at the location...");
			//System.out.println("Close the db connection");
		}
		
		finally {
			System.out.println("Close the db connection");
		}
	}

}
