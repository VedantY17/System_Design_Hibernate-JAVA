package com.jsp.employee.controller;

import com.jsp.employee.service.EmployeeService;

public class EmployeeDelete {

	public static void main(String[] args) {
		
		EmployeeService employeeService = new EmployeeService();
		boolean res = employeeService.deleteEmployeeById(4);
		System.out.println(res);
	}
}
