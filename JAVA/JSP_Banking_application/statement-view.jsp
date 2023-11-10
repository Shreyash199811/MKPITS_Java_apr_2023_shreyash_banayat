<%@ page import="com.example.bankapplicationusebean.BankService" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.ResultSetMetaData" %><%--
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
    ResultSetMetaData resultSetMetaData=resultSet.getMetaData();
%>
<table border="1" align="center">
    <tr>
        <%
            for(int columnIndex=1;columnIndex<=resultSetMetaData.getColumnCount();columnIndex++)
            {
        %>
        <th><%=resultSetMetaData.getColumnName(columnIndex)%></th>
        <%
            }
        %>
    </tr>

    <%
        while(resultSet.next())
        {
    %>
    <tr>
        <td><%=resultSet.getString(1)%></td>
        <td><%=resultSet.getString(2)%></td>
        <td><%=resultSet.getString(3)%></td>
        <td><%=resultSet.getString(4)%></td>
    </tr>

    <%
        }
    %>

</table>
</body>
</html>
