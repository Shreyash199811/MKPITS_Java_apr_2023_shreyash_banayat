package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> findAll();

    Student save(Student student);
    void delete(Integer roll_number);

    Student findParticular(Integer rollNo);

    Student update(Student student);

    List<Student> multiInsert(List<Student> studentList);
}


