package com.student.student.controller;

import com.student.student.entity.Student;
import com.student.student.repository.StudentRepository;
import com.student.student.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    private StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping("/student")
    public Student insert(@RequestBody Student s){
        return service.addStudent(s);
    }

    @GetMapping("/student")
    public List<Student> getAll(){
        return service.getAllStudents();
    }
}
