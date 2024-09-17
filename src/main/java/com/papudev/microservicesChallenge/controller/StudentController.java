package com.papudev.microservicesChallenge.controller;

import com.papudev.microservicesChallenge.entity.Student;
import com.papudev.microservicesChallenge.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getAll")
    public List<Student> getAll(){
        return studentService.getStudent();
    }

    @GetMapping("/{id}")
    public Optional<Student> getById(@PathVariable("id") Long id){
        return  studentService.getStudent(id);
    }

    @PostMapping
    public Student saveUpdate(@RequestBody Student student){
        studentService.saveUpdate(student);
        return student;
    }

    @DeleteMapping("/{studentId}")
    public void delete(@PathVariable("studentId") Long studenId){
        studentService.delete(studenId);
    }
}
