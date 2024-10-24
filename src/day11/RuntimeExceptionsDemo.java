package day11;

public class RuntimeExceptionsDemo {

	public static void main(String[] args) {
		try {

			int a = 78 / 0;
			System.out.println(a);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			String str = null;
			System.out.println(str.length());
		}
		catch (NullPointerException e) {
			System.out.println(e.getLocalizedMessage());
			System.out.println("STring is not being initialized with value and is null");
		}
		try {
			String a1 = "dfdsfd";
			int i1 = Integer.parseInt(a1);
		}
		catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			int[] arr = new int[2];
			System.out.println(arr[4]);
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array is out of bound");
			}

		} 

		

		

		

	}


