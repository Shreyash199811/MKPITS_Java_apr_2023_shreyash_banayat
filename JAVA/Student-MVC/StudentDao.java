import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
class StudentDao {
    Connection con;
    
    public StudentDao(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        out.println("Driver Loaded");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_details","root","Owner@1998"); 
        }catch(Exception ex){
            out.println(ex);
        }
    }
    
    public int insertRecord(Student student){
        int value=1;
        try{
        PreparedStatement ps=con.prepareStatement("insert into student_info values(?,?,?,?) ");
        ps.setString(1,student.getRoll_no());
        ps.setString(2,student.getName());
        ps.setString(3,student.getAddress() );
        ps.setString(4,student.getCity());
        
        ps.executeUpdate();
        }catch(Exception e){
            out.println(e);
        }
        return value;
    }
    
    public ResultSet getRecord(){
        ResultSet rs=null;
        try{
        Statement stat=con.createStatement();
         rs=stat.executeQuery("select * from studentdetails");
        }catch(Exception e){
        out.println(e);
        }
        return rs;
        }
}
