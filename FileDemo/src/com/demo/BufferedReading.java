package com.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedReading {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fout = new FileOutputStream("sample.txt");
		BufferedOutputStream  bout = new BufferedOutputStream(fout);
		
		long start = System.currentTimeMillis();
		for(int i=0; i<10;i++)
		{
			  fout.write(65);
		}
		long stop = System.currentTimeMillis();
		System.out.println(" Time :- "+(stop-start));

	}

}
