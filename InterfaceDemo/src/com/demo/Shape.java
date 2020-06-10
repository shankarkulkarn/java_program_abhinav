package com.demo;

public interface Shape {

	public static final double PI = 3.142;
	public void area();
	public void draw();
	
	public static void print()
	{
		System.out.println(" Shape interface ");
	}
	
	public default void display()
	{
		System.out.println(" Shape display method called ");
	}
}
