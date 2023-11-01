<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<%--<a href="hello-servlet">Hello Servlet</a>--%>
<form action="registration.jsp" method="post">
    <label for="roll_no">Roll Number</label>
    <input type="text" name="roll_no"><br><br>

    <label for="s_name">Name</label>
    <input type="text" name="s_name"><br><br>

    <label for="s_address">Address</label>
    <input type="text" name="s_address"><br><br>

    <label for="s_city">City</label>
    <input type="text" name="s_city"><br><br>

    <input type="submit" name="submitbtn" value="Submit"><br><br>
</form>
    <input type="reset" name="resetbtn" value="Reset">
</body>
</html>