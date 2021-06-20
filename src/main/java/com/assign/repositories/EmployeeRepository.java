package com.assign.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assign.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	List<Employee> findByDesignationId(Long courseId);
	
	
}
