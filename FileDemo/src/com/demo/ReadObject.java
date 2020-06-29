package com.demo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) throws Exception {
	
ObjectInputStream out = new ObjectInputStream( new FileInputStream("emp.dat"));

while( true )
{
  Employee   employee =  (Employee) out.readObject();
  if( employee.getEmployeeId() == -1)
  {
	  break;
  }
  System.out.println(employee);
} 
  
  out.close();

	}

}
