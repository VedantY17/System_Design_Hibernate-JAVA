package com.jsp.employee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.employee.dto.Employee;

public class EmployeeDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vedant");

	EntityManager entityManager = entityManagerFactory.createEntityManager();

	EntityTransaction entityTransaction = entityManager.getTransaction();

	Employee employee = new Employee();

	// to save employee
	public Employee saveEmployees(Employee employee) {

		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();

		return employee;
	}

	// to get employee
	public Employee getEmployeeById(int id) {

		Employee employee = entityManager.find(Employee.class, id);

		return employee;
	}

	// to delete employee
	public boolean deleteEmployeeById(int id) {

		Employee employee = entityManager.find(Employee.class, id);

		if (employee != null) {
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
			return true;
		} else {
			System.out.println("not deleted");
			return false;
		}

	}

	// to update email
	public Employee updateEmployeeById(Employee employee) {
		if (employee != null) {
			entityTransaction.begin();
			entityManager.merge(employee);
			entityTransaction.commit();
		}
		return employee;
	}

	// to get all employees
	public List<Employee> getAllEmployees() {

		String sql = "SELECT e FROM Employee e";
		Query query = entityManager.createQuery(sql);

		List<Employee> employees = query.getResultList();

		return employees;
	}

}

