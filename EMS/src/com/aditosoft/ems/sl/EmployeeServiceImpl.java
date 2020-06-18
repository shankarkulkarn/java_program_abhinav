package com.aditosoft.ems.sl;

import java.util.List;

import com.aditisoaft.ems.exception.EmployeeException;
import com.aditisoft.ems.dl.EmployeeDao;
import com.aditisoft.ems.dl.EmployeeDaoImpl;
import com.aditisoft.ems.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao  employeeDao  =  new EmployeeDaoImpl();
	
	private static int  generateEmployeeId =  1000 ;
	
	@Override
	public int createEmployee(Employee employee) throws EmployeeException {
		
		String  employeeName =  employee.getEmployeeName();
		
		if( employeeName.matches("[a-zA-Z]+"))
		{
		      employee.setEmployeeId(++generateEmployeeId);
		      employeeDao.createEmployee(employee);
		}
		else
		{
			throw new EmployeeException("Name should contain ony characters ");
		}
		
		return generateEmployeeId;
	}

	@Override
	public Employee findEmployeeById(int employeeId) throws EmployeeException {
		
		String  empid =  String.valueOf(employeeId);
		Employee  employee = null;
		if( empid.matches("[0-9]{4}"))
		{
			  employee = employeeDao.findEmployeeById(employeeId);
		}
		else
		{
			throw new EmployeeException("ID should contain 4 digit ");
		}
		return employee ;
	}

	@Override
	public Employee deleteEmployeeById(int employeeId) throws EmployeeException {
		
		return null;
	}

	@Override
	public List<Employee> findAllEmployees() throws EmployeeException {
		
		return null;
	}

}
