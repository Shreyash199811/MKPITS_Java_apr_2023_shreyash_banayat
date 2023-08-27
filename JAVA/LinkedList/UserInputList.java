import java.util.*;
public class UserInputList {
    LinkedList nameList = new LinkedList();

    Scanner scanner = new Scanner(System.in);
    String name, choice;
    int counter = 0;

    public void enteringNameInList() {
        do {
            System.out.println("Enter the name =");
            name = scanner.next();
            nameList.add(name);
            counter++;
            System.out.println("Do you want to enter another name? (y/n)");
            choice = scanner.next();
            if (choice == "y") {
                nameList.add(name);
            }
        } while (choice.equalsIgnoreCase("y"));

        for(Object allnames:nameList){
            System.out.println(allnames);
        }
    }

}
