package com.thanhnhandev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thanhnhandev.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
}
