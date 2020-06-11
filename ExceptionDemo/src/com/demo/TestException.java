package com.demo;

public class TestException {

	
	public static void main(String[] args) {

		
		try
		{
            int  a = Integer.parseInt(args[0]);
            
            int b = Integer.parseInt(args[1]);
            
            int result = a / b;
            
            System.out.println(" Result =  "+result);
            
		}  
		catch(IndexOutOfBoundsException  e)
		{
			  System.out.println("Parameter Missing .... ");
			  System.out.println("Usage :  java TestException n1 n2 ");
			  //e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println(" Divide by zero ");
		}
        catch(NumberFormatException  e)
		{
        	System.out.println(" Not a number ");
		}
		
        System.out.println("END");
		
	}

}
