package com.example.demo.dao;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentDao {
public List<Student> findall();
public Student save(Student student);
public void delete(int roll_number);
public List<Student> multiInsert(List<Student> students);
}
