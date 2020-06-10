package com.demo;

public class TestData {

	public static void main(String[] args) {
		
		  Data<Integer>   d1 = new Data();
		  
		  d1.setElement(10);
		  int element = d1.getElement();
		  System.out.println(element);
		  
		  Data<String>  d2 = new Data();
		  d2.setElement("india");
		  String str = d2.getElement();
		  System.out.println(str);
		  
	}
}
