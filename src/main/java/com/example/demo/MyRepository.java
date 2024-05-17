package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepository extends JpaRepository<User, Integer> {
	

}
