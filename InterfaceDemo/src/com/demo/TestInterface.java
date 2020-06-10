package com.demo;

import java.util.Random;

public class TestInterface {

	public static void main(String[] args) {
		
		  Shape  []  shape = new Shape[10];
		  
		  Random  random = new Random();
		  
		  for(int i=0;i<10;i++)
		  {
			  int num = random.nextInt(100);
			  if( num %2 == 0)
			  {
				  shape[i]=new Car();
			  }
			  else if( num%3 == 0)
			  {
				  shape[i]=new Circle();
			  }
			  else
			  {
				  shape[i]=new Rectangle();
			  }
			  
		  }
		  
		  for(int i=0;i<10;i++)
		  {
			  shape[i].draw();
		  }
		  
	}

}
