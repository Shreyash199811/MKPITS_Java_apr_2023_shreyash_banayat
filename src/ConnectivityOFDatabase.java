
    import java.sql.*;
    import java.util.*;
    import java.util.Scanner;

    public class ConnectivityOFDatabase {
        static Connection connection;

        public static void dbcon() throws SQLException {

            try {
                //driver loading
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            System.out.println("driver loaded");
            //establish connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stud_man", "root", "Owner@1998");
            System.out.println("connection established");
        }

        //display data
        public static void displaydata() throws SQLException {
            dbcon();
            //create statement
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from studentdetails");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));

            }
        }

        //insert data
        public static void insertdata(Student student) throws SQLException {
            dbcon();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into studentdetails values(?,?,?)");
            preparedStatement.setString(1, student.getRollNo());
            preparedStatement.setString(2, student.getStud_Name());
            preparedStatement.setString(3, student.getStud_address());

            int returnvalue = preparedStatement.executeUpdate();
        }

        public static void deleteRow(Student student) throws SQLException {
            dbcon();
            PreparedStatement preparedStatement=connection.prepareStatement("delete from studentdetails where roll_no=?");
            preparedStatement.setString(1, student.getRollNo());

        }

        public static void update(Student student) throws SQLException {
            dbcon();
            PreparedStatement preparedStatement=connection.prepareStatement("update studentdetails set roll_no=?,name=?,address=? where roll_no=");
            preparedStatement.setString(1, student.getRollNo());
            preparedStatement.setString(2, student.getStud_Name());
            preparedStatement.setString(3, student.getStud_address());
            preparedStatement.setString(4,student.getRollNo());

        }
    }



