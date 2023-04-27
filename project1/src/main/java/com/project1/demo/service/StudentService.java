package com.project1.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.demo.model.Student;
import com.project1.demo.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository sc;
	public List<Student> getall()
	{
		return sc.findAll();
	}
	public Student saveall(Student s)
	{
		return sc.save(s);
	}
	

}
