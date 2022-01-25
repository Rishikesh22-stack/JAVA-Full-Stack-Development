package com.simplilearn.first.conditional;

public class Loop {
	
	public static void main(String[] args) {
		
		//print my name 5 times
		int i=1;
		while(i<=5)
		{
			System.out.println(i+".Rishi");
			i++;//increase the value of I by 1
		}
		
		//print using do while
		do
		{
			System.out.println(i+".Rishi");
			i++;//increase the value of I by 1
		}
		while(i<=10);
		
		//For loop
		for(i=11;i<=15;i++)
		{
			System.out.println(i+".Rishi");
		}
	}

}
