package com.demo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) throws Exception {
		
		Employee  employee1 =  new Employee(1000,"krishna",9000);
		Employee  employee2 =  new Employee(1003,"Vijay",8000);
		Employee  employee3 =  new Employee(1001,"Jay",7000);
		Employee  employee4 =  new Employee(1002,"seema",5000);
		Employee  employee5=  new Employee(-1,"NA",0);
		
		FileOutputStream fout = new FileOutputStream("emp.dat");
		
		ObjectOutputStream  out = new ObjectOutputStream( fout);
		
        out.writeObject(employee1);
        out.writeObject(employee2);
        out.writeObject(employee3);
        out.writeObject(employee4);
        out.writeObject(employee5);
        
        out.close();
        System.out.println(" Object Saved ");
		
	}

}
