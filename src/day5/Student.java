package day5;

public class Student extends BaseClass {
	
	int id;
	String name;
	String grade;
	char section; 
	String pancard;
	//constructor overloading
	/*
	 * It makes difference in 
	 * > no. of parameters that are part of constructor
	 * > type of parameter that are part of constructor
	 * 
	 */
	public Student(int id,String name) {
		this.id = id;
		this.name= name;
	}
	
	public Student(int id,String name,String pancard) {
		this.id = id;
		this.name= name;
		this.pancard=pancard;
	}

	public Student(String grade,char section) {
		this.grade=grade;
		this.section=section;
	}



	public Student(String name, String grade,int id) {
		
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	public Student() {
		System.out.println("Non parameterized constructor");
	}
	
	public void attendSession() {
		System.out.println("Student attends session");
	}
	
	public void submitProject() {
		System.out.println("Student submits project");
	}
	
	

	

}
