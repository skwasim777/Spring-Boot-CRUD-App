package com.sprin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprin.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee,Long> {

}
