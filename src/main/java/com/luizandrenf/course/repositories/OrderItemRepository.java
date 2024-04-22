package com.luizandrenf.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizandrenf.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	
}
