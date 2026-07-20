package com.student.student.controller;

import com.student.student.entity.Student;
import com.student.student.repository.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private StudentRepository repo;

    public StudentController(StudentRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }

    @PostMapping("/add")
    public Student insert(@RequestBody Student s){
        return repo.save(s);
    }
}
