package com.example.demo.entity;

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

    public Student(int roll_no, String name, String address) {
        this.roll_no = roll_no;
        this.name = name;
        this.address = address;
    }

    public Student() {

    }

    //    ---------------------Getter---------------------
    public int getRoll_no() {
        return roll_no;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

//    ---------------------Setter---------------------

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
