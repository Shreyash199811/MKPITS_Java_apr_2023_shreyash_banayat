package com.example.demoApplication.dao;

import com.example.demoApplication.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImp implements  StudentDao{
    private EntityManager entityManager;

    @Autowired
    public StudentDaoImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student thestudent) {
        entityManager.persist(thestudent);
    }

    @Override
    public Student findStudent(Integer roll_no)
    {
        return entityManager.find(Student.class,roll_no);
    }

    @Override
    public void updateRecord(Integer roll_no,String newName,String newAddress){
        if(entityManager.contains(roll_no)){
            Student student=new Student(newName,newAddress);
            entityManager.persist(student);
        }else {
            System.out.println("Roll number does not exist.");
        }
    }


}
