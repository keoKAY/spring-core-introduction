package com.istad.spring_core_lessons.configuration;

import com.istad.spring_core_lessons.service.CourseService;
import com.istad.spring_core_lessons.service.serviceImpl.CourseServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public CourseService getCourseService(){
        return new CourseServiceImpl();
    }
}
