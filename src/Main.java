import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
       try{
//           Loading a driver
           Class.forName("com.mysql.cj.jdbc.Driver");
           System.out.println("Driver loaded");
           Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Owner@1998");
           System.out.println("Connection established");
           Statement statement=connection.createStatement();
           ResultSet resultSet=statement.executeQuery("select * from student_details");
           while(resultSet.next()){
               System.out.println(resultSet.getString(1)+"\t"+resultSet.getString(2)+"\t\t"+resultSet.getString(3));
           }
       }
       catch(Exception e){
           System.out.println(e);
       }

    }
}