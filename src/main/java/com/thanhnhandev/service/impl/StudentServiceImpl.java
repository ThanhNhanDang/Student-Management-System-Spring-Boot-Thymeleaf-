package com.thanhnhandev.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.thanhnhandev.entity.Student;
import com.thanhnhandev.repository.StudentRepository;
import com.thanhnhandev.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> list = studentRepository.findAll();
		return list;
	}

	@Override
	public Student saveStudent(Student entity) {
		return studentRepository.save(entity);
	}

	@Override
	public Student getStudentById(Long id) {
		
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Long id, Student entity) {
		Student entityRepo = this.getStudentById(id);
		
		entityRepo.setFirstName(entity.getFirstName());
		entityRepo.setLastName(entity.getLastName());
		entityRepo.setEmail(entity.getEmail());
		return studentRepository.save(entityRepo);
	}
	
}
