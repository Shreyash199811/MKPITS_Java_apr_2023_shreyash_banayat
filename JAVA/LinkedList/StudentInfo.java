import java.util.LinkedList;
import java.util.Scanner;

public class StudentInfo {
    Scanner scanner = new Scanner(System.in);
    LinkedList<Student> studentList = new LinkedList();
    Student student=new Student();
    String name, choice;
    int marks,counter = 0;

    public void enteringData() {
        do {
            System.out.println("Enter the name =");
            name = scanner.next();
            System.out.println("Enter marks =");
            marks=scanner.nextInt();
            studentList.add(new Student(name,marks));
            counter++;
            System.out.println("Do you want to enter another name? (y/n)");
            choice = scanner.next();
            if (choice == "y") {
                studentList.add(new Student(name,marks));
            }
        } while (choice.equalsIgnoreCase("y"));

        for(Object names:studentList){
            System.out.println(names);
        }
    }
}
