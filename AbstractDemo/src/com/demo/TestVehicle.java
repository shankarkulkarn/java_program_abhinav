package com.demo;

import java.util.Scanner;

public class TestVehicle {

	
	public static void main(String[] args) {
		
		     Scanner   scr = new Scanner(System.in);
		     System.out.println(" Enter Any Number ");
		     int  num = scr.nextInt();
		     //  if num is even car speed else truck speed ;
		     Vehicle  vehicle =null;
		     Car  car =new Car();
		     Truck truck =new Truck();
		     if(num%2==0)
		     {
		     	vehicle =car;

		     }
		     else
		     	vehicle=truck;
		     
		    vehicle.speed();  // Runtime polymorphism 

		     
	}
}
