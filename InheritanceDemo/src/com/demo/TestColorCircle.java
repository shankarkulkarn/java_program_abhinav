package com.demo;

public class TestColorCircle {

	   public static void main(String[] args) {
		
		   ColorCircle   colorCircle = new ColorCircle(200,10,10);
		   
		   colorCircle.setRadius(100);
		   colorCircle.setX(10);
		   colorCircle.setY(20);
		   colorCircle.draw();
		   System.out.println(colorCircle.calculateCircumference());
		   
		   Circle   circle = colorCircle ;
		   circle.setRadius( 200 );
		   System.out.println( circle.calculateArea() );
		   // System.out.println( circle.calculateCircumference() );
		       circle.draw();
		   
		   
		   
		   
	}
}
