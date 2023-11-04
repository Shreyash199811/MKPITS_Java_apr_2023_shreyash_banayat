package com.example.studentprojectjsp;

import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class StudentService {
    Connection con;
    public StudentService() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = getConnection("jdbc:mysql://localhost:3306/StudentsInformation","root","Owner@1998");
        } catch (Exception exp) {
            System.out.println(exp);
        }
    }

    public int insertRecord(Student student)  {
        int result=0;
        try {
            PreparedStatement preparedStatement = con.prepareStatement("insert into studentdetails values(?,?,?,?)");
            preparedStatement.setString(1,student.getRollNo());
            preparedStatement.setString(2, student.getStudent_name());
            preparedStatement.setString(3,student.getAddress());
            preparedStatement.setString(4,student.getCity());
            result=preparedStatement.executeUpdate();
        }catch(Exception exp){
            System.out.println(exp);
        }
        return result;
    }

}

