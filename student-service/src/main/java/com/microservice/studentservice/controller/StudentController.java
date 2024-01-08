package com.microservice.studentservice.controller;

import com.microservice.studentservice.model.Student;
import com.microservice.studentservice.service.Imp.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentServiceImp studentServiceImp ;

    @GetMapping
    public List<Student> getAll(){
        return studentServiceImp.getAllStudents() ;
    }



    @GetMapping("/{course}")
    public List<Student> getAllStudent(@PathVariable String course){
        return studentServiceImp.getAllStudents() ;
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id) {
        return studentServiceImp.getStudentById(id);
    }

}
