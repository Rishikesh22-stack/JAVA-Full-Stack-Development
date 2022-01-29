package com.simplilearn.email;

import java.util.ArrayList;
import java.util.Scanner;

public class ValidationEmail {
	
	private static boolean ValidationEmail(String str, int n) {
		// TODO Auto-generated method stub
		return false;
	}
	public static void main(String[] args) {
		
		ArrayList<String>emails=new ArrayList<String>();
		
		emails.add("rishikeshkulk085@gmail.com\n");
		emails.add("rishikeshkulk053@gmail.com\n");
		emails.add("tanmaysancheti@gmail.com\n");
		emails.add("alokbesake@gmail.com\n");
		emails.add("karan007@gmail.com\n");
		emails.add("aafleyash@gmail.com\n");
		
		System.out.println(emails);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Email");
		String str=sc.next();
		int n=str.length();
		if(ValidationEmail(str,n))
			System.out.println("It is Valid");
		else
			System.out.println("It is Not Valid");
			
	}
}
