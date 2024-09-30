package day3;

public class Student {
	/*
	 * CTRL+SPace - auto completes
	 * main
	 * syso
	 * 
	 * Teacher - 
	 * id/name/classConducted -- properties - variable
	 * conductSessions() - method 1
	 * evaluateProject() - method 2
	 */
	
	// instance variable - global variable
	int id;
	String name;
	String grade;
	char section; 
	
	//static variable - gloabal variable
	static String schoolName;
	
	public void attendSession() {
		System.out.println("Student Attends Session");
		System.out.println(id);
		System.out.println(schoolName);
	}

	public void submitProject() {
		System.out.println("Student Submit Project");
		System.out.println(id);
		System.out.println(schoolName);
	}
	
	public static void getSchoolName() {
	System.out.println("Only access static variables inside a static method");
	System.out.println(schoolName);
	//System.out.println(id);
	}
	
	public static void main(String[] args) {
		//classname ref = new classname(); - Object Creation
		Student s1 = new Student(); // object1
		s1.id = 123;
		s1.name="abc";
		s1.grade="I";
		schoolName = "Testing School";
				
		System.out.println("Id of student 1: " +s1.id );
		System.out.println("Name of student 1: " +s1.name);
		System.out.println(schoolName);
		
		s1.attendSession();
		s1.submitProject();
		getSchoolName();
		
		
		Student s2 = new Student(); // object2
		s2.id = 456;
		s2.name="xyz";
		s2.grade="II";
		
		System.out.println("Id of student 2: " +s2.id );
		System.out.println(schoolName);
		
		s2.attendSession();
		s2.submitProject();
	}

}
