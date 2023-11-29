package com.example.demoApplication.dao;

import com.example.demoApplication.entity.Student;

public interface StudentDao {
    void save(Student student);
    Student findStudent(Integer roll_no);

    void updateRecord(Integer roll_no,String name,String address);
}
