package com.first.service;

import com.first.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> retrieveStudent();

    Student getStudent(Integer studentId);

    void saveStudent(Student student);

    void deleteStudent(Integer studentId);

    void updateStudent(Student student);
}
