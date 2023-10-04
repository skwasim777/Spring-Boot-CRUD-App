package com.sprin.serviceImpl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.sprin.entity.Employee;
import com.sprin.service.EmpService;

public class ServiceImpl implements EmpService {
	@Autowired
	private Employee employee;

	@Override
	public Employee createEmployee(Employee emp) {
			
		return employee.save(emp);
	}

	@Override
	public Employee getEmployeeById(Long eId) {
		 Optional<Employee> optEmpl = ((Employee) employee).findById(eId);
	        return optEmpl.get();
	}

	@Override
	public ArrayList<Employee> getAllEmployee() {

		return null;
	}

	@Override
	public Employee updateEmployee(Employee emp) {

		return null;
	}

	@Override
	public void deleteEmployee(Long eId) {

	}

}
