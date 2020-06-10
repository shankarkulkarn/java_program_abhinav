package com.demo;

public class TestShape {

	public static void main(String[] args) {
		
		         Shape  shape = null;
		         Car  car = new Car();
		         
		        
		         Circle  circle = new Circle();
		         
		         shape = car;
		         shape.draw();
		         
		         shape = circle ;
		         circle.setRadius(100);
		         shape.draw();
		         
		         Vehicle  vehicle = car ;
		         vehicle.speed();

	}

}
