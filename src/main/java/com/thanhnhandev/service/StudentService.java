package com.thanhnhandev.service;

import java.util.List;

import com.thanhnhandev.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student saveStudent(Student entity);
	Student getStudentById(Long id);
	Student updateStudent(Long id, Student entity);
	void deleteStudentById(Long id);
}
