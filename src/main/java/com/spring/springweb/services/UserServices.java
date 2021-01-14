package com.spring.springweb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.springweb.entities.User;
import com.spring.springweb.repositories.UserRepository;

public class UserServices {
	
	@Autowired
	private UserRepository repository;
	
	public List<User>findAll(){
		return repository.findAll();

}
}
