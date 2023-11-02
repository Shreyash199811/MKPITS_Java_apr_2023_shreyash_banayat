<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 02-11-2023
  Time: 12:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*"%>
<%
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsInformation","root","Owner@1998");
    Statement statement=con.createStatement();
    ResultSet resultSet=statement.executeQuery("select * from studentdetails");
    ResultSetMetaData resultSetMetaData=resultSet.getMetaData();
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
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
