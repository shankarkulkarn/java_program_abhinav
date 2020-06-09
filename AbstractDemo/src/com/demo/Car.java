package com.demo;

public class Car extends Vehicle
{

	@Override
	public void speed() {
		
		System.out.println(" Car speed ");
	}

	@Override
	public void mileage() {
		
		System.out.println(" Car mileage ");
	}
	
	public void startAC()
	{
		System.out.println(" Car AC started ");
	}
	
	public void stopAC()
	{
		System.out.println("Car AC stopped");
	}

}
