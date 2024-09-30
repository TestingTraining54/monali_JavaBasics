package day3;

public class VariableDemo {
	int a=10;//global variable
	static int c=23;
	public void Method1() {
		int b=20;//local variable
		System.out.println(a);
		System.out.println(b);
	}

	public void Method2() {
		System.out.println(a);
		//System.out.println(b);
		
	}
	
	public static void main(String[] args) {
		

	}

}
