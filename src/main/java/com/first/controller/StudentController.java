package com.first.controller;


import com.first.entity.Student;
import com.first.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {


    @Autowired
    private StudentService studentService;

    @GetMapping("/api/students")
    public List<Student> getStudents() {
        List<Student> students = studentService.retrieveStudent();
        return students;
    }

    @GetMapping("/api/students/{studentId}")
    public Student getStudent(@PathVariable(name="studentId")Integer studentId) {
        return studentService.getStudent(studentId);
    }

    @PostMapping("/api/students")
    public void saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        System.out.println("Student Saved Successfully");
    }

    @DeleteMapping("/api/students/{studentId}")
    public void deleteStudent(@PathVariable(name="studentId")Integer studentId){
        studentService.deleteStudent(studentId);
        System.out.println("Student Deleted Successfully");
    }

    @PutMapping("/api/students/{studentId}")
    public void updateStudent(@RequestBody Student student,
                               @PathVariable(name="studentId")Integer studentId){
        Student std = studentService.getStudent(studentId);
        if(std != null){
            studentService.updateStudent(student);
        }
    }
}
