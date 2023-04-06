package com.istad.spring_core_lessons.service;

import com.istad.spring_core_lessons.model.Student;
import com.istad.spring_core_lessons.repository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;



public interface StudentService {
    // features
    public List<Student> getAllStudents();
    public Student findStudentByID(int id );


}
