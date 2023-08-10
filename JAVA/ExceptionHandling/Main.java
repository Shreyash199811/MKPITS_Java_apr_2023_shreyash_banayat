import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//       int[] num={34,54,5,45,3};
//       ClassArray classArray=new ClassArray();
//       classArray.method(num);
//       classArray.display();
        Customer customer=new Customer();
        try {
            customer.personAge(25);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }

    }
}


//Runtime error is called exception
//Checked exception and unchecked exception

