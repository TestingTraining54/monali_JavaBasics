package day8;

public class MainClass {

	public static void main(String[] args) {
		Student s1= new Student();
		//System.out.println(s1.id);
		s1.setid(10);
		System.out.println(s1.getid());
		
		//s1.setName("nonsense"); //- write
		System.out.println(s1.getName());//read
		
		s1.setGender('Z');
		System.out.println(s1.getGender());
		

	}

}
