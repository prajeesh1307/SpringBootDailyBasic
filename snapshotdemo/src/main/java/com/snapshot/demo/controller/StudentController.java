package com.snapshot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.snapshot.demo.model.Student;
import com.snapshot.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studService;
	
	@GetMapping(value="/fetchStudents")
	public List<Student> getAllStudents()
	{
		return studList;
	}
	
	
	{
		List<Student>studList=studService.getAllStudents();
		return studList;
	}
	//http://localhost:9080/saveStudent
	
	@PostMapping(value="/saveStudent")
	public Student saveStudent(@RequestBody Student s)
	{
		return studService.saveStudent(s);
	}
	@PutMapping(value="/updateStudent")
	public Student updateStudent(@RequestBody Student s)
	{
		return studService.saveStudent(s);
	}
	@DeleteMapping("/deleStudent/{rno}")
	public Student deleteStudent(@PathVariable("rno") int id)
	{
		return studService.deleteStudent(id);
	}

}
