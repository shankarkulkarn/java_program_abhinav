package com.geom;

import java.util.Random;

public class TestEmployee {

	
	public static void main(String[] args) {
		
		Employee []  employee = new Employee[10];
		
		Random  random = new Random();
		
		for(int i=0;i<employee.length;i++)
		{
			  int  employeeNumber = random.nextInt(1000)+1000;
			  int  salary = random.nextInt(5000)+5000;
			  String name = "Abhinav-"+(i+1);
			  employee[i]=new  Employee(employeeNumber,name,salary);
		}
		
		for(int i=0; i<employee.length;i++)
		{
        System.out.println(employee[i].getEmployeeNumber()+"  "+employee[i].getEmployeeName()+" "+employee[i].getEmployeeSalary());
		}
		System.out.println("******************************");
		Employee  []  emp = EmployeeUtil.findEmployeeBySalary(employee, 5000, 8000);
		
		for(int i=0; i<emp.length;i++)
		{
        System.out.println(emp[i].getEmployeeNumber()+"  "+emp[i].getEmployeeName()+" "+emp[i].getEmployeeSalary());
		}
		

	}

}
