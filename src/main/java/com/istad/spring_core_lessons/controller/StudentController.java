package com.istad.spring_core_lessons.controller;

import com.istad.spring_core_lessons.model.Student;
import com.istad.spring_core_lessons.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

   StudentService studentService;
    @Autowired
   StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    @GetMapping("/allstudents")
    public List<Student> getAllStudents(){

        return studentService.getAllStudents();
    }
}
