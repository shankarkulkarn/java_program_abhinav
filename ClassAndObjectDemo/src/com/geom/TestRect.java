package com.geom;

import java.util.Scanner;

public class TestRect {

	public static void main(String[] args) {
		
		Scanner  scanner  = new Scanner(System.in);
		System.out.println(" Enter Length and width ");
		int length = scanner.nextInt();
		int width = scanner.nextInt();
		Rectangle rectangle = new Rectangle(length,width);
		
		Rectangle  myrectangle = new Rectangle();
		
		
		//rectangle.setLength(length);
		//rectangle.setWidth(width);
		System.out.println(" Area = "+rectangle.area());
		
		rectangle.setLength( rectangle.getLength() + 10 );
        rectangle.setWidth(rectangle.getWidth() + 10);
		
		
		System.out.println(" Area = "+rectangle.area());

	}

}
