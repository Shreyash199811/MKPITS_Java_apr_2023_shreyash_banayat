package StudentDatabase;

import java.util.LinkedList;
import java.util.Scanner;

public class StudentDataServices {

        Scanner scanner = new Scanner(System.in);
        LinkedList<Student> studentList = new LinkedList();
        Student student=new Student();
        String name, choice;
        int marks,counter = 0;

        public void addRecord() {
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
        }

        public void displayData(){
            for(Object names:studentList){
                System.out.println(names);
            }
        }

        public void findRecord(Student record){

            if(studentList.contains(record)){
                System.out.println("Record is present");
            }else{
                System.out.println("Record is not present");
            }
        }

        public void modifyRecord(int indexValue,Student student){
        studentList.set(indexValue,student);
            System.out.println("Record Modified");
        }

        public void deleteRecord(int indexValue){
            if(studentList.size()>indexValue){
            studentList.remove(indexValue);
            System.out.println("Record deleted");}
            else{
                System.out.println("Record is not available to delete");
            }
        }

        public void deleteRecord(Student student){
            if(studentList.remove(student)) {
                System.out.println("Record deleted");
            }
        }

        public void deleteAllRecords(){
            studentList.clear();
        }

}


