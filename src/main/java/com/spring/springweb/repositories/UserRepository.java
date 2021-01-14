package com.spring.springweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springweb.entities.User;

public interface  UserRepository extends JpaRepository<User, Long> {

}
