package day9;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
// CTRL+SHIFT+O
	public static void main(String[] args) {
		LinkedList<String> st1 = new LinkedList();
		st1.add("hello");
		st1.add("selenium");
		st1.add("java");
		System.out.println(st1);
		st1.addFirst("First Value");
		st1.addLast("LastValue");
		System.out.println(st1);
		
		st1.set(2,"python");
		System.out.println(st1);
		
		st1.add(1, "C#");
		System.out.println(st1);
		st1.remove(3);
		System.out.println(st1);
		
		System.out.println("Using For loop");
		for(int i=0;i<st1.size();i++) {
			System.out.println(st1.get(i));
		}
		
		System.out.println("Using Enhanced For loop");
		//Enhanced For Loop
		for(String s:st1) {
			System.out.println(s);
		}

	}

}
