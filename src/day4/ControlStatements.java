package day4;

public class ControlStatements {
	
	/*
	 * if
	 * if - else
	 * if - else if -else
	 * switch
	 * 
	 * if(condition){
	 * }
	 * 
	 * >=75 -- Distinction
	 * <75 and >=60 -- First
	 * <60 and >=50 -- second
	 * <50 and >=30 -- third
	 * <30 -- fail
	 */

	public static void main(String[] args) {
		int age=12;
		
		if(age>18) {
			System.out.println("Allowed for vote");
		}
		else {
			System.out.println("Not allowed to vote");
		}
		

		int marks=56;
		
		if(marks>=75) {
			System.out.println("Distinction");
		}
		else if(marks<75 & marks>=60) {
			System.out.println("First class");
		}
		else if(marks<60 & marks>=50) {
			System.out.println("Second class");
		}
		else if(marks<50 & marks>=30) {
			System.out.println("Third class");
		}
		else  {
			System.out.println("Fail");
		}
		/* day 1 - Monday
		 * day 2 - Tuesday
		 */
		
		int day=41;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;	
		case 4:
			System.out.println("Thursday");
			break;	
		case 5:
			System.out.println("Friday");
			break;	
		case 6:
			System.out.println("Saturday");
			break;	
		case 7:
			System.out.println("Sunday");
			break;	

		default:
			System.out.println("Your day value is not correct");
			break;
		}
		
		
	}

}
