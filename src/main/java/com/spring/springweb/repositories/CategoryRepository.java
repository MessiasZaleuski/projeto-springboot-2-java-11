package com.spring.springweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springweb.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
