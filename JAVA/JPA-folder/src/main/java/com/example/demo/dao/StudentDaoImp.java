package com.example.demo.dao;

import com.example.demo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StudentDaoImp implements StudentDao{
    private EntityManager entityManager;
    @Autowired
    public StudentDaoImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Student> findall() {
         TypedQuery<Student> students=entityManager.createQuery("from Student",Student.class);
         return students.getResultList();
    }

    @Override
    public Student save(Student student) {
        return entityManager.merge(student);
    }

    public void delete(int roll_number){
        Student student=entityManager.find(Student.class,roll_number);
        entityManager.remove(student);
    }
    @Override
    public List<Student> multiInsert(List<Student> students){
       return entityManager.merge(students);
    }






}
