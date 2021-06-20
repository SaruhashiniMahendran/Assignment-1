package com.assign.dto;


public class EmployeeRespDto {
	private String firstName;
	
	private String lastName;
	
	private String joiningData;
	
	private String email;
	
	private Long designationId;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getJoiningData() {
		return joiningData;
	}
	public void setJoiningData(String joiningData) {
		this.joiningData = joiningData;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getDesignationId() {
		return designationId;
	}
	public void setDesignationId(Long designationId) {
		this.designationId = designationId;
	}
	
}
