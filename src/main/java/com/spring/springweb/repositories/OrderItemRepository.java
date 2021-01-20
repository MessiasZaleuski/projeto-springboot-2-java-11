package com.spring.springweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springweb.entities.OrderItem;

public interface  OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
