package com.simpllilearn.inheritance;

public class Student {

	int id;
	String name;
	String email;
	Address address;
	
	public Student(int id, String name, String email, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	
	void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
		System.out.println("Address");
	}
}
