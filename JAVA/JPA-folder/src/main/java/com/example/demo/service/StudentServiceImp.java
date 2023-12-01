package com.example.demo.service;

import com.example.demo.dao.StudentDaoImp;
import com.example.demo.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImp implements StudentService{

    private StudentDaoImp studentDaoImp;

    @Autowired
    public StudentServiceImp(StudentDaoImp studentDaoImp) {
        this.studentDaoImp = studentDaoImp;
    }

    @Override
    public List<Student> findAll() {
        return studentDaoImp.findall();
    }

    @Transactional
    @Override
    public Student save(Student student) {
        return studentDaoImp.save(student);
    }

    @Transactional
    @Override
    public void delete(int roll_number){
        studentDaoImp.delete(roll_number);
    }
}
