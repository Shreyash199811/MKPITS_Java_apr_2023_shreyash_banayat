package com.example.studentprojectjsp;

public class Student {
    private String rollNo;
    private String student_name;
    private String address;
    private String city;

    public Student() {
    }

    public Student(String rollNo, String student_name, String address, String city) {
        this.rollNo = rollNo;
        this.student_name = student_name;
        this.address = address;
        this.city = city;
    }


//    ------------------------Getters------------------------

    public String getRollNo() {
        return rollNo;
    }

    public String getStudent_name() {
        return student_name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

//    ------------------------Setters------------------------

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
