import java.sql.*;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws SQLException {
        try {
            //driver loading
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("driver loaded");
        //establish connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "109Trupti@109");
        System.out.println("connection established");

        //create statement
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from mark");
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
        }

//by using another class
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Insert, 2.Display, 3.Delete, 4.Update");
        System.out.println("Enter Choice:-");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter roll_no,name,address:-");
                String rn = sc.next();
                String n = sc.next();
                String add = sc.next();
                ConnectivityOFDatabase.insertdata(rn, n, add);
                break;

            case 2:
                ConnectivityOFDatabase.displaydata();
                break;
        }
    }
}
