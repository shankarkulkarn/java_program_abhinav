package com.demo;

public class Car extends Vehicle implements Shape
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

	@Override
	public void area() {
		System.out.println("Car  Area ");
		
	}

	@Override
	public void draw() {
		System.out.println(" Car Draw ");
		
	}

}
