package day3;

public class OperatorsDemo {

	public static void main(String[] args) {
		/*Unary: 1 operand - a
		 * Binary: 2 operands a+b
		 * 	Arithmetic Operators - +,-,/ - quotient,*,% - remainder
		 * 	Assignment Operator - =
		 * 	Relational Operators - <,>,<=,>=,!=,==
		 *	Logical Operators: &&,||,! 
		 * Ternary: 3 operands
		 * 
		 */
		int a=10;
		int b=5;
		
		int c = a+b;
		System.out.println("Sum of a and b is: " + c);//15
		System.out.println("Product of a and b is: " + (a*b));//50
		System.out.println("Remainder of a and b is: " + (a%b));//0
		System.out.println("Division of a and b is: " + (a/b));//2
		
		System.out.println(a<b);//false
		System.out.println(a>b);//true
		
		int x=60;
		int y=50;
		int z=12;
		
		/* 
		 * x>y --true && y>z -- true -- true
		 * & - AND
		 * T - T - T
		 * T - F - F
		 * F - T - F
		 * F - F - F
		 * 
		 * |- OR
		 * T - T - T
		 * T - F - T
		 * F - T - T
		 * F - F - F
		 * 
		 */
		
		System.out.println(x>y & y>z);//true
		System.out.println(x>y & y<z);//false
		System.out.println(x>y | y<z);//true
		System.out.println(x<y | y<z);//f|F - F
		
		System.out.println(!(x>y));//True - False
		
		System.out.println("Unary Operator - Post/Pre - Increment and Decrement");
		
		int q = 6;
		System.out.println("Post Increment: " + q++);//post increment - 6
		System.out.println("Post Increment: " + q);//7
		System.out.println("Pre Increment: " + (++q));//8
		
		int w=5;
		System.out.println("Post Decrement: " + w--);//post increment - 5
		System.out.println("Post Decrement: " + w);//4
		System.out.println("Pre Decrement: " + (--w));//3
		
		System.out.println("Ternary Operator");
		//q = 8 and w = 3
		int b1 = (q>w)?10:20;
		System.out.println(b1);
		
	}

}
