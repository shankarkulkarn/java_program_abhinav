package com.geom;

import java.util.Random;

//  Array of object 
// statement tightly coupled , loosely coupled 
public class TestArray {

	
	public static void main(String[] args) {
		
		Rectangle  [] rectangle = new Rectangle[10];
		
		for(int i=0; i<rectangle.length  ;i++)
		{
		rectangle[i]= new Rectangle();
		}
		
		Random  random = new Random();
		for(int i=0;i<rectangle.length ;i++)
		{
		int length = random.nextInt(100);
		int width = random.nextInt(100);
	    rectangle[i].set(length,width);
		System.out.println(rectangle[i].area());
		}
	}

}
