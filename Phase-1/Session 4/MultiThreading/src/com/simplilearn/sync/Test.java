package com.simplilearn.sync;

public class Test {

	public static void main(String[] args) {
		
		Sender sender=new Sender();
		
		User user1=new User("Pranav","Hiii...",sender);
		User user2=new User("Rishi","Bye...",sender);
		
		user1.start();
		user2.start();
	}
}
