<%@ page import="java.sql.DriverManager" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 01-11-2023
  Time: 13:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*"%>
<%@ page import="java.io.PrintWriter" %>

<%

    String rollNo=request.getParameter("roll_no");
    String name=request.getParameter("s_name");
    String address=request.getParameter("s_address");
    String city=request.getParameter("s_city");
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentsInformation","root","Owner@1998");
    PreparedStatement preparedStatement=con.prepareStatement("insert into studentdetails values(?,?,?,?)");
    preparedStatement.setString(1,rollNo);
    preparedStatement.setString(2,name);
    preparedStatement.setString(3,address);
    preparedStatement.setString(4,city);
    int rs= preparedStatement.executeUpdate();

    PrintWriter printWriter=response.getWriter();
    if(rs!=0)
        printWriter.println("Inserted");
    else
        printWriter.println("Not Inserted");
%>

