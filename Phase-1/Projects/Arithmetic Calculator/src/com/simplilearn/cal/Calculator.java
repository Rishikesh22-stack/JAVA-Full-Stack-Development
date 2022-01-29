package com.simplilearn.cal;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		double num1, num2, ans;
		char op;
		
		Scanner reader= new Scanner(System.in);
		System.out.println("Enter Two Number");
		
		num1=reader.nextDouble();
		num2=reader.nextDouble();
		
		System.out.println("Enter the Operator(+,-,*,/)");
		op=reader.next().charAt(0);
		switch(op) {
		
		case '+': ans=num1 + num2;
		break;
		case '-': ans=num1 - num2;
		break;
		case '*': ans=num1 - num2;
		break;
		case '/': ans=num1 - num2;
		break;
		
		default: System.out.println("Error! Enter correct operator");
		return;
		}
		System.out.println("\nThe result is given as follows:\n");
		System.out.println(num1 +" "+op+" "+num2+" = "+ans);
	}
}
