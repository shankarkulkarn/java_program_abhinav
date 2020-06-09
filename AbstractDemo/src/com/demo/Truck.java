package com.demo;

public class Truck extends Vehicle
{

	@Override
	public void speed() {
		System.out.println(" Truck Speed ");
		
	}

	@Override
	public void mileage() {
		System.out.println(" Truck Mileage ");
		
	}

	public void startLoading()
	{
		System.out.println(" Truck loading start ");
	}
	
	public void stopLoading()
	{
		System.out.println(" Truck loading stopped ");
	}
	
}
