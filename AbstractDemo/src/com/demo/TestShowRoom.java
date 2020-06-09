package com.demo;

public class TestShowRoom {

	
	public static void main(String[] args) {
		Vehicle  vehicle =new Truck();
		
		ShowRoom showroom = new ShowRoom(vehicle);
		showroom.show();

		
	}
}
