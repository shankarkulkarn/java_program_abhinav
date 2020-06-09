package com.demo;

public class Circle {

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
		for(int theta=0;theta<=360;theta++)
		{
			double px = radius * Math.sin(theta * Math.PI / 180) + x;
			double py = radius * Math.cos(theta * Math.PI / 180) + y;
			
		}
		System.out.println(" Circle drawn radius = "+radius );
	}
	
	public double calculateArea()
	{
		return Math.PI *  radius * radius ;
	}
}
