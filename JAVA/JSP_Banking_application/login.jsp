<%@ page import="com.example.bankapplicationusebean.BankService" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 06-11-2023
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%

%>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<%

%>
<%@page session="true" %>

<%="Welcome"%>
<%
    RequestDispatcher requestDispatcher = request.getRequestDispatcher("homepage.jsp");
    requestDispatcher.forward(request, response);
    }
    else
    {
%>
<h1><%="Unable to fetch"%></h1>
<h1><a href="index.jsp">Back</a></h1>
<%
    }
%>

</body>
</html>
