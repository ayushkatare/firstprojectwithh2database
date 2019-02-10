package com.first.impl;

import com.first.entity.Student;
import com.first.repository.StudentRepository;
import com.first.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> retrieveStudent() {

        List<Student> student = studentRepository.findAll();
        return student;
    }

    @Override
    public Student getStudent(Integer studentId) {
        Optional<Student> student = studentRepository.findById(studentId);
        return student.get();
    }

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Integer studentId) {
        studentRepository.deleteById(studentId);
    }

    @Override
    public void updateStudent(Student student) {

    }
}
