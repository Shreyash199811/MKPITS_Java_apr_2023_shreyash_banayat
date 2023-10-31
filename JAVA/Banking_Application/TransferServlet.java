

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP
 */
@WebServlet(urlPatterns = {"/transfer"})
public class TransferServlet extends HttpServlet {
Connection connection;
String transaction="transfer";
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String transfer_amt=request.getParameter("amount");
            String receiver=request.getParameter("transfer_to");
               //Session Tracking
               HttpSession session=request.getSession(true);
               
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                out.println("Driver Loaded");
                connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/BankAccounts","root","Owner@1998"); 
                out.println("Connection Established");
            }catch(Exception e){
                out.println(e);
            }
            
            try{
               //Creaction Time
            long dateValue=session.getCreationTime();
            
             PreparedStatement preparedStatements=connection.prepareStatement("insert into transactions values(?,?,?,?)");
             preparedStatements.setString(1,(String)session.getAttribute("sessionid") );
             preparedStatements.setDate(2, new java.sql.Date(dateValue));
             preparedStatements.setString(3,transfer_amt);
             preparedStatements.setString(4,transaction);
             
             int result=preparedStatements.executeUpdate();
             if(result!=0){
             out.println("Data Inserted");
             
             }else{
                 out.println("insert error");
             } 
            }catch(Exception ex){
                out.println(ex);
            }
               
            
            try{
                PreparedStatement prepStatement=connection.prepareStatement("update Accounts set account_balance=account_balance-? where user_id=? ");
                prepStatement.setString(1, transfer_amt);
                prepStatement.setString(2,(String) session.getAttribute("sessionid"));
                
                int update_result=prepStatement.executeUpdate();
                if(update_result!=0){
             out.println("Data Updated");
             
             }else{
                 out.println("update error");
             } 
            }catch(Exception exp){
                out.println(exp);
            }
            
            try{
                PreparedStatement prepStatements=connection.prepareStatement("update Accounts set account_balance=account_balance+? where user_id=? ");
                prepStatements.setString(1, transfer_amt);
                prepStatements.setString(2,receiver);
                
                int update_result=prepStatements.executeUpdate();
                if(update_result!=0){
             out.println("Data Updated");
             }else{
                 out.println("update error");
             } 
            }catch(Exception exp){
                out.println(exp);
            }
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
