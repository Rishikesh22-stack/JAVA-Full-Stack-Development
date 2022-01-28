package com.simplilearn.sync;

public class Sender {

	public void send(String msg,String name)
	{
		System.out.println(name+ "Sending "+msg);
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("message sent successfully");
	}
}
