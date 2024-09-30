package day2;

public class DataTypeConversion {
/*
 * B1: 3l capacity
 * B2: 5l capacity: 2l water
 * 
 * Task1 : B1 > B2 - possible
 * Task2 : B2 > B1 - confirmation:could be a chances of data loss
 */
	public static void main(String[] args) {
		byte b1=12;
		int i1=b1;
		System.out.println(b1);//12
		System.out.println(i1);//12
		
		
		int i2=123;
		byte b2=(byte) i2;//type casting
		System.out.println(i2);//123
		System.out.println(b2);//123
		
		float f1=23.56f;
		int i3=(int) f1;
		System.out.println(f1);//23.86
		System.out.println(i3);//23

		
		int i4=45;
		float f2=i4;
		System.out.println(i4);//45
		System.out.println(f2);//45.0
		
		char c1='%';
		int i5 = c1;
		System.out.println(c1);//%
		System.out.println(i5);//37 - ascii value
		
		int i6=56;
		char c2 = (char) i6;
		System.out.println(i6);//56
		System.out.println(c2);//8
		
		/*Wrapper class
		 * byte - Byte
		 * char - Character
		 * float - Float
		 * int - Integer
		 * double - Double
		 * 
		 */
		String s1 = "234";
		int i7 = Integer.parseInt(s1);
		System.out.println(s1+12);//23412
		System.out.println(i7+12);//246
		
		
		double i8 = 45.6;
		String s2=Double.toString(i8);
		System.out.println(i8+1);//46.6
		System.out.println(s2+1);//45.61
	}

}
