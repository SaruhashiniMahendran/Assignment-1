package com.assign.services;

import java.util.List;
import java.util.Optional;

import com.assign.dto.EmployeeDto;
import com.assign.dto.EmployeeRespDto;
import com.assign.entity.Employee;

public interface EmployeeService {
	public void addEmployee(EmployeeDto employeeDto);
	
	public List<EmployeeRespDto> viewEmployee();
	
	public void deleteEmployee(Long id);
	
	public void updateEmployee(EmployeeDto employeeDto);
	
	public Optional<Employee> getEmployee(Long id);
	
	public List<Employee> getEmpByDes(Long DesId);
}
