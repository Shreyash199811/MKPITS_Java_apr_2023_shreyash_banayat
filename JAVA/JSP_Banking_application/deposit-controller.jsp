<%@ page import="com.example.bankapplicationusebean.BankService" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 07-11-2023
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
</head>
<body>
<jsp:useBean id="bank1" class="com.example.bankapplicationusebean.Bank" scope="application"/>
<jsp:setProperty name="bank1" property="accountBalance" param="deposit_amt"/>
<%
    BankService bankService=new BankService();
    out.println(bankService.deposit(bank1)+" rows affected");
%>
<a href="homepage.jsp">Back</a>
</body>
</html>
