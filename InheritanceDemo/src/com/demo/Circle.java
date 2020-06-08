package com.demo;

public class Circle {

	private  int radius ;   // instance variable 
	private int x,y ;      // instance variable 
	
	
	
	public Circle(int radius, int x, int y) {
		super();
		this.radius = radius;
		this.x = x;
		this.y = y;
	}


	public Circle()
	{
		System.out.println(" Circle Default constructor ");
	}
	
	
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
		System.out.println(" Monocrome Circle drawn radius = "+radius );
	}
	
	public double calculateArea()
	{
		return Math.PI *  radius * radius ;
	}
}
