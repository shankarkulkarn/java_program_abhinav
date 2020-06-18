package com.aditisoft.ems.pl;

import java.util.Scanner;

import com.aditisoaft.ems.exception.EmployeeException;
import com.aditisoft.ems.dto.Employee;
import com.aditosoft.ems.sl.EmployeeService;
import com.aditosoft.ems.sl.EmployeeServiceImpl;

public class EMSApps {

	public static void main(String[] args) {
		
		EmployeeService  service = new EmployeeServiceImpl();
		Scanner  scanner  =  new Scanner(System.in);
		Employee  employee = null;
		int choice = 0;
		while(choice != 5)
		{
		  System.out.println("1.ADD Employee ");	
		  System.out.println("2.Search Employee ");
		  System.out.println("3.Delete Employee ");
		  System.out.println("4.List all Employee ");
		  System.out.println("5. EXIT ");
		  System.out.println(" Enter your choice ");	
		  choice = scanner.nextInt();
		  switch(choice)
		  {
		  case   1  :  System.out.println("Enter Employee Name ");
		               String name = scanner.next();
		               System.out.println("Enter Salary ");
		               double salary = scanner.nextDouble();
		               employee = new Employee(0,name,salary);
		               try
		               {
		               int id = service.createEmployee(employee);
		               System.out.println(" Employee Added Successfully with id = "+id);
		               }catch(EmployeeException e)
		               {
		            	   System.err.println(e.getMessage());
		               }
		               break;
		  case  2  :   System.out.println(" Enter Employee Id ");
		               int  id = scanner.nextInt();
		               
		               try
		               {
		               employee =  service.findEmployeeById(id);
		               System.out.println(employee);
		               }catch(EmployeeException e)
		               {
		            	   System.err.println(e.getMessage());
		               }
		               break;
		  case  5  :   System.out.println(" Thank you ");
		               System.exit(0);
		  
		  }
		  
			
			
		}
		
		
		

	}

}
