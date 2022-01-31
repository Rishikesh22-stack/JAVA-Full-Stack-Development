package com.simpllilearn.inheritance;

public class TetsAggregation {

	public static void main(String[] args) {
		Address address1=new Address("Kopargaon", "Maharashtra", 423601);
		
		Student st1=new Student(1, "Rishi", "rishikeshkulkarni053@gmail.com", address1);
		
		st1.display();
	}
}
