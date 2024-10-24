package day10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
/*Book - where 
 * library
 * 
 * IOException
 * FileNotFoundException
 * 
 * source code > compiled(.class) > run
 */
	public static void main(String[] args) throws IOException  {
		String filePath = "./src/day10/test";
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		/*
		 * System.out.println(br.readLine()); System.out.println(br.readLine());
		 */
		String s=null;
		while((s=br.readLine())!=null) {
			System.out.println(s);
		}
		
	}

}
