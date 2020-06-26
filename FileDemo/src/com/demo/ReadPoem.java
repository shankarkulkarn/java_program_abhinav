package com.demo;

import java.io.FileInputStream;

public class ReadPoem {

	public static void main(String[] args) throws Exception {
		
		   FileInputStream fin = new FileInputStream("poem.txt");
		   
		   while( fin.available() > 0 )
		   {
		   char data = (char) fin.read();
		   if(data!=32)
		    System.out.print(data);
		   
		   }
		   
		   fin.close();

	}

}
