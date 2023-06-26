import java.util.Scanner;

public class BankAccount {
    Scanner scanner=new Scanner(System.in);
    double accountBalance;
    double moneyYouWantToCredit;
    public void CheckBalance(){
        do{
            System.out.println("Enter how much money you want to debit=");
            moneyYouWantToCredit=scanner.nextDouble();
            System.out.println("You can Debit money");
        }while(accountBalance>5000);
        System.out.println("Please maintain minimum of 5000rs in your account");
    }
}
