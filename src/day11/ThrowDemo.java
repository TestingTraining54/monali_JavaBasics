package day11;

import java.io.IOException;

public class ThrowDemo {

	public static void main(String[] args) throws IOException {
		int age=12;
		if(age>18) {
			System.out.println("Allowed to vote");
		}
		else {
			throw new IOException("Age should be greater than 18 to vote");
		}

	}

}
