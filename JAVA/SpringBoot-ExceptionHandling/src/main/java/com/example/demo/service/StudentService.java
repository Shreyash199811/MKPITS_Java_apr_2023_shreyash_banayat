package com.example.demo.service;

import com.example.demo.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> findAll();

    Student save(Student student);
    void delete(Integer roll_number);

    Student update(Integer rollNo);

    Student find(Integer rollNo);

}


