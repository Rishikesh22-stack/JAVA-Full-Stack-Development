package com.simplilearn.AccessSpecifier;

public class TypeCasting {
	
	public static void main(String[] args) {
		//Implicit Conversion
		
		System.out.println("Implicit type Casting");
		char a='A';
		System.out.println("Value of a "+a);
		
		int b=a;
		System.out.println("value of Int "+b);
		
		float c=a;
		System.out.println("valu of Float "+c);
		
		double d=a;
		System.out.println("value of Double "+d);
		
		long e=a;
		System.out.println("value of long "+e);
		
		System.out.println("Explicit Type Conversion");
		double x=89.90;
		int y = (int) x;
		System.out.println("value of x "+x);
		System.out.println("value of y "+y);
		
		float result= 45.0f/7;
		System.out.println("value of result "+result);
		
	}

}
