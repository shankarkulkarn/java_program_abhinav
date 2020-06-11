package com.demo;

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList  list = new LinkedList();
		
		list.addElement(10);
		list.addElement(80);
		list.addElement(79);
		
		int num = list.removeElement(2);
		System.out.println(num);
		
		for(int n : list.findAll())
		{
			System.out.println(n);
		}

	}

}
