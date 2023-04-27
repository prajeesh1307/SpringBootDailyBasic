package com.snapshot.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snapshot.demo.model.Student;
import com.snapshot.demo.repository.StudentRepository;

@Service

public class StudentService {
	@Autowired
	StudentRepository studRepository;
	
	public List<Student> getAllStudents()
	{
		List<Student>studList=studRepository.findAll();
		return studList;
	}
	public Student saveStudent(Student s) {
		Student obj=studRepository.save(s);
		return obj;
	}
	public Student updateStudent(Student s) {
		Student obj=studRepository.save(s);
		return obj;
	}
	public void deleteStudent(int id)
	{
		studRepository.deleteById(id);
	}

}
