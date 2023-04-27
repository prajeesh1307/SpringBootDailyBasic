package com.project1.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project1.demo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}
