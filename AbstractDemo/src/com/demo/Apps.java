package com.demo;

public class Apps {

	public static void main(String[] args) {
		
		 Vehicle vehicle ;
		 
		 Car   car  = new Car();
		 Truck  truck = new Truck();
		 
		 vehicle  =  car ;
		 
		 vehicle.speed();
		 vehicle.mileage();
		 
		 

	}

}
