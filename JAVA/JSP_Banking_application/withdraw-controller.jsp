<%@ page import="com.mysql.cj.Session" %>
<%@ page import="com.example.bankapplicationusebean.BankService" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 08-11-2023
  Time: 18:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String userid=(String) session.getAttribute("sessionID");
%>
<jsp:useBean id="bank1" class="com.example.bankapplicationusebean.Bank" scope="application"/>
<jsp:setProperty name="bank1" property="accountBalance" param="withdraw_amt"/>
<jsp:setProperty name="bank1" property="userID" value="<%=userid%>"/>

<%
    BankService bankService=new BankService();
    int result=bankService.withdraw(bank1);
    bankService.insertTransaction(bank1,"Withdraw");
    out.println(result);
    if(result!=0){
        out.println("Withdraw Succesfull");
    }
    else{
        out.println("Unsuccessfull");
    }
    out.println("<h3><a href=\"homepage.jsp\">Back</a></h3>");
%>
<html>
<head>
    <title>Withdraw</title>
</head>
<body>

</body>
</html>
