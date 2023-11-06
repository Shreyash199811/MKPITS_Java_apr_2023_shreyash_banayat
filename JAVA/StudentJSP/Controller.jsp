<%@ page import="com.example.studentprojectjsp.StudentService" %>
<%@ page import="java.sql.*" %>
<%@ page import="com.example.studentprojectjsp.Student" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 04-11-2023
  Time: 12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    try {
        StudentService studentService = new StudentService();
        ResultSet resultSet = studentService.getRecords();


        ArrayList<Student> studentList = new ArrayList<Student>();
        while (resultSet.next()) {
            studentList.add(new Student(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4)));
        }
        request.setAttribute("studList", studentList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view.jsp");
        requestDispatcher.forward(request, response);
    }catch(Exception x){
        out.println(x);
    }
%>
