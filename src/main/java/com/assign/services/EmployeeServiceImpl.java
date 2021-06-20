package com.assign.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assign.dto.EmployeeDto;
import com.assign.dto.EmployeeRespDto;
import com.assign.entity.Employee;
import com.assign.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	ModelMapper modelmapper;
	
	@Override
	public void addEmployee(EmployeeDto employeeDto) {
		Employee employee = modelmapper.map(employeeDto, Employee.class);
		employeeRepository.save(employee);
	}
	@Override
	public List<EmployeeRespDto> viewEmployee(){
		List<Employee> employees = employeeRepository.findAll();
		return employees.stream().map(this::convertEntToRespEnt).collect(Collectors.toList());
	}
	
	private EmployeeRespDto convertEntToRespEnt(Employee employee) {
		EmployeeRespDto employeeRespDto = modelmapper.map(employee, EmployeeRespDto.class);
		return employeeRespDto;
	}
	@Override
	public void updateEmployee(EmployeeDto employeeDto) {
		Employee employee = modelmapper.map(employeeDto, Employee.class);
		employeeRepository.save(employee);
	}
	
	@Override
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}
	
	@Override
	public Optional<Employee> getEmployee(Long id) {
		Optional<Employee> employee = employeeRepository.findById(id);
		return employee;
	}
	
	@Override
	public List<Employee> getEmpByDes(Long DesId){
		List<Employee> Employees = new ArrayList<>();
		employeeRepository.findByDesignationId(DesId).forEach(Employees::add);
		return Employees;
	}
	
}
