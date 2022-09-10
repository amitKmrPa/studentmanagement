package com.example.practice.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practice.studentmanagement.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Long>{
    
}
