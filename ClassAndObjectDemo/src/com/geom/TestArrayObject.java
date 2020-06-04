package com.geom;

import java.util.Random;

public class TestArrayObject {

	public static int findBiggestRectangle(Rectangle[] rectangle) {

		// fill the code 
		return 0;
	}

	public static void main(String[] args) {

		Rectangle[] rectangle = new Rectangle[10];
		Random random = new Random();
		for (int i = 0; i < rectangle.length; i++) 
		{
			int length = random.nextInt(100);
			int width = random.nextInt(100);

			rectangle[i] = new Rectangle(length, width);
		}

		int area= findBiggestRectangle(rectangle);
		System.out.println(" Biggest Rectangle = "+area);
		
	}

}
