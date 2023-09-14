package com.jsp.employee.controller;

import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;

public class EmployeeSave {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		EmployeeService employeeService = new EmployeeService();
		
		employee.setName("xyz");
		employee.setEmail("xyz@mail");
		employee.setCno(8167227314l);
		
		employeeService.saveEmployees(employee);
	}
	
}
