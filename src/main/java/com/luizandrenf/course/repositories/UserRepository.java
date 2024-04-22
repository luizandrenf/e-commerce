package com.luizandrenf.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizandrenf.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
