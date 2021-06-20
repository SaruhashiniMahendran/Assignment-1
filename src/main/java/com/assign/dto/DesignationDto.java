package com.assign.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class DesignationDto {
	
	private Long id;
	
	@NotNull(message="Not be in Null")
	@NotBlank(message="Not be in Blank")
	@NotEmpty(message="Not be in Empty")
	private String name;
	
//	private List<Employee> employeeId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public List<Employee> getEmployeeId() {
//		return employeeId;
//	}
//
//	public void setEmployeeId(List<Employee> employeeId) {
//		this.employeeId = employeeId;
//	}
	
}
