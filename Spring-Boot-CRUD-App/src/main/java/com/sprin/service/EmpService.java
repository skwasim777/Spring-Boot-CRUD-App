package com.sprin.service;

import java.util.ArrayList;

import com.sprin.entity.Employee;

public interface EmpService {
	Employee createEmployee(Employee emp);

	Employee getEmployeeById(Long eId);

	ArrayList<Employee> getAllEmployee();

	Employee updateEmployee(Employee emp);

	void deleteEmployee(Long eId);
}
