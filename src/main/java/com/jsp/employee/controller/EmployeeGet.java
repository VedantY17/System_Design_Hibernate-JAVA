package com.jsp.employee.controller;

import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;

public class EmployeeGet {
	public static void main(String[] args) {
		
		EmployeeService employeeService = new EmployeeService();
		Employee employee = employeeService.getEmployeeById(3);
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getEmail());
		System.out.println(employee.getCno());

	}
}
