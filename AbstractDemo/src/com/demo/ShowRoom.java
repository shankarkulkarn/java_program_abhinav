package com.demo;

public class ShowRoom {

	private  Vehicle vehicle ;
	
	public ShowRoom(Vehicle vehicle)
	{
		this.vehicle = vehicle;
	}
	
	public void show()
	{
		
		if( vehicle instanceof Car)
		{
	         Car  car = (Car)vehicle ;
	         car.startAC();
		}
		else
		{
			vehicle.mileage();
		}
		
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	
	
	
	
}
