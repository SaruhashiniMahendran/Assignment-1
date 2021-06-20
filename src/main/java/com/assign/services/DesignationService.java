package com.assign.services;

import java.util.List;

import com.assign.dto.DesignationDto;
import com.assign.dto.DesignationRespDto;

public interface DesignationService {
	
	public void addDesignation(DesignationDto designationDto);
	
	public List<DesignationRespDto> viewDesignation();
	
	public void deleteDesignation(Long id);
	
	public void updateDesignation(DesignationDto designationDto);

}
