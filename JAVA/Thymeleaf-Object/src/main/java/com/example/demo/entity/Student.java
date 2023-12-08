package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



public class Student {
    private int roll_no;
    private String name;
    private String address;
    private String courses;
    private String gender;

    public Student(int roll_no, String name, String address, String courses,String gender) {
        this.roll_no = roll_no;
        this.name = name;
        this.address = address;
        this.courses = courses;
        this.gender=gender;
    }

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
    public String getCourses() {
        return courses;
    }

    public String getGender() {
        return gender;
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

    public void setCourses(String courses){
        this.courses=courses;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
