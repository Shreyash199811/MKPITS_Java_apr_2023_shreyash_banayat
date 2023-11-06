<%@ page import="java.util.ArrayList" %>
<%@ page import="static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List" %>
<%@ page import="com.example.studentprojectjsp.Student" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 04-11-2023
  Time: 12:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>View</title>
</head>
<body>
<table>
    <%
        ArrayList<Student> studentArrayList=(ArrayList) request.getAttribute("studList");
        for (Student iterator:  studentArrayList)
        {

    %>
    <tr>
        <td><%=iterator.getRollNo()%></td>
        <td><%=iterator.getStudent_name()%></td>
        <td><%=iterator.getAddress()%></td>
        <td><%=iterator.getCity()%></td>
    </tr>
    <%
        }
        %>
</table>

</body>
</html>
