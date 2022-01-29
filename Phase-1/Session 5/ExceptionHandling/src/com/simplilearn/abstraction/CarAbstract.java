package com.simplilearn.abstraction;

public abstract class CarAbstract implements CarDesign {

	private String model;
	public CarAbstract(String model)
	{
		this.model=model;
	}
	@Override
	public void start() {
		System.out.println("Car Started");
	}
	@Override
	public void stop() {
		System.out.println("Car stopped");
	}
	abstract public void powerEngine();
	public void poweEngine() {
		// TODO Auto-generated method stub
		
	}
}
