package com.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DeleteObject {

	public static void main(String[] args) throws Exception {
		
		ObjectInputStream out = new ObjectInputStream( new FileInputStream("emp.dat"));
        List<Employee>   list = new ArrayList<Employee>();
        
		while( true )
		{
		  Employee   employee =  (Employee) out.readObject();
		  if( employee.getEmployeeId()!=1001)
		  {
			    list.add(employee);
		  }
		  if( employee.getEmployeeId() == -1)
		  {
			  break;
		  }
		  
		} 
		  
		  out.close();
ObjectOutputStream  fout = new ObjectOutputStream(new FileOutputStream("emp.dat"));

for( Employee  emp : list)
{
	  fout.writeObject(emp);
}
		  
fout.close();
System.out.println(" Employee Deleted with Id 1001 ");

			}

	}


