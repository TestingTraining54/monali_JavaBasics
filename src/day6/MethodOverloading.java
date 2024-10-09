package day6;

public class MethodOverloading {
	
	public void sum(int a,int b) {
		int c=a+b;
		System.out.println("Sum of 2 integer values: " + c);
	}
	
	
	public void sum(int a,int b,int c) {
		int z = a+b+c;
		System.out.println("Sum of 3 integer values: " + z);
	}

	public void sum(float a,float b) {
		float c=a+b;
		System.out.println("Sum of 2 float values: " + c);
	}
	public static void main(String[] args) {
		
		MethodOverloading m1 = new MethodOverloading();
		m1.sum(23,67);
		m1.sum(34, 56, 10);
		m1.sum(45.56f, 56.55f);
		
	}

}
