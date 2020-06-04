package com.geom;

public class TestCircle {

	public static void main(String[] args) {
		
		Circle   a=  new Circle();
		Circle   b= new Circle();
		
		a.setRadius(100);  a.setX(10); a.setY(20);
		
		b.setRadius(200);  b.setX(30); b.setY(50);
		
		
		a.draw();
		
		b.draw();
		System.out.println(  a.calculateArea());
		System.out.println(  b.calculateArea());
		
	}

}
