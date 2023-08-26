import StudentDatabase.Student;
import StudentDatabase.StudentDataServices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StudentDataServices studentInfo=new StudentDataServices();

        int option=(-1);

        while(true) {
            System.out.println("1-Add Record\n2-Display All\n3-Find Record\n4-Modify Record" +
                    "\n5-Delete Record\n6-Delete All\n0-Exit");
            System.out.print("Enter your choice=");
            option=scanner.nextInt();
            switch (option) {
                case 1:
                    studentInfo.addRecord();
                    break;
                case 2:
                    studentInfo.displayData();
                    break;

                case 3:
                    System.out.println("Enter the nam and marks to be found=");
                    Student record = new Student(scanner.next(), scanner.nextInt());
                    studentInfo.findRecord(record);
                    break;

                case 4:
                    System.out.println("Enter the index of file to modify=");
                    int indexValue = scanner.nextInt();
                    System.out.println("Enter new name=");
                    String name = scanner.next();
                    System.out.println("Enter new marks=");
                    int marks = scanner.nextInt();
                    Student newRecord = new Student(name, marks);
                    studentInfo.modifyRecord(indexValue,newRecord);
                    break;

                case 5:
                    String choice = "index";
                    System.out.println("Enter how do you want to delete record using\n index\nobject\n");
                    choice=scanner.next();
                    if (choice.equalsIgnoreCase("index")) {
                        System.out.println("Enter Index Value=");
//                        indexValue = scanner.nextInt();
                        studentInfo.deleteRecord(scanner.nextInt());
                        System.out.println("Record deleted");
                    } else if (choice.equalsIgnoreCase("object")) {
                        System.out.println("Enter new name=");
                        name = scanner.next();
                        System.out.println("Enter new marks=");
                        marks = scanner.nextInt();
                        Student recordToDelete = new Student(name, marks);
                        studentInfo.deleteRecord(recordToDelete);
                        System.out.println("Record deleted");
                    }
                    break;

                case 6:
                    studentInfo.deleteAllRecords();
                    break;

                case 0:
                    return;

//                default:
//                    System.out.println("Please enter the proper input");
            }
        }
    }
}