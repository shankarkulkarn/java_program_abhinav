package com.aditisoft.ems.dl;

import java.util.List;

import com.aditisoaft.ems.exception.EmployeeException;
import com.aditisoft.ems.dto.Employee;

public interface EmployeeDao {

	public  int  createEmployee(Employee employee)  throws EmployeeException ;
	public  Employee  findEmployeeById(int employeeId) throws EmployeeException ;
	public Employee  deleteEmployeeById(int employeeId) throws EmployeeException ;
	public List<Employee>  findAllEmployees() throws EmployeeException ;
	
}
