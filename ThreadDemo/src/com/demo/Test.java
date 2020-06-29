package com.demo;

public class Test {
	public static void printi()
	{
		for(int i=0; i<10;i++)
		{
			System.out.println("i= " + i);
		}
	}
	public static void printj()
	{
		for(int j=0;j<10;j++)
		{
			System.out.println("j= " +j);
		}
	}

	public static void main(String[] args) {
		
		Thread  thread = new Thread();
		thread.start();
		
		
		}

}
