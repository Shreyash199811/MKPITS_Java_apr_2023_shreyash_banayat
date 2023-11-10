<%@ page import="java.sql.Date" %>
<%@ page import="com.example.bankapplicationusebean.BankService" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 08-11-2023
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="transfer" scope="application" class="com.example.bankapplicationusebean.Transaction"/>
<%

    String id= (String) session.getAttribute("sessionID");
    long date_new= session.getCreationTime();
    Date transferdate=new Date(date_new);
%>
<jsp:setProperty name="transfer" property="transfer_id" param="transfer_id"/>
<jsp:setProperty name="transfer" property="transfer_date" value="<%=transferdate%>"/>
<jsp:setProperty name="transfer" property="amount" param="amount_transfer"/>
<jsp:setProperty name="transfer" property="transaction_type" value="transfer_in"/>
<jsp:setProperty name="transfer" property="login_id" value="<%=id%>"/>
<jsp:setProperty name="transfer" property="transaction_out" value="transfer_out"/>


<%
    String transactionType="Transfer";
    BankService transfer_amount=new BankService();
    transfer_amount.transferAmount(transfer);
    transfer_amount.log(transactionType,id);
    out.println("<h3><a href=\"homepage.jsp\">Back</a></h3>");
%>


<html>
<head>
    <title>Transfer</title>
</head>
<body>

</body>
</html>
