package com.istad.spring_core_lessons.service.serviceImpl;

import com.istad.spring_core_lessons.model.Course;
import com.istad.spring_core_lessons.repository.CourseRepository;
import com.istad.spring_core_lessons.service.CourseService;

import java.util.List;

public class CourseServiceImpl implements CourseService {

    CourseRepository courseRepository;
    public CourseServiceImpl(){
        courseRepository= new CourseRepository();
    }

    @Override
    public Course getCourseByID(int id) {
        return courseRepository.getCourseByID(id);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.getAllCourses();
    }

    @Override
    public void addCourse(Course course) {
            courseRepository.addCourse(course);
    }
}
