
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
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "109Trupti@109");
            System.out.println("connection established");


        }

        //display data
        public static void displaydata() throws SQLException {
            dbcon();
            //create statement
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from student_detail");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));

            }
        }

        //insert data
        public static void insertdata(String roll_no, String name, String address) throws SQLException {
            dbcon();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into student_detail values(?,?,?)");
            preparedStatement.setString(1, roll_no);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, address);

            int returnvalue = preparedStatement.executeUpdate();
        }
    }



