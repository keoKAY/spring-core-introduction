package com.istad.spring_core_lessons.repository;

import com.github.javafaker.Faker;
import com.istad.spring_core_lessons.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    List<Student> studentList = new ArrayList<>(){{

        // use loop to create a lot of user
        for(int i =0; i < 10; i++){
            Faker obj = new Faker();
            add(new Student(obj.idNumber().hashCode(),obj.funnyName().name(), "male", obj.number().randomNumber()));
        }
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
