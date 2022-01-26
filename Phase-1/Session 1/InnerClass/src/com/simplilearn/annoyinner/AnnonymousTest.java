package com.simplilearn.annoyinner;

public class AnnonymousTest {

	public static void main(String[] args) {
		
		Car c=new Car() {
			
			@Override
			public void Stop() {
				System.out.println("car started from anonymous class");
				
			}
			
			@Override
			public void Start() {
				System.out.println("Car stopped from anonymous class");
				
			}
		};
		
		c.Start();
		c.Stop();
	}
}
