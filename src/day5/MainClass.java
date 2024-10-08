package day5;

public class MainClass {

public static void main(String[] args) {
		
		
		Student s1 = new Student(23,"abc");
		System.out.println(s1.id);//0
		System.out.println(s1.name);//null
		
		Student s2 = new Student(34,"xyz","CTY453456F");
		
		Student s3 = new Student("I", 'C');
		
		
		s1.lunchTime();
		s1.attendSession();
		s1.markAttendance();
		s1.submitProject();
		
		
		Staff st1 = new Staff();
		st1.calculateSalary();
		st1.evaluatesAttendance();
		st1.markAttendance();
		st1.lunchTime();
		
		
		Teacher t1= new Teacher();
		t1.conductSession();
		t1.evaluatesProject();
		t1.markAttendance();
		t1.lunchTime();
		
		
	}
}
