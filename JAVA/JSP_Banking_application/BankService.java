package com.example.bankapplicationusebean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

import static java.sql.DriverManager.getConnection;

public class BankService {
        Connection con;

    //Date
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
    String current_date = formatter.format(date);

    public BankService(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = getConnection("jdbc:mysql://localhost:3306/Bank_Accounts","root","Owner@1998");
        } catch (Exception exp) {
            System.out.println(exp);
        }
    }

    public int insertData(Bank bank){
        int result=0;
        try {
            PreparedStatement preparedStatement = con.prepareStatement("insert into Accounts (user_id,userpw,user_name,address,city,account_balance,RegisteredOn) values(?,?,?,?,?,?,?)");
            preparedStatement.setString(1,bank.getUserID() );
            preparedStatement.setString(2, bank.getUser_password());
            preparedStatement.setString(3, bank.getUserName());
            preparedStatement.setString(4, bank.getUserAddress());
            preparedStatement.setString(5, bank.getUserCity());
            preparedStatement.setString(6, bank.getAccountBalance());
            preparedStatement.setString(7, current_date);
            result = preparedStatement.executeUpdate();

        }catch(Exception exception){

        }
        return result;
    }

    public int login(Bank bank){
        int result=0;
        try {

            PreparedStatement preparedStatement = con.prepareStatement("select * from Accounts where user_id=? and userpw=? and Approved_Status='Approved'");
            preparedStatement.setString(1,bank.getUserID());
            preparedStatement.setString(2,bank.getUser_password());
        }catch(Exception exception){

        }
        return result;
    }

//    public int insertTransaction(Bank bank){
//        try{
//            PreparedStatement preparedStatements=con.prepareStatement("insert into transactions values(?,?,?,?)");
//            preparedStatements.setString(1,(String)session.getAttribute("login_Session") );
//            preparedStatements.setDate(2, new java.sql.Date(dateValue));
//            preparedStatements.setString(3,depositAmount);
//            preparedStatements.setString(4,transaction_type);
//            int result=preparedStatements.executeUpdate();
//        }catch(Exception exception){
//
//        }
//    }

//    public ResultSet userCheck(Bank bank){
//        try {
//            String user_id = request.getParameter("userID");
//            String user_pw = request.getParameter("name");
//            PreparedStatement preparedStatement = con.prepareStatement("select * from Accounts where user_Id=? and userpw=?");
//            preparedStatement.setString(1, user_id);
//            preparedStatement.setString(2, user_pw);
//            ResultSet resultSet = preparedStatement.executeQuery();
//        }catch(Exception exception){
//
//        }
//    }

}
