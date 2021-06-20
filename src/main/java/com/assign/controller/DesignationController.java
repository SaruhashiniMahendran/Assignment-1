package com.assign.controller;

import java.util.List;

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

import com.assign.dto.DesignationDto;
import com.assign.dto.DesignationRespDto;
import com.assign.services.DesignationService;

@RestController
@RequestMapping(value="api/v1/desig")
public class DesignationController {
	@Autowired
	public DesignationService designationService;
	
	@PostMapping(value="/add")
	public ResponseEntity<Object> addDesignation(@Valid @RequestBody DesignationDto designationDto ){
		designationService.addDesignation(designationDto);
		return new ResponseEntity<Object>("successfully entered Designation", HttpStatus.CREATED);
	}
	@GetMapping(value = "/view")
	public ResponseEntity<List<DesignationRespDto>>viewDesignation(){
		return new ResponseEntity<List<DesignationRespDto>>( designationService.viewDesignation(),HttpStatus.OK);
	}
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<String>deleteDesignation(@PathVariable Long id){
		designationService.deleteDesignation(id);
		return new ResponseEntity<String>("successfully deleted Designation", HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/update")
	public ResponseEntity<Object>updateDesignation(@Valid @RequestBody DesignationDto designationDto){
		designationService.updateDesignation(designationDto);
		return new ResponseEntity<Object>("successfully update designation", HttpStatus.OK);
	}
}
