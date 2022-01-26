package com.simplilearn.collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		
		set.add("Rishi");
		set.add("Atharva");
		set.add("Tanmay");
		set.add("Himanshu");
		//no order maintain
		System.out.println(set);
		//no duplicates allowed
		set.add("Shubham");
		
		System.out.println(set);
		
		System.out.println("Is Empty: "+set.isEmpty());
		
		set.remove("Shubham");
		
		System.out.println("Size: "+set.size());
	}
}
