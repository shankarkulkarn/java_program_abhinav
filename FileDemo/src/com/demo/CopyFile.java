package com.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
/* program to copy file */  //  internal documentation 

public class CopyFile {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fin = new FileInputStream("poem1.txt");
		FileOutputStream fout = new FileOutputStream("poem_copy.txt");
		
		while( fin.available() > 0)
		{
			  fout.write( fin.read() );
		}

		System.out.println(" File Copied Successfully ");
	}

}
