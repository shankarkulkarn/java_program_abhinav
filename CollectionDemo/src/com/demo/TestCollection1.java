package com.demo;

import java.util.ArrayList;
import java.util.Collections;

public class TestCollection1 {

	public static void main(String[] args) {
		
		ArrayList<String>  list = new ArrayList<String>();
		
		list.add("orange");
		list.add("apple");
		list.add("banana");
		list.add("grapes");
		list.add("apple");
		list.add("apple");
		
		Collections.shuffle(list);
		
		System.out.println(list);
		int n = Collections.frequency(list, "apple");
		System.out.println(n);
		
	}

}
