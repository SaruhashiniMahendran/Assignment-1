package com.assign.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assign.dto.EmployeeDto;
import com.assign.dto.EmployeeRespDto;
import com.assign.entity.Employee;
import com.assign.services.EmployeeService;

@RestController
@RequestMapping(value="api/v1/empl")
public class EmployeeController {
	@Autowired
	public EmployeeService employeeService;
	
	@PostMapping(value="/add")
	public ResponseEntity<Object>addEmployee(@Valid @RequestBody EmployeeDto employeeDto){
		employeeService.addEmployee(employeeDto);
		return new ResponseEntity<Object>("successfully entered Employee", HttpStatus.CREATED);
	}
	
	@GetMapping(value="/view")
	public ResponseEntity<List<EmployeeRespDto>>viewEmployee(){
		return new ResponseEntity<List<EmployeeRespDto>>(employeeService.viewEmployee(),HttpStatus.OK);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public ResponseEntity<String>deleteEmployee(@PathVariable Long id){
		employeeService.deleteEmployee(id);
		return new ResponseEntity<String>("successfully deleted employee", HttpStatus.OK);
	}
	
	@PutMapping(value = "/update")
	public ResponseEntity<Object>updateEmployee(@Valid @RequestBody EmployeeDto employeeDto){
		employeeService.updateEmployee(employeeDto);
		return new ResponseEntity<Object>("successfully update employee", HttpStatus.OK);
	}
	
	@GetMapping(value="/getById/{id}")
	public Optional<Employee> getEmployee(@PathVariable Long id) {
		return employeeService.getEmployee(id);
	}
	@GetMapping(value="/getAllEmp/{desId}")
	public List<Employee>getEmpByDes(@PathVariable Long desId){
		return employeeService.getEmpByDes(desId);
	}
}
