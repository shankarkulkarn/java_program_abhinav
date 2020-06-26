package com.demo;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args)  throws Exception  {
		
		FileReader  fr = new FileReader("poem.txt");
	    BufferedReader  br = new BufferedReader( fr);
	    while( br.ready() )
	    {
	    String str = br.readLine();
	    System.out.println(str);
	    }
	    br.close();

	}

}
