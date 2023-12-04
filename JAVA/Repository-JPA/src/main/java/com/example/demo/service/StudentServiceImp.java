package com.example.demo.service;

import com.example.demo.dao.RepositoryJPA;
import com.example.demo.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService{

    private RepositoryJPA repositoryJPA;

    @Autowired
    public StudentServiceImp(RepositoryJPA repositoryJPA) {
        this.repositoryJPA = repositoryJPA;
    }

    @Override
    public List<Student> findAll() {
        return repositoryJPA.findAll();
    }

    @Transactional
    @Override
    public Student save(Student student) {
        return repositoryJPA.save(student);
    }

    @Transactional
    @Override
    public void delete(Integer roll_number){
        repositoryJPA.deleteById(roll_number);
    }

    @Override
    public Student findParticular(Integer rollNo){
        Optional<Student> studentOptional=repositoryJPA.findById(rollNo);
        return studentOptional.get();
    }

    public Student update(Student student){
        Optional<Student> studentOptional=repositoryJPA.findById(student.getRoll_no());
        if(studentOptional.isPresent()){
            repositoryJPA.save(student);
            System.out.println("Record Updated");
        }
        else {
            System.out.println("Cannot find Record");
        }
        return student;
    }

    public List<Student> multiInsert(List<Student> studentList){
            repositoryJPA.saveAll(studentList);
            return studentList;
    }

}
