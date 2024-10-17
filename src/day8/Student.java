package day8;

public class Student {
	
	private int id;
	private String name = "abc";
	private String schoolName;
	private String section;
	public String grade;
	protected int a=10;
	private char gender;
	
	public void setid(int id) {
		this.id=id;
	}
	
	public int getid() {
		return id;
	}
	
	
	
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		
		if(gender=='M'||gender=='F') {
			this.gender = gender;
		}
		else {
			System.out.println("Please enter right gender value");
		}
	}

	public String getName() {
		return name;
	}
	
	

}
