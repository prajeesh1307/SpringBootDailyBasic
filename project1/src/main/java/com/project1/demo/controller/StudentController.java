package com.project1.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project1.demo.model.Student;
import com.project1.demo.repository.StudentRepository;
import com.project1.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService sr;
    @GetMapping("/id")
	public List<Student>fetch()
	{
		return sr.getall();
	}
    @PostMapping("/postid")
    public Student saveid(@RequestBody Student s)
    {
    	return sr.saveall(s);
    }
}
