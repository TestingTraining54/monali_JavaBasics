package day9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	/*
	 * ArrayList -- store multiple values of same data type similar to an array -
	 * class which implements List interface - order of insertion is maintained -
	 * allows duplicate values 
	 * CRUD - Creation: add(value) 
	 * Retrieval: get(index)
	 * Update: set(index,value)
	 * Delete : remove(index)
	 */
	public static void main(String[] args) {
		List<Integer> al1 = new ArrayList<Integer>();
		al1.add(10);
		al1.add(12);
		al1.add(45);
		al1.add(34);
		al1.add(10);
		al1.add(null);
		
		System.out.println(al1);

		for (int i = 0; i < al1.size(); i++) {
			System.out.println(al1.get(i));
		}

		al1.set(1, 100);
		System.out.println(al1);

		al1.remove(2);
		System.out.println(al1);
		/*
		 * CTRL+SHIFT+/ - comment CTRL+SHIFT+\ - uncomment CTRL+SHIFT+f - format
		 * System.out.println(al1.get(0));//10 System.out.println(al1.get(1));//12
		 * System.out.println(al1.get(2));//45 System.out.println(al1.get(3));//34
		 * System.out.println(al1.get(4));//10
		 */

		System.out.println(al1.contains(1001));
		System.out.println(al1.indexOf(10));// 0
		System.out.println(al1.lastIndexOf(10));// 3

		System.out.println("Using Enhanced For Loop");
		for(Integer a:al1) {
			System.out.println(a);
		}
		
	}

}
