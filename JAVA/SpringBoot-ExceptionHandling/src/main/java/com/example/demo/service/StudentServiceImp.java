package com.example.demo.service;

import com.example.demo.dao.RepositoryJPA;
import com.example.demo.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

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
    public Student save(@ModelAttribute ("student") Student student) {
        return repositoryJPA.save(student);
    }


    @Transactional
    @Override
    public void delete(Integer roll_number){
        Student student=repositoryJPA.findById(roll_number).get();
        repositoryJPA.delete(student);
    }

    @Transactional
    @Override
    public Student update(Integer rollNo){
        Student students=repositoryJPA.findById(rollNo).get();
        return students;
    }

    @Override
    public Student find(Integer rollNo) {
       Optional<Student> studentOptionals =repositoryJPA.findById(rollNo);
        return studentOptionals.get();
    }


}
