package com.simplilearn.exceptionhandling;

import java.util.Scanner;

public class FinallyDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		try {
			String value= sc.next();
			int num=Integer.parseInt(value);
			String name=sc.next();
			
			System.out.println("ID: "+num+"Name: "+name);
		}
		catch (NumberFormatException e)
		{
			System.out.println(e);
		}
		finally
		{
			sc.close();
			System.out.println("Scanner closed");
		}
	}
}
