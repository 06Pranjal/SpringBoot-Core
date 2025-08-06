package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entites.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	@Query("select u from User u")
	public List<User> getAllUsers();
	
}
