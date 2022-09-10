package com.example.practice.studentmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.practice.studentmanagement.entity.Student;
import com.example.practice.studentmanagement.service.StudentServices;

@Controller
public class StudentController {

    @Autowired
    private StudentServices studentServices;

    public StudentController(StudentServices studentServices) {
        super();
        this.studentServices = studentServices;
    }

    @RequestMapping(value="/studentRegistration",method = RequestMethod.GET)  
    public String registrationPage(@ModelAttribute("students") Student student,Model model){
        model.addAttribute("students", new Student());

        return "students/studentRegistration";
    }

    @RequestMapping(value="/submitRegistration",method = RequestMethod.POST)  
    public String studentRegis(@ModelAttribute("students") Student student, Model model ){
        
        System.out.println("========================================"+student.getFirstName());
        studentServices.storeStudentDetails(student);

        return null;
    }   
    
}
