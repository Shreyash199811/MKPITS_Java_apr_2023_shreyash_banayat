<%@ page import="com.example.bankapplicationusebean.BankService" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
</head>
<body>

<%
    String userid= (String) session.getAttribute("sessionID");
%>
<jsp:useBean id="bank1" class="com.example.bankapplicationusebean.Bank" scope="application"/>
<jsp:setProperty name="bank1" property="accountBalance" param="deposit_amt"/>
<jsp:setProperty name="bank1" property="userID" value="<%=userid%>"/>
<%
    String transactionType="deposite";

    BankService bankService=new BankService();
    out.println(bankService.deposit(bank1)+" rows affected");
    bankService.log(transactionType,userid);
    bankService.insertTransaction(bank1,"Deposite");
    out.println("<h3><a href=\"homepage.jsp\">Back</a></h3>");
%>

</body>
</html>
