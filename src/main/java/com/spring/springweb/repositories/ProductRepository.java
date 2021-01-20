package com.spring.springweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
