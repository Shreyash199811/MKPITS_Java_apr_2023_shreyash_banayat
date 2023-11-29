package com.example.demoApplication.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
    @Id
    @Column
    private int roll_no;
    @Column
    private String name;
    @Column
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
                "roll no=" + roll_no +
                ", name='" + name + '\'' +
                ", city='" + address + '\'' +
                '}';
    }
}
