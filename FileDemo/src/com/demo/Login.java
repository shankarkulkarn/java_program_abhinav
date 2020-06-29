package com.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Login {

	public static void main(String[] args)  throws Exception  {
		
		Scanner  scanner = new Scanner(System.in);
		System.out.println(" Enter login name ");
		String  user =  scanner.nextLine();
		System.out.println(" Enter password ");
		String pass = scanner.nextLine();
		FileReader  fr1 = new FileReader("login.txt");
	    BufferedReader  br1 = new BufferedReader( fr1);
	    String arr[]=null;
	    boolean  found = false;
	    while( br1.ready() )
	    {
	    String str = br1.readLine();
	    arr=str.split("\\s+");
	    if( arr[0].equals(user)  && arr[1].equals(pass))
	    {
	    	   found = true; 
	    	   break;
	    }
	    
	    }
	    
	    if( found )
	    {
	    	System.out.println(" Login Success ");
	    }
	    else
	    {
	    	System.out.println(" Login Failed ");
	    }
	    br1.close();
		  
		

		
		
		
	}

}
