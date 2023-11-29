package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
    @Id
    private int roll_no;

    private String name;


    private String address;

    public Student() {
    }

    public Student( String name, String address) {

        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", city='" + address + '\'' +
                '}';
    }
}
