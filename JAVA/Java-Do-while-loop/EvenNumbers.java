import java.util.Scanner;

public class EvenNumbers {
    Scanner scanner=new Scanner(System.in);
    int number=scanner.nextInt();
    int remainder;
    public void Range(){
        do{
            remainder=number%2;
            if(remainder==0){
                System.out.println("It is an even number");
                break;
            }else{
                System.out.println("It is an odd number");
                break;
            }
        }while(number>0 && number<100);
    }
}
