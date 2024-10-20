package day9;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	/*
	 * HashSet - class that implements Set Interface
	 * 1.Hashing technique is followed - random order is maintained for insertion
	 * 2.It does not allow duplicate values
	 */

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(23);
		hs.add(34);
		hs.add(12);
		hs.add(100);
		hs.add(34);
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		System.out.println("Enhanced For loop");
		for(Integer i:hs) {
			System.out.println(i);
		}
		
		System.out.println("Using Iterator");
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
		
		

	}

}
