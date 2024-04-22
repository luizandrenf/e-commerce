package com.luizandrenf.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizandrenf.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
}
