package com.demo;

public class Circle implements Shape {

	private  int radius ;   // instance variable 
	private int x,y ;      // instance variable 
	
	
	
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void draw()
	{
		
		System.out.println(" Circle drawn radius = "+radius );
	}
	
	public double calculateArea()
	{
		return Math.PI *  radius * radius ;
	}

	@Override
	public void area() {
		System.out.println( calculateArea());
		
		
	}
}
