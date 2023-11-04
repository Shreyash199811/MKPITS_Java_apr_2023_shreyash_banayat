<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Index Page</title>
</head>
<body>
<h1 align="center">Student Registration</h1>
<br/>
    <form action="beanfile.jsp" align="center">
        <label>Roll number</label>
        <input type="text" name="rollno"><br><br>

        <label>Name</label>
        <input type="text" name="name"><br><br>

        <label>Address</label>
        <input type="text" name="address"><br><br>

        <label>City</label>
        <input type="text" name="city"><br><br>

        <input type="submit" value="Submit">
        <input type="reset" value="Reset">
    </form>
<%--<a href="hello-servlet">Hello Servlet</a>--%>
</body>
</html>