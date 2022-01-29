package com.simplilearn.exceptionhandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=0;i<args.length;i++)
		{
			try {
			sum=sum + Integer.parseInt(args[i]);
			}
			catch(NumberFormatException e)
			{
				System.out.println("Eror Occured "+args[i]+"Can not format Integer");
				e.printStackTrace();
			}
			}
		System.out.println("Sum is "+sum);
		}
}
