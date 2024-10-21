package day10;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingDemo {
/*Book - where 
 * library
 * 
 * IOException
 * FileNotFoundException
 * 
 */
	public static void main(String[] args) throws IOException {
		String filePath = "./src/day10/test";
		FileReader fr = new FileReader(filePath);
		int i=0;
		while((i=fr.read())!=-1) {
			System.out.print((char)i);//
		}

	}

}
