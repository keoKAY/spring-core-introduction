package com.istad.spring_core_lessons.service.serviceImpl;

import com.istad.spring_core_lessons.model.Student;
import com.istad.spring_core_lessons.repository.StudentRepository;
import com.istad.spring_core_lessons.service.StudentService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    // Student Repository
    StudentRepository studentRepository;
    StudentServiceImpl (){
        studentRepository = new StudentRepository();
    }
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    @Override
    public Student findStudentByID(int id ) {
        return studentRepository.getStudentByID(id);
    }
}
