package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();

    Student save(Student student);
    void delete(int roll_number);
    List<Student> multiInsert(List<Student> students);
}
