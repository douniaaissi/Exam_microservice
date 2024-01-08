package com.example.course_service.service;


import com.example.course_service.model.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getAllCourses() ;
    public Course getCourseById(Long id) ;

}
