package com.assign.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.assign.entity.Designation;

public interface DesignationRepository extends JpaRepository<Designation, Long>{
	
}
