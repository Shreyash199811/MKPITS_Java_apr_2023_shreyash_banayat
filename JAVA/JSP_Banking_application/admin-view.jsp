<%@ page import="com.example.bankapplicationusebean.BankService" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 09-11-2023
  Time: 00:05
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin</title>
    <style>
        .navdiv{
            height: 50px;
            width:100%;
            background-color: #c0ecf0;
        }
        form{
            margin-top: 50px;
        }
    </style>
</head>
<body>

<div class=navdiv>
<h1>Admin</h1>
</div>

<form action="admin-controller.jsp" method="post" align="center">
    <label>UserID </label><input type="text" name="userid"><br><br>
    <label>Password </label><input type="password" name="userPass"><br><br>
    <input type="submit" value="Submit">
</form>

</body>
</html>
