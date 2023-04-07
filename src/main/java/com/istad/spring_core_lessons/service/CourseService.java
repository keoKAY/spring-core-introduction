package com.istad.spring_core_lessons.service;

import com.istad.spring_core_lessons.model.Course;

import java.util.List;

public interface CourseService {
    Course getCourseByID(int id );
    List<Course> getAllCourses();
    void addCourse(Course course);
}
