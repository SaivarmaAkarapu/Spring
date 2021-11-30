package com.original.origin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.original.origin.entity.Usertypes;

@Repository
public interface UserTypeRepository extends JpaRepository<Usertypes, Integer>{
		
		
	
}
