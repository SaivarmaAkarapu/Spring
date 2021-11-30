package com.original.origin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.original.origin.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

	User getById(Integer id);
	
	
}
