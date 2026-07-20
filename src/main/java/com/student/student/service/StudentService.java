package com.student.student.service;

import com.student.student.entity.Student;
import com.student.student.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public Student addStudent(Student s){
        return repo.save(s);
    }


    public List<Student> insertMultipleRecords(List<Student> list) {
        return repo.saveAll(list);
    }


    public List<Student> getAllStudents(){
        return repo.findAll();
    }


    public Student getStudentByUSN(String usn){
        Student std= repo.findById(usn).orElse(null);
        return std;
    }

    public Student updateStudent(Student s){
        return repo.save(s);
    }


    public String deleteByUSN(String usn){
        if(!repo.existsById(usn)){
            return "Record with USN:"+usn+" Not found";
        }
        Student std=repo.findById(usn).orElse(null);
        repo.delete(std);
        return "Deleted";
    }

    public long recordsCount(){
       return repo.count();
    }

    public String deleteAll() {
        repo.deleteAll();
        return "All Records deleted";
    }
}

