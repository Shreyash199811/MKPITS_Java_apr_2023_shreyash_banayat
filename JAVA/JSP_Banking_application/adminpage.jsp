<%@ page import="com.example.bankapplicationusebean.BankService" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.ResultSetMetaData" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 09-11-2023
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Page</title>
</head>
<body>
<%
    BankService bankService=new BankService();
    ResultSet resultSet=bankService.notApprovedUsers();
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
        <td><%=resultSet.getString(5)%></td>
        <td><%=resultSet.getString(6)%></td>
        <td><%=resultSet.getString(7)%></td>
        <td><%=resultSet.getString(8)%></td>
        <td><%=resultSet.getString(9)%></td>
        <td><%=resultSet.getString(10)%></td>
    </tr>

    <%
        }
    %>

</table>

</body>
</html>
