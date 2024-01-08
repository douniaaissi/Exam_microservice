package com.example.course_service.contoller;

import com.example.course_service.model.Course;
import com.example.course_service.model.Student;
import com.example.course_service.service.Imp.CourseServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseServiceImp courseServiceImp ;

    @GetMapping
    public List<Course> getAll(){
        return courseServiceImp.getAllCourses() ;
    }

    @GetMapping("/{id}")
    public Course getCourse(@PathVariable Long id){
        return courseServiceImp.getCourseById(id) ;
    }


   /* @GetMapping("/{name}")
    public List<Student> getAllStudent(@PathVariable String name ) {

    }*/


}
