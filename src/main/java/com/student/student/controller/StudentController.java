package com.student.student.controller;

import com.student.student.entity.Student;
import com.student.student.service.StudentService;
import org.springframework.web.bind.annotation.*;

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
    
    @GetMapping("/student/{usn}")
    public Student getStudentByUSN(@PathVariable String usn){
        return service.getStudentByUSN(usn);
    }

    @DeleteMapping("/student/{usn}")
    public String deleteByUSN(@PathVariable String usn){
        return service.deleteByUSN(usn);
    }
}
