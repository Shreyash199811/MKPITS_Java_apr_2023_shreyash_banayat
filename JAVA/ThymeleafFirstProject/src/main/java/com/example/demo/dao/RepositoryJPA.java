package com.example.demo.dao;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryJPA extends JpaRepository<Student,Integer> {

}
