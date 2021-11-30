package com.original.origin.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.original.origin.entity.Employee;


@Repository
public interface EmpRepository extends JpaRepository<Employee, Long> {


	Employee getById(Integer employeeId);
	
	
	
}

