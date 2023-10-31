/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP
 */
@WebServlet(urlPatterns = {"/DepositAmount"})
public class DepositeAmountServlet extends HttpServlet {
Connection connection;
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
            String transaction="Deposit";
        
                          //Session Tracking
               HttpSession s=request.getSession(true);  
//               String uid=(String)s.getAttribute("sessionid");
               
      
             
             String depositAmount=request.getParameter("d_amount");
          try{
               Class.forName("com.mysql.cj.jdbc.Driver");
               connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/BankAccounts","root","Owner@1998"); 
          
          }catch(Exception ex){
            out.println(ex);
        }
          
          try{          
             //Creaction Time
            long dateValue=s.getCreationTime();
            
             PreparedStatement preparedStatements=connection.prepareStatement("insert into transactions values(?,?,?,?)");
             preparedStatements.setString(1,(String)s.getAttribute("sessionid") );
             preparedStatements.setDate(2, new java.sql.Date(dateValue));
             preparedStatements.setString(3,depositAmount);
             preparedStatements.setString(4,transaction);
             
             int result=preparedStatements.executeUpdate();
             if(result!=0){
             out.println("Data Inserted");
             
             }else{
                 out.println("insert error");
             }
                }catch(Exception exp){
                 out.println(exp);
                }
          
         try{
             PreparedStatement preparedStatement=connection.prepareStatement("update Accounts set account_balance=account_balance+? where user_id=?");  
             preparedStatement.setString(1,depositAmount);
              preparedStatement.setString(2,  (String)s.getAttribute("sessionid"));
             int update_result=preparedStatement.executeUpdate();
//             out.println(s.getAttribute("sessionid").toString());
             if(update_result!=0){
                       out.println("data modified");
             }else{
                       out.println("update error");
             }
             
         } catch(Exception ex){
             out.println(ex);
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


