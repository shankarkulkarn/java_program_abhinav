package com.demo;

public class ColorCircle extends Circle
{

	public ColorCircle(int radius,int x,int y)
	{
		super(radius,x,y);
	}
	public ColorCircle()
	{
		System.out.println(" Color Circle Default constructor ");
	}
	
	public void draw()
	{
		System.out.println(" Color Circle drawn radius ="+getRadius());
	}
	
	public double calculateCircumference()
	{
		return 2*Math.PI* getRadius() ;
	}
	
}
