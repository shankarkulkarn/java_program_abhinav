package com.demo;

import java.util.ArrayList;

public class TestEmployee {

	public static void main(String[] args) {
		
		ArrayList<Employee>  list = new ArrayList<Employee>();
		
		Employee  e1 = new Employee(2001,"JOHN",9000);
		Employee  e2 = new Employee(1001,"STEVEN",8000);
		Employee  e3 = new Employee(3001,"DAVID",5000);
		Employee  e4 = new Employee(5001,"MICHAEL",8000);
		Employee  e5 = new Employee(4001,"BOB",5000);
		Employee  e6 = new Employee(6001,"KING",7000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		
		print(list);
		
}

	public static void print(ArrayList<Employee>  list)
	{
		
		for(Employee emp : list)
		{
		
		if( emp.getEmployeeSalary() >= 8000 )
		{
		  System.out.println( emp.getEmployeeNumber()+"  "+emp.getEmployeeName());
		}
		
		}
	}
	
}
