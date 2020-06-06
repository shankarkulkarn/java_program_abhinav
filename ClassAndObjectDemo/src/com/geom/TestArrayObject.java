package com.geom;

import java.util.Random;

public class TestArrayObject {

	public static int findBiggestRectangle(Rectangle[] rectangle) 
	{
		int big = rectangle[0].area();
		 for(int i=1; i<rectangle.length;i++)
		 {
			   int area = rectangle[i].area();
			   if ( area > big )
			   {
				  big = area; 
			   }
		 }
		
		  return big;
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
