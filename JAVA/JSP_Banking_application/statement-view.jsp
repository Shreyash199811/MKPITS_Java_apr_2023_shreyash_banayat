<%@ page import="com.example.bankapplicationusebean.BankService" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 08-11-2023
  Time: 23:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String userid= (String) session.getAttribute("sessionID");
%>
<jsp:useBean id="bank1" class="com.example.bankapplicationusebean.Bank" scope="application"/>
<jsp:setProperty name="bank1" property="userID" value="<%=userid%>"/>


<html>
<head>
    <title>Statement</title>
</head>
<body>
<%

    BankService bankService=new BankService();
    ResultSet resultSet=bankService.statements(bank1);
%>
<table>
    <tr>
        <td>UserID</td>
        <td>Transaction Date</td>
        <td>Transaction Amount</td>
        <td>Transaction type</td>
    </tr>
<%
    while(resultSet.next())
    {
%>
    <tr>
        <td><%=bank1.getUserID()%></td>
        <td><%=bank1.getTransactionDate()%></td>
        <td><%=bank1.getAccountBalance()%></td>
        <td><%=bank1.getTransaction_Type()%></td>
    </tr>
    <%
        }
    %>
</table>

</body>
</html>
