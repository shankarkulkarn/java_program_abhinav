package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestCollection2 {

	public static void main(String[] args) {
		
		ArrayList<String>  list = new ArrayList<String>();
		Scanner  scanner  = new Scanner(System.in);
		System.out.println(" Enter any five string ");
		for(int i=0;i<5;i++)
		{
		String str = scanner.nextLine();
		list.add(str);
		}
		
		Collections.shuffle(list);
		
		System.out.println(list);
		int n = Collections.frequency(list, "apple");
		System.out.println(n);
		
	}

}
