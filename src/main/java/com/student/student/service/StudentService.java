package com.student.student.service;

import com.student.student.entity.Student;
import com.student.student.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public Student addStudent(Student s){
        return repo.save(s);
    }
}

