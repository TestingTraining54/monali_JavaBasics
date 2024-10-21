package day10;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
/*
 * HashMap follows Hashing mechanism - random order of insertion
 * key/value -- pair/bucket/entry
 * set of entries - entryset
 * 1. Duplicate values
 * 2. Duplicate keys are not allowed, it acts as an update
 * 3. Null value and keys are allowed
 * 
 * 
 */
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(123,"abc");
		hm.put(234,"xyz");
		hm.put(678, "qwe");
		hm.put(890,"abc");
		System.out.println(hm);
		hm.put(123,"abc");
		hm.put(789, null);
		hm.put(null, "nullValue");
		hm.putIfAbsent(567, "zzz");
		
		System.out.println(hm);
		System.out.println(hm.entrySet());
		
		for(java.util.Map.Entry<Integer, String> e:hm.entrySet()) {
			System.out.println(e);
		}
		
		
		Set<Integer> allKeys = hm.keySet();
		System.out.println(allKeys);
		
		Collection<String> allValues = hm.values();
		System.out.println(allValues);
		
		System.out.println(hm.get(890));//abc
		
		System.out.println(hm.containsKey(123));//true
		System.out.println(hm.containsValue("qwe"));//true
		
	
		
		

	}

}
