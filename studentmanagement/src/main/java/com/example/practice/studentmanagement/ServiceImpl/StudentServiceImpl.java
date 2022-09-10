package com.example.practice.studentmanagement.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.studentmanagement.entity.Student;
import com.example.practice.studentmanagement.repository.StudentRepo;
import com.example.practice.studentmanagement.service.StudentServices;

@Service
public class StudentServiceImpl implements StudentServices{

    @Autowired
    private StudentRepo studentRepo;

    public StudentServiceImpl(StudentRepo studentRepo) {
        super();
        this.studentRepo = studentRepo;
    }

    @Override
    public String storeStudentDetails(Student student) {
        Student studentRes=studentRepo.save(student);
        System.out.println(student);
        return null;
    }


    
}
