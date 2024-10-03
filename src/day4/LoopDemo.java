package day4;

public class LoopDemo {
	/*
	 * for
	 * while
	 * do while
	 * 
	 * 1 to 10
	 * for(Initilialization;condition;increment/decrement){
	 * }
	 * 
	 * int i=1;
	 * while(condition){
	 * looping statement
	 * increment/decrement
	 * }
	 * 
	 * 10 to 5
	 * 
	 * 50 45 40 35 30 ..5
	 */
	

	public static void main(String[] args) {
		System.out.println("For Loop");
		System.out.println("Printed from 5 to 10");
		for(int i=5;i<=10;i++) {//3<=10 - true
			System.out.println(i);//10
		}
		
		System.out.println("Printed from 10 to 5"); // 10 9 8 7 6 5
		for(int i=10;i>=5;i--) {
			System.out.println(i);
		}
		
		System.out.println("Decrementing by 5 everytime");
		for(int i=50;i>=5;i=i-5) {
			System.out.println(i);//50 45 .. 5
		}
		
		System.out.println("Incrementing by 10 everytime");
		for(int i=10;i<=100;i=i+10) {
			System.out.println(i);//10 20.. 100
		}
		
		System.out.println("While Loop");
		int j=101;//10 20.. 100
		while(j<=100) {
			System.out.println(j);
			j=j+10;
		}
		
		System.out.println("Do While Loop");
		int k=101;
		do {
			System.out.println(k);//101
			k=k+10;//111
		}while(k<=100);//111<=100
		
		
		
	}

}
