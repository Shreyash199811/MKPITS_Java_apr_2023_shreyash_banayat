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
 import java.sql.*;

/**
 *
 * @author HP
 */
@WebServlet(urlPatterns = {"/DetailsServlet"})
public class DetailsServlet extends HttpServlet {
static Connection connection;
    //public String stud_Rollno,stud_Name,stud_address,stud_city;

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
            /* TODO output your page here. You may use following sample code. */
            String stud_Rollno=request.getParameter("roll_no");
            String stud_Name=request.getParameter("name");
            String stud_address=request.getParameter("address");
            String stud_city=request.getParameter("city");

            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            out.println("Driver loaded");
             connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentsInformation","root","Owner@1998");
            out.println("connection established");
            }catch(Exception e){
                out.println(e);
            }  
            try
            {
            PreparedStatement preparedStatement=connection.prepareStatement("insert into studentdetails  values(?,?,?,?)");
            preparedStatement.setString(1,stud_Rollno);
            preparedStatement.setString(2,stud_Name);
            preparedStatement.setString(3,stud_address);
            preparedStatement.setString(4,stud_city);

            preparedStatement.executeUpdate();
            out.println("Inserted");
            }
            catch(Exception e){
                out.println(e);
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
            throws ServletException, IOException{
       
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
            throws ServletException, IOException{
              
        processRequest(request, response);
              
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
   
}

