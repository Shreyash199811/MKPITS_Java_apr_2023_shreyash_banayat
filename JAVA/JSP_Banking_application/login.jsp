<%@ page import="com.example.bankapplicationusebean.BankService" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 06-11-2023
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="bank1" class="com.example.bankapplicationusebean.Bank" scope="application"/>
<jsp:setProperty name="bank1" property="userID" param="userID"/>
<jsp:setProperty name="bank1" property="user_password" param="pass"/>

<html>
<head></head>
<body>
<%

    BankService bankService=new BankService();
    ResultSet resultSet=bankService.logIn(bank1);
    //     session Tracking
    String userid=bank1.getUserID();
    String userpass=bank1.getUser_password();
    session.setAttribute("sessionID",userid);
    System.out.println(userid);

    if(userid.equals("admin") && userpass.equals("admin")){
        RequestDispatcher requestDispatcher1 = request.getRequestDispatcher("admin-view.jsp");
        requestDispatcher1.forward(request, response);
    }else {
        if (resultSet.next()) {
            out.println("Welcome");

//    Request Dispatcher
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("homepage.jsp");
            requestDispatcher.forward(request, response);

        } else {


            out.println("Unable to fetch");
            out.println("<h2> <a href=index.jsp>Back to login page</a></h2>");
        }
    }
%>
</body>
</html>



