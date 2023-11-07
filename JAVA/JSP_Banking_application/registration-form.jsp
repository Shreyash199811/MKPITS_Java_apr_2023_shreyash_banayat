<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 06-11-2023
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Registration Page</title>
</head>
<body>
<h1>Registration</h1>
<form action="register-controller.jsp" method="post" align="center">
    Create UserId <input type="text" name="user_id"  placeholder="----Enter----"><br><br>
    Enter Password <input type="password" name="user_ps"  placeholder="----Enter----"><br><br>
    Enter Your Name <input type="text" name="user_name" placeholder="----Enter----"><br><br>
    Enter your Address <input type="text" name="user_address" placeholder="----Enter----"><br><br>
    Enter Your City <input type="text" name="user_city" placeholder="----Enter----"><br><br>
    Enter Your Balance <input type="text" name="user_amount" placeholder="----Enter----"><br><br>
    <input type="submit" value="Submit">
</form>

</body>
</html>
