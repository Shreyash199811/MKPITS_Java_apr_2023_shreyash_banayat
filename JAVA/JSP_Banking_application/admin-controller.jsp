<%@ page import="com.example.bankapplicationusebean.Admin" %>
<%@ page import="com.example.bankapplicationusebean.BankService" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 09-11-2023
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="admin" class="com.example.bankapplicationusebean.Admin" scope="application"/>
<jsp:setProperty name="admin" property="user_id" param="userid"/>
<jsp:setProperty name="admin" property="user_password" param="userPass"/>
<html>
<head>
    <title>Admin</title>
</head>
<body>
<%
    String userid= (String) session.getAttribute("sessionID");
%>
<%
    BankService bankService=new BankService();
    ResultSet result=bankService.checkAdmin(admin);
    System.out.println(result);
    if (result.next()){
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("adminpage.jsp");
        requestDispatcher.forward(request,response);
    }
    else{
        out.println("Wrong id password");
    }
%>



</body>
</html>
