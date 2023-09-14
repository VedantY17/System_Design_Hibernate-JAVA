package com.jsp.employee.controller;

import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;

public class EmployeeUpdate {
	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeService();
		Employee e1 = employeeService.updateEmployeeById(2, "abc@mail.com");
		System.out.println(e1.getEmail());

	}

}
