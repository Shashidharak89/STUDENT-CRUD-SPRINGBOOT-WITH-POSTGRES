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

    @PostMapping("/student/multiple")
    public List<Student> insertMultipleRecords(@RequestBody List<Student> list){
        return service.insertMultipleRecords(list);
    }

    @GetMapping("/student")
    public List<Student> getAll(){
        return service.getAllStudents();
    }
    
    @GetMapping("/student/{usn}")
    public Student getStudentByUSN(@PathVariable String usn){
        return service.getStudentByUSN(usn);
    }
    @PutMapping("/student")
    public Student updateStudent(@RequestBody Student s){
        return service.updateStudent(s);
    }

    @DeleteMapping("/student/{usn}")
    public String deleteByUSN(@PathVariable String usn){
        return service.deleteByUSN(usn);
    }
}
