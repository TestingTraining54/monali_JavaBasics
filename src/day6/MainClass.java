package day6;

public class MainClass {

public static void main(String[] args) {
		/*
		 * Polymorphism
		 * 	: Poly - many , morphism - form
		 * many forms	
		 * 
		 *    > Method overloading:
		 *    	1. Same class
		 *    	2. Same Method name 
		 *    		>differs in no. of parameters to send
		 *    		>differs in type of parameters to send
		 *    
		 *    > Method Overriding
		 *    	1. Inheritance relationship should be present
		 *    	2. Child class should have method with same name as
		 *    that of the parent class
		 *    difference in method implementation
		 * 
		 * 
		 * 
		 */
		
		Student s1 = new Student();
		s1.lunchTime();
		
		Staff st1 = new Staff();
		st1.lunchTime();
		
		Teacher t1 = new Teacher();
		t1.lunchTime();
		
		
	}
}
