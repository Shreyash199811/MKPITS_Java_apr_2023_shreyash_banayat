<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Withdraw</title>
    <style>
        form{
            align-self: center;
            padding: 20px;
        }
    </style>
</head>
<body>
    <form action="withdraw-controller.jsp" method="post">
    <label>Amount </label><input type="text" name="withdraw_amt" placeholder="----Enter----"><br><br>
    <input type="submit" value="Submit">
    </form>
</body>
</html>
