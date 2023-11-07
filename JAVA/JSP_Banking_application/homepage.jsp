<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 07-11-2023
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
    <style>
        li {
            float: left;
            font-size: 25px;
            padding: 20px;
        }

        li a {
            display: block;
            color: black;
            padding: 8px 15px;
            text-decoration: none;
        }

        ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            width:200px;
        }
    </style>
</head>
<body>
    <ul>
        <li><a href="deposit.jsp">Deposit</a></li>
        <li>Withdraw</li>
        <li>Transfer</li>
        <li>Statement</li>
        <li>logout</li>
    </ul>

</body>
</html>
