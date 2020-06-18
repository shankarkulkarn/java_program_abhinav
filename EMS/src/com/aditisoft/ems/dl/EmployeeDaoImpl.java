package com.aditisoft.ems.dl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.aditisoaft.ems.exception.EmployeeException;
import com.aditisoft.ems.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

    private Map<Integer,Employee>  employeeMap = new HashMap<Integer,Employee>();
	
	@Override
	public int createEmployee(Employee employee) throws EmployeeException {
		
		if( employeeMap.containsKey(employee.getEmployeeId()))
		{
			throw new EmployeeException(" ID already exist ") ;
		}
		
		employeeMap.put(employee.getEmployeeId(), employee);
		return employee.getEmployeeId();
	}

	@Override
	public Employee findEmployeeById(int employeeId) throws EmployeeException {
		Employee  employee = null;
		
		if( employeeMap.containsKey(employeeId)) {
			
			   employee = employeeMap.get(employeeId);
		}
		else
		{
			throw new EmployeeException(" ID NOT  FOUND  ") ;
		}
		
		return employee;
	}

	@Override
	public Employee deleteEmployeeById(int employeeId) throws EmployeeException {
		
             Employee  employee = null;
		
		if( employeeMap.containsKey(employeeId)) {
			
			   employee = employeeMap.remove(employeeId);
			   
		}
		else
		{
			throw new EmployeeException(" ID NOT FOUND ") ;
		}
		
		
		return employee;
	}

	@Override
	public List<Employee> findAllEmployees() throws EmployeeException {
		
		Set<Integer> set = employeeMap.keySet();
		
		if( set .isEmpty() )
		{
			throw new EmployeeException(" Record not found ");
		}
		List<Employee>  list = new ArrayList<Employee>();
          
          for(int employeeId :  set )
          {
        	  list.add( employeeMap.get(employeeId));
        	  
          } 
	return list;
}
	
	
	

}
