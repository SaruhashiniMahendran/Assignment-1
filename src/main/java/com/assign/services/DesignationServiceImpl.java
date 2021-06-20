package com.assign.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assign.dto.DesignationDto;
import com.assign.dto.DesignationRespDto;
import com.assign.entity.Designation;
import com.assign.repositories.DesignationRepository;

@Service
public class DesignationServiceImpl implements DesignationService{

	@Autowired
	private DesignationRepository designationRepository;
	
	@Autowired
	ModelMapper modelmapper;
	
	@Override
	public void addDesignation(DesignationDto designationDto) {
		Designation designation = modelmapper.map(designationDto, Designation.class);
		//System.out.println(designation.getEmployee().getFirstName());
		designationRepository.save(designation);
	}
	
	@Override
	public List<DesignationRespDto> viewDesignation(){
		List<Designation> designations = designationRepository.findAll();
		return designations.stream().map(this::convertEntityToDto).collect(Collectors.toList());
	}
	private DesignationRespDto convertEntityToDto(Designation designation) {
		DesignationRespDto designationRespDtos = modelmapper.map(designation, DesignationRespDto.class);
		return designationRespDtos;
	}
	@Override
	public void deleteDesignation(Long id) {
		designationRepository.deleteById(id);
	}
	@Override
	public void updateDesignation(DesignationDto designationDto) {
		Designation designation = modelmapper.map(designationDto, Designation.class);
		designationRepository.save(designation);
	}
	
}
