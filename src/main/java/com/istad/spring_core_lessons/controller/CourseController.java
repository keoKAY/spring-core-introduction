package com.istad.spring_core_lessons.controller;

import com.istad.spring_core_lessons.model.Course;
import com.istad.spring_core_lessons.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    // inject courseService

    CourseService courseService;
    @Autowired
    CourseController(CourseService courseService){
        this.courseService = courseService;
    }
    @GetMapping("/allcourses")
    public List<Course> getAllCourses (){
        return courseService.getAllCourses();
    }


}
