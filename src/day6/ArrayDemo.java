package day6;

public class ArrayDemo {

	public static void main(String[] args) {
		/*
		 * Array - storing multiple values of same datatype
		 * 1. mandatory to provide the size of an array while instanstiation
		 * 2. indexing starts from 0
		 * 3. If user is not initializing value, java will initialize with a default 
		 * value based on the datatype
		 * 4. Duplicate values are allowed
		 * 5. static size 
		 */
		
		int[] id = new int[6];//instantiation
		id[0] = 23;
		id[1] = 45;//initialization
		id[2] = 67;
		id[3] = 78;//default value - int - 0
		id[4] = 100;
		id[5] = 67;
		
		for(int i=0;i<id.length;i++) {
			System.out.println("Value at " + i+ " index is "+ id[i]);
			
		}
	
		//System.out.println(id[5]);
		System.out.println("Size of an array is: " + id.length);//6
		
		/*
		 * System.out.println(id[0]);//23 System.out.println(id[1]);//45
		 * System.out.println(id[2]);//67 System.out.println(id[3]);//78
		 * System.out.println(id[4]);//100
		 */		
	
		
		
		
	}

}
