package com.simplilearn.abstraction;

public class RangeRover extends CarAbstract {

	public RangeRover(String name)
	{
		super(name);
	}
	@Override
	public void powerEngine() {
		// TODO Auto-generated method stub
		System.out.println("Range Rover Engine Started");
	}
}
