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
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stud_man", "root", "Owner@1998");
        System.out.println("connection established");

        //create statement
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from marks");
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
        }

//by using another class
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("1-Insert\n 2-Display\n 3-Delete\n 4-Update\n5-Exit");
            System.out.println("Enter Choice:-");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter roll number,name,address:-");
                    String rn = sc.next();
                    String n = sc.next();
                    String add = sc.next();
                    Student student = new Student(rn, n, add);
                    ConnectivityOFDatabase.insertdata(student);
                    break;

                case 2:
                    ConnectivityOFDatabase.displaydata();
                    break;

                case 3:
                    System.out.println("Enter the roll number to be deleted=");
                    String rollNo = sc.next();
                    Student studRollNO = new Student(rollNo);
                    ConnectivityOFDatabase.deleteRow(studRollNO);
                    break;

                case 4:
                    System.out.println("Enter roll number,name,address:-");
                    String rollno = sc.next();
                    String name = sc.next();
                    String address = sc.next();
                    Student deleteRecord = new Student(rollno,name,address);
                    ConnectivityOFDatabase.update(deleteRecord);

                case 5:
                    return;
            }
        }
    }
}
