package com.simplilearn.customexception;

public class NotValidAgeException extends Exception {

	public NotValidAgeException(String msg) {
		
		super(msg);
	}
}
