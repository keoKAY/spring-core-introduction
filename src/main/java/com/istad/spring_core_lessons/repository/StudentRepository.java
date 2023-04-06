package com.istad.spring_core_lessons.repository;

import com.istad.spring_core_lessons.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    List<Student> studentList = new ArrayList<>(){{

        // use loop to create a lot of user
        add(new Student(1001,"james","male",90));
        add(new Student(1002,"luna","female",89));
    }};

    public List<Student> getAllStudents(){
        return studentList;
    }


    public Student getStudentByID(int id ){

        // list
        //
        return studentList.stream().filter((student -> student.id == id)).findFirst().orElse(null);
    }
}
