package com.jsp.employee.service;

import java.util.List;

import com.jsp.employee.dao.EmployeeDao;
import com.jsp.employee.dto.Employee;

public class EmployeeService {

	EmployeeDao employeeDao = new EmployeeDao();

	public Employee saveEmployees(Employee employee) {
		return employeeDao.saveEmployees(employee);
	}

	public Employee getEmployeeById(int id) {
		return employeeDao.getEmployeeById(id);
	}

	public boolean deleteEmployeeById(int id) {
		return employeeDao.deleteEmployeeById(id);
	}

	public Employee updateEmployeeById(int id, String email) {
		Employee employee = employeeDao.getEmployeeById(id);
		employee.setEmail(email);
		return employeeDao.updateEmployeeById(employee);
	}

	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

}
