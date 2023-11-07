<%@ page import="com.example.bankapplicationusebean.Bank" %>
<%@ page import="com.example.bankapplicationusebean.BankService" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean id="bank1" class="com.example.bankapplicationusebean.Bank" scope="application"/>
<jsp:setProperty name="bank1" property="userID" param="user_id"/>
<jsp:setProperty name="bank1" property="user_password" param="user_ps"/>
<jsp:setProperty name="bank1" property="userName" param="user_name"/>
<jsp:setProperty name="bank1" property="userAddress" param="user_address"/>
<jsp:setProperty name="bank1" property="userCity" param="user_city"/>
<jsp:setProperty name="bank1" property="accountBalance" param="user_amount"/>
<%
    BankService bankService=new BankService();
    if (bankService.insertData(bank1)!=0)
    {
    out.println("Inserted");
    }
    else{
    out.println("Not inserted");
        }
%>

