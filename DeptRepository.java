package com.original.origin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.original.origin.entity.department;

@Repository
public interface DeptRepository extends JpaRepository<department, Integer>{

	department getById(Integer deptId);
	
}
