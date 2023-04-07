package com.istad.spring_core_lessons.repository;

import com.istad.spring_core_lessons.model.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseRepository {
    List<Course> allCourses = new ArrayList<>(){{
        add(new Course(1001,"Java","2months"));
        add(new Course(1002,"Maths","3months"));
    }} ;

    // data
    public void addCourse(Course course){
        allCourses.add(course);
    }
    public Course getCourseByID ( int id ){

        return allCourses.stream().filter((course-> course.courseID == id )).findFirst().orElse(null);
    }

    public List<Course> getAllCourses (){
        return allCourses;
    }
}
